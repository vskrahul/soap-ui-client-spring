
package com.charter.enterprise.billing.csg.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiCallResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiCallResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wasAttempted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ExceptionInfo" type="{http://charter.com/enterprise/billing/csg/orders}ResultExceptionInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiCallResult", propOrder = {
    "wasAttempted",
    "exceptionInfo"
})
public class MultiCallResult {

    protected boolean wasAttempted;
    @XmlElement(name = "ExceptionInfo")
    protected ResultExceptionInfo2 exceptionInfo;

    /**
     * Gets the value of the wasAttempted property.
     * 
     */
    public boolean isWasAttempted() {
        return wasAttempted;
    }

    /**
     * Sets the value of the wasAttempted property.
     * 
     */
    public void setWasAttempted(boolean value) {
        this.wasAttempted = value;
    }

    /**
     * Gets the value of the exceptionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ResultExceptionInfo2 }
     *     
     */
    public ResultExceptionInfo2 getExceptionInfo() {
        return exceptionInfo;
    }

    /**
     * Sets the value of the exceptionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultExceptionInfo2 }
     *     
     */
    public void setExceptionInfo(ResultExceptionInfo2 value) {
        this.exceptionInfo = value;
    }

}
