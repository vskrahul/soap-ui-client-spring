
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
 * <p>Java class for BillingDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="DetailType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatementIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="TransactionPostDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingDiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingDiscountDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Billing" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Prorated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="BalanceIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineOfBusiness" type="{http://charter.com/enterprise/billing/csg/accounts}LineOfBusiness" minOccurs="0"/>
 *         &lt;element name="Transfer" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Adjustment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Item" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Offer" type="{http://charter.com/enterprise/billing/csg/accounts}OfferDisplay" minOccurs="0"/>
 *                             &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OriginatingStatementIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Reason" type="{http://charter.com/enterprise/billing/csg/accounts}codeDescription" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Item" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Offer" type="{http://charter.com/enterprise/billing/csg/accounts}OfferDisplay" minOccurs="0"/>
 *                   &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BillingIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="TelephoneNumberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Provisioned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BeforeQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BeginTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Installment" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="NumberOfInstallments" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="Billing" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ThruDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DiscountDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Component" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ComponentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TelephoneNumberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ClassCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Provisioned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LineOfBusiness" type="{http://charter.com/enterprise/billing/csg/accounts}LineOfBusiness" minOccurs="0"/>
 *                             &lt;element name="Billing" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ThruDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="DiscountDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Miscellaneous" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Payment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DeclineReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Resubmitted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;choice>
 *                     &lt;element name="Card" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                               &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                               &lt;element name="TypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                               &lt;element name="AuthorizationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="EFT" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="RoutingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                               &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                               &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                   &lt;element name="ScheduledStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Tax" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TaxCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TaxTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Usage" type="{http://charter.com/enterprise/billing/csg/accounts}Usage" minOccurs="0"/>
 *         &lt;element name="StatementSummary" type="{http://charter.com/enterprise/billing/csg/accounts}StatementSummary" minOccurs="0"/>
 *         &lt;element name="Prorate" type="{http://charter.com/enterprise/billing/csg/accounts}Prorate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingDetail", propOrder = {
    "identifier",
    "detailType",
    "statementIdentifier",
    "transactionCode",
    "transactionDate",
    "transactionPostDate",
    "amount",
    "description",
    "reference",
    "serviceCode",
    "serviceCodeDescription",
    "billingCode",
    "billingCodeDescription",
    "billingDiscount",
    "billingDiscountDescription",
    "billing",
    "prorated",
    "balance",
    "balanceIndicator",
    "lineOfBusiness",
    "transfer",
    "adjustment",
    "item",
    "miscellaneous",
    "payment",
    "tax",
    "usage",
    "statementSummary",
    "prorate"
})
public class BillingDetail {

    @XmlElement(name = "Identifier")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger identifier;
    @XmlElement(name = "DetailType")
    protected String detailType;
    @XmlElement(name = "StatementIdentifier")
    protected String statementIdentifier;
    @XmlElement(name = "TransactionCode")
    protected String transactionCode;
    @XmlElement(name = "TransactionDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transactionDate;
    @XmlElement(name = "TransactionPostDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transactionPostDate;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Reference")
    protected String reference;
    @XmlElement(name = "ServiceCode")
    protected String serviceCode;
    @XmlElement(name = "ServiceCodeDescription")
    protected String serviceCodeDescription;
    @XmlElement(name = "BillingCode")
    protected String billingCode;
    @XmlElement(name = "BillingCodeDescription")
    protected String billingCodeDescription;
    @XmlElement(name = "BillingDiscount")
    protected String billingDiscount;
    @XmlElement(name = "BillingDiscountDescription")
    protected String billingDiscountDescription;
    @XmlElement(name = "Billing")
    protected BillingDetail.Billing billing;
    @XmlElement(name = "Prorated")
    protected String prorated;
    @XmlElement(name = "Balance", required = true)
    protected BigDecimal balance;
    @XmlElement(name = "BalanceIndicator")
    protected String balanceIndicator;
    @XmlElement(name = "LineOfBusiness")
    protected LineOfBusiness lineOfBusiness;
    @XmlElement(name = "Transfer")
    protected BillingDetail.Transfer transfer;
    @XmlElement(name = "Adjustment")
    protected BillingDetail.Adjustment adjustment;
    @XmlElement(name = "Item")
    protected BillingDetail.Item item;
    @XmlElement(name = "Miscellaneous")
    protected BillingDetail.Miscellaneous miscellaneous;
    @XmlElement(name = "Payment")
    protected BillingDetail.Payment payment;
    @XmlElement(name = "Tax")
    protected BillingDetail.Tax tax;
    @XmlElement(name = "Usage")
    protected Usage usage;
    @XmlElement(name = "StatementSummary")
    protected StatementSummary statementSummary;
    @XmlElement(name = "Prorate")
    protected Prorate prorate;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdentifier(BigInteger value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the detailType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailType() {
        return detailType;
    }

    /**
     * Sets the value of the detailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailType(String value) {
        this.detailType = value;
    }

    /**
     * Gets the value of the statementIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementIdentifier() {
        return statementIdentifier;
    }

    /**
     * Sets the value of the statementIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementIdentifier(String value) {
        this.statementIdentifier = value;
    }

    /**
     * Gets the value of the transactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCode() {
        return transactionCode;
    }

    /**
     * Sets the value of the transactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCode(String value) {
        this.transactionCode = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the transactionPostDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionPostDate() {
        return transactionPostDate;
    }

    /**
     * Sets the value of the transactionPostDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionPostDate(XMLGregorianCalendar value) {
        this.transactionPostDate = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the serviceCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCodeDescription() {
        return serviceCodeDescription;
    }

    /**
     * Sets the value of the serviceCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCodeDescription(String value) {
        this.serviceCodeDescription = value;
    }

    /**
     * Gets the value of the billingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCode() {
        return billingCode;
    }

    /**
     * Sets the value of the billingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCode(String value) {
        this.billingCode = value;
    }

    /**
     * Gets the value of the billingCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCodeDescription() {
        return billingCodeDescription;
    }

    /**
     * Sets the value of the billingCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCodeDescription(String value) {
        this.billingCodeDescription = value;
    }

    /**
     * Gets the value of the billingDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingDiscount() {
        return billingDiscount;
    }

    /**
     * Sets the value of the billingDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingDiscount(String value) {
        this.billingDiscount = value;
    }

    /**
     * Gets the value of the billingDiscountDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingDiscountDescription() {
        return billingDiscountDescription;
    }

    /**
     * Sets the value of the billingDiscountDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingDiscountDescription(String value) {
        this.billingDiscountDescription = value;
    }

    /**
     * Gets the value of the billing property.
     * 
     * @return
     *     possible object is
     *     {@link BillingDetail.Billing }
     *     
     */
    public BillingDetail.Billing getBilling() {
        return billing;
    }

    /**
     * Sets the value of the billing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingDetail.Billing }
     *     
     */
    public void setBilling(BillingDetail.Billing value) {
        this.billing = value;
    }

    /**
     * Gets the value of the prorated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProrated() {
        return prorated;
    }

    /**
     * Sets the value of the prorated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProrated(String value) {
        this.prorated = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * Gets the value of the balanceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceIndicator() {
        return balanceIndicator;
    }

    /**
     * Sets the value of the balanceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceIndicator(String value) {
        this.balanceIndicator = value;
    }

    /**
     * Gets the value of the lineOfBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link LineOfBusiness }
     *     
     */
    public LineOfBusiness getLineOfBusiness() {
        return lineOfBusiness;
    }

    /**
     * Sets the value of the lineOfBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineOfBusiness }
     *     
     */
    public void setLineOfBusiness(LineOfBusiness value) {
        this.lineOfBusiness = value;
    }

    /**
     * Gets the value of the transfer property.
     * 
     * @return
     *     possible object is
     *     {@link BillingDetail.Transfer }
     *     
     */
    public BillingDetail.Transfer getTransfer() {
        return transfer;
    }

    /**
     * Sets the value of the transfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingDetail.Transfer }
     *     
     */
    public void setTransfer(BillingDetail.Transfer value) {
        this.transfer = value;
    }

    /**
     * Gets the value of the adjustment property.
     * 
     * @return
     *     possible object is
     *     {@link BillingDetail.Adjustment }
     *     
     */
    public BillingDetail.Adjustment getAdjustment() {
        return adjustment;
    }

    /**
     * Sets the value of the adjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingDetail.Adjustment }
     *     
     */
    public void setAdjustment(BillingDetail.Adjustment value) {
        this.adjustment = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link BillingDetail.Item }
     *     
     */
    public BillingDetail.Item getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingDetail.Item }
     *     
     */
    public void setItem(BillingDetail.Item value) {
        this.item = value;
    }

    /**
     * Gets the value of the miscellaneous property.
     * 
     * @return
     *     possible object is
     *     {@link BillingDetail.Miscellaneous }
     *     
     */
    public BillingDetail.Miscellaneous getMiscellaneous() {
        return miscellaneous;
    }

    /**
     * Sets the value of the miscellaneous property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingDetail.Miscellaneous }
     *     
     */
    public void setMiscellaneous(BillingDetail.Miscellaneous value) {
        this.miscellaneous = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link BillingDetail.Payment }
     *     
     */
    public BillingDetail.Payment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingDetail.Payment }
     *     
     */
    public void setPayment(BillingDetail.Payment value) {
        this.payment = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link BillingDetail.Tax }
     *     
     */
    public BillingDetail.Tax getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingDetail.Tax }
     *     
     */
    public void setTax(BillingDetail.Tax value) {
        this.tax = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link Usage }
     *     
     */
    public Usage getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Usage }
     *     
     */
    public void setUsage(Usage value) {
        this.usage = value;
    }

    /**
     * Gets the value of the statementSummary property.
     * 
     * @return
     *     possible object is
     *     {@link StatementSummary }
     *     
     */
    public StatementSummary getStatementSummary() {
        return statementSummary;
    }

    /**
     * Sets the value of the statementSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementSummary }
     *     
     */
    public void setStatementSummary(StatementSummary value) {
        this.statementSummary = value;
    }

    /**
     * Gets the value of the prorate property.
     * 
     * @return
     *     possible object is
     *     {@link Prorate }
     *     
     */
    public Prorate getProrate() {
        return prorate;
    }

    /**
     * Sets the value of the prorate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prorate }
     *     
     */
    public void setProrate(Prorate value) {
        this.prorate = value;
    }


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
     *         &lt;element name="Item" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Offer" type="{http://charter.com/enterprise/billing/csg/accounts}OfferDisplay" minOccurs="0"/>
     *                   &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OriginatingStatementIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Reason" type="{http://charter.com/enterprise/billing/csg/accounts}codeDescription" maxOccurs="unbounded" minOccurs="0"/>
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
        "item",
        "originatingStatementIdentifier",
        "reason"
    })
    public static class Adjustment {

        @XmlElement(name = "Item")
        protected BillingDetail.Adjustment.Item item;
        @XmlElement(name = "OriginatingStatementIdentifier")
        protected String originatingStatementIdentifier;
        @XmlElement(name = "Reason")
        protected List<CodeDescription> reason;

        /**
         * Gets the value of the item property.
         * 
         * @return
         *     possible object is
         *     {@link BillingDetail.Adjustment.Item }
         *     
         */
        public BillingDetail.Adjustment.Item getItem() {
            return item;
        }

        /**
         * Sets the value of the item property.
         * 
         * @param value
         *     allowed object is
         *     {@link BillingDetail.Adjustment.Item }
         *     
         */
        public void setItem(BillingDetail.Adjustment.Item value) {
            this.item = value;
        }

        /**
         * Gets the value of the originatingStatementIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginatingStatementIdentifier() {
            return originatingStatementIdentifier;
        }

        /**
         * Sets the value of the originatingStatementIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginatingStatementIdentifier(String value) {
            this.originatingStatementIdentifier = value;
        }

        /**
         * Gets the value of the reason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReason().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CodeDescription }
         * 
         * 
         */
        public List<CodeDescription> getReason() {
            if (reason == null) {
                reason = new ArrayList<CodeDescription>();
            }
            return this.reason;
        }


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
         *         &lt;element name="Offer" type="{http://charter.com/enterprise/billing/csg/accounts}OfferDisplay" minOccurs="0"/>
         *         &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "offer",
            "itemCode"
        })
        public static class Item {

            @XmlElement(name = "Offer")
            protected OfferDisplay offer;
            @XmlElement(name = "ItemCode")
            protected String itemCode;

            /**
             * Gets the value of the offer property.
             * 
             * @return
             *     possible object is
             *     {@link OfferDisplay }
             *     
             */
            public OfferDisplay getOffer() {
                return offer;
            }

            /**
             * Sets the value of the offer property.
             * 
             * @param value
             *     allowed object is
             *     {@link OfferDisplay }
             *     
             */
            public void setOffer(OfferDisplay value) {
                this.offer = value;
            }

            /**
             * Gets the value of the itemCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemCode() {
                return itemCode;
            }

            /**
             * Sets the value of the itemCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemCode(String value) {
                this.itemCode = value;
            }

        }

    }


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
     *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
        "discountAmount"
    })
    public static class Billing {

        @XmlElement(name = "DiscountAmount", required = true)
        protected BigDecimal discountAmount;

        /**
         * Gets the value of the discountAmount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDiscountAmount() {
            return discountAmount;
        }

        /**
         * Sets the value of the discountAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDiscountAmount(BigDecimal value) {
            this.discountAmount = value;
        }

    }


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
     *         &lt;element name="Offer" type="{http://charter.com/enterprise/billing/csg/accounts}OfferDisplay" minOccurs="0"/>
     *         &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BillingIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="TelephoneNumberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Provisioned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BeforeQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BeginTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Installment" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="NumberOfInstallments" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="Billing" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ThruDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DiscountDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Component" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ComponentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TelephoneNumberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ClassCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Provisioned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LineOfBusiness" type="{http://charter.com/enterprise/billing/csg/accounts}LineOfBusiness" minOccurs="0"/>
     *                   &lt;element name="Billing" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ThruDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="DiscountDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "offer",
        "itemCode",
        "billingIdentifier",
        "telephoneNumberId",
        "provisioned",
        "beforeQuantity",
        "quantity",
        "beginDate",
        "beginTime",
        "endDate",
        "endTime",
        "installment",
        "numberOfInstallments",
        "billing",
        "component"
    })
    public static class Item {

        @XmlElement(name = "Offer")
        protected OfferDisplay offer;
        @XmlElement(name = "ItemCode")
        protected String itemCode;
        @XmlElement(name = "BillingIdentifier")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger billingIdentifier;
        @XmlElement(name = "TelephoneNumberId")
        protected String telephoneNumberId;
        @XmlElement(name = "Provisioned")
        protected String provisioned;
        @XmlElement(name = "BeforeQuantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger beforeQuantity;
        @XmlElement(name = "Quantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger quantity;
        @XmlElement(name = "BeginDate")
        protected String beginDate;
        @XmlElement(name = "BeginTime")
        protected String beginTime;
        @XmlElement(name = "EndDate")
        protected String endDate;
        @XmlElement(name = "EndTime")
        protected String endTime;
        @XmlElement(name = "Installment")
        protected BigInteger installment;
        @XmlElement(name = "NumberOfInstallments")
        protected BigInteger numberOfInstallments;
        @XmlElement(name = "Billing")
        protected BillingDetail.Item.Billing billing;
        @XmlElement(name = "Component")
        protected List<BillingDetail.Item.Component> component;

        /**
         * Gets the value of the offer property.
         * 
         * @return
         *     possible object is
         *     {@link OfferDisplay }
         *     
         */
        public OfferDisplay getOffer() {
            return offer;
        }

        /**
         * Sets the value of the offer property.
         * 
         * @param value
         *     allowed object is
         *     {@link OfferDisplay }
         *     
         */
        public void setOffer(OfferDisplay value) {
            this.offer = value;
        }

        /**
         * Gets the value of the itemCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItemCode() {
            return itemCode;
        }

        /**
         * Sets the value of the itemCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItemCode(String value) {
            this.itemCode = value;
        }

        /**
         * Gets the value of the billingIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBillingIdentifier() {
            return billingIdentifier;
        }

        /**
         * Sets the value of the billingIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBillingIdentifier(BigInteger value) {
            this.billingIdentifier = value;
        }

        /**
         * Gets the value of the telephoneNumberId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTelephoneNumberId() {
            return telephoneNumberId;
        }

        /**
         * Sets the value of the telephoneNumberId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTelephoneNumberId(String value) {
            this.telephoneNumberId = value;
        }

        /**
         * Gets the value of the provisioned property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProvisioned() {
            return provisioned;
        }

        /**
         * Sets the value of the provisioned property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProvisioned(String value) {
            this.provisioned = value;
        }

        /**
         * Gets the value of the beforeQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getBeforeQuantity() {
            return beforeQuantity;
        }

        /**
         * Sets the value of the beforeQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setBeforeQuantity(BigInteger value) {
            this.beforeQuantity = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the beginDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeginDate() {
            return beginDate;
        }

        /**
         * Sets the value of the beginDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeginDate(String value) {
            this.beginDate = value;
        }

        /**
         * Gets the value of the beginTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeginTime() {
            return beginTime;
        }

        /**
         * Sets the value of the beginTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeginTime(String value) {
            this.beginTime = value;
        }

        /**
         * Gets the value of the endDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndDate() {
            return endDate;
        }

        /**
         * Sets the value of the endDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndDate(String value) {
            this.endDate = value;
        }

        /**
         * Gets the value of the endTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndTime() {
            return endTime;
        }

        /**
         * Sets the value of the endTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndTime(String value) {
            this.endTime = value;
        }

        /**
         * Gets the value of the installment property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getInstallment() {
            return installment;
        }

        /**
         * Sets the value of the installment property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setInstallment(BigInteger value) {
            this.installment = value;
        }

        /**
         * Gets the value of the numberOfInstallments property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumberOfInstallments() {
            return numberOfInstallments;
        }

        /**
         * Sets the value of the numberOfInstallments property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumberOfInstallments(BigInteger value) {
            this.numberOfInstallments = value;
        }

        /**
         * Gets the value of the billing property.
         * 
         * @return
         *     possible object is
         *     {@link BillingDetail.Item.Billing }
         *     
         */
        public BillingDetail.Item.Billing getBilling() {
            return billing;
        }

        /**
         * Sets the value of the billing property.
         * 
         * @param value
         *     allowed object is
         *     {@link BillingDetail.Item.Billing }
         *     
         */
        public void setBilling(BillingDetail.Item.Billing value) {
            this.billing = value;
        }

        /**
         * Gets the value of the component property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the component property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComponent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BillingDetail.Item.Component }
         * 
         * 
         */
        public List<BillingDetail.Item.Component> getComponent() {
            if (component == null) {
                component = new ArrayList<BillingDetail.Item.Component>();
            }
            return this.component;
        }


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
         *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ThruDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DiscountDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "fromDate",
            "thruDate",
            "discount",
            "discountDescription"
        })
        public static class Billing {

            @XmlElement(name = "FromDate")
            protected String fromDate;
            @XmlElement(name = "ThruDate")
            protected String thruDate;
            @XmlElement(name = "Discount")
            protected String discount;
            @XmlElement(name = "DiscountDescription")
            protected String discountDescription;

            /**
             * Gets the value of the fromDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFromDate() {
                return fromDate;
            }

            /**
             * Sets the value of the fromDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFromDate(String value) {
                this.fromDate = value;
            }

            /**
             * Gets the value of the thruDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getThruDate() {
                return thruDate;
            }

            /**
             * Sets the value of the thruDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setThruDate(String value) {
                this.thruDate = value;
            }

            /**
             * Gets the value of the discount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDiscount() {
                return discount;
            }

            /**
             * Sets the value of the discount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDiscount(String value) {
                this.discount = value;
            }

            /**
             * Gets the value of the discountDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDiscountDescription() {
                return discountDescription;
            }

            /**
             * Sets the value of the discountDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDiscountDescription(String value) {
                this.discountDescription = value;
            }

        }


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
         *         &lt;element name="ComponentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TelephoneNumberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ClassCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Provisioned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LineOfBusiness" type="{http://charter.com/enterprise/billing/csg/accounts}LineOfBusiness" minOccurs="0"/>
         *         &lt;element name="Billing" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ThruDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="DiscountDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "componentCode",
            "description",
            "telephoneNumberId",
            "classCode",
            "classCodeDescription",
            "provisioned",
            "lineOfBusiness",
            "billing"
        })
        public static class Component {

            @XmlElement(name = "ComponentCode")
            protected String componentCode;
            @XmlElement(name = "Description")
            protected String description;
            @XmlElement(name = "TelephoneNumberId")
            protected String telephoneNumberId;
            @XmlElement(name = "ClassCode")
            protected String classCode;
            @XmlElement(name = "ClassCodeDescription")
            protected String classCodeDescription;
            @XmlElement(name = "Provisioned")
            protected String provisioned;
            @XmlElement(name = "LineOfBusiness")
            protected LineOfBusiness lineOfBusiness;
            @XmlElement(name = "Billing")
            protected BillingDetail.Item.Component.Billing billing;

            /**
             * Gets the value of the componentCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getComponentCode() {
                return componentCode;
            }

            /**
             * Sets the value of the componentCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setComponentCode(String value) {
                this.componentCode = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Gets the value of the telephoneNumberId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTelephoneNumberId() {
                return telephoneNumberId;
            }

            /**
             * Sets the value of the telephoneNumberId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTelephoneNumberId(String value) {
                this.telephoneNumberId = value;
            }

            /**
             * Gets the value of the classCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClassCode() {
                return classCode;
            }

            /**
             * Sets the value of the classCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClassCode(String value) {
                this.classCode = value;
            }

            /**
             * Gets the value of the classCodeDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClassCodeDescription() {
                return classCodeDescription;
            }

            /**
             * Sets the value of the classCodeDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClassCodeDescription(String value) {
                this.classCodeDescription = value;
            }

            /**
             * Gets the value of the provisioned property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProvisioned() {
                return provisioned;
            }

            /**
             * Sets the value of the provisioned property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProvisioned(String value) {
                this.provisioned = value;
            }

            /**
             * Gets the value of the lineOfBusiness property.
             * 
             * @return
             *     possible object is
             *     {@link LineOfBusiness }
             *     
             */
            public LineOfBusiness getLineOfBusiness() {
                return lineOfBusiness;
            }

            /**
             * Sets the value of the lineOfBusiness property.
             * 
             * @param value
             *     allowed object is
             *     {@link LineOfBusiness }
             *     
             */
            public void setLineOfBusiness(LineOfBusiness value) {
                this.lineOfBusiness = value;
            }

            /**
             * Gets the value of the billing property.
             * 
             * @return
             *     possible object is
             *     {@link BillingDetail.Item.Component.Billing }
             *     
             */
            public BillingDetail.Item.Component.Billing getBilling() {
                return billing;
            }

            /**
             * Sets the value of the billing property.
             * 
             * @param value
             *     allowed object is
             *     {@link BillingDetail.Item.Component.Billing }
             *     
             */
            public void setBilling(BillingDetail.Item.Component.Billing value) {
                this.billing = value;
            }


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
             *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ThruDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="DiscountDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
                "fromDate",
                "thruDate",
                "amount",
                "discount",
                "discountDescription",
                "discountAmount"
            })
            public static class Billing {

                @XmlElement(name = "FromDate")
                protected String fromDate;
                @XmlElement(name = "ThruDate")
                protected String thruDate;
                @XmlElement(name = "Amount")
                protected String amount;
                @XmlElement(name = "Discount")
                protected String discount;
                @XmlElement(name = "DiscountDescription")
                protected String discountDescription;
                @XmlElement(name = "DiscountAmount", required = true)
                protected BigDecimal discountAmount;

                /**
                 * Gets the value of the fromDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFromDate() {
                    return fromDate;
                }

                /**
                 * Sets the value of the fromDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFromDate(String value) {
                    this.fromDate = value;
                }

                /**
                 * Gets the value of the thruDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getThruDate() {
                    return thruDate;
                }

                /**
                 * Sets the value of the thruDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setThruDate(String value) {
                    this.thruDate = value;
                }

                /**
                 * Gets the value of the amount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAmount() {
                    return amount;
                }

                /**
                 * Sets the value of the amount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAmount(String value) {
                    this.amount = value;
                }

                /**
                 * Gets the value of the discount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDiscount() {
                    return discount;
                }

                /**
                 * Sets the value of the discount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDiscount(String value) {
                    this.discount = value;
                }

                /**
                 * Gets the value of the discountDescription property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDiscountDescription() {
                    return discountDescription;
                }

                /**
                 * Sets the value of the discountDescription property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDiscountDescription(String value) {
                    this.discountDescription = value;
                }

                /**
                 * Gets the value of the discountAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getDiscountAmount() {
                    return discountAmount;
                }

                /**
                 * Sets the value of the discountAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setDiscountAmount(BigDecimal value) {
                    this.discountAmount = value;
                }

            }

        }

    }


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
     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "description"
    })
    public static class Miscellaneous {

        @XmlElement(name = "Description")
        protected String description;

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

    }


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
     *         &lt;element name="DeclineReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Resubmitted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;choice>
     *           &lt;element name="Card" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                     &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                     &lt;element name="TypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                     &lt;element name="AuthorizationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="EFT" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="RoutingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                     &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                     &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *         &lt;element name="ScheduledStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "declineReason",
        "resubmitted",
        "card",
        "eft",
        "scheduledStatus",
        "date"
    })
    public static class Payment {

        @XmlElement(name = "DeclineReason")
        protected String declineReason;
        @XmlElement(name = "Resubmitted")
        protected String resubmitted;
        @XmlElement(name = "Card")
        protected BillingDetail.Payment.Card card;
        @XmlElement(name = "EFT")
        protected BillingDetail.Payment.EFT eft;
        @XmlElement(name = "ScheduledStatus")
        protected String scheduledStatus;
        @XmlElement(name = "Date")
        protected String date;

        /**
         * Gets the value of the declineReason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeclineReason() {
            return declineReason;
        }

        /**
         * Sets the value of the declineReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeclineReason(String value) {
            this.declineReason = value;
        }

        /**
         * Gets the value of the resubmitted property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResubmitted() {
            return resubmitted;
        }

        /**
         * Sets the value of the resubmitted property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResubmitted(String value) {
            this.resubmitted = value;
        }

        /**
         * Gets the value of the card property.
         * 
         * @return
         *     possible object is
         *     {@link BillingDetail.Payment.Card }
         *     
         */
        public BillingDetail.Payment.Card getCard() {
            return card;
        }

        /**
         * Sets the value of the card property.
         * 
         * @param value
         *     allowed object is
         *     {@link BillingDetail.Payment.Card }
         *     
         */
        public void setCard(BillingDetail.Payment.Card value) {
            this.card = value;
        }

        /**
         * Gets the value of the eft property.
         * 
         * @return
         *     possible object is
         *     {@link BillingDetail.Payment.EFT }
         *     
         */
        public BillingDetail.Payment.EFT getEFT() {
            return eft;
        }

        /**
         * Sets the value of the eft property.
         * 
         * @param value
         *     allowed object is
         *     {@link BillingDetail.Payment.EFT }
         *     
         */
        public void setEFT(BillingDetail.Payment.EFT value) {
            this.eft = value;
        }

        /**
         * Gets the value of the scheduledStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScheduledStatus() {
            return scheduledStatus;
        }

        /**
         * Sets the value of the scheduledStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScheduledStatus(String value) {
            this.scheduledStatus = value;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDate(String value) {
            this.date = value;
        }


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
         *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AuthorizationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "number",
            "type",
            "typeDescription",
            "authorizationNumber"
        })
        public static class Card {

            @XmlElement(name = "Number")
            protected String number;
            @XmlElement(name = "Type")
            protected String type;
            @XmlElement(name = "TypeDescription")
            protected String typeDescription;
            @XmlElement(name = "AuthorizationNumber")
            protected String authorizationNumber;

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumber(String value) {
                this.number = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the typeDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTypeDescription() {
                return typeDescription;
            }

            /**
             * Sets the value of the typeDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTypeDescription(String value) {
                this.typeDescription = value;
            }

            /**
             * Gets the value of the authorizationNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAuthorizationNumber() {
                return authorizationNumber;
            }

            /**
             * Sets the value of the authorizationNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAuthorizationNumber(String value) {
                this.authorizationNumber = value;
            }

        }


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
         *         &lt;element name="RoutingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "routingNumber",
            "accountNumber",
            "accountType"
        })
        public static class EFT {

            @XmlElement(name = "RoutingNumber")
            protected String routingNumber;
            @XmlElement(name = "AccountNumber")
            protected String accountNumber;
            @XmlElement(name = "AccountType")
            protected String accountType;

            /**
             * Gets the value of the routingNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRoutingNumber() {
                return routingNumber;
            }

            /**
             * Sets the value of the routingNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRoutingNumber(String value) {
                this.routingNumber = value;
            }

            /**
             * Gets the value of the accountNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountNumber() {
                return accountNumber;
            }

            /**
             * Sets the value of the accountNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountNumber(String value) {
                this.accountNumber = value;
            }

            /**
             * Gets the value of the accountType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountType() {
                return accountType;
            }

            /**
             * Sets the value of the accountType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountType(String value) {
                this.accountType = value;
            }

        }

    }


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
     *         &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TaxCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TaxTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "taxCode",
        "taxCodeDescription",
        "taxType",
        "taxTypeDescription"
    })
    public static class Tax {

        @XmlElement(name = "TaxCode")
        protected String taxCode;
        @XmlElement(name = "TaxCodeDescription")
        protected String taxCodeDescription;
        @XmlElement(name = "TaxType")
        protected String taxType;
        @XmlElement(name = "TaxTypeDescription")
        protected String taxTypeDescription;

        /**
         * Gets the value of the taxCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxCode() {
            return taxCode;
        }

        /**
         * Sets the value of the taxCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxCode(String value) {
            this.taxCode = value;
        }

        /**
         * Gets the value of the taxCodeDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxCodeDescription() {
            return taxCodeDescription;
        }

        /**
         * Sets the value of the taxCodeDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxCodeDescription(String value) {
            this.taxCodeDescription = value;
        }

        /**
         * Gets the value of the taxType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxType() {
            return taxType;
        }

        /**
         * Sets the value of the taxType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxType(String value) {
            this.taxType = value;
        }

        /**
         * Gets the value of the taxTypeDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxTypeDescription() {
            return taxTypeDescription;
        }

        /**
         * Sets the value of the taxTypeDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxTypeDescription(String value) {
            this.taxTypeDescription = value;
        }

    }


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
     *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "accountId"
    })
    public static class Transfer {

        @XmlElement(name = "AccountId")
        protected String accountId;

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

    }

}
