package com.charter.enterprise.csg.service;

import com.charter.enterprise.csg.model.json.JsonResponse;
import com.charter.enterprise.prefcomm.v1.FindContactPreferencesByAccountNumberAndBillingSystemResponse;

/**
 * 
 * @author Rahul Vishvakarma
 *
 * @created May 25, 2018
 */
public interface PrefcommService {

	/**
	 * Prefcomm API Service layer for findContactPreferencesByAccountNumberAndBillingSystem operation.
	 * 
	 * @param accountNumber Account number of the user
	 * @param billingSystemId Billing Id
	 * @return {@link JsonResponse}
	 */
	public JsonResponse<FindContactPreferencesByAccountNumberAndBillingSystemResponse>
		findContactPreferencesByAccountNumberAndBillingSystem(String accountNumber, String billingSystemId);
}
