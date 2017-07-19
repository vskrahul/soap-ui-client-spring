/**
 * 
 */
package com.charter.enterprise.csg.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Rahul
 *
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "SOA OSB Server is not reachable.")
public class SoaOsbException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1574130554410865028L;

	public SoaOsbException() {
		super();
	}
	
	public SoaOsbException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
	
}