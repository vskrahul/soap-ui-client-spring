package com.charter.enterprise.csg.repository.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;
import org.springframework.stereotype.Repository;

import com.charter.enterprise.csg.exception.RemoteException;
import com.charter.enterprise.csg.repository.PrefcommRepository;
import com.charter.enterprise.prefcomm.v1.EnterprisePreferredCommunicationDataService;
import com.charter.enterprise.prefcomm.v1.EnterprisePreferredCommunicationServiceException_Exception;
import com.charter.enterprise.prefcomm.v1.GetPreferenceAccountInfoByAccountNumberAndBillingSystem;
import com.charter.enterprise.prefcomm.v1.GetPreferenceAccountInfoByAccountNumberAndBillingSystemResponse;
import com.charter.enterprise.prefcomm.v1.PreferenceAccountInfo;

@Repository
public class PrefcommRepositoryWs implements PrefcommRepository {

	private Logger logger = LoggerFactory.getLogger(PrefcommRepositoryWs.class);
	
	@Autowired
	@Qualifier("prefcommProxy")
	private JaxWsPortProxyFactoryBean prefcommProxy;
	
	@Override
	public PreferenceAccountInfo getUser(String accountID, String billingSystemID) {
		logger.info("Calling prefcomm services.");
		
		
		
		GetPreferenceAccountInfoByAccountNumberAndBillingSystem request = new GetPreferenceAccountInfoByAccountNumberAndBillingSystem();
		request.setAccountNumber(accountID);
		request.setBillingSystemId(billingSystemID);
		
		GetPreferenceAccountInfoByAccountNumberAndBillingSystemResponse response = null;
		PreferenceAccountInfo accountInfo = null;
		
		EnterprisePreferredCommunicationDataService service = (EnterprisePreferredCommunicationDataService)prefcommProxy.getObject();
		try{
			response = service.getPreferenceAccountInfoByAccountNumberAndBillingSystem(request, null);
			accountInfo = response.getReturn();
		} catch(EnterprisePreferredCommunicationServiceException_Exception e) {
			logger.error(e.getMessage());
			throw new RemoteException();
		} catch(NullPointerException e) {
			logger.error(e.getMessage());
			throw new RemoteException();
		}
		return accountInfo;
	}

}
