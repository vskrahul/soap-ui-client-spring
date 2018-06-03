/**
 * 
 */
package com.charter.enterprise.csg.exception;

/**
 * Representing any exception caught while calling prefcomm operations.
 * 
 * @author Rahul Vishvakarma
 *
 * @created Jun 1, 2018
 */
public class PrefcommException extends RuntimeException {

	private static final long serialVersionUID = 9158657275503110487L;

	public PrefcommException(String message) {
		super(message);
	}
}