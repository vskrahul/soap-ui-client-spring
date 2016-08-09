package com.charter.enterprise.csg.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.PropertiesFactoryBean;

import com.charter.enterprise.csg.security.CredentialManager;

/**
 * This contains method to return prototype beans by lookup {@link BeanFactory }.
 * 
 * @author rahul.vishvakarma
 *
 */
public interface ContextService {

	/**
	 * This class contains the utility methods to decrypt the credentials.
	 * 
	 * @return
	 */
	public CredentialManager getCredentialManager();
	
	/**
	 * Returns properties factory bean.
	 * 
	 * @return
	 */
	public PropertiesFactoryBean getPropertiesFactoryBean();
}