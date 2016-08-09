package com.charter.enterprise.csg.config;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import com.charter.enterprise.csg.security.CredentialManager;
import com.charter.enterprise.csg.web.interceptor.RequestCounts;

public class CsgPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

	private Logger logger = LoggerFactory.getLogger(CsgPropertyPlaceholderConfigurer.class);
	
	private CredentialManager credentialManager = null;
	
	protected CsgPropertyPlaceholderConfigurer() {
		try{
			credentialManager = new CredentialManager();
		} catch(Exception e){
			throw new IllegalArgumentException("Not able to create CredentialManager bean.");
		}
	}
	
	@Override
	public void setProperties(Properties properties) {
		loadPrefcommProperties(properties);
		loadEAIProperties(properties);
		super.setProperties(properties);
	}
	
	/**
	 * Load Prefcomm Properties
	 * @param properties
	 */
	private void loadPrefcommProperties(Properties properties) {
		
		String env = properties.getProperty("environment.prefcomm", "prod");
		
		String username = properties.getProperty(env + ".prefcomm.username");
		String password = properties.getProperty(env + ".prefcomm.password");
		
		String prefcommEndPoint = properties.getProperty(env + ".prefcomm.endpoint");
		
		properties.setProperty("prefcomm.username", username);
		properties.setProperty("prefcomm.password", password);
		properties.setProperty("prefcomm.endpoint", prefcommEndPoint);
	}
	
	/**
	 * Load EAI Properties
	 * @param properties
	 */
	private void loadEAIProperties(Properties properties) {
		String environment = properties.getProperty("environment");
		
		String username = credentialManager.decrypt(properties.getProperty(environment  + ".username"));
		String password = credentialManager.decrypt(properties.getProperty(environment  + ".password"));
		
		String equipmentEndPoint = properties.getProperty(environment + ".equipment.endpoint");
		String accountEndPoint = properties.getProperty(environment + ".account.endpoint");
		String servicesEndPoint = properties.getProperty(environment + ".services.endpoint");
		
		String eaiAllowedRequests = properties.getProperty(environment + ".eai.request.perhour");
		
		RequestCounts _instance = RequestCounts.getInstance();
		try {
			_instance.setPerHourReuquestLimit(Integer.parseInt(eaiAllowedRequests == null ? "-1" : eaiAllowedRequests));
		} catch(NumberFormatException e) {
			_instance.setPerHourReuquestLimit(RequestCounts.PER_HOUR_REQUEST_LIMIT_DEFAULT);
		}
		
		logger.info("Equipment Endpoint : " + equipmentEndPoint);
		logger.info("Account Endpoint : " + accountEndPoint);
		
		properties.setProperty("eai.username", username);
		properties.setProperty("eai.password", password);
		properties.setProperty("eai.equipment.endpoint", equipmentEndPoint);
		properties.setProperty("eai.account.endpoint", accountEndPoint);
		properties.setProperty("eai.services.endpoint", servicesEndPoint);
		properties.setProperty("eai.request.perhour", eaiAllowedRequests);
	}
}
