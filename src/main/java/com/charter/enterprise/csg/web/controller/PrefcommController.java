/**
 * 
 */
package com.charter.enterprise.csg.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.charter.enterprise.csg.model.json.JsonResponse;
import com.charter.enterprise.csg.model.json.JsonResponseStatus;
import com.charter.enterprise.csg.service.PrefcommService;
import com.charter.enterprise.prefcomm.v1.FindContactDatasByContactIdResponse;
import com.charter.enterprise.prefcomm.v1.FindContactPreferencesByAccountNumberAndBillingSystemResponse;

/**
 * 
 * Rest controller to expose SOAP Prefcomm API as a REST API.
 * 
 * @author Rahul Vishvakarma
 *
 * @created May 25, 2018
 */
@RestController
@RequestMapping(value = "prefcomm")
public class PrefcommController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private PrefcommService service;
	
	@RequestMapping(path = "findContactPreferences", method = {RequestMethod.GET})
	public ResponseEntity<JsonResponse<FindContactPreferencesByAccountNumberAndBillingSystemResponse>>
		findContactPreferencesByAccountNumberAndBillingSystem(@RequestParam(name = "accountNumber") String accountNumber,
															@RequestParam(name = "billingSystemId") String billingSystemId) {
		
		logger.info("Calling findContactPreferencesByAccountNumberAndBillingSystem"
				+ "with account number {} and billing sytem id {}", accountNumber, billingSystemId);
		
		JsonResponse<FindContactPreferencesByAccountNumberAndBillingSystemResponse>
			json = service.findContactPreferencesByAccountNumberAndBillingSystem(accountNumber, billingSystemId);
		
		ResponseEntity<JsonResponse<FindContactPreferencesByAccountNumberAndBillingSystemResponse>>
			response = new ResponseEntity<>(json, JsonResponseStatus.Success.equals(json.getStatus())
													? HttpStatus.OK : HttpStatus.INTERNAL_SERVER_ERROR);
		
		return response;
	}
	
	@RequestMapping(path = "findContactDatasByContactId", method = {RequestMethod.GET})
	public ResponseEntity<?> findContactDatasByContactIdResponse(
											@RequestParam(name = "contactId") Long contactId) {
		
		logger.info("Calling findContactDatasByContactId with contactId {}", contactId);
		
		JsonResponse<FindContactDatasByContactIdResponse> json = service.findContactDatasByContactIdResponse(contactId);
		
		return new ResponseEntity<>(json, JsonResponseStatus.Success.equals(json.getStatus())
				? HttpStatus.OK : HttpStatus.INTERNAL_SERVER_ERROR);
	}
}