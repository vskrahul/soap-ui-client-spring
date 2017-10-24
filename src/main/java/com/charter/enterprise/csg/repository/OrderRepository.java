/**
 * 
 */
package com.charter.enterprise.csg.repository;

import com.charter.enterprise.billing.csg.orders.GetOrderScheduleRequest;
import com.charter.enterprise.billing.csg.orders.GetOrderScheduleResponse;
import com.charter.enterprise.billing.csg.orders.GetOrdersRequest;
import com.charter.enterprise.billing.csg.orders.GetOrdersResponse;

/**
 * @author Rahul
 *
 */
public interface OrderRepository {

	/**
	 * Return Orders for given Order request.
	 * 
	 * @param request {@link GetOrdersRequest}
	 * @return {@link GetOrdersResponse}
	 */
	public GetOrdersResponse getOrders(GetOrdersRequest request);
	
	/**
	 * Return order schedules.
	 * 
	 * @param request
	 * @return {@link GetOrderScheduleResponse}
	 */
	public GetOrderScheduleResponse getOrderSchedule(GetOrderScheduleRequest request);
}