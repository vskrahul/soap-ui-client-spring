
package com.charter.enterprise.billing.csg.orders;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="CsgHeaderInfo" type="{http://charter.com/enterprise/billing/csg/orders}CsgHeaderInfo" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account" type="{http://charter.com/enterprise/billing/csg/orders}Account" minOccurs="0"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingBeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingDiscountOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelfInstall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Reasons" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SalesRepresentative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Caller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ProcessParametersOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfferManagementValidationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Items" type="{http://charter.com/enterprise/billing/csg/orders}Item" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Campaign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomField" type="{http://charter.com/enterprise/billing/csg/orders}customFieldUpdate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Alerts" type="{http://charter.com/enterprise/billing/csg/orders}Alert" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StandardComments" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Equipment" type="{http://charter.com/enterprise/billing/csg/orders}Equipment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Virtual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProvisioningMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Job" type="{http://charter.com/enterprise/billing/csg/orders}AddOrderJob" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ByPassCurrentServices" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Transfer" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ActionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TelephoneNumberList" type="{http://charter.com/enterprise/billing/csg/orders}ArrayOfAddOrderRequestTransferTelephoneNumber" minOccurs="0"/>
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
    "csgHeaderInfo",
    "customerId",
    "customerType",
    "account",
    "locationId",
    "orderID",
    "orderStatus",
    "billingBeginDate",
    "billingDiscountOverride",
    "selfInstall",
    "dueDate",
    "reasons",
    "salesRepresentative",
    "caller",
    "beginDate",
    "endDate",
    "processParametersOverride",
    "offerManagementValidationCode",
    "items",
    "campaign",
    "customField",
    "alerts",
    "comments",
    "standardComments",
    "equipment",
    "virtual",
    "salesChannel",
    "provisioningMethod",
    "job",
    "byPassCurrentServices",
    "transfer"
})
@XmlRootElement(name = "AddOrderRequest")
public class AddOrderRequest {

    @XmlElement(name = "CsgHeaderInfo")
    protected CsgHeaderInfo csgHeaderInfo;
    @XmlElement(name = "CustomerId")
    protected String customerId;
    @XmlElement(name = "CustomerType")
    protected String customerType;
    @XmlElement(name = "Account")
    protected Account account;
    @XmlElement(name = "LocationId")
    protected String locationId;
    @XmlElement(name = "OrderID")
    protected String orderID;
    @XmlElement(name = "OrderStatus")
    protected String orderStatus;
    @XmlElement(name = "BillingBeginDate")
    protected String billingBeginDate;
    @XmlElement(name = "BillingDiscountOverride")
    protected String billingDiscountOverride;
    @XmlElement(name = "SelfInstall")
    protected boolean selfInstall;
    @XmlElement(name = "DueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDate;
    @XmlElement(name = "Reasons")
    protected List<String> reasons;
    @XmlElement(name = "SalesRepresentative")
    protected String salesRepresentative;
    @XmlElement(name = "Caller")
    protected String caller;
    @XmlElement(name = "BeginDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar beginDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "ProcessParametersOverride")
    protected String processParametersOverride;
    @XmlElement(name = "OfferManagementValidationCode")
    protected String offerManagementValidationCode;
    @XmlElement(name = "Items")
    protected List<Item> items;
    @XmlElement(name = "Campaign")
    protected String campaign;
    @XmlElement(name = "CustomField")
    protected List<CustomFieldUpdate> customField;
    @XmlElement(name = "Alerts")
    protected List<Alert> alerts;
    @XmlElement(name = "Comments")
    protected List<String> comments;
    @XmlElement(name = "StandardComments")
    protected List<String> standardComments;
    @XmlElement(name = "Equipment")
    protected List<Equipment> equipment;
    @XmlElement(name = "Virtual")
    protected String virtual;
    @XmlElement(name = "SalesChannel")
    protected String salesChannel;
    @XmlElement(name = "ProvisioningMethod")
    protected String provisioningMethod;
    @XmlElement(name = "Job")
    protected List<AddOrderJob> job;
    @XmlElement(name = "ByPassCurrentServices")
    protected boolean byPassCurrentServices;
    @XmlElement(name = "Transfer")
    protected AddOrderRequest.Transfer transfer;

    /**
     * Gets the value of the csgHeaderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CsgHeaderInfo }
     *     
     */
    public CsgHeaderInfo getCsgHeaderInfo() {
        return csgHeaderInfo;
    }

    /**
     * Sets the value of the csgHeaderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsgHeaderInfo }
     *     
     */
    public void setCsgHeaderInfo(CsgHeaderInfo value) {
        this.csgHeaderInfo = value;
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
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setAccount(Account value) {
        this.account = value;
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
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
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
     * Gets the value of the billingBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingBeginDate() {
        return billingBeginDate;
    }

    /**
     * Sets the value of the billingBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingBeginDate(String value) {
        this.billingBeginDate = value;
    }

    /**
     * Gets the value of the billingDiscountOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingDiscountOverride() {
        return billingDiscountOverride;
    }

    /**
     * Sets the value of the billingDiscountOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingDiscountOverride(String value) {
        this.billingDiscountOverride = value;
    }

    /**
     * Gets the value of the selfInstall property.
     * 
     */
    public boolean isSelfInstall() {
        return selfInstall;
    }

    /**
     * Sets the value of the selfInstall property.
     * 
     */
    public void setSelfInstall(boolean value) {
        this.selfInstall = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
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
     * {@link String }
     * 
     * 
     */
    public List<String> getReasons() {
        if (reasons == null) {
            reasons = new ArrayList<String>();
        }
        return this.reasons;
    }

    /**
     * Gets the value of the salesRepresentative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesRepresentative() {
        return salesRepresentative;
    }

    /**
     * Sets the value of the salesRepresentative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesRepresentative(String value) {
        this.salesRepresentative = value;
    }

    /**
     * Gets the value of the caller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaller() {
        return caller;
    }

    /**
     * Sets the value of the caller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaller(String value) {
        this.caller = value;
    }

    /**
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDate(XMLGregorianCalendar value) {
        this.beginDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the processParametersOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessParametersOverride() {
        return processParametersOverride;
    }

    /**
     * Sets the value of the processParametersOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessParametersOverride(String value) {
        this.processParametersOverride = value;
    }

    /**
     * Gets the value of the offerManagementValidationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferManagementValidationCode() {
        return offerManagementValidationCode;
    }

    /**
     * Sets the value of the offerManagementValidationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferManagementValidationCode(String value) {
        this.offerManagementValidationCode = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the items property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Item }
     * 
     * 
     */
    public List<Item> getItems() {
        if (items == null) {
            items = new ArrayList<Item>();
        }
        return this.items;
    }

    /**
     * Gets the value of the campaign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaign() {
        return campaign;
    }

    /**
     * Sets the value of the campaign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaign(String value) {
        this.campaign = value;
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
     * {@link CustomFieldUpdate }
     * 
     * 
     */
    public List<CustomFieldUpdate> getCustomField() {
        if (customField == null) {
            customField = new ArrayList<CustomFieldUpdate>();
        }
        return this.customField;
    }

    /**
     * Gets the value of the alerts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alerts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlerts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Alert }
     * 
     * 
     */
    public List<Alert> getAlerts() {
        if (alerts == null) {
            alerts = new ArrayList<Alert>();
        }
        return this.alerts;
    }

    /**
     * Gets the value of the comments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getComments() {
        if (comments == null) {
            comments = new ArrayList<String>();
        }
        return this.comments;
    }

    /**
     * Gets the value of the standardComments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standardComments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandardComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStandardComments() {
        if (standardComments == null) {
            standardComments = new ArrayList<String>();
        }
        return this.standardComments;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Equipment }
     * 
     * 
     */
    public List<Equipment> getEquipment() {
        if (equipment == null) {
            equipment = new ArrayList<Equipment>();
        }
        return this.equipment;
    }

    /**
     * Gets the value of the virtual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtual() {
        return virtual;
    }

    /**
     * Sets the value of the virtual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtual(String value) {
        this.virtual = value;
    }

    /**
     * Gets the value of the salesChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesChannel() {
        return salesChannel;
    }

    /**
     * Sets the value of the salesChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesChannel(String value) {
        this.salesChannel = value;
    }

    /**
     * Gets the value of the provisioningMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvisioningMethod() {
        return provisioningMethod;
    }

    /**
     * Sets the value of the provisioningMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvisioningMethod(String value) {
        this.provisioningMethod = value;
    }

    /**
     * Gets the value of the job property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the job property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJob().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddOrderJob }
     * 
     * 
     */
    public List<AddOrderJob> getJob() {
        if (job == null) {
            job = new ArrayList<AddOrderJob>();
        }
        return this.job;
    }

    /**
     * Gets the value of the byPassCurrentServices property.
     * 
     */
    public boolean isByPassCurrentServices() {
        return byPassCurrentServices;
    }

    /**
     * Sets the value of the byPassCurrentServices property.
     * 
     */
    public void setByPassCurrentServices(boolean value) {
        this.byPassCurrentServices = value;
    }

    /**
     * Gets the value of the transfer property.
     * 
     * @return
     *     possible object is
     *     {@link AddOrderRequest.Transfer }
     *     
     */
    public AddOrderRequest.Transfer getTransfer() {
        return transfer;
    }

    /**
     * Sets the value of the transfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddOrderRequest.Transfer }
     *     
     */
    public void setTransfer(AddOrderRequest.Transfer value) {
        this.transfer = value;
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
     *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ActionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TelephoneNumberList" type="{http://charter.com/enterprise/billing/csg/orders}ArrayOfAddOrderRequestTransferTelephoneNumber" minOccurs="0"/>
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
        "customerId",
        "locationId",
        "actionIndicator",
        "telephoneNumberList"
    })
    public static class Transfer {

        @XmlElement(name = "CustomerId")
        protected String customerId;
        @XmlElement(name = "LocationId")
        protected String locationId;
        @XmlElement(name = "ActionIndicator")
        protected String actionIndicator;
        @XmlElement(name = "TelephoneNumberList")
        protected ArrayOfAddOrderRequestTransferTelephoneNumber telephoneNumberList;

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
         * Gets the value of the actionIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActionIndicator() {
            return actionIndicator;
        }

        /**
         * Sets the value of the actionIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActionIndicator(String value) {
            this.actionIndicator = value;
        }

        /**
         * Gets the value of the telephoneNumberList property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfAddOrderRequestTransferTelephoneNumber }
         *     
         */
        public ArrayOfAddOrderRequestTransferTelephoneNumber getTelephoneNumberList() {
            return telephoneNumberList;
        }

        /**
         * Sets the value of the telephoneNumberList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfAddOrderRequestTransferTelephoneNumber }
         *     
         */
        public void setTelephoneNumberList(ArrayOfAddOrderRequestTransferTelephoneNumber value) {
            this.telephoneNumberList = value;
        }

    }

}
