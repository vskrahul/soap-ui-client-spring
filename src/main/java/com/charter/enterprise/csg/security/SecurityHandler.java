/**
 * 
 */
package com.charter.enterprise.csg.security;

import java.util.HashSet;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * 
 * @author Rahul
 *
 */
public class SecurityHandler implements SOAPHandler<SOAPMessageContext> {

	private Logger logger = LoggerFactory.getLogger(SecurityHandler.class);
	
	private String username;
	
	private String password;

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if (outboundProperty.booleanValue()) {
			SOAPMessage message = context.getMessage();
			try {
				SOAPPart sp = message.getSOAPPart();
				SOAPEnvelope envelope = sp.getEnvelope();

				SOAPHeader header = envelope.getHeader();
				if (header == null) {
					logger.info("No header found");
					header = envelope.addHeader();
				}

				final String wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
				final String wsu = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd";

				SOAPFactory factory = SOAPFactory.newInstance();

				SOAPElement security = factory.createElement("Security","wsse", wsse);

				SOAPElement usernameToken = factory.createElement("UsernameToken","wsse", wsse);
				usernameToken.setAttribute("xmlns:wsu", wsu);

				SOAPElement username = factory.createElement("Username","wsse", wsse);
				username.setTextContent(getUsername());

				SOAPElement password = factory.createElement("Password","wsse", wsse);
				password.setTextContent(getPassword());
				password.setAttribute("Type", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");

				usernameToken.addChildElement(username);
				usernameToken.addChildElement(password);

				security.addChildElement(usernameToken);
				
				header.addChildElement(security);
				message.saveChanges();
			} catch (Exception e) {
				logger.error("Exception in handler: " + e);
				return false;
			}
		} else {
			// inbound
		}
		return true;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		return true;
	}

	@Override
	public void close(MessageContext context) {
		// no-op
	}

	@Override
	public Set<QName> getHeaders() {
		// The code below is added on order to invoke Spring secured WS.
		// Otherwise,
		// http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd
		// won't be recognised
		final QName securityHeader = new QName(
				"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Security",
				"wsse");

		final Set<QName> headers = new HashSet<QName>();
		headers.add(securityHeader);

		return headers;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
