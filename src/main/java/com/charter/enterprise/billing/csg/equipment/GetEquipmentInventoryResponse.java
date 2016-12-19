
package com.charter.enterprise.billing.csg.equipment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Result" type="{http://charter.com/enterprise/billing/csg/equipment}Result" minOccurs="0"/>
 *         &lt;element name="EquipmentInventoryResult" type="{http://charter.com/enterprise/billing/csg/equipment}EquipmentInventoryResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "result",
    "equipmentInventoryResult"
})
@XmlRootElement(name = "GetEquipmentInventoryResponse")
public class GetEquipmentInventoryResponse {

    @XmlElement(name = "Result")
    protected Result result;
    @XmlElement(name = "EquipmentInventoryResult")
    protected EquipmentInventoryResult equipmentInventoryResult;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setResult(Result value) {
        this.result = value;
    }

    /**
     * Gets the value of the equipmentInventoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentInventoryResult }
     *     
     */
    public EquipmentInventoryResult getEquipmentInventoryResult() {
        return equipmentInventoryResult;
    }

    /**
     * Sets the value of the equipmentInventoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentInventoryResult }
     *     
     */
    public void setEquipmentInventoryResult(EquipmentInventoryResult value) {
        this.equipmentInventoryResult = value;
    }

}
