package com.charter.enterprise.csg.exception;

//@ResponseStatus(value = HttpStatus.FORBIDDEN, reason = "Request is blocked as you reached the maximum allowed limit in one hour.")
public class ForbiddenException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5749019564435421122L;
	
	private String message;
	
	public ForbiddenException() {
		
	}
	
	public ForbiddenException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}

}
