package com.charter.enterprise.csg.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.charter.enterprise.billing.csg.accounts.Account;
import com.charter.enterprise.csg.service.AccountService;

@Controller
@RequestMapping(value = "account")
public class AccountController {

	private Logger logger = LoggerFactory.getLogger(EquipmentController.class);
	
	@Autowired
	AccountService accountService;
	
	@RequestMapping(method = {RequestMethod.GET})
	public String getEquipmentStatus() {
		String str = "AccountController is accessible....!";
		logger.info(str);
		return str;
	}
	
	@RequestMapping(value = "getAccount", method = {RequestMethod.GET})
	public Account listEquipmentsJson(@RequestParam("AccountID") String accountNumber, 
											@RequestParam(value = "RoutingArea") String routingArea) {
		return accountService.getAccount(accountNumber, routingArea);
	}
	
}