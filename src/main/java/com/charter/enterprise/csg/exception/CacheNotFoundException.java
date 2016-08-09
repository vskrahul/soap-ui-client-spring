package com.charter.enterprise.csg.exception;

public class CacheNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3878629656451914587L;
	
	private String message;
	
	public CacheNotFoundException() {
		
	}
	
	public CacheNotFoundException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}

}
