package com.charter.enterprise.csg.repository;

import com.charter.enterprise.prefcomm.v1.PreferenceAccountInfo;

public interface PrefcommRepository {

	public PreferenceAccountInfo getUser(String accountID, String billingSystemID);
}
