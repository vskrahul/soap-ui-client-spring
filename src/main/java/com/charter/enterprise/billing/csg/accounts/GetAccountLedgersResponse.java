
package com.charter.enterprise.billing.csg.accounts;

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
 *         &lt;element name="AccountLedgerInfo" type="{http://charter.com/enterprise/billing/csg/accounts}AccountLedger" minOccurs="0"/>
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
    "accountLedgerInfo"
})
@XmlRootElement(name = "GetAccountLedgersResponse")
public class GetAccountLedgersResponse {

    @XmlElement(name = "Result")
    protected Result result;
    @XmlElement(name = "AccountLedgerInfo")
    protected AccountLedger accountLedgerInfo;

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
     * Gets the value of the accountLedgerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AccountLedger }
     *     
     */
    public AccountLedger getAccountLedgerInfo() {
        return accountLedgerInfo;
    }

    /**
     * Sets the value of the accountLedgerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountLedger }
     *     
     */
    public void setAccountLedgerInfo(AccountLedger value) {
        this.accountLedgerInfo = value;
    }

}
