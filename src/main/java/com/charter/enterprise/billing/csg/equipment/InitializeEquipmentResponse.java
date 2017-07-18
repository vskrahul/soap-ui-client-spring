
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
 *         &lt;element name="InitializeEquipmentResult" type="{http://charter.com/enterprise/billing/csg/equipment}InitializeEquipmentResult" minOccurs="0"/>
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
    "initializeEquipmentResult"
})
@XmlRootElement(name = "InitializeEquipmentResponse")
public class InitializeEquipmentResponse {

    @XmlElement(name = "Result")
    protected Result result;
    @XmlElement(name = "InitializeEquipmentResult")
    protected InitializeEquipmentResult initializeEquipmentResult;

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
     * Gets the value of the initializeEquipmentResult property.
     * 
     * @return
     *     possible object is
     *     {@link InitializeEquipmentResult }
     *     
     */
    public InitializeEquipmentResult getInitializeEquipmentResult() {
        return initializeEquipmentResult;
    }

    /**
     * Sets the value of the initializeEquipmentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitializeEquipmentResult }
     *     
     */
    public void setInitializeEquipmentResult(InitializeEquipmentResult value) {
        this.initializeEquipmentResult = value;
    }

}
