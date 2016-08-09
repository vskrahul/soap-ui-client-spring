package com.charter.enterprise.csg.repository.ws;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.remoting.RemoteAccessException;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;
import org.springframework.stereotype.Repository;

import com.charter.enterprise.billing.csg.equipment.CsgHeaderInfo;
import com.charter.enterprise.billing.csg.equipment.Equipment;
import com.charter.enterprise.billing.csg.equipment.GetEquipmentRequest;
import com.charter.enterprise.billing.csg.equipment.GetEquipmentResponse;
import com.charter.enterprise.billing.equipment.EquipmentService;
import com.charter.enterprise.csg.exception.RemoteException;
import com.charter.enterprise.csg.repository.EquipmentRepository;
import com.charter.enterprise.csg.web.interceptor.RequestCounts;

@Repository
public class EquipmentRepositoryWs implements EquipmentRepository {
	
	private Logger logger = LoggerFactory.getLogger(EquipmentRepositoryWs.class);
	
	@Autowired
	@Qualifier("equipmentProxy")
	private JaxWsPortProxyFactoryBean equipmentProxy;
	
	@Override
	public List<Equipment> listEquipments(String customerID, String locationID, String routingArea) {
		
		GetEquipmentRequest request = new GetEquipmentRequest();
		
		CsgHeaderInfo csgHeaderInfo = new CsgHeaderInfo();
		csgHeaderInfo.setRoutingArea(routingArea);
		
		request.setCsgHeaderInfo(csgHeaderInfo);
		request.setCustomerID(customerID);
		request.setLocationID(locationID);
		
		EquipmentService service = (EquipmentService)equipmentProxy.getObject();
		GetEquipmentResponse response = null;
		try{
			response = service.getEquipment(request);
		}catch(RemoteAccessException e) {
			logger.error(e.getMessage());
			throw new RemoteException();
		} finally {
			RequestCounts instance = RequestCounts.getInstance();
			instance.setRequestCounter(instance.getRequestCounter() + 1);
		}
		return response.getEquipmentResult().getEquipmentList().getEquipment();
	}

}
