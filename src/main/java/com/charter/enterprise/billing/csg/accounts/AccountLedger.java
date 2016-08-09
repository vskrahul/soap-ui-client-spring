
package com.charter.enterprise.billing.csg.accounts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountLedger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountLedger">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LedgerDetail" type="{http://charter.com/enterprise/billing/csg/accounts}AccountLedgerDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountLedger", propOrder = {
    "accountId",
    "businessUnit",
    "ledgerDetail"
})
public class AccountLedger {

    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "BusinessUnit")
    protected String businessUnit;
    @XmlElement(name = "LedgerDetail")
    protected AccountLedgerDetail ledgerDetail;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the businessUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessUnit() {
        return businessUnit;
    }

    /**
     * Sets the value of the businessUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessUnit(String value) {
        this.businessUnit = value;
    }

    /**
     * Gets the value of the ledgerDetail property.
     * 
     * @return
     *     possible object is
     *     {@link AccountLedgerDetail }
     *     
     */
    public AccountLedgerDetail getLedgerDetail() {
        return ledgerDetail;
    }

    /**
     * Sets the value of the ledgerDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountLedgerDetail }
     *     
     */
    public void setLedgerDetail(AccountLedgerDetail value) {
        this.ledgerDetail = value;
    }

}
