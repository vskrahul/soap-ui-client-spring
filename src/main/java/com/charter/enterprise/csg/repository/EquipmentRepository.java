package com.charter.enterprise.csg.repository;

import java.util.List;

import com.charter.enterprise.billing.csg.equipment.Equipment;

/**
 * Interacts directly with SOAP EAI web services.
 * 
 * @author Rahul
 *
 */
public interface EquipmentRepository {

	/**
	 * 
	 * 
	 * @param customerID
	 * @param locationID
	 * @param routingArea
	 * @return
	 */
	public List<Equipment> listEquipments(String customerID, String locationID, String routingArea);
}
