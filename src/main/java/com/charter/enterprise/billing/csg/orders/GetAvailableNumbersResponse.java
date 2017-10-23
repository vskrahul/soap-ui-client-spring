
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
 *         &lt;element name="AvailableNumbersResult" type="{http://charter.com/enterprise/billing/csg/orders}GetAvailableNumbersResult" minOccurs="0"/>
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
    "availableNumbersResult"
})
@XmlRootElement(name = "GetAvailableNumbersResponse")
public class GetAvailableNumbersResponse {

    @XmlElement(name = "Result")
    protected Result2 result;
    @XmlElement(name = "AvailableNumbersResult")
    protected GetAvailableNumbersResult availableNumbersResult;

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
     * Gets the value of the availableNumbersResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetAvailableNumbersResult }
     *     
     */
    public GetAvailableNumbersResult getAvailableNumbersResult() {
        return availableNumbersResult;
    }

    /**
     * Sets the value of the availableNumbersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAvailableNumbersResult }
     *     
     */
    public void setAvailableNumbersResult(GetAvailableNumbersResult value) {
        this.availableNumbersResult = value;
    }

}
