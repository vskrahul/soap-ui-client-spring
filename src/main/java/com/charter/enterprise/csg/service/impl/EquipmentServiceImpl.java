package com.charter.enterprise.csg.service.impl;

import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.charter.enterprise.billing.csg.accounts.Account;
import com.charter.enterprise.billing.csg.equipment.Equipment;
import com.charter.enterprise.csg.exception.EquipmentNotFoundException;
import com.charter.enterprise.csg.repository.EquipmentRepository;
import com.charter.enterprise.csg.service.AccountService;
import com.charter.enterprise.csg.service.EquipmentService;

@Service
public class EquipmentServiceImpl implements EquipmentService {

	Logger logger = LoggerFactory.getLogger(EquipmentServiceImpl.class);
	
	@Autowired
	private EquipmentRepository equipmentRespository;
	
	@Autowired
	private AccountService accountService;
	
	@Override
	@Cacheable(cacheNames = {"listEquipments"})
	public List<Equipment> listEquipments(String accountNumber, String routingArea) {
		logger.info("listEquipments()...");
		Account account = accountService.getAccount(accountNumber, routingArea);
		return equipmentRespository.listEquipments(account.getCustomerId(), account.getLocationId(), routingArea);
	}
	
	@Override
	@Cacheable(cacheNames = {"listEquipmentsSerialNumers"})
	public String listEquipmentsSerialNumers(String accountNumber, String routingArea) {
		logger.info("listEquipmentsSerialNumers();");
		StringBuilder strBldr = new StringBuilder();
		String semicolon = ";";
		List<Equipment> equipmentList = listEquipments(accountNumber, routingArea);
		
		Iterator<Equipment> itr = equipmentList.iterator();
		
		while(itr.hasNext()) {
			Equipment e = itr.next();
			if(!e.getSerialNumber().equals(null))
				strBldr.append(e.getSerialNumber()  + semicolon);
		}
		if(strBldr.length() <= 0)
			throw new EquipmentNotFoundException();
		String str = strBldr.substring(0, strBldr.length());
		return str;
	}
	
	@Override
	@Cacheable(cacheNames = {"getEuipmentStatus"})
	public String getEuipmentStatus(String accountNumber, String routingArea, String serialNumber) {
		logger.info("getEuipmentStatus();");
		Equipment targetEquipment = getEquipment(accountNumber, routingArea, serialNumber);
		return targetEquipment.getStatus();
	}
	
	@Override
	@Cacheable(cacheNames = {"getEuipmentType"})
	public String getEuipmentType(String accountNumber, String routingArea, String serialNumber) {
		logger.info("getEuipmentType();");
		Equipment targetEquipment = getEquipment(accountNumber, routingArea, serialNumber);
		return targetEquipment.getType();
	}
	
	private Equipment getEquipment(String accountNumber, String routingArea, String serialNumber) {
		logger.info("getEquipment();");
		List<Equipment> equipmentList = listEquipments(accountNumber, routingArea);
		
		Equipment targetEquipment = new Equipment();
		targetEquipment.setSerialNumber(serialNumber);
		targetEquipment.setAccountID(accountNumber);
		
		Integer targetEquipmentIndex = findIndexOfEquipment(equipmentList, targetEquipment);
		if(targetEquipmentIndex == -1) {
			throw new EquipmentNotFoundException();
		}
		targetEquipment = equipmentList.get(targetEquipmentIndex);
		return targetEquipment;
	}
	
	private Integer findIndexOfEquipment(List<Equipment> list, Equipment targetobj) {
		logger.info("findIndexOfEquipment();");
		Integer index = -1;
		boolean flag = true;
		
		Iterator<Equipment> itr = list.iterator();
		
		while(itr.hasNext()) {
			index++;
			Equipment e = itr.next();
			if(!e.getSerialNumber().equals(null) && !e.getAccountID().equals(null) 
					&& targetobj.getSerialNumber().equals(e.getSerialNumber()) && targetobj.getAccountID().equals(e.getAccountID())) {
				flag = false;
				break;
			}
		}
		if(flag){
			logger.error("Equipment with serial no : " + targetobj.getSerialNumber() + ", could not found.");
		}
		return index;
	}

}
