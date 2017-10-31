package com.charter.enterprise.csg.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.charter.enterprise.billing.csg.services.Service;
import com.charter.enterprise.csg.service.ServicesService;

@RestController
@RequestMapping(value = "customer")
public class ServicesController {

	private Logger logger = LoggerFactory.getLogger(ServicesController.class);
	
	@Autowired
	private ServicesService service;
	
	@RequestMapping(method = {RequestMethod.GET})
	public String getEquipmentStatus() {
		String str = "Services controller is OK.";
		logger.info(str);
		return str;
	}
	
	@RequestMapping(value = "services", method = {RequestMethod.GET})
	public List<Service> getServices(@RequestParam("AccountID") String accountNumber,
								@RequestParam("RoutingArea") String routingArea) {
		logger.info("Requesting Current Services on Account Number : " + accountNumber);
		List<Service> services = service.getServices(accountNumber, routingArea);
		logger.info("Return : " + services);
		return services;
	}
	
	@RequestMapping(value = "packages", method = {RequestMethod.GET})
	public List<Service> getPackages(@RequestParam("AccountID") String accountNumber,
								@RequestParam("RoutingArea") String routingArea) {
		logger.info("Requesting Current Packages on Account Number : " + accountNumber);
		List<Service> packages = service.getPackages(accountNumber, routingArea);
		logger.info("Result : "+ packages);
		return packages;
	}
}
