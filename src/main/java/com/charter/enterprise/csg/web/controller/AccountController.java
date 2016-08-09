package com.charter.enterprise.csg.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "account")
public class AccountController {

	private Logger logger = LoggerFactory.getLogger(EquipmentController.class);
	
	@RequestMapping(method = {RequestMethod.GET})
	public String getEquipmentStatus() {
		String str = "AccountController is accessible....!";
		logger.info(str);
		return str;
	}
	
}