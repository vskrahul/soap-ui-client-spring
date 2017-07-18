
package com.charter.enterprise.billing.csg.orders;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddOrderAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOrderAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountHandshakeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="FutureFees" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="FutureTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CycleDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Frequency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TaxGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DelinquencyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MonetaryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOrderAccount", propOrder = {
    "accountId",
    "accountHandshakeID",
    "currentBalance",
    "futureFees",
    "futureTotal",
    "cycleDay",
    "frequency",
    "taxGroup",
    "delinquencyStatus",
    "monetaryStatus"
})
public class AddOrderAccount {

    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "AccountHandshakeID")
    protected String accountHandshakeID;
    @XmlElement(name = "CurrentBalance", required = true)
    protected BigDecimal currentBalance;
    @XmlElement(name = "FutureFees", required = true)
    protected BigDecimal futureFees;
    @XmlElement(name = "FutureTotal", required = true)
    protected BigDecimal futureTotal;
    @XmlElement(name = "CycleDay")
    protected int cycleDay;
    @XmlElement(name = "Frequency")
    protected int frequency;
    @XmlElement(name = "TaxGroup")
    protected String taxGroup;
    @XmlElement(name = "DelinquencyStatus")
    protected String delinquencyStatus;
    @XmlElement(name = "MonetaryStatus")
    protected String monetaryStatus;

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
     * Gets the value of the accountHandshakeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHandshakeID() {
        return accountHandshakeID;
    }

    /**
     * Sets the value of the accountHandshakeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHandshakeID(String value) {
        this.accountHandshakeID = value;
    }

    /**
     * Gets the value of the currentBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Sets the value of the currentBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentBalance(BigDecimal value) {
        this.currentBalance = value;
    }

    /**
     * Gets the value of the futureFees property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFutureFees() {
        return futureFees;
    }

    /**
     * Sets the value of the futureFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFutureFees(BigDecimal value) {
        this.futureFees = value;
    }

    /**
     * Gets the value of the futureTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFutureTotal() {
        return futureTotal;
    }

    /**
     * Sets the value of the futureTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFutureTotal(BigDecimal value) {
        this.futureTotal = value;
    }

    /**
     * Gets the value of the cycleDay property.
     * 
     */
    public int getCycleDay() {
        return cycleDay;
    }

    /**
     * Sets the value of the cycleDay property.
     * 
     */
    public void setCycleDay(int value) {
        this.cycleDay = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     */
    public int getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     */
    public void setFrequency(int value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the taxGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxGroup() {
        return taxGroup;
    }

    /**
     * Sets the value of the taxGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxGroup(String value) {
        this.taxGroup = value;
    }

    /**
     * Gets the value of the delinquencyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelinquencyStatus() {
        return delinquencyStatus;
    }

    /**
     * Sets the value of the delinquencyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelinquencyStatus(String value) {
        this.delinquencyStatus = value;
    }

    /**
     * Gets the value of the monetaryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonetaryStatus() {
        return monetaryStatus;
    }

    /**
     * Sets the value of the monetaryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonetaryStatus(String value) {
        this.monetaryStatus = value;
    }

}
