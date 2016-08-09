package com.charter.enterprise.csg.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.charter.enterprise.csg.exception.RemoteException;
import com.charter.enterprise.csg.model.prefcomm.User;
import com.charter.enterprise.csg.service.PrefcommService;

@RestController
@RequestMapping("prefcomm")
public class PrefcommController {

	private Logger logger = LoggerFactory.getLogger(PrefcommController.class);
	
	@Autowired
	private PrefcommService service;
	
	@RequestMapping("user")
	public User getUser(@RequestParam("accountID") String accountID, @RequestParam("billingSystemID") String billingSystemID) throws RemoteException {
		logger.info("Requesting getPreferenceAccountInfoByAccountNumberAndBillingSystem("+accountID+", "+billingSystemID+");");
		return service.getUser(accountID, billingSystemID);
	}
}