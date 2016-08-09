
package com.charter.enterprise.billing.csg.accounts;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Statement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Statement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentStatementDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="StatementType" type="{http://charter.com/enterprise/billing/csg/accounts}StatementType"/>
 *         &lt;element name="StatementTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousStatementDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="BillingFromDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="BillingThruDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PreviousBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="RecurringCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OneTimeCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TotalFees" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Payment" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PendingPayment" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OtherCredit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="StatementBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="RemainingBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CalculatedBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CalculatedBalanceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentDueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="DueDateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NextIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NextDisplayGroup" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="BillingDetailCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BillingDetail" type="{http://charter.com/enterprise/billing/csg/accounts}BillingDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statement", propOrder = {
    "statementId",
    "currentStatementDate",
    "statementType",
    "statementTypeDescription",
    "previousStatementDate",
    "billingFromDate",
    "billingThruDate",
    "previousBalance",
    "recurringCharge",
    "oneTimeCharge",
    "totalFees",
    "payment",
    "pendingPayment",
    "otherCredit",
    "statementBalance",
    "remainingBalance",
    "calculatedBalance",
    "calculatedBalanceStatus",
    "paymentDueDate",
    "dueDateDescription",
    "nextIdentifier",
    "nextDisplayGroup",
    "billingDetailCount",
    "billingDetail"
})
public class Statement {

    @XmlElement(name = "StatementId")
    protected String statementId;
    @XmlElement(name = "CurrentStatementDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar currentStatementDate;
    @XmlElement(name = "StatementType", required = true)
    protected String statementType;
    @XmlElement(name = "StatementTypeDescription")
    protected String statementTypeDescription;
    @XmlElement(name = "PreviousStatementDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar previousStatementDate;
    @XmlElement(name = "BillingFromDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar billingFromDate;
    @XmlElement(name = "BillingThruDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar billingThruDate;
    @XmlElement(name = "PreviousBalance", required = true)
    protected BigDecimal previousBalance;
    @XmlElement(name = "RecurringCharge", required = true)
    protected BigDecimal recurringCharge;
    @XmlElement(name = "OneTimeCharge", required = true)
    protected BigDecimal oneTimeCharge;
    @XmlElement(name = "TotalFees", required = true)
    protected BigDecimal totalFees;
    @XmlElement(name = "Payment", required = true)
    protected BigDecimal payment;
    @XmlElement(name = "PendingPayment", required = true)
    protected BigDecimal pendingPayment;
    @XmlElement(name = "OtherCredit", required = true)
    protected BigDecimal otherCredit;
    @XmlElement(name = "StatementBalance", required = true)
    protected BigDecimal statementBalance;
    @XmlElement(name = "RemainingBalance", required = true)
    protected BigDecimal remainingBalance;
    @XmlElement(name = "CalculatedBalance", required = true)
    protected BigDecimal calculatedBalance;
    @XmlElement(name = "CalculatedBalanceStatus")
    protected String calculatedBalanceStatus;
    @XmlElement(name = "PaymentDueDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentDueDate;
    @XmlElement(name = "DueDateDescription")
    protected String dueDateDescription;
    @XmlElement(name = "NextIdentifier")
    protected String nextIdentifier;
    @XmlElement(name = "NextDisplayGroup")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger nextDisplayGroup;
    @XmlElement(name = "BillingDetailCount")
    protected int billingDetailCount;
    @XmlElement(name = "BillingDetail")
    protected List<BillingDetail> billingDetail;

    /**
     * Gets the value of the statementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementId() {
        return statementId;
    }

    /**
     * Sets the value of the statementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementId(String value) {
        this.statementId = value;
    }

    /**
     * Gets the value of the currentStatementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentStatementDate() {
        return currentStatementDate;
    }

    /**
     * Sets the value of the currentStatementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentStatementDate(XMLGregorianCalendar value) {
        this.currentStatementDate = value;
    }

    /**
     * Gets the value of the statementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementType() {
        return statementType;
    }

    /**
     * Sets the value of the statementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementType(String value) {
        this.statementType = value;
    }

    /**
     * Gets the value of the statementTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementTypeDescription() {
        return statementTypeDescription;
    }

    /**
     * Sets the value of the statementTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementTypeDescription(String value) {
        this.statementTypeDescription = value;
    }

    /**
     * Gets the value of the previousStatementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPreviousStatementDate() {
        return previousStatementDate;
    }

    /**
     * Sets the value of the previousStatementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreviousStatementDate(XMLGregorianCalendar value) {
        this.previousStatementDate = value;
    }

    /**
     * Gets the value of the billingFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillingFromDate() {
        return billingFromDate;
    }

    /**
     * Sets the value of the billingFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillingFromDate(XMLGregorianCalendar value) {
        this.billingFromDate = value;
    }

    /**
     * Gets the value of the billingThruDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillingThruDate() {
        return billingThruDate;
    }

    /**
     * Sets the value of the billingThruDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillingThruDate(XMLGregorianCalendar value) {
        this.billingThruDate = value;
    }

    /**
     * Gets the value of the previousBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreviousBalance() {
        return previousBalance;
    }

    /**
     * Sets the value of the previousBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreviousBalance(BigDecimal value) {
        this.previousBalance = value;
    }

    /**
     * Gets the value of the recurringCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecurringCharge() {
        return recurringCharge;
    }

    /**
     * Sets the value of the recurringCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecurringCharge(BigDecimal value) {
        this.recurringCharge = value;
    }

    /**
     * Gets the value of the oneTimeCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOneTimeCharge() {
        return oneTimeCharge;
    }

    /**
     * Sets the value of the oneTimeCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOneTimeCharge(BigDecimal value) {
        this.oneTimeCharge = value;
    }

    /**
     * Gets the value of the totalFees property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalFees() {
        return totalFees;
    }

    /**
     * Sets the value of the totalFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalFees(BigDecimal value) {
        this.totalFees = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayment(BigDecimal value) {
        this.payment = value;
    }

    /**
     * Gets the value of the pendingPayment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPendingPayment() {
        return pendingPayment;
    }

    /**
     * Sets the value of the pendingPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPendingPayment(BigDecimal value) {
        this.pendingPayment = value;
    }

    /**
     * Gets the value of the otherCredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherCredit() {
        return otherCredit;
    }

    /**
     * Sets the value of the otherCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherCredit(BigDecimal value) {
        this.otherCredit = value;
    }

    /**
     * Gets the value of the statementBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStatementBalance() {
        return statementBalance;
    }

    /**
     * Sets the value of the statementBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStatementBalance(BigDecimal value) {
        this.statementBalance = value;
    }

    /**
     * Gets the value of the remainingBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainingBalance() {
        return remainingBalance;
    }

    /**
     * Sets the value of the remainingBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainingBalance(BigDecimal value) {
        this.remainingBalance = value;
    }

    /**
     * Gets the value of the calculatedBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalculatedBalance() {
        return calculatedBalance;
    }

    /**
     * Sets the value of the calculatedBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalculatedBalance(BigDecimal value) {
        this.calculatedBalance = value;
    }

    /**
     * Gets the value of the calculatedBalanceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculatedBalanceStatus() {
        return calculatedBalanceStatus;
    }

    /**
     * Sets the value of the calculatedBalanceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculatedBalanceStatus(String value) {
        this.calculatedBalanceStatus = value;
    }

    /**
     * Gets the value of the paymentDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDueDate() {
        return paymentDueDate;
    }

    /**
     * Sets the value of the paymentDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDueDate(XMLGregorianCalendar value) {
        this.paymentDueDate = value;
    }

    /**
     * Gets the value of the dueDateDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDateDescription() {
        return dueDateDescription;
    }

    /**
     * Sets the value of the dueDateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDateDescription(String value) {
        this.dueDateDescription = value;
    }

    /**
     * Gets the value of the nextIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextIdentifier() {
        return nextIdentifier;
    }

    /**
     * Sets the value of the nextIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextIdentifier(String value) {
        this.nextIdentifier = value;
    }

    /**
     * Gets the value of the nextDisplayGroup property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNextDisplayGroup() {
        return nextDisplayGroup;
    }

    /**
     * Sets the value of the nextDisplayGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNextDisplayGroup(BigInteger value) {
        this.nextDisplayGroup = value;
    }

    /**
     * Gets the value of the billingDetailCount property.
     * 
     */
    public int getBillingDetailCount() {
        return billingDetailCount;
    }

    /**
     * Sets the value of the billingDetailCount property.
     * 
     */
    public void setBillingDetailCount(int value) {
        this.billingDetailCount = value;
    }

    /**
     * Gets the value of the billingDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingDetail }
     * 
     * 
     */
    public List<BillingDetail> getBillingDetail() {
        if (billingDetail == null) {
            billingDetail = new ArrayList<BillingDetail>();
        }
        return this.billingDetail;
    }

}
