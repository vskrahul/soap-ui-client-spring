
package com.charter.enterprise.billing.csg.orders;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Salutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleInitial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Zip4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderClass" type="{http://charter.com/enterprise/billing/csg/orders}GetOrdersOrderClass" minOccurs="0"/>
 *         &lt;element name="OrderStatus" type="{http://charter.com/enterprise/billing/csg/orders}GetOrdersOrderStatus" minOccurs="0"/>
 *         &lt;element name="Reasons" type="{http://charter.com/enterprise/billing/csg/orders}OrderReason" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SalesRepresentative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompletionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompletionTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Resolutions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RepeatTroubleCall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://charter.com/enterprise/billing/csg/orders}IndexedComment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LinesOfBusiness" type="{http://charter.com/enterprise/billing/csg/orders}OrderInfoLineOfBusiness" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AuditCreation" type="{http://charter.com/enterprise/billing/csg/orders}Audit" minOccurs="0"/>
 *         &lt;element name="OfferManagementIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuditLastUpdate" type="{http://charter.com/enterprise/billing/csg/orders}Audit" minOccurs="0"/>
 *         &lt;element name="Items" type="{http://charter.com/enterprise/billing/csg/orders}OrderInfoItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Jobs" type="{http://charter.com/enterprise/billing/csg/orders}OrderInfoJob" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CustomField" type="{http://charter.com/enterprise/billing/csg/orders}CustomField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderInfo", propOrder = {
    "customerId",
    "salutation",
    "firstName",
    "middleInitial",
    "lastName",
    "company",
    "locationId",
    "businessUnit",
    "addressLine1",
    "addressLine2",
    "city",
    "state",
    "zip",
    "zip4",
    "orderId",
    "orderClass",
    "orderStatus",
    "reasons",
    "salesRepresentative",
    "dueDate",
    "completionDate",
    "completionTime",
    "resolutions",
    "repeatTroubleCall",
    "billingDate",
    "comment",
    "linesOfBusiness",
    "auditCreation",
    "offerManagementIndicator",
    "auditLastUpdate",
    "items",
    "jobs",
    "customField"
})
public class OrderInfo {

    @XmlElement(name = "CustomerId")
    protected String customerId;
    @XmlElement(name = "Salutation")
    protected String salutation;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleInitial")
    protected String middleInitial;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "Company")
    protected String company;
    @XmlElement(name = "LocationId")
    protected String locationId;
    @XmlElement(name = "BusinessUnit")
    protected String businessUnit;
    @XmlElement(name = "AddressLine1")
    protected String addressLine1;
    @XmlElement(name = "AddressLine2")
    protected String addressLine2;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "Zip")
    protected String zip;
    @XmlElement(name = "Zip4")
    protected String zip4;
    @XmlElement(name = "OrderId")
    protected String orderId;
    @XmlElement(name = "OrderClass")
    protected GetOrdersOrderClass orderClass;
    @XmlElement(name = "OrderStatus")
    protected GetOrdersOrderStatus orderStatus;
    @XmlElement(name = "Reasons")
    protected List<OrderReason> reasons;
    @XmlElement(name = "SalesRepresentative")
    protected String salesRepresentative;
    @XmlElement(name = "DueDate")
    protected String dueDate;
    @XmlElement(name = "CompletionDate")
    protected String completionDate;
    @XmlElement(name = "CompletionTime")
    protected String completionTime;
    @XmlElement(name = "Resolutions")
    protected List<String> resolutions;
    @XmlElement(name = "RepeatTroubleCall")
    protected String repeatTroubleCall;
    @XmlElement(name = "BillingDate")
    protected String billingDate;
    @XmlElement(name = "Comment")
    protected List<IndexedComment> comment;
    @XmlElement(name = "LinesOfBusiness")
    protected List<OrderInfoLineOfBusiness> linesOfBusiness;
    @XmlElement(name = "AuditCreation")
    protected Audit auditCreation;
    @XmlElement(name = "OfferManagementIndicator")
    protected String offerManagementIndicator;
    @XmlElement(name = "AuditLastUpdate")
    protected Audit auditLastUpdate;
    @XmlElement(name = "Items")
    protected List<OrderInfoItem> items;
    @XmlElement(name = "Jobs")
    protected List<OrderInfoJob> jobs;
    @XmlElement(name = "CustomField")
    protected List<CustomField> customField;

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
     * Gets the value of the middleInitial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleInitial() {
        return middleInitial;
    }

    /**
     * Sets the value of the middleInitial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleInitial(String value) {
        this.middleInitial = value;
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
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
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
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the zip4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip4() {
        return zip4;
    }

    /**
     * Sets the value of the zip4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip4(String value) {
        this.zip4 = value;
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
     * Gets the value of the orderClass property.
     * 
     * @return
     *     possible object is
     *     {@link GetOrdersOrderClass }
     *     
     */
    public GetOrdersOrderClass getOrderClass() {
        return orderClass;
    }

    /**
     * Sets the value of the orderClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetOrdersOrderClass }
     *     
     */
    public void setOrderClass(GetOrdersOrderClass value) {
        this.orderClass = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link GetOrdersOrderStatus }
     *     
     */
    public GetOrdersOrderStatus getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetOrdersOrderStatus }
     *     
     */
    public void setOrderStatus(GetOrdersOrderStatus value) {
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
     * {@link OrderReason }
     * 
     * 
     */
    public List<OrderReason> getReasons() {
        if (reasons == null) {
            reasons = new ArrayList<OrderReason>();
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
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(String value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the completionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletionDate() {
        return completionDate;
    }

    /**
     * Sets the value of the completionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletionDate(String value) {
        this.completionDate = value;
    }

    /**
     * Gets the value of the completionTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletionTime() {
        return completionTime;
    }

    /**
     * Sets the value of the completionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletionTime(String value) {
        this.completionTime = value;
    }

    /**
     * Gets the value of the resolutions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resolutions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResolutions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResolutions() {
        if (resolutions == null) {
            resolutions = new ArrayList<String>();
        }
        return this.resolutions;
    }

    /**
     * Gets the value of the repeatTroubleCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepeatTroubleCall() {
        return repeatTroubleCall;
    }

    /**
     * Sets the value of the repeatTroubleCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepeatTroubleCall(String value) {
        this.repeatTroubleCall = value;
    }

    /**
     * Gets the value of the billingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingDate() {
        return billingDate;
    }

    /**
     * Sets the value of the billingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingDate(String value) {
        this.billingDate = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndexedComment }
     * 
     * 
     */
    public List<IndexedComment> getComment() {
        if (comment == null) {
            comment = new ArrayList<IndexedComment>();
        }
        return this.comment;
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
     * {@link OrderInfoLineOfBusiness }
     * 
     * 
     */
    public List<OrderInfoLineOfBusiness> getLinesOfBusiness() {
        if (linesOfBusiness == null) {
            linesOfBusiness = new ArrayList<OrderInfoLineOfBusiness>();
        }
        return this.linesOfBusiness;
    }

    /**
     * Gets the value of the auditCreation property.
     * 
     * @return
     *     possible object is
     *     {@link Audit }
     *     
     */
    public Audit getAuditCreation() {
        return auditCreation;
    }

    /**
     * Sets the value of the auditCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Audit }
     *     
     */
    public void setAuditCreation(Audit value) {
        this.auditCreation = value;
    }

    /**
     * Gets the value of the offerManagementIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferManagementIndicator() {
        return offerManagementIndicator;
    }

    /**
     * Sets the value of the offerManagementIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferManagementIndicator(String value) {
        this.offerManagementIndicator = value;
    }

    /**
     * Gets the value of the auditLastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link Audit }
     *     
     */
    public Audit getAuditLastUpdate() {
        return auditLastUpdate;
    }

    /**
     * Sets the value of the auditLastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Audit }
     *     
     */
    public void setAuditLastUpdate(Audit value) {
        this.auditLastUpdate = value;
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
     * {@link OrderInfoItem }
     * 
     * 
     */
    public List<OrderInfoItem> getItems() {
        if (items == null) {
            items = new ArrayList<OrderInfoItem>();
        }
        return this.items;
    }

    /**
     * Gets the value of the jobs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderInfoJob }
     * 
     * 
     */
    public List<OrderInfoJob> getJobs() {
        if (jobs == null) {
            jobs = new ArrayList<OrderInfoJob>();
        }
        return this.jobs;
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

}
