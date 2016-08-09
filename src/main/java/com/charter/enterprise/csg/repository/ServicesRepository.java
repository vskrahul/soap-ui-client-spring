package com.charter.enterprise.csg.repository;

import com.charter.enterprise.billing.csg.services.CustomerService;

public interface ServicesRepository {

	/**
	 * Returns the all services used by Account holder.
	 * 
	 * @return
	 */
	public CustomerService getServices(String accountNumber, String routingArea);
	
	/**
	 * Returns the all packages used by Account holder.
	 * 
	 * @return
	 */
	public CustomerService getPackages(String accountNumber, String routingArea);
}
