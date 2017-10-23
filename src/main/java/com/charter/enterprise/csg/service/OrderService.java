/**
 * 
 */
package com.charter.enterprise.csg.service;

import com.charter.enterprise.billing.csg.orders.GetOrdersResponse;

/**
 * @author Rahul
 *
 */
public interface OrderService {

	/**
	 * Return All order for given customer.
	 * 
	 * @param routingArea Routing Area
	 * @param customerId Customer Id
	 * @return {@link GetOrdersResponse}
	 */
	public GetOrdersResponse getOrders(String routingArea, String customerId);
}
