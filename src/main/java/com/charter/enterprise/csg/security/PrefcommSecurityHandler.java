/**
 * 
 */
package com.charter.enterprise.csg.security;

import java.util.Objects;

import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * 
 * @author Rahul
 *
 */
public class PrefcommSecurityHandler extends SecurityHandler {

	protected PrefcommSecurityHandler(String username, String password) throws SOAPException {
		super(username, password);
	}

	private Logger logger = LoggerFactory.getLogger(PrefcommSecurityHandler.class);
	
	@Override
	protected boolean addSecurityHeader(SOAPMessageContext context) {
		Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if (outboundProperty.booleanValue()) {
			SOAPMessage message = context.getMessage();
			try {
				SOAPPart sp = message.getSOAPPart();
				SOAPEnvelope envelope = sp.getEnvelope();

				SOAPHeader header = Objects.isNull(envelope.getHeader()) ? envelope.addHeader() : envelope.getHeader();

				SOAPElement security = security();

				security.addChildElement(usernameToken());
				security.addChildElement(timestamp());
				
				header.addChildElement(security);
				message.saveChanges();
				message.writeTo(System.out);
				
			} catch (Exception e) {
				logger.error("Exception in handler: " + e);
				return false;
			}
		}
		return true;
	}
}