package com.charter.enterprise.csg.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED, reason = "Invalid account number.")
public class InvalidAccountException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8124915688818676177L;

	
}
