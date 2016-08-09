
package com.charter.enterprise.billing.csg.equipment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquipmentInventoryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentInventoryResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CsgResponse" type="{http://charter.com/enterprise/billing/csg/equipment}CsgResponse" minOccurs="0"/>
 *         &lt;element name="Business" type="{http://charter.com/enterprise/billing/csg/equipment}Business" minOccurs="0"/>
 *         &lt;element name="EquipmentInventory" type="{http://charter.com/enterprise/billing/csg/equipment}EquipmentInventory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentInventoryResult", propOrder = {
    "csgResponse",
    "business",
    "equipmentInventory"
})
public class EquipmentInventoryResult {

    @XmlElement(name = "CsgResponse")
    protected CsgResponse csgResponse;
    @XmlElement(name = "Business")
    protected Business business;
    @XmlElement(name = "EquipmentInventory")
    protected EquipmentInventory equipmentInventory;

    /**
     * Gets the value of the csgResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CsgResponse }
     *     
     */
    public CsgResponse getCsgResponse() {
        return csgResponse;
    }

    /**
     * Sets the value of the csgResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsgResponse }
     *     
     */
    public void setCsgResponse(CsgResponse value) {
        this.csgResponse = value;
    }

    /**
     * Gets the value of the business property.
     * 
     * @return
     *     possible object is
     *     {@link Business }
     *     
     */
    public Business getBusiness() {
        return business;
    }

    /**
     * Sets the value of the business property.
     * 
     * @param value
     *     allowed object is
     *     {@link Business }
     *     
     */
    public void setBusiness(Business value) {
        this.business = value;
    }

    /**
     * Gets the value of the equipmentInventory property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentInventory }
     *     
     */
    public EquipmentInventory getEquipmentInventory() {
        return equipmentInventory;
    }

    /**
     * Sets the value of the equipmentInventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentInventory }
     *     
     */
    public void setEquipmentInventory(EquipmentInventory value) {
        this.equipmentInventory = value;
    }

}
