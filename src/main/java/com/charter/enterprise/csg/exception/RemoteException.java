package com.charter.enterprise.csg.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "EAI Backend web server is not reachable.")
public class RemoteException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1574130554410865028L;

	public RemoteException() {
		super();
	}
	
	public RemoteException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
	
}
