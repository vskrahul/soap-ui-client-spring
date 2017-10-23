/**
 * 
 */
package com.charter.enterprise.csg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.charter.enterprise.billing.csg.orders.CsgHeaderInfo;
import com.charter.enterprise.billing.csg.orders.GetOrdersOrderClass;
import com.charter.enterprise.billing.csg.orders.GetOrdersOrderStatus;
import com.charter.enterprise.billing.csg.orders.GetOrdersRequest;
import com.charter.enterprise.billing.csg.orders.GetOrdersResponse;
import com.charter.enterprise.csg.repository.OrderRepository;
import com.charter.enterprise.csg.service.OrderService;

/**
 * @author Rahul
 *
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository repository;
	
	@Override
	public GetOrdersResponse getOrders(String routingArea, String customerId) {
		
		GetOrdersRequest request = new GetOrdersRequest();
		
		CsgHeaderInfo csgHeaderInfo = new CsgHeaderInfo();
		csgHeaderInfo.setRoutingArea(routingArea);
		csgHeaderInfo.setOperator("WEB");
		csgHeaderInfo.setRealTime(false);
		
		request.setCsgHeaderInfo(csgHeaderInfo);
		request.setCustomerId(customerId);
		request.setOrderClass(GetOrdersOrderClass.NOT_SPECIFIED);
		request.setOrderStatus(GetOrdersOrderStatus.NOT_SPECIFIED);
		
		return repository.getOrders(request);
	}
}