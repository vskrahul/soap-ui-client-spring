
package com.charter.enterprise.billing.csg.equipment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquipmentResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CsgResponse" type="{http://charter.com/enterprise/billing/csg/equipment}CsgResponse" minOccurs="0"/>
 *         &lt;element name="Business" type="{http://charter.com/enterprise/billing/csg/equipment}Business" minOccurs="0"/>
 *         &lt;element name="Customer" type="{http://charter.com/enterprise/billing/csg/equipment}Customer" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://charter.com/enterprise/billing/csg/equipment}Location" minOccurs="0"/>
 *         &lt;element name="EquipmentList" type="{http://charter.com/enterprise/billing/csg/equipment}ArrayOfEquipment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentResult", propOrder = {
    "csgResponse",
    "business",
    "customer",
    "location",
    "equipmentList"
})
public class EquipmentResult {

    @XmlElement(name = "CsgResponse")
    protected CsgResponse csgResponse;
    @XmlElement(name = "Business")
    protected Business business;
    @XmlElement(name = "Customer")
    protected Customer customer;
    @XmlElement(name = "Location")
    protected Location location;
    @XmlElement(name = "EquipmentList")
    protected ArrayOfEquipment equipmentList;

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
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomer(Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the equipmentList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEquipment }
     *     
     */
    public ArrayOfEquipment getEquipmentList() {
        return equipmentList;
    }

    /**
     * Sets the value of the equipmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEquipment }
     *     
     */
    public void setEquipmentList(ArrayOfEquipment value) {
        this.equipmentList = value;
    }

}
