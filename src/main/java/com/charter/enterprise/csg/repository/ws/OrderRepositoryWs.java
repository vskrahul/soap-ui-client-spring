/**
 * 
 */
package com.charter.enterprise.csg.repository.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;
import org.springframework.stereotype.Repository;

import com.charter.enterprise.billing.csg.orders.GetOrderScheduleRequest;
import com.charter.enterprise.billing.csg.orders.GetOrderScheduleResponse;
import com.charter.enterprise.billing.csg.orders.GetOrdersRequest;
import com.charter.enterprise.billing.csg.orders.GetOrdersResponse;
import com.charter.enterprise.billing.csg.orders.OrderService;
import com.charter.enterprise.csg.repository.OrderRepository;

/**
 * @author Rahul
 *
 */
@Repository
public class OrderRepositoryWs implements OrderRepository {

private Logger logger = LoggerFactory.getLogger(OrderRepositoryWs.class);
	
	@Autowired
	@Qualifier("orderProxy")
	private JaxWsPortProxyFactoryBean orderProxy;
	
	@Override
	public GetOrdersResponse getOrders(GetOrdersRequest request) {
		
		logger.info(String.format("Gettting Orders for - %s", request));
		
		OrderService service = (OrderService)orderProxy.getObject();
		return service.getOrders(request);
	}
	
	@Override
	public GetOrderScheduleResponse getOrderSchedule(GetOrderScheduleRequest request) {
		
		logger.info(String.format("Gettting Orders for - %s", request));
		
		OrderService service = (OrderService)orderProxy.getObject();
		return service.getOrderSchedule(request);
	}

}
