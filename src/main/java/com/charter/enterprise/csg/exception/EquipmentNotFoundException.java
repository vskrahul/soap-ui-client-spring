package com.charter.enterprise.csg.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Equipment not found.")
public class EquipmentNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2174512143038262878L;
	
	

}
