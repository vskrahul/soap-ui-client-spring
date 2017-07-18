
package com.charter.enterprise.billing.csg.accounts;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Result" type="{http://charter.com/enterprise/billing/csg/accounts}Result" minOccurs="0"/>
 *         &lt;element name="VerifyResult" type="{http://charter.com/enterprise/billing/csg/accounts}VerifyResult" maxOccurs="unbounded" minOccurs="0"/>
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
    "verifyResult"
})
@XmlRootElement(name = "GetVerificationResponse")
public class GetVerificationResponse {

    @XmlElement(name = "Result")
    protected Result result;
    @XmlElement(name = "VerifyResult")
    protected List<VerifyResult> verifyResult;

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
     * Gets the value of the verifyResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verifyResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerifyResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerifyResult }
     * 
     * 
     */
    public List<VerifyResult> getVerifyResult() {
        if (verifyResult == null) {
            verifyResult = new ArrayList<VerifyResult>();
        }
        return this.verifyResult;
    }

}
