/**
 * 
 */
package com.charter.enterprise.csg.security;

import java.util.ArrayList;
import java.util.List;

import javax.xml.soap.SOAPException;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.PortInfo;

import com.charter.enterprise.csg.exception.PrefcommException;

/**
 * @author Rahul Vishvakarma
 *
 * @created Jun 1, 2018
 */
public class SoaSecurityHandlerResolver extends SecurityHandlerResolver {

	protected SoaSecurityHandlerResolver(String username, String password) {
		super(username, password);
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public List<Handler> getHandlerChain(PortInfo portInfo)  {
		List<Handler> handlerList = new ArrayList<>();
		SecurityHandler handler = null;
		
		try {
			handler = new SoaSecurityHandler(getUsername(), getPassword());
		} catch(SOAPException e) {
			throw new PrefcommException(e.getMessage());
		}
		handlerList.add(handler);
		return handlerList;
	}
}
