package com.charter.enterprise.csg.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.charter.enterprise.billing.csg.equipment.Equipment;
import com.charter.enterprise.csg.service.EquipmentService;

@RestController
@RequestMapping(value = "equipment")
public class EquipmentController {

	Logger logger = LoggerFactory.getLogger(EquipmentController.class);
	
	@Autowired
	private EquipmentService equipmentService;
	
	@RequestMapping(method = {RequestMethod.GET})
	public String getEquipmentStatus() {
		String str = "CSG Applilcation is deployed properly.";
		logger.info(str);
		return str;
	}
	
	@RequestMapping(value = "list/json", method = {RequestMethod.GET})
	public List<Equipment> listEquipmentsJson(@RequestParam("AccountID") String accountNumber, 
											@RequestParam(value = "RoutingArea") String routingArea) {
		return equipmentService.listEquipments(accountNumber, routingArea);
	}
	
	@RequestMapping(value = "list/xml", method = {RequestMethod.GET}, produces = {MediaType.APPLICATION_XML_VALUE})
	public List<Equipment> listEquipmentsXml(@RequestParam("AccountID") String accountNumber, 
											@RequestParam(value = "RoutingArea") String routingArea) {
		return equipmentService.listEquipments(accountNumber, routingArea);
	}
	
	@RequestMapping(value = "list", method = {RequestMethod.GET}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Equipment> listEquipments(@RequestParam("AccountID") String accountNumber, 
											@RequestParam(value = "RoutingArea") String routingArea) {
		logger.info("List of Equipments are trying to fetch from EAI for, AccountID : " + accountNumber + ", Routing Area : " + routingArea);
		return equipmentService.listEquipments(accountNumber, routingArea);
	}
	
	@RequestMapping(value = "serialNumbers", method = {RequestMethod.GET})
	public String getEquipmentSerialNumbers(@RequestParam("AccountID") String accountNumber, 
										@RequestParam(value = "RoutingArea") String routingArea) {
		logger.info("Equipments serial numbers are trying to fetch from EAI for, AccountID : " + accountNumber + ", Routing Area : " + routingArea);
		return equipmentService.listEquipmentsSerialNumers(accountNumber, routingArea);
	}
	
	@RequestMapping(value = "status", method = {RequestMethod.GET})
	public String getEquipmentStatus(@RequestParam("AccountID") String accountNumber, 
										@RequestParam(value = "RoutingArea") String routingArea,
										@RequestParam(value = "SerialNumber") String serialNumber) {
		logger.info("Equipments status is trying to fetch from EAI for, AccountID : " + accountNumber + ", Routing Area : " + routingArea + ", Serial number : " + serialNumber);
		return equipmentService.getEuipmentStatus(accountNumber, routingArea, serialNumber);
	}
	
	@RequestMapping(value = "type", method = {RequestMethod.GET})
	public String getEquipmentType(@RequestParam("AccountID") String accountNumber, 
										@RequestParam(value = "RoutingArea") String routingArea,
										@RequestParam(value = "SerialNumber") String serialNumber) {
		logger.info("Equipment type is trying to fetch from EAI for, AccountID : " + accountNumber + ", Routing Area : " + routingArea + ", Serial number : " + serialNumber);
		return equipmentService.getEuipmentType(accountNumber, routingArea, serialNumber);
	}
}
