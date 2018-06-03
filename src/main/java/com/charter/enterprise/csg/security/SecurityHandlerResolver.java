package com.charter.enterprise.csg.security;

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
public abstract class SecurityHandlerResolver implements HandlerResolver {

	private String username;
	
	private String password;
	
	protected SecurityHandlerResolver(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public abstract List<Handler> getHandlerChain(PortInfo portInfo);

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
}
