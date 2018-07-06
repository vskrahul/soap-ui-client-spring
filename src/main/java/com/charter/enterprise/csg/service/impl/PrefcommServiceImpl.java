/**
 * 
 */
package com.charter.enterprise.csg.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.charter.enterprise.csg.model.json.JsonResponse;
import com.charter.enterprise.csg.model.json.JsonResponseStatus;
import com.charter.enterprise.csg.repository.PrefcommRepository;
import com.charter.enterprise.csg.service.PrefcommService;
import com.charter.enterprise.prefcomm.v1.FindContactDatasByContactId;
import com.charter.enterprise.prefcomm.v1.FindContactDatasByContactIdResponse;
import com.charter.enterprise.prefcomm.v1.FindContactPreferencesByAccountNumberAndBillingSystem;
import com.charter.enterprise.prefcomm.v1.FindContactPreferencesByAccountNumberAndBillingSystemResponse;

/**
 * Service implementation for {@link PrefcommService}
 * 
 * @author Rahul Vishvakarma
 *
 * @created May 25, 2018
 */
@Service
public class PrefcommServiceImpl implements PrefcommService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private PrefcommRepository repository;
	
	@Override
	public JsonResponse<FindContactPreferencesByAccountNumberAndBillingSystemResponse> 
			findContactPreferencesByAccountNumberAndBillingSystem(String accountNumber, String billingSystemId) {
		
		logger.info("Calling service layer for findContactPreferencesByAccountNumberAndBillingSystem");
		
		JsonResponse<FindContactPreferencesByAccountNumberAndBillingSystemResponse>
				json = new JsonResponse<>();
		
		try {
			
			FindContactPreferencesByAccountNumberAndBillingSystem
				request = new FindContactPreferencesByAccountNumberAndBillingSystem();
			request.setAccountNumber(accountNumber);
			request.setBillingSystemId(billingSystemId);
			
			FindContactPreferencesByAccountNumberAndBillingSystemResponse
				response = repository.findContactPreferencesByAccountNumberAndBillingSystem(request);
			
			json.setBody(response);
			json.setStatus(JsonResponseStatus.Success);
			
		} catch(Exception e) {
			json.setStatus(JsonResponseStatus.Error);
			json.setError(e.getMessage());
			logger.error(e.getMessage());
		}
		
		return json;
	}
	
	@Override
	public JsonResponse<FindContactDatasByContactIdResponse> findContactDatasByContactIdResponse(Long contactId) {
		
		JsonResponse<FindContactDatasByContactIdResponse> json
				= new JsonResponse<>();
		
		try {
			FindContactDatasByContactId request = new FindContactDatasByContactId();
			request.setContactId(contactId);
			
			json.setBody(repository.findContactDatasByContactIdResponse(request));
			json.setStatus(JsonResponseStatus.Success);
			
		} catch(Exception e) {
			json.setStatus(JsonResponseStatus.Error);
			json.setError(e.getMessage());
			logger.error(e.getMessage());
		}
		
		return json;
	}
}