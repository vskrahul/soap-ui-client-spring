
package com.charter.enterprise.billing.csg.accounts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerifyResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerifyResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PINType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Verified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Result" type="{http://charter.com/enterprise/billing/csg/accounts}MultiCallResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifyResult", propOrder = {
    "pinType",
    "verified",
    "result"
})
public class VerifyResult {

    @XmlElement(name = "PINType")
    protected String pinType;
    @XmlElement(name = "Verified")
    protected boolean verified;
    @XmlElement(name = "Result")
    protected MultiCallResult result;

    /**
     * Gets the value of the pinType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPINType() {
        return pinType;
    }

    /**
     * Sets the value of the pinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPINType(String value) {
        this.pinType = value;
    }

    /**
     * Gets the value of the verified property.
     * 
     */
    public boolean isVerified() {
        return verified;
    }

    /**
     * Sets the value of the verified property.
     * 
     */
    public void setVerified(boolean value) {
        this.verified = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link MultiCallResult }
     *     
     */
    public MultiCallResult getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiCallResult }
     *     
     */
    public void setResult(MultiCallResult value) {
        this.result = value;
    }

}
