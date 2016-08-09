
package com.charter.enterprise.billing.csg.accounts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServicePriceUpdateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServicePriceUpdateResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Result" type="{http://charter.com/enterprise/billing/csg/accounts}MultiCallResult" minOccurs="0"/>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reasons" type="{http://charter.com/enterprise/billing/csg/accounts}ServicesResultReasons" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CurrentBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="FutureFees" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="FutureTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CycleDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Frequency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TaxGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DelinquencyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MonetaryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServicesResult" type="{http://charter.com/enterprise/billing/csg/accounts}ServicesResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicePriceUpdateResult", propOrder = {
    "customerNumber",
    "locationId",
    "accountId",
    "businessUnit",
    "result",
    "orderId",
    "orderStatus",
    "reasons",
    "currentBalance",
    "futureFees",
    "futureTotal",
    "cycleDay",
    "frequency",
    "taxGroup",
    "delinquencyStatus",
    "monetaryStatus",
    "servicesResult"
})
public class ServicePriceUpdateResult {

    @XmlElement(name = "CustomerNumber")
    protected String customerNumber;
    @XmlElement(name = "LocationId")
    protected String locationId;
    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "BusinessUnit")
    protected String businessUnit;
    @XmlElement(name = "Result")
    protected MultiCallResult result;
    @XmlElement(name = "OrderId")
    protected String orderId;
    @XmlElement(name = "OrderStatus")
    protected String orderStatus;
    @XmlElement(name = "Reasons")
    protected List<ServicesResultReasons> reasons;
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
    @XmlElement(name = "ServicesResult")
    protected List<ServicesResult> servicesResult;

    /**
     * Gets the value of the customerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationId(String value) {
        this.locationId = value;
    }

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

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatus(String value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the reasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicesResultReasons }
     * 
     * 
     */
    public List<ServicesResultReasons> getReasons() {
        if (reasons == null) {
            reasons = new ArrayList<ServicesResultReasons>();
        }
        return this.reasons;
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

    /**
     * Gets the value of the servicesResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicesResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicesResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicesResult }
     * 
     * 
     */
    public List<ServicesResult> getServicesResult() {
        if (servicesResult == null) {
            servicesResult = new ArrayList<ServicesResult>();
        }
        return this.servicesResult;
    }

}
