
package com.charter.enterprise.billing.csg.equipment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InitializeEquipmentResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InitializeEquipmentResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CsgResponse" type="{http://charter.com/enterprise/billing/csg/equipment}CsgResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitializeEquipmentResult", propOrder = {
    "csgResponse"
})
public class InitializeEquipmentResult {

    @XmlElement(name = "CsgResponse")
    protected CsgResponse csgResponse;

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

}
