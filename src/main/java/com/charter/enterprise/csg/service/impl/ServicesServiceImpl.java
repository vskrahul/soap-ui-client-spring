package com.charter.enterprise.csg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;

import com.charter.enterprise.billing.csg.services.CustomerService;
import com.charter.enterprise.billing.csg.services.Service;
import com.charter.enterprise.csg.repository.ServicesRepository;
import com.charter.enterprise.csg.service.ServicesService;

@org.springframework.stereotype.Service
public class ServicesServiceImpl implements ServicesService {

	@Autowired
	ServicesRepository repository;
	
	@Override
	@Cacheable(cacheNames = {"getServices"})
	public List<Service> getServices(String accountNumber, String routingArea) {
		CustomerService customerService = repository.getServices(accountNumber, routingArea);
		List<Service> services = customerService.getServices();
		return services;
	}

	@Override
	@Cacheable(cacheNames = {"getPackages"})
	public List<Service> getPackages(String accountNumber, String routingArea) {
		CustomerService customerService = repository.getServices(accountNumber, routingArea);
		List<Service> services = customerService.getServices();
		return services;
	}

}
