package com.charter.enterprise.billing.csg.equipment;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Equipments", propOrder = {
    "equipmentsList"
})
public class EquipmentList {

	@XmlElement(name = "EquipmentsList")
	protected List<Equipment> equipmentsList;

	public List<Equipment> getEquipmentsList() {
		if(null == equipmentsList){
			equipmentsList = new ArrayList<Equipment>();
		}
		return equipmentsList;
	}

	public void setEquipmentsList(List<Equipment> equipmentsList) {
		this.equipmentsList = equipmentsList;
	}
}
