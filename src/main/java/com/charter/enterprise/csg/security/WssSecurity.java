/**
 * 
 */
package com.charter.enterprise.csg.security;

/**
 * WSS Security Enum constants
 * 
 * @author Rahul Vishvakarma
 *
 * @created Jun 1, 2018
 */
public enum WssSecurity {

	WSU_XMLNS("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd"),
	WSSE_XMLNS("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"),
	WS_ENCODING_BASE_64_XMLNS("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary"),
	WS_PASSWORD_TEXT_XMLNS("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText"),
	Security, UsernameToken, Username, Password, Nonce, Created, Expires, Timestamp;
	
	private String value;
	
	private WssSecurity(String value) {
		this.value = value;
	}
	
	private WssSecurity() {
	}
	
	public String value() {
		return value;
	}
}