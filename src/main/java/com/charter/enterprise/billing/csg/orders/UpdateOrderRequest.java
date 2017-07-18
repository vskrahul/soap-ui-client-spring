
package com.charter.enterprise.billing.csg.orders;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="CsgHeaderInfo" type="{http://charter.com/enterprise/billing/csg/orders}CsgHeaderInfo" minOccurs="0"/>
 *         &lt;element name="Account" type="{http://charter.com/enterprise/billing/csg/orders}Account" minOccurs="0"/>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reasons" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesRepresentative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Campaign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfferManagementValidationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompletionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompletionTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Resolutions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BillingDiscountOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProvisioningMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StandardComment" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProcessParametersOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Items" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BillingIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="LineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="HandshakeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ParentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ServiceBillCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PackageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NegotiatedCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="NegotiatedChargeOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Telephone" type="{http://charter.com/enterprise/billing/csg/orders}Telephone" minOccurs="0"/>
 *                   &lt;element name="Outlet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DiscountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RequestedFunction" type="{http://charter.com/enterprise/billing/csg/orders}RequestedFunction"/>
 *                   &lt;element name="ExternalProvisioningStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CatalogIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Parameter" type="{http://charter.com/enterprise/billing/csg/orders}Parameter" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="JobSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Offer" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                             &lt;element name="ParentServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RootServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ComponentIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                             &lt;element name="PenaltyOfferIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                             &lt;element name="PenaltyServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Product" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PricePlan" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                                       &lt;element name="ClassChoiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
 *         &lt;element name="Job" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="HandshakeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Technician" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TechnicianType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Dispatch" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CashOnDelivery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CallAheadNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Alerts" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ResolutionCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="RequestedFunction" type="{http://charter.com/enterprise/billing/csg/orders}RequestedFunction"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Equipment" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Outlet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Ownership" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RequestedFunction" type="{http://charter.com/enterprise/billing/csg/orders}RequestedFunction"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ByPassCurrentServices" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "account",
    "orderId",
    "customerId",
    "customerType",
    "locationId",
    "reasons",
    "status",
    "salesRepresentative",
    "campaign",
    "offerManagementValidationCode",
    "dueDate",
    "completionDate",
    "completionTime",
    "resolutions",
    "billingDiscountOverride",
    "provisioningMethod",
    "comments",
    "standardComment",
    "processParametersOverride",
    "items",
    "job",
    "equipment",
    "byPassCurrentServices"
})
@XmlRootElement(name = "UpdateOrderRequest")
public class UpdateOrderRequest {

    @XmlElement(name = "CsgHeaderInfo")
    protected CsgHeaderInfo csgHeaderInfo;
    @XmlElement(name = "Account")
    protected Account account;
    @XmlElement(name = "OrderId")
    protected String orderId;
    @XmlElement(name = "CustomerId")
    protected String customerId;
    @XmlElement(name = "CustomerType")
    protected String customerType;
    @XmlElement(name = "LocationId")
    protected String locationId;
    @XmlElement(name = "Reasons")
    protected List<String> reasons;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "SalesRepresentative")
    protected String salesRepresentative;
    @XmlElement(name = "Campaign")
    protected String campaign;
    @XmlElement(name = "OfferManagementValidationCode")
    protected String offerManagementValidationCode;
    @XmlElement(name = "DueDate")
    protected String dueDate;
    @XmlElement(name = "CompletionDate")
    protected String completionDate;
    @XmlElement(name = "CompletionTime")
    protected String completionTime;
    @XmlElement(name = "Resolutions")
    protected List<String> resolutions;
    @XmlElement(name = "BillingDiscountOverride")
    protected String billingDiscountOverride;
    @XmlElement(name = "ProvisioningMethod")
    protected String provisioningMethod;
    @XmlElement(name = "Comments")
    protected List<String> comments;
    @XmlElement(name = "StandardComment")
    protected List<String> standardComment;
    @XmlElement(name = "ProcessParametersOverride")
    protected String processParametersOverride;
    @XmlElement(name = "Items")
    protected List<UpdateOrderRequest.Items> items;
    @XmlElement(name = "Job")
    protected List<UpdateOrderRequest.Job> job;
    @XmlElement(name = "Equipment")
    protected List<UpdateOrderRequest.Equipment> equipment;
    @XmlElement(name = "ByPassCurrentServices")
    protected boolean byPassCurrentServices;

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
     * Gets the value of the standardComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standardComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandardComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStandardComment() {
        if (standardComment == null) {
            standardComment = new ArrayList<String>();
        }
        return this.standardComment;
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
     * {@link UpdateOrderRequest.Items }
     * 
     * 
     */
    public List<UpdateOrderRequest.Items> getItems() {
        if (items == null) {
            items = new ArrayList<UpdateOrderRequest.Items>();
        }
        return this.items;
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
     * {@link UpdateOrderRequest.Job }
     * 
     * 
     */
    public List<UpdateOrderRequest.Job> getJob() {
        if (job == null) {
            job = new ArrayList<UpdateOrderRequest.Job>();
        }
        return this.job;
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
     * {@link UpdateOrderRequest.Equipment }
     * 
     * 
     */
    public List<UpdateOrderRequest.Equipment> getEquipment() {
        if (equipment == null) {
            equipment = new ArrayList<UpdateOrderRequest.Equipment>();
        }
        return this.equipment;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Outlet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Ownership" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RequestedFunction" type="{http://charter.com/enterprise/billing/csg/orders}RequestedFunction"/>
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
        "model",
        "type",
        "outlet",
        "ownership",
        "macAddress",
        "requestedFunction"
    })
    public static class Equipment {

        @XmlElement(name = "Model")
        protected String model;
        @XmlElement(name = "Type")
        protected String type;
        @XmlElement(name = "Outlet")
        protected String outlet;
        @XmlElement(name = "Ownership")
        protected String ownership;
        @XmlElement(name = "MacAddress")
        protected String macAddress;
        @XmlElement(name = "RequestedFunction", required = true)
        protected RequestedFunction requestedFunction;

        /**
         * Gets the value of the model property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModel() {
            return model;
        }

        /**
         * Sets the value of the model property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModel(String value) {
            this.model = value;
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
         * Gets the value of the outlet property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOutlet() {
            return outlet;
        }

        /**
         * Sets the value of the outlet property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOutlet(String value) {
            this.outlet = value;
        }

        /**
         * Gets the value of the ownership property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwnership() {
            return ownership;
        }

        /**
         * Sets the value of the ownership property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwnership(String value) {
            this.ownership = value;
        }

        /**
         * Gets the value of the macAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMacAddress() {
            return macAddress;
        }

        /**
         * Sets the value of the macAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMacAddress(String value) {
            this.macAddress = value;
        }

        /**
         * Gets the value of the requestedFunction property.
         * 
         * @return
         *     possible object is
         *     {@link RequestedFunction }
         *     
         */
        public RequestedFunction getRequestedFunction() {
            return requestedFunction;
        }

        /**
         * Sets the value of the requestedFunction property.
         * 
         * @param value
         *     allowed object is
         *     {@link RequestedFunction }
         *     
         */
        public void setRequestedFunction(RequestedFunction value) {
            this.requestedFunction = value;
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
     *         &lt;element name="BillingIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="LineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="HandshakeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ParentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ServiceBillCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PackageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NegotiatedCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="NegotiatedChargeOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Telephone" type="{http://charter.com/enterprise/billing/csg/orders}Telephone" minOccurs="0"/>
     *         &lt;element name="Outlet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DiscountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RequestedFunction" type="{http://charter.com/enterprise/billing/csg/orders}RequestedFunction"/>
     *         &lt;element name="ExternalProvisioningStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CatalogIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Parameter" type="{http://charter.com/enterprise/billing/csg/orders}Parameter" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="JobSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Offer" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *                   &lt;element name="ParentServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RootServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ComponentIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *                   &lt;element name="PenaltyOfferIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *                   &lt;element name="PenaltyServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Product" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PricePlan" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *                             &lt;element name="ClassChoiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
        "billingIdentifier",
        "lineOfBusiness",
        "serviceIdentifier",
        "handshakeId",
        "parentID",
        "serviceBillCode",
        "packageCode",
        "quantity",
        "negotiatedCharge",
        "negotiatedChargeOverride",
        "telephone",
        "outlet",
        "discountCode",
        "requestedFunction",
        "externalProvisioningStatus",
        "catalogIdentifier",
        "parameter",
        "jobSequence",
        "offer"
    })
    public static class Items {

        @XmlElement(name = "BillingIdentifier")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger billingIdentifier;
        @XmlElement(name = "LineOfBusiness")
        protected String lineOfBusiness;
        @XmlElement(name = "ServiceIdentifier")
        protected String serviceIdentifier;
        @XmlElement(name = "HandshakeId")
        protected String handshakeId;
        @XmlElement(name = "ParentID")
        protected String parentID;
        @XmlElement(name = "ServiceBillCode")
        protected String serviceBillCode;
        @XmlElement(name = "PackageCode")
        protected String packageCode;
        @XmlElement(name = "Quantity")
        protected String quantity;
        @XmlElement(name = "NegotiatedCharge", required = true)
        protected BigDecimal negotiatedCharge;
        @XmlElement(name = "NegotiatedChargeOverride")
        protected String negotiatedChargeOverride;
        @XmlElement(name = "Telephone")
        protected Telephone telephone;
        @XmlElement(name = "Outlet")
        protected String outlet;
        @XmlElement(name = "DiscountCode")
        protected String discountCode;
        @XmlElement(name = "RequestedFunction", required = true)
        protected RequestedFunction requestedFunction;
        @XmlElement(name = "ExternalProvisioningStatus")
        protected String externalProvisioningStatus;
        @XmlElement(name = "CatalogIdentifier")
        protected String catalogIdentifier;
        @XmlElement(name = "Parameter")
        protected List<Parameter> parameter;
        @XmlElement(name = "JobSequence")
        protected String jobSequence;
        @XmlElement(name = "Offer")
        protected UpdateOrderRequest.Items.Offer offer;

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
         * Gets the value of the lineOfBusiness property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLineOfBusiness() {
            return lineOfBusiness;
        }

        /**
         * Sets the value of the lineOfBusiness property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLineOfBusiness(String value) {
            this.lineOfBusiness = value;
        }

        /**
         * Gets the value of the serviceIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceIdentifier() {
            return serviceIdentifier;
        }

        /**
         * Sets the value of the serviceIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceIdentifier(String value) {
            this.serviceIdentifier = value;
        }

        /**
         * Gets the value of the handshakeId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHandshakeId() {
            return handshakeId;
        }

        /**
         * Sets the value of the handshakeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHandshakeId(String value) {
            this.handshakeId = value;
        }

        /**
         * Gets the value of the parentID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParentID() {
            return parentID;
        }

        /**
         * Sets the value of the parentID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParentID(String value) {
            this.parentID = value;
        }

        /**
         * Gets the value of the serviceBillCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceBillCode() {
            return serviceBillCode;
        }

        /**
         * Sets the value of the serviceBillCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceBillCode(String value) {
            this.serviceBillCode = value;
        }

        /**
         * Gets the value of the packageCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPackageCode() {
            return packageCode;
        }

        /**
         * Sets the value of the packageCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPackageCode(String value) {
            this.packageCode = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuantity(String value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the negotiatedCharge property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNegotiatedCharge() {
            return negotiatedCharge;
        }

        /**
         * Sets the value of the negotiatedCharge property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNegotiatedCharge(BigDecimal value) {
            this.negotiatedCharge = value;
        }

        /**
         * Gets the value of the negotiatedChargeOverride property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNegotiatedChargeOverride() {
            return negotiatedChargeOverride;
        }

        /**
         * Sets the value of the negotiatedChargeOverride property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNegotiatedChargeOverride(String value) {
            this.negotiatedChargeOverride = value;
        }

        /**
         * Gets the value of the telephone property.
         * 
         * @return
         *     possible object is
         *     {@link Telephone }
         *     
         */
        public Telephone getTelephone() {
            return telephone;
        }

        /**
         * Sets the value of the telephone property.
         * 
         * @param value
         *     allowed object is
         *     {@link Telephone }
         *     
         */
        public void setTelephone(Telephone value) {
            this.telephone = value;
        }

        /**
         * Gets the value of the outlet property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOutlet() {
            return outlet;
        }

        /**
         * Sets the value of the outlet property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOutlet(String value) {
            this.outlet = value;
        }

        /**
         * Gets the value of the discountCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiscountCode() {
            return discountCode;
        }

        /**
         * Sets the value of the discountCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiscountCode(String value) {
            this.discountCode = value;
        }

        /**
         * Gets the value of the requestedFunction property.
         * 
         * @return
         *     possible object is
         *     {@link RequestedFunction }
         *     
         */
        public RequestedFunction getRequestedFunction() {
            return requestedFunction;
        }

        /**
         * Sets the value of the requestedFunction property.
         * 
         * @param value
         *     allowed object is
         *     {@link RequestedFunction }
         *     
         */
        public void setRequestedFunction(RequestedFunction value) {
            this.requestedFunction = value;
        }

        /**
         * Gets the value of the externalProvisioningStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExternalProvisioningStatus() {
            return externalProvisioningStatus;
        }

        /**
         * Sets the value of the externalProvisioningStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExternalProvisioningStatus(String value) {
            this.externalProvisioningStatus = value;
        }

        /**
         * Gets the value of the catalogIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCatalogIdentifier() {
            return catalogIdentifier;
        }

        /**
         * Sets the value of the catalogIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCatalogIdentifier(String value) {
            this.catalogIdentifier = value;
        }

        /**
         * Gets the value of the parameter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parameter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParameter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Parameter }
         * 
         * 
         */
        public List<Parameter> getParameter() {
            if (parameter == null) {
                parameter = new ArrayList<Parameter>();
            }
            return this.parameter;
        }

        /**
         * Gets the value of the jobSequence property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJobSequence() {
            return jobSequence;
        }

        /**
         * Sets the value of the jobSequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJobSequence(String value) {
            this.jobSequence = value;
        }

        /**
         * Gets the value of the offer property.
         * 
         * @return
         *     possible object is
         *     {@link UpdateOrderRequest.Items.Offer }
         *     
         */
        public UpdateOrderRequest.Items.Offer getOffer() {
            return offer;
        }

        /**
         * Sets the value of the offer property.
         * 
         * @param value
         *     allowed object is
         *     {@link UpdateOrderRequest.Items.Offer }
         *     
         */
        public void setOffer(UpdateOrderRequest.Items.Offer value) {
            this.offer = value;
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
         *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
         *         &lt;element name="ParentServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RootServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ComponentIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
         *         &lt;element name="PenaltyOfferIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
         *         &lt;element name="PenaltyServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Product" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PricePlan" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
         *                   &lt;element name="ClassChoiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
            "identifier",
            "parentServiceIdentifier",
            "rootServiceIdentifier",
            "componentIdentifier",
            "penaltyOfferIdentifier",
            "penaltyServiceIdentifier",
            "product",
            "pricePlan"
        })
        public static class Offer {

            @XmlElement(name = "Identifier")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger identifier;
            @XmlElement(name = "ParentServiceIdentifier")
            protected String parentServiceIdentifier;
            @XmlElement(name = "RootServiceIdentifier")
            protected String rootServiceIdentifier;
            @XmlElement(name = "ComponentIdentifier")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger componentIdentifier;
            @XmlElement(name = "PenaltyOfferIdentifier")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger penaltyOfferIdentifier;
            @XmlElement(name = "PenaltyServiceIdentifier")
            protected String penaltyServiceIdentifier;
            @XmlElement(name = "Product")
            protected UpdateOrderRequest.Items.Offer.Product product;
            @XmlElement(name = "PricePlan")
            protected UpdateOrderRequest.Items.Offer.PricePlan pricePlan;

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
             * Gets the value of the parentServiceIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParentServiceIdentifier() {
                return parentServiceIdentifier;
            }

            /**
             * Sets the value of the parentServiceIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParentServiceIdentifier(String value) {
                this.parentServiceIdentifier = value;
            }

            /**
             * Gets the value of the rootServiceIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRootServiceIdentifier() {
                return rootServiceIdentifier;
            }

            /**
             * Sets the value of the rootServiceIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRootServiceIdentifier(String value) {
                this.rootServiceIdentifier = value;
            }

            /**
             * Gets the value of the componentIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getComponentIdentifier() {
                return componentIdentifier;
            }

            /**
             * Sets the value of the componentIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setComponentIdentifier(BigInteger value) {
                this.componentIdentifier = value;
            }

            /**
             * Gets the value of the penaltyOfferIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPenaltyOfferIdentifier() {
                return penaltyOfferIdentifier;
            }

            /**
             * Sets the value of the penaltyOfferIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPenaltyOfferIdentifier(BigInteger value) {
                this.penaltyOfferIdentifier = value;
            }

            /**
             * Gets the value of the penaltyServiceIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPenaltyServiceIdentifier() {
                return penaltyServiceIdentifier;
            }

            /**
             * Sets the value of the penaltyServiceIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPenaltyServiceIdentifier(String value) {
                this.penaltyServiceIdentifier = value;
            }

            /**
             * Gets the value of the product property.
             * 
             * @return
             *     possible object is
             *     {@link UpdateOrderRequest.Items.Offer.Product }
             *     
             */
            public UpdateOrderRequest.Items.Offer.Product getProduct() {
                return product;
            }

            /**
             * Sets the value of the product property.
             * 
             * @param value
             *     allowed object is
             *     {@link UpdateOrderRequest.Items.Offer.Product }
             *     
             */
            public void setProduct(UpdateOrderRequest.Items.Offer.Product value) {
                this.product = value;
            }

            /**
             * Gets the value of the pricePlan property.
             * 
             * @return
             *     possible object is
             *     {@link UpdateOrderRequest.Items.Offer.PricePlan }
             *     
             */
            public UpdateOrderRequest.Items.Offer.PricePlan getPricePlan() {
                return pricePlan;
            }

            /**
             * Sets the value of the pricePlan property.
             * 
             * @param value
             *     allowed object is
             *     {@link UpdateOrderRequest.Items.Offer.PricePlan }
             *     
             */
            public void setPricePlan(UpdateOrderRequest.Items.Offer.PricePlan value) {
                this.pricePlan = value;
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
             *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
             *         &lt;element name="ClassChoiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
                "identifier",
                "classChoiceIdentifier"
            })
            public static class PricePlan {

                @XmlElement(name = "Identifier")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger identifier;
                @XmlElement(name = "ClassChoiceIdentifier")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger classChoiceIdentifier;

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
                 * Gets the value of the classChoiceIdentifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getClassChoiceIdentifier() {
                    return classChoiceIdentifier;
                }

                /**
                 * Sets the value of the classChoiceIdentifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setClassChoiceIdentifier(BigInteger value) {
                    this.classChoiceIdentifier = value;
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
             *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
                "identifier"
            })
            public static class Product {

                @XmlElement(name = "Identifier")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger identifier;

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
     *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="HandshakeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Technician" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TechnicianType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Dispatch" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CashOnDelivery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CallAheadNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Alerts" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ResolutionCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="RequestedFunction" type="{http://charter.com/enterprise/billing/csg/orders}RequestedFunction"/>
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
        "sequence",
        "handshakeId",
        "status",
        "technician",
        "technicianType",
        "dispatch",
        "cashOnDelivery",
        "callAheadNumber",
        "alerts",
        "resolutionCodes",
        "comments",
        "requestedFunction"
    })
    public static class Job {

        @XmlElement(name = "Sequence")
        protected String sequence;
        @XmlElement(name = "HandshakeId")
        protected String handshakeId;
        @XmlElement(name = "Status")
        protected String status;
        @XmlElement(name = "Technician")
        protected String technician;
        @XmlElement(name = "TechnicianType")
        protected String technicianType;
        @XmlElement(name = "Dispatch")
        protected UpdateOrderRequest.Job.Dispatch dispatch;
        @XmlElement(name = "CashOnDelivery")
        protected String cashOnDelivery;
        @XmlElement(name = "CallAheadNumber")
        protected String callAheadNumber;
        @XmlElement(name = "Alerts")
        protected List<UpdateOrderRequest.Job.Alerts> alerts;
        @XmlElement(name = "ResolutionCodes")
        protected List<String> resolutionCodes;
        @XmlElement(name = "Comments")
        protected List<String> comments;
        @XmlElement(name = "RequestedFunction", required = true)
        protected RequestedFunction requestedFunction;

        /**
         * Gets the value of the sequence property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSequence() {
            return sequence;
        }

        /**
         * Sets the value of the sequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSequence(String value) {
            this.sequence = value;
        }

        /**
         * Gets the value of the handshakeId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHandshakeId() {
            return handshakeId;
        }

        /**
         * Sets the value of the handshakeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHandshakeId(String value) {
            this.handshakeId = value;
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
         * Gets the value of the technician property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTechnician() {
            return technician;
        }

        /**
         * Sets the value of the technician property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTechnician(String value) {
            this.technician = value;
        }

        /**
         * Gets the value of the technicianType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTechnicianType() {
            return technicianType;
        }

        /**
         * Sets the value of the technicianType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTechnicianType(String value) {
            this.technicianType = value;
        }

        /**
         * Gets the value of the dispatch property.
         * 
         * @return
         *     possible object is
         *     {@link UpdateOrderRequest.Job.Dispatch }
         *     
         */
        public UpdateOrderRequest.Job.Dispatch getDispatch() {
            return dispatch;
        }

        /**
         * Sets the value of the dispatch property.
         * 
         * @param value
         *     allowed object is
         *     {@link UpdateOrderRequest.Job.Dispatch }
         *     
         */
        public void setDispatch(UpdateOrderRequest.Job.Dispatch value) {
            this.dispatch = value;
        }

        /**
         * Gets the value of the cashOnDelivery property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCashOnDelivery() {
            return cashOnDelivery;
        }

        /**
         * Sets the value of the cashOnDelivery property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCashOnDelivery(String value) {
            this.cashOnDelivery = value;
        }

        /**
         * Gets the value of the callAheadNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCallAheadNumber() {
            return callAheadNumber;
        }

        /**
         * Sets the value of the callAheadNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCallAheadNumber(String value) {
            this.callAheadNumber = value;
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
         * {@link UpdateOrderRequest.Job.Alerts }
         * 
         * 
         */
        public List<UpdateOrderRequest.Job.Alerts> getAlerts() {
            if (alerts == null) {
                alerts = new ArrayList<UpdateOrderRequest.Job.Alerts>();
            }
            return this.alerts;
        }

        /**
         * Gets the value of the resolutionCodes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the resolutionCodes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResolutionCodes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getResolutionCodes() {
            if (resolutionCodes == null) {
                resolutionCodes = new ArrayList<String>();
            }
            return this.resolutionCodes;
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
         * Gets the value of the requestedFunction property.
         * 
         * @return
         *     possible object is
         *     {@link RequestedFunction }
         *     
         */
        public RequestedFunction getRequestedFunction() {
            return requestedFunction;
        }

        /**
         * Sets the value of the requestedFunction property.
         * 
         * @param value
         *     allowed object is
         *     {@link RequestedFunction }
         *     
         */
        public void setRequestedFunction(RequestedFunction value) {
            this.requestedFunction = value;
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
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "name",
            "value"
        })
        public static class Alerts {

            @XmlElement(name = "Name")
            protected String name;
            @XmlElement(name = "Value")
            protected String value;

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
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
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
         *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "status",
            "comment"
        })
        public static class Dispatch {

            @XmlElement(name = "Status")
            protected String status;
            @XmlElement(name = "Comment")
            protected String comment;

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
             * Gets the value of the comment property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getComment() {
                return comment;
            }

            /**
             * Sets the value of the comment property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setComment(String value) {
                this.comment = value;
            }

        }

    }

}
