
package com.charter.enterprise.billing.csg.equipment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Video complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Video">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SecondaryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HostIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssociatedEquipment" type="{http://charter.com/enterprise/billing/csg/equipment}AssociatedEquipment" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Video", propOrder = {
    "secondaryAddress",
    "hostIdentifier",
    "dataIdentifier",
    "associatedEquipment",
    "type",
    "description"
})
public class Video {

    @XmlElement(name = "SecondaryAddress")
    protected String secondaryAddress;
    @XmlElement(name = "HostIdentifier")
    protected String hostIdentifier;
    @XmlElement(name = "DataIdentifier")
    protected String dataIdentifier;
    @XmlElement(name = "AssociatedEquipment")
    protected AssociatedEquipment associatedEquipment;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Gets the value of the secondaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryAddress() {
        return secondaryAddress;
    }

    /**
     * Sets the value of the secondaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryAddress(String value) {
        this.secondaryAddress = value;
    }

    /**
     * Gets the value of the hostIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostIdentifier() {
        return hostIdentifier;
    }

    /**
     * Sets the value of the hostIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostIdentifier(String value) {
        this.hostIdentifier = value;
    }

    /**
     * Gets the value of the dataIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataIdentifier() {
        return dataIdentifier;
    }

    /**
     * Sets the value of the dataIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataIdentifier(String value) {
        this.dataIdentifier = value;
    }

    /**
     * Gets the value of the associatedEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link AssociatedEquipment }
     *     
     */
    public AssociatedEquipment getAssociatedEquipment() {
        return associatedEquipment;
    }

    /**
     * Sets the value of the associatedEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedEquipment }
     *     
     */
    public void setAssociatedEquipment(AssociatedEquipment value) {
        this.associatedEquipment = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
