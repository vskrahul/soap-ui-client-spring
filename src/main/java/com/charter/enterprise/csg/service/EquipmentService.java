package com.charter.enterprise.csg.service;

import java.util.List;

import com.charter.enterprise.billing.csg.equipment.Equipment;

/**
 * This provides method to interact with Equipment EAI web service.
 * 
 * @author Rahul
 *
 */
public interface EquipmentService {

	/**
	 * Returns the List of Equipments.
	 * 
	 * @param customerID
	 * @param locationID
	 * @param routingArea
	 * @return List of Equipments
	 */
	public List<Equipment> listEquipments(String accountNumber, String routingArea);
	
	/**
	 * Return period (;) separated equipments serial numbers.
	 * 
	 * @param accountNumber
	 * @param routingArea
	 * @return
	 */
	public String listEquipmentsSerialNumers(String accountNumber, String routingArea);
	
	/**
	 * This return's the serial number of a particular equipment.
	 * 
	 * @param accountNumber
	 * @param routingArea
	 * @param serialNumber
	 * @return
	 */
	public String getEuipmentStatus(String accountNumber, String routingArea, String serialNumber);
	
	/**
	 * This return's the type of a particular equipment.
	 * 
	 * @param accountNumber
	 * @param routingArea
	 * @param serialNumber
	 * @return
	 */
	public String getEuipmentType(String accountNumber, String routingArea, String serialNumber);
}
