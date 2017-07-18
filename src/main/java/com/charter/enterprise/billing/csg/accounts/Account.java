
package com.charter.enterprise.billing.csg.accounts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Account">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SysPrin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Agent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Classification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Salutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponsibleParty" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Salutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="StatementNameFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Remittance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Occurrances" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OriginalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LastChangeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Miscellaneous" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConnectStatus" type="{http://charter.com/enterprise/billing/csg/accounts}ConnectStatus"/>
 *         &lt;element name="ConnectDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisconnectDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MonetaryStatus" type="{http://charter.com/enterprise/billing/csg/accounts}MonetaryStatus"/>
 *         &lt;element name="CurrentAccountBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PendingPayment" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PPVAccountBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PPVCreditLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DunningGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Payment" type="{http://charter.com/enterprise/billing/csg/accounts}PaymentDetail" minOccurs="0"/>
 *         &lt;element name="BillingInfo" type="{http://charter.com/enterprise/billing/csg/accounts}BillingInfo" minOccurs="0"/>
 *         &lt;element name="Identification" type="{http://charter.com/enterprise/billing/csg/accounts}Identification" minOccurs="0"/>
 *         &lt;element name="DaysDelinquent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DelinquencyStatus" type="{http://charter.com/enterprise/billing/csg/accounts}DelinquencyStatus"/>
 *         &lt;element name="DelinquencyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PromiseToPayDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PaymentHistory" type="{http://charter.com/enterprise/billing/csg/accounts}PaymentHistory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LastPaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="LastPaymentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="SubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubTypeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DebitDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="History" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LockboxPending" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TotalPending" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="FutureDated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuditCreationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LinesOfBusiness" type="{http://charter.com/enterprise/billing/csg/accounts}LineOfBusiness" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Bulk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transfer" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CustomField" type="{http://charter.com/enterprise/billing/csg/accounts}CustomField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillToAddress" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BillToName" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Salutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="First" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Last" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Account", propOrder = {
    "accountId",
    "customerId",
    "region",
    "sysPrin",
    "agent",
    "type",
    "classification",
    "salutation",
    "firstName",
    "lastName",
    "companyName",
    "primaryPhone",
    "secondaryPhone",
    "addressLine1",
    "addressLine2",
    "city",
    "state",
    "zipCode",
    "responsibleParty",
    "remittance",
    "miscellaneous",
    "connectStatus",
    "connectDate",
    "disconnectDate",
    "monetaryStatus",
    "currentAccountBalance",
    "pendingPayment",
    "ppvAccountBalance",
    "ppvCreditLimit",
    "dunningGroup",
    "payment",
    "billingInfo",
    "identification",
    "daysDelinquent",
    "delinquencyStatus",
    "delinquencyAmount",
    "promiseToPayDate",
    "paymentHistory",
    "lastPaymentAmount",
    "lastPaymentDate",
    "subType",
    "subTypeStatus",
    "debitDate",
    "history",
    "lockboxPending",
    "totalPending",
    "futureDated",
    "auditCreationDate",
    "locationId",
    "locationType",
    "locationTypeDescription",
    "linesOfBusiness",
    "bulk",
    "vip",
    "transfer",
    "customField",
    "pin",
    "billToAddress",
    "billToName"
})
public class Account {

    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "CustomerId")
    protected String customerId;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "SysPrin")
    protected String sysPrin;
    @XmlElement(name = "Agent")
    protected String agent;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Classification")
    protected String classification;
    @XmlElement(name = "Salutation")
    protected String salutation;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "PrimaryPhone")
    protected String primaryPhone;
    @XmlElement(name = "SecondaryPhone")
    protected String secondaryPhone;
    @XmlElement(name = "AddressLine1")
    protected String addressLine1;
    @XmlElement(name = "AddressLine2")
    protected String addressLine2;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "ZipCode")
    protected String zipCode;
    @XmlElement(name = "ResponsibleParty")
    protected Account.ResponsibleParty responsibleParty;
    @XmlElement(name = "Remittance")
    protected Account.Remittance remittance;
    @XmlElement(name = "Miscellaneous")
    protected String miscellaneous;
    @XmlElement(name = "ConnectStatus", required = true)
    protected ConnectStatus connectStatus;
    @XmlElement(name = "ConnectDate")
    protected String connectDate;
    @XmlElement(name = "DisconnectDate")
    protected String disconnectDate;
    @XmlElement(name = "MonetaryStatus", required = true)
    protected MonetaryStatus monetaryStatus;
    @XmlElement(name = "CurrentAccountBalance", required = true)
    protected BigDecimal currentAccountBalance;
    @XmlElement(name = "PendingPayment", required = true)
    protected BigDecimal pendingPayment;
    @XmlElement(name = "PPVAccountBalance", required = true)
    protected BigDecimal ppvAccountBalance;
    @XmlElement(name = "PPVCreditLimit", required = true)
    protected BigDecimal ppvCreditLimit;
    @XmlElement(name = "DunningGroup")
    protected String dunningGroup;
    @XmlElement(name = "Payment")
    protected PaymentDetail payment;
    @XmlElement(name = "BillingInfo")
    protected BillingInfo billingInfo;
    @XmlElement(name = "Identification")
    protected Identification identification;
    @XmlElement(name = "DaysDelinquent")
    protected int daysDelinquent;
    @XmlElement(name = "DelinquencyStatus", required = true)
    protected DelinquencyStatus delinquencyStatus;
    @XmlElement(name = "DelinquencyAmount", required = true)
    protected BigDecimal delinquencyAmount;
    @XmlElement(name = "PromiseToPayDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar promiseToPayDate;
    @XmlElement(name = "PaymentHistory")
    protected List<PaymentHistory> paymentHistory;
    @XmlElement(name = "LastPaymentAmount", required = true)
    protected BigDecimal lastPaymentAmount;
    @XmlElement(name = "LastPaymentDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastPaymentDate;
    @XmlElement(name = "SubType")
    protected String subType;
    @XmlElement(name = "SubTypeStatus")
    protected String subTypeStatus;
    @XmlElement(name = "DebitDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar debitDate;
    @XmlElement(name = "History")
    protected String history;
    @XmlElement(name = "LockboxPending", required = true)
    protected BigDecimal lockboxPending;
    @XmlElement(name = "TotalPending", required = true)
    protected BigDecimal totalPending;
    @XmlElement(name = "FutureDated")
    protected String futureDated;
    @XmlElement(name = "AuditCreationDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar auditCreationDate;
    @XmlElement(name = "LocationId")
    protected String locationId;
    @XmlElement(name = "LocationType")
    protected String locationType;
    @XmlElement(name = "LocationTypeDescription")
    protected String locationTypeDescription;
    @XmlElement(name = "LinesOfBusiness")
    protected List<LineOfBusiness> linesOfBusiness;
    @XmlElement(name = "Bulk")
    protected String bulk;
    @XmlElement(name = "VIP")
    protected String vip;
    @XmlElement(name = "Transfer")
    protected Account.Transfer transfer;
    @XmlElement(name = "CustomField")
    protected List<CustomField> customField;
    @XmlElement(name = "PIN")
    protected String pin;
    @XmlElement(name = "BillToAddress")
    protected Account.BillToAddress billToAddress;
    @XmlElement(name = "BillToName")
    protected Account.BillToName billToName;

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
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the sysPrin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysPrin() {
        return sysPrin;
    }

    /**
     * Sets the value of the sysPrin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysPrin(String value) {
        this.sysPrin = value;
    }

    /**
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgent(String value) {
        this.agent = value;
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
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassification(String value) {
        this.classification = value;
    }

    /**
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalutation(String value) {
        this.salutation = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the primaryPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPhone() {
        return primaryPhone;
    }

    /**
     * Sets the value of the primaryPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPhone(String value) {
        this.primaryPhone = value;
    }

    /**
     * Gets the value of the secondaryPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryPhone() {
        return secondaryPhone;
    }

    /**
     * Sets the value of the secondaryPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryPhone(String value) {
        this.secondaryPhone = value;
    }

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the responsibleParty property.
     * 
     * @return
     *     possible object is
     *     {@link Account.ResponsibleParty }
     *     
     */
    public Account.ResponsibleParty getResponsibleParty() {
        return responsibleParty;
    }

    /**
     * Sets the value of the responsibleParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account.ResponsibleParty }
     *     
     */
    public void setResponsibleParty(Account.ResponsibleParty value) {
        this.responsibleParty = value;
    }

    /**
     * Gets the value of the remittance property.
     * 
     * @return
     *     possible object is
     *     {@link Account.Remittance }
     *     
     */
    public Account.Remittance getRemittance() {
        return remittance;
    }

    /**
     * Sets the value of the remittance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account.Remittance }
     *     
     */
    public void setRemittance(Account.Remittance value) {
        this.remittance = value;
    }

    /**
     * Gets the value of the miscellaneous property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscellaneous() {
        return miscellaneous;
    }

    /**
     * Sets the value of the miscellaneous property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscellaneous(String value) {
        this.miscellaneous = value;
    }

    /**
     * Gets the value of the connectStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectStatus }
     *     
     */
    public ConnectStatus getConnectStatus() {
        return connectStatus;
    }

    /**
     * Sets the value of the connectStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectStatus }
     *     
     */
    public void setConnectStatus(ConnectStatus value) {
        this.connectStatus = value;
    }

    /**
     * Gets the value of the connectDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectDate() {
        return connectDate;
    }

    /**
     * Sets the value of the connectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectDate(String value) {
        this.connectDate = value;
    }

    /**
     * Gets the value of the disconnectDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisconnectDate() {
        return disconnectDate;
    }

    /**
     * Sets the value of the disconnectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisconnectDate(String value) {
        this.disconnectDate = value;
    }

    /**
     * Gets the value of the monetaryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryStatus }
     *     
     */
    public MonetaryStatus getMonetaryStatus() {
        return monetaryStatus;
    }

    /**
     * Sets the value of the monetaryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryStatus }
     *     
     */
    public void setMonetaryStatus(MonetaryStatus value) {
        this.monetaryStatus = value;
    }

    /**
     * Gets the value of the currentAccountBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentAccountBalance() {
        return currentAccountBalance;
    }

    /**
     * Sets the value of the currentAccountBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentAccountBalance(BigDecimal value) {
        this.currentAccountBalance = value;
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
     * Gets the value of the ppvAccountBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPPVAccountBalance() {
        return ppvAccountBalance;
    }

    /**
     * Sets the value of the ppvAccountBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPPVAccountBalance(BigDecimal value) {
        this.ppvAccountBalance = value;
    }

    /**
     * Gets the value of the ppvCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPPVCreditLimit() {
        return ppvCreditLimit;
    }

    /**
     * Sets the value of the ppvCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPPVCreditLimit(BigDecimal value) {
        this.ppvCreditLimit = value;
    }

    /**
     * Gets the value of the dunningGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDunningGroup() {
        return dunningGroup;
    }

    /**
     * Sets the value of the dunningGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDunningGroup(String value) {
        this.dunningGroup = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetail }
     *     
     */
    public PaymentDetail getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetail }
     *     
     */
    public void setPayment(PaymentDetail value) {
        this.payment = value;
    }

    /**
     * Gets the value of the billingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BillingInfo }
     *     
     */
    public BillingInfo getBillingInfo() {
        return billingInfo;
    }

    /**
     * Sets the value of the billingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingInfo }
     *     
     */
    public void setBillingInfo(BillingInfo value) {
        this.billingInfo = value;
    }

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link Identification }
     *     
     */
    public Identification getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identification }
     *     
     */
    public void setIdentification(Identification value) {
        this.identification = value;
    }

    /**
     * Gets the value of the daysDelinquent property.
     * 
     */
    public int getDaysDelinquent() {
        return daysDelinquent;
    }

    /**
     * Sets the value of the daysDelinquent property.
     * 
     */
    public void setDaysDelinquent(int value) {
        this.daysDelinquent = value;
    }

    /**
     * Gets the value of the delinquencyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DelinquencyStatus }
     *     
     */
    public DelinquencyStatus getDelinquencyStatus() {
        return delinquencyStatus;
    }

    /**
     * Sets the value of the delinquencyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelinquencyStatus }
     *     
     */
    public void setDelinquencyStatus(DelinquencyStatus value) {
        this.delinquencyStatus = value;
    }

    /**
     * Gets the value of the delinquencyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDelinquencyAmount() {
        return delinquencyAmount;
    }

    /**
     * Sets the value of the delinquencyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDelinquencyAmount(BigDecimal value) {
        this.delinquencyAmount = value;
    }

    /**
     * Gets the value of the promiseToPayDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPromiseToPayDate() {
        return promiseToPayDate;
    }

    /**
     * Sets the value of the promiseToPayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPromiseToPayDate(XMLGregorianCalendar value) {
        this.promiseToPayDate = value;
    }

    /**
     * Gets the value of the paymentHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentHistory }
     * 
     * 
     */
    public List<PaymentHistory> getPaymentHistory() {
        if (paymentHistory == null) {
            paymentHistory = new ArrayList<PaymentHistory>();
        }
        return this.paymentHistory;
    }

    /**
     * Gets the value of the lastPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastPaymentAmount() {
        return lastPaymentAmount;
    }

    /**
     * Sets the value of the lastPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastPaymentAmount(BigDecimal value) {
        this.lastPaymentAmount = value;
    }

    /**
     * Gets the value of the lastPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPaymentDate() {
        return lastPaymentDate;
    }

    /**
     * Sets the value of the lastPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPaymentDate(XMLGregorianCalendar value) {
        this.lastPaymentDate = value;
    }

    /**
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubType(String value) {
        this.subType = value;
    }

    /**
     * Gets the value of the subTypeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTypeStatus() {
        return subTypeStatus;
    }

    /**
     * Sets the value of the subTypeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTypeStatus(String value) {
        this.subTypeStatus = value;
    }

    /**
     * Gets the value of the debitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDebitDate() {
        return debitDate;
    }

    /**
     * Sets the value of the debitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDebitDate(XMLGregorianCalendar value) {
        this.debitDate = value;
    }

    /**
     * Gets the value of the history property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistory() {
        return history;
    }

    /**
     * Sets the value of the history property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistory(String value) {
        this.history = value;
    }

    /**
     * Gets the value of the lockboxPending property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLockboxPending() {
        return lockboxPending;
    }

    /**
     * Sets the value of the lockboxPending property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLockboxPending(BigDecimal value) {
        this.lockboxPending = value;
    }

    /**
     * Gets the value of the totalPending property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPending() {
        return totalPending;
    }

    /**
     * Sets the value of the totalPending property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPending(BigDecimal value) {
        this.totalPending = value;
    }

    /**
     * Gets the value of the futureDated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFutureDated() {
        return futureDated;
    }

    /**
     * Sets the value of the futureDated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFutureDated(String value) {
        this.futureDated = value;
    }

    /**
     * Gets the value of the auditCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuditCreationDate() {
        return auditCreationDate;
    }

    /**
     * Sets the value of the auditCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuditCreationDate(XMLGregorianCalendar value) {
        this.auditCreationDate = value;
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
     * Gets the value of the locationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationType(String value) {
        this.locationType = value;
    }

    /**
     * Gets the value of the locationTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationTypeDescription() {
        return locationTypeDescription;
    }

    /**
     * Sets the value of the locationTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationTypeDescription(String value) {
        this.locationTypeDescription = value;
    }

    /**
     * Gets the value of the linesOfBusiness property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linesOfBusiness property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinesOfBusiness().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineOfBusiness }
     * 
     * 
     */
    public List<LineOfBusiness> getLinesOfBusiness() {
        if (linesOfBusiness == null) {
            linesOfBusiness = new ArrayList<LineOfBusiness>();
        }
        return this.linesOfBusiness;
    }

    /**
     * Gets the value of the bulk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBulk() {
        return bulk;
    }

    /**
     * Sets the value of the bulk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBulk(String value) {
        this.bulk = value;
    }

    /**
     * Gets the value of the vip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIP() {
        return vip;
    }

    /**
     * Sets the value of the vip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIP(String value) {
        this.vip = value;
    }

    /**
     * Gets the value of the transfer property.
     * 
     * @return
     *     possible object is
     *     {@link Account.Transfer }
     *     
     */
    public Account.Transfer getTransfer() {
        return transfer;
    }

    /**
     * Sets the value of the transfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account.Transfer }
     *     
     */
    public void setTransfer(Account.Transfer value) {
        this.transfer = value;
    }

    /**
     * Gets the value of the customField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomField }
     * 
     * 
     */
    public List<CustomField> getCustomField() {
        if (customField == null) {
            customField = new ArrayList<CustomField>();
        }
        return this.customField;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIN() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIN(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the billToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Account.BillToAddress }
     *     
     */
    public Account.BillToAddress getBillToAddress() {
        return billToAddress;
    }

    /**
     * Sets the value of the billToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account.BillToAddress }
     *     
     */
    public void setBillToAddress(Account.BillToAddress value) {
        this.billToAddress = value;
    }

    /**
     * Gets the value of the billToName property.
     * 
     * @return
     *     possible object is
     *     {@link Account.BillToName }
     *     
     */
    public Account.BillToName getBillToName() {
        return billToName;
    }

    /**
     * Sets the value of the billToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account.BillToName }
     *     
     */
    public void setBillToName(Account.BillToName value) {
        this.billToName = value;
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
     *         &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "addressLine1",
        "addressLine2",
        "city",
        "state",
        "zipCode"
    })
    public static class BillToAddress {

        @XmlElement(name = "AddressLine1")
        protected String addressLine1;
        @XmlElement(name = "AddressLine2")
        protected String addressLine2;
        @XmlElement(name = "City")
        protected String city;
        @XmlElement(name = "State")
        protected String state;
        @XmlElement(name = "ZipCode")
        protected String zipCode;

        /**
         * Gets the value of the addressLine1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddressLine1() {
            return addressLine1;
        }

        /**
         * Sets the value of the addressLine1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddressLine1(String value) {
            this.addressLine1 = value;
        }

        /**
         * Gets the value of the addressLine2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddressLine2() {
            return addressLine2;
        }

        /**
         * Sets the value of the addressLine2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddressLine2(String value) {
            this.addressLine2 = value;
        }

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCity(String value) {
            this.city = value;
        }

        /**
         * Gets the value of the state property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getState() {
            return state;
        }

        /**
         * Sets the value of the state property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setState(String value) {
            this.state = value;
        }

        /**
         * Gets the value of the zipCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZipCode() {
            return zipCode;
        }

        /**
         * Sets the value of the zipCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZipCode(String value) {
            this.zipCode = value;
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
     *         &lt;element name="Salutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="First" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Last" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "salutation",
        "first",
        "last"
    })
    public static class BillToName {

        @XmlElement(name = "Salutation")
        protected String salutation;
        @XmlElement(name = "First")
        protected String first;
        @XmlElement(name = "Last")
        protected String last;

        /**
         * Gets the value of the salutation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSalutation() {
            return salutation;
        }

        /**
         * Sets the value of the salutation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSalutation(String value) {
            this.salutation = value;
        }

        /**
         * Gets the value of the first property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirst() {
            return first;
        }

        /**
         * Sets the value of the first property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirst(String value) {
            this.first = value;
        }

        /**
         * Gets the value of the last property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLast() {
            return last;
        }

        /**
         * Sets the value of the last property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLast(String value) {
            this.last = value;
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
     *         &lt;element name="Occurrances" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OriginalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LastChangeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "occurrances",
        "originalDate",
        "lastChangeDate"
    })
    public static class Remittance {

        @XmlElement(name = "Occurrances")
        protected String occurrances;
        @XmlElement(name = "OriginalDate")
        protected String originalDate;
        @XmlElement(name = "LastChangeDate")
        protected String lastChangeDate;

        /**
         * Gets the value of the occurrances property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOccurrances() {
            return occurrances;
        }

        /**
         * Sets the value of the occurrances property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOccurrances(String value) {
            this.occurrances = value;
        }

        /**
         * Gets the value of the originalDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalDate() {
            return originalDate;
        }

        /**
         * Sets the value of the originalDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalDate(String value) {
            this.originalDate = value;
        }

        /**
         * Gets the value of the lastChangeDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastChangeDate() {
            return lastChangeDate;
        }

        /**
         * Sets the value of the lastChangeDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastChangeDate(String value) {
            this.lastChangeDate = value;
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
     *         &lt;element name="Salutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="StatementNameFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "salutation",
        "name",
        "statementNameFormat"
    })
    public static class ResponsibleParty {

        @XmlElement(name = "Salutation")
        protected String salutation;
        @XmlElement(name = "Name")
        protected String name;
        @XmlElement(name = "StatementNameFormat")
        protected String statementNameFormat;

        /**
         * Gets the value of the salutation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSalutation() {
            return salutation;
        }

        /**
         * Sets the value of the salutation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSalutation(String value) {
            this.salutation = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the statementNameFormat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatementNameFormat() {
            return statementNameFormat;
        }

        /**
         * Sets the value of the statementNameFormat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatementNameFormat(String value) {
            this.statementNameFormat = value;
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
     *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "accountID",
        "status",
        "identifier"
    })
    public static class Transfer {

        @XmlElement(name = "AccountID")
        protected String accountID;
        @XmlElement(name = "Status")
        protected String status;
        @XmlElement(name = "Identifier")
        protected String identifier;

        /**
         * Gets the value of the accountID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountID() {
            return accountID;
        }

        /**
         * Sets the value of the accountID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountID(String value) {
            this.accountID = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the identifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdentifier() {
            return identifier;
        }

        /**
         * Sets the value of the identifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdentifier(String value) {
            this.identifier = value;
        }

    }

}
