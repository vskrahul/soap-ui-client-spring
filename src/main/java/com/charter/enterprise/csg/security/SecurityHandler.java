/**
 * 
 */
package com.charter.enterprise.csg.security;

import java.security.SecureRandom;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.ws.security.WSSecurityException;

/**
 * Abstract SOAP Handler
 * 
 * @author Rahul Vishvakarma
 *
 * @created Jun 1, 2018
 */
public abstract class SecurityHandler implements SOAPHandler<SOAPMessageContext> {

private String username;
	
	private String password;
	
	private static SecureRandom random = null;
	
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
	
	private SOAPFactory factory = null;
	
	protected SecurityHandler(String username, String password) throws SOAPException {
		this.username = username;
		this.password = password;
		this.factory = SOAPFactory.newInstance();
	}
	
	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		return addSecurityHeader(context);
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		return false;
	}

	@Override
	public void close(MessageContext context) {
		
	}

	@Override
	public Set<QName> getHeaders() {
		return null;
	}
	
	/**
	 * Abstract method to add security header in SOAP message.
	 * 
	 * @param context SOAP message context
	 */
	protected abstract boolean addSecurityHeader(SOAPMessageContext context);
	
	protected SOAPElement security() throws SOAPException, WSSecurityException {
		return factory.createElement(WssSecurity.Security.name(),"wsse", WssSecurity.WSSE_XMLNS.value());
	}
	
	protected SOAPElement usernameToken() throws SOAPException, WSSecurityException {
		SOAPElement usernameToken = factory.createElement(WssSecurity.UsernameToken.name(),"wsse", WssSecurity.WSSE_XMLNS.value());
		usernameToken.setAttribute("xmlns:wsu", WssSecurity.WSU_XMLNS.value());

		SOAPElement username = factory.createElement(WssSecurity.Username.name(),"wsse", WssSecurity.WSSE_XMLNS.value());
		username.setTextContent(this.username);

		SOAPElement password = factory.createElement(WssSecurity.Password.name(),"wsse", WssSecurity.WSSE_XMLNS.value());
		password.setTextContent(this.password);
		password.setAttribute("Type", WssSecurity.WS_PASSWORD_TEXT_XMLNS.value());
		
		String nonceStr = generateNonce(16);
		
		SOAPElement nonce = factory.createElement(WssSecurity.Nonce.name(), "wsse", WssSecurity.WSSE_XMLNS.value());
		nonce.setAttribute("EncodingType", WssSecurity.WS_ENCODING_BASE_64_XMLNS.value());
		nonce.setTextContent(nonceStr);
		
		SOAPElement created = factory.createElement("Created", "wsu", WssSecurity.WSU_XMLNS.value());
		created.setTextContent(created());

		usernameToken.addChildElement(username);
		usernameToken.addChildElement(password);
		usernameToken.addChildElement(nonce);
		usernameToken.addChildElement(created);
		
		return usernameToken;
	}
	
	protected SOAPElement timestamp() throws SOAPException, WSSecurityException {
		SOAPElement timestamp = factory.createElement(WssSecurity.Timestamp.name(), "wsu", WssSecurity.WSU_XMLNS.value());
		
		SOAPElement timestampCreated = factory.createElement(WssSecurity.Created.name(), "wsu", WssSecurity.WSU_XMLNS.value());
		timestampCreated.setTextContent(created());
		
		SOAPElement timestampExpires = factory.createElement(WssSecurity.Expires.name(), "wsu", WssSecurity.WSU_XMLNS.value());
		timestampExpires.setTextContent(expires());
		
		timestamp.addChildElement(timestampCreated);
		timestamp.addChildElement(timestampExpires);
		
		return timestamp;
	}
	
	protected synchronized String generateNonce(int length) throws WSSecurityException {
	    try {
	        if (random == null) {
	            random = SecureRandom.getInstance("SHA1PRNG");
	        }
	        byte[] temp = new byte[length];
	        random.nextBytes(temp);
	        return Base64.getEncoder().encodeToString(temp);
	    } catch (Exception ex) {
	        throw new WSSecurityException(
	            "Error in generating nonce of length " + length, ex
	        );
	    }
	}
	
	protected String created() {
		return ZonedDateTime.now().withZoneSameInstant(ZoneOffset.UTC).format(formatter);
	}
	
	protected String expires() {
		return ZonedDateTime.now().plusMinutes(1).withZoneSameInstant(ZoneOffset.UTC).format(formatter);
	}
}
