/**
 * 
 */
package com.charter.enterprise.csg.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.charter.enterprise.billing.csg.orders.GetOrdersResponse;
import com.charter.enterprise.csg.service.OrderService;

/**
 * @author Rahul
 *
 */
@RestController
@RequestMapping("/order")
public class OrderController {

	private Logger logger = LoggerFactory.getLogger(OrderController.class); 
	
	@Autowired
	private OrderService service;
	
	@RequestMapping(path = "/getOrders", method = {RequestMethod.GET})
	public GetOrdersResponse getOrders(@RequestParam(name="RoutingArea", required = true) String routingArea
									,@RequestParam(name = "CustomerId", required = true) String customerId) {
		logger.info(String.format("Request Order Details for : {RoutingArea=%s, CustomerId=%s}", routingArea, customerId));
		return service.getOrders(routingArea, customerId);
	}
}
