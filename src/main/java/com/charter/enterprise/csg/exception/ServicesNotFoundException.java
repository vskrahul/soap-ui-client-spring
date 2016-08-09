package com.charter.enterprise.csg.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No Current services are found.")
public class ServicesNotFoundException extends RuntimeException {

private String message = "";
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1574130554410865028L;

	public ServicesNotFoundException() {
		
	}
	
	public ServicesNotFoundException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
