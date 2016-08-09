package com.charter.enterprise.csg.service;

import com.charter.enterprise.csg.model.prefcomm.User;

/**
 * 
 * @author Rahul
 *
 */
public interface PrefcommService {

	public User getUser(String accountID, String billingSystemID);
}
