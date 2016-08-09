/**
 * 
 */
package com.charter.enterprise.csg.config;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rahul
 *
 */
public class Caches {

	/**
	 * Map which maps cache name with cache descriptions.
	 */
	private static final Map<String, String> cacheDescriptions = new HashMap<String, String>();
	
	/**
	 * Cache Names
	 */
	public static final String GET_ACCOUNT = "getAccount";
	
	public static final String LIST_EQUIPMENTS = "listEquipments";
	
	public static final String LIST_EQUIPMENTS_SERAIL_NUMBERS = "listEquipmentsSerialNumers";
	
	public static final String GET_EQUIPMENT_STATUS = "getEuipmentStatus";
	
	public static final String GET_EQUIPMENT_TYPE = "getEuipmentType";
	
	public static final String GET_SERVICES = "getServices";
	
	public static final String GET_PACKAGES = "getPackages";
	
	/**
	 * Cache Descriptions
	 */
	public static final String GET_ACCOUNT_DESC = "Get Account Cache";
	
	public static final String LIST_EQUIPMENTS_DESC = "List of Equipments Cache";
	
	public static final String LIST_EQUIPMENTS_SERAIL_NUMBERS_DESC = "List of Equipments Serial Numbers Cache";
	
	public static final String GET_EQUIPMENT_STATUS_DESC = "Get Equipment Status Cache";
	
	public static final String GET_EQUIPMENT_TYPE_DESC = "Get Equipment Type Cache";
	
	public static final String GET_SERVICES_DESC = "Get Services Cache";
	
	public static final String GET_PACKAGES_DESC = "Get Packages Cache";
	
	static {
		cacheDescriptions.put(GET_ACCOUNT, GET_ACCOUNT_DESC);
		cacheDescriptions.put(LIST_EQUIPMENTS, LIST_EQUIPMENTS_DESC);
		cacheDescriptions.put(LIST_EQUIPMENTS_SERAIL_NUMBERS, LIST_EQUIPMENTS_SERAIL_NUMBERS_DESC);
		cacheDescriptions.put(GET_EQUIPMENT_STATUS, GET_EQUIPMENT_STATUS_DESC);
		cacheDescriptions.put(GET_EQUIPMENT_TYPE, GET_EQUIPMENT_TYPE_DESC);
		cacheDescriptions.put(GET_SERVICES, GET_SERVICES_DESC);
		cacheDescriptions.put(GET_PACKAGES, GET_PACKAGES_DESC);
	}
	
	public static String getDescription(String cacheName) {
		String desc = Caches.cacheDescriptions.get(cacheName);
		desc = desc == null ? "Invalid Cache" : desc;
		return desc;
	}
}
