
package com.charter.enterprise.billing.csg.orders;

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
 *         &lt;element name="Result" type="{http://charter.com/enterprise/billing/csg/orders}Result" minOccurs="0"/>
 *         &lt;element name="AssignedNumbersResult" type="{http://charter.com/enterprise/billing/csg/orders}GetAssignedTelephoneNumberListResult" minOccurs="0"/>
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
    "assignedNumbersResult"
})
@XmlRootElement(name = "GetAssignedTelephoneNumberListResponse")
public class GetAssignedTelephoneNumberListResponse {

    @XmlElement(name = "Result")
    protected Result2 result;
    @XmlElement(name = "AssignedNumbersResult")
    protected GetAssignedTelephoneNumberListResult assignedNumbersResult;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Result2 }
     *     
     */
    public Result2 getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result2 }
     *     
     */
    public void setResult(Result2 value) {
        this.result = value;
    }

    /**
     * Gets the value of the assignedNumbersResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetAssignedTelephoneNumberListResult }
     *     
     */
    public GetAssignedTelephoneNumberListResult getAssignedNumbersResult() {
        return assignedNumbersResult;
    }

    /**
     * Sets the value of the assignedNumbersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAssignedTelephoneNumberListResult }
     *     
     */
    public void setAssignedNumbersResult(GetAssignedTelephoneNumberListResult value) {
        this.assignedNumbersResult = value;
    }

}
