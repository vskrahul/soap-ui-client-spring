
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
 *         &lt;element name="Result1" type="{http://charter.com/enterprise/billing/csg/orders}Result1" minOccurs="0"/>
 *         &lt;element name="OrderScheduleResult" type="{http://charter.com/enterprise/billing/csg/orders}GetOrderScheduleResult" minOccurs="0"/>
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
    "result1",
    "orderScheduleResult"
})
@XmlRootElement(name = "GetOrderScheduleResponse")
public class GetOrderScheduleResponse {

    @XmlElement(name = "Result")
    protected Result1 result1;
    @XmlElement(name = "OrderScheduleResult")
    protected GetOrderScheduleResult orderScheduleResult;

    /**
     * Gets the value of the result1 property.
     * 
     * @return
     *     possible object is
     *     {@link Result1 }
     *     
     */
    public Result1 getResult1() {
        return result1;
    }

    /**
     * Sets the value of the result1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result1 }
     *     
     */
    public void setResult1(Result1 value) {
        this.result1 = value;
    }

    /**
     * Gets the value of the orderScheduleResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetOrderScheduleResult }
     *     
     */
    public GetOrderScheduleResult getOrderScheduleResult() {
        return orderScheduleResult;
    }

    /**
     * Sets the value of the orderScheduleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetOrderScheduleResult }
     *     
     */
    public void setOrderScheduleResult(GetOrderScheduleResult value) {
        this.orderScheduleResult = value;
    }

}