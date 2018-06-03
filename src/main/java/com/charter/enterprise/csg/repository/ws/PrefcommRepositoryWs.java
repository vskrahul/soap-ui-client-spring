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

import com.charter.enterprise.csg.repository.PrefcommRepository;
import com.charter.enterprise.prefcomm.v1.EnterprisePreferredCommunicationDataService;
import com.charter.enterprise.prefcomm.v1.EnterprisePreferredCommunicationServiceException_Exception;
import com.charter.enterprise.prefcomm.v1.FindContactPreferencesByAccountNumberAndBillingSystem;
import com.charter.enterprise.prefcomm.v1.FindContactPreferencesByAccountNumberAndBillingSystemResponse;

/**
 * @author Rahul Vishvakarma
 *
 * @created May 25, 2018
 */
@Repository
public class PrefcommRepositoryWs implements PrefcommRepository {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("prefcommProxy")
	private JaxWsPortProxyFactoryBean prefcommProxy;
	
	@Override
	public FindContactPreferencesByAccountNumberAndBillingSystemResponse findContactPreferencesByAccountNumberAndBillingSystem(
			FindContactPreferencesByAccountNumberAndBillingSystem request) {
		
		FindContactPreferencesByAccountNumberAndBillingSystemResponse response = null;
		
		try {
			EnterprisePreferredCommunicationDataService service =
					(EnterprisePreferredCommunicationDataService)prefcommProxy.getObject();
			
			response = service.findContactPreferencesByAccountNumberAndBillingSystem(request, null);
			
		} catch(EnterprisePreferredCommunicationServiceException_Exception e) {
			logger.error(e.getMessage());
		}
		
		return response;
	}
}