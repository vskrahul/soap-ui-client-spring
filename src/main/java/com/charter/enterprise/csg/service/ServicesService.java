package com.charter.enterprise.csg.service;

import java.util.List;

import com.charter.enterprise.billing.csg.services.Service;

public interface ServicesService {

	/**
	 * Returns the all services used by Account holder.
	 * 
	 * @return
	 */
	public List<Service> getServices(String accountNumber, String routingArea);
	
	/**
	 * Returns the all packages used by Account holder.
	 * 
	 * @return
	 */
	public List<Service> getPackages(String accountNumber,String routingArea);
}
