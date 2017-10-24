/**
 * 
 */
package com.charter.enterprise.csg.service;

import com.charter.enterprise.billing.csg.orders.GetOrderScheduleResponse;
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
	
	/**
	 * Return the order schedules for given Order Id.
	 * 
	 * @param routingArea Routing Area
	 * @param businessUnit Business Unit
	 * @param locationId Location Id
	 * @param orderId Order Id
	 * @param jobSequence Job Sequence
	 * @param jobType Job Type
	 * @param totalUnits Total Units
	 * @return {@link GetOrderScheduleResponse}
	 */
	public GetOrderScheduleResponse getOrderSchedule(String routingArea, String businessUnit, 
														String locationId, String orderId,
														String jobSequence, String jobType,
														Integer totalUnits);
}
