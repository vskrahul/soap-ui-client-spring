package com.charter.enterprise.csg.repository;

import com.charter.enterprise.prefcomm.v1.FindContactDatasByContactId;
import com.charter.enterprise.prefcomm.v1.FindContactDatasByContactIdResponse;
import com.charter.enterprise.prefcomm.v1.FindContactPreferencesByAccountNumberAndBillingSystem;
import com.charter.enterprise.prefcomm.v1.FindContactPreferencesByAccountNumberAndBillingSystemResponse;

/**
 * Prefcomm repository which is interacting with SOAP Prefcomm API
 * 
 * @author Rahul Vishvakarma
 *
 * @created May 25, 2018
 */
public interface PrefcommRepository {

	/**
	 * Repository method to call Prefcomm SOAP findContactPreferencesByAccountNumberAndBillingSystem operation
	 * and returning back the response POJO.
	 * 
	 * @param request request body to call prefcomm SOAP operation findContactPreferencesByAccountNumberAndBillingSystem 
	 * @return {@link FindContactPreferencesByAccountNumberAndBillingSystemResponse}
	 */
	public FindContactPreferencesByAccountNumberAndBillingSystemResponse
		findContactPreferencesByAccountNumberAndBillingSystem(
					FindContactPreferencesByAccountNumberAndBillingSystem request);
	
	/**
	 * Repository layer to make prefcomm SOAP request for findContactDatasByContactId operation.
	 * 
	 * @param request {@link FindContactDatasByContactId}
	 * @return {@link FindContactDatasByContactIdResponse}
	 */
	public FindContactDatasByContactIdResponse findContactDatasByContactIdResponse(
										FindContactDatasByContactId request);
}
