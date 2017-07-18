/**
 * 
 */
package com.charter.enterprise.csg.security;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

/**
 * To Security token in the request header to SOA-OSB
 * 
 * @author Rahul
 *
 */
public class SoaSecurityHandlerResolver implements HandlerResolver {

	private String username;
	
	private String password;
	
	@SuppressWarnings("rawtypes")
	@Override
	public List<Handler> getHandlerChain(PortInfo portInfo) {
		List<Handler> handlerList = new ArrayList<Handler>();
		SecurityHandler handler = new SecurityHandler();
		handler.setUsername(getUsername());
		handler.setPassword(getPassword());
		handlerList.add(handler);
		return handlerList;
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