
package com.charter.enterprise.billing.csg.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Bridger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bridger">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BidirectionalUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GateControl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bridger", propOrder = {
    "bidirectionalUnit",
    "gateControl"
})
public class Bridger {

    @XmlElement(name = "BidirectionalUnit")
    protected String bidirectionalUnit;
    @XmlElement(name = "GateControl")
    protected String gateControl;

    /**
     * Gets the value of the bidirectionalUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBidirectionalUnit() {
        return bidirectionalUnit;
    }

    /**
     * Sets the value of the bidirectionalUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBidirectionalUnit(String value) {
        this.bidirectionalUnit = value;
    }

    /**
     * Gets the value of the gateControl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGateControl() {
        return gateControl;
    }

    /**
     * Sets the value of the gateControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGateControl(String value) {
        this.gateControl = value;
    }

}
