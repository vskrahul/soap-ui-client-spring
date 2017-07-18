
package com.charter.enterprise.billing.csg.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelephoneNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelephoneNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Native" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PortedType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InventoryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Preferred" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephoneNumber", propOrder = {
    "number",
    "_native",
    "portedType",
    "inventoryType",
    "preferred"
})
public class TelephoneNumber {

    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "Native")
    protected boolean _native;
    @XmlElement(name = "PortedType")
    protected String portedType;
    @XmlElement(name = "InventoryType")
    protected String inventoryType;
    @XmlElement(name = "Preferred")
    protected boolean preferred;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the native property.
     * 
     */
    public boolean isNative() {
        return _native;
    }

    /**
     * Sets the value of the native property.
     * 
     */
    public void setNative(boolean value) {
        this._native = value;
    }

    /**
     * Gets the value of the portedType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortedType() {
        return portedType;
    }

    /**
     * Sets the value of the portedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortedType(String value) {
        this.portedType = value;
    }

    /**
     * Gets the value of the inventoryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryType() {
        return inventoryType;
    }

    /**
     * Sets the value of the inventoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryType(String value) {
        this.inventoryType = value;
    }

    /**
     * Gets the value of the preferred property.
     * 
     */
    public boolean isPreferred() {
        return preferred;
    }

    /**
     * Sets the value of the preferred property.
     * 
     */
    public void setPreferred(boolean value) {
        this.preferred = value;
    }

}
