package com.charter.enterprise.csg.repository.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;
import org.springframework.stereotype.Repository;

import com.charter.enterprise.billing.csg.services.CsgHeaderInfo;
import com.charter.enterprise.billing.csg.services.CurrentItems;
import com.charter.enterprise.billing.csg.services.Customer;
import com.charter.enterprise.billing.csg.services.CustomerService;
import com.charter.enterprise.billing.csg.services.GetCurrentServicesRequest;
import com.charter.enterprise.billing.csg.services.GetCurrentServicesResponse;
import com.charter.enterprise.billing.csg.services.HistoryItems;
import com.charter.enterprise.billing.csg.services.PendingItems;
import com.charter.enterprise.billing.csg.services.ServicesService;
import com.charter.enterprise.csg.exception.RemoteException;
import com.charter.enterprise.csg.exception.ServicesNotFoundException;
import com.charter.enterprise.csg.repository.ServicesRepository;
import com.charter.enterprise.csg.web.interceptor.RequestCounts;

@Repository
public class ServicesRepositoryWs implements ServicesRepository {

	private Logger logger = LoggerFactory.getLogger(ServicesRepositoryWs.class);
	
	@Autowired
	@Qualifier("servicesProxy")
	private JaxWsPortProxyFactoryBean servicesProxy;
	
	@Override
	public CustomerService getServices(String accountNumber, String routingArea) {
		
		GetCurrentServicesRequest request = new GetCurrentServicesRequest();
		
		CsgHeaderInfo csgHeaderInfo = new CsgHeaderInfo();
		csgHeaderInfo.setRoutingArea(routingArea);
		
		GetCurrentServicesRequest.SearchFilter searchFilter = new GetCurrentServicesRequest.SearchFilter();
		searchFilter.setAccountId(accountNumber);
		searchFilter.setCurrentItems(CurrentItems.TRUE);
		searchFilter.setPendingItems(PendingItems.FALSE);
		searchFilter.setHistoryItems(HistoryItems.FALSE);
		
		request.setCsgHeaderInfo(csgHeaderInfo);
		request.setSearchFilter(searchFilter);
		
		ServicesService servicesService = (ServicesService)servicesProxy.getObject();
		GetCurrentServicesResponse response = null;
		Customer customer = null;
		CustomerService customerService = null;
		try{
			response = servicesService.getCurrentServices(request);
			customer = response.getCustomers().get(0);
			customerService = customer.getCustomerServices().get(0);
		} catch(IndexOutOfBoundsException e) {
			throw new ServicesNotFoundException();
		} catch(RemoteException e) {
			logger.error(e.getMessage());
			throw new RemoteException();
		}finally {
			RequestCounts instance = RequestCounts.getInstance();
			instance.setRequestCounter(instance.getRequestCounter() + 1);
		}
		return customerService;
	}

	@Override
	public CustomerService getPackages(String accountNumber, String routingArea) {
		CustomerService customerService = null;
		try{
			customerService = getServices(accountNumber, routingArea);
		} catch(Exception e) {
			throw new ServicesNotFoundException("No packages are found.");
		}
		return customerService;
	}

}
