
package com.charter.enterprise.billing.csg.orders;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddOrderResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOrderResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CsgStatus" type="{http://charter.com/enterprise/billing/csg/orders}CsgStatus" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerSysPrin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConversationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Accounts" type="{http://charter.com/enterprise/billing/csg/orders}AddOrderAccount" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Items" type="{http://charter.com/enterprise/billing/csg/orders}ItemResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Reasons" type="{http://charter.com/enterprise/billing/csg/orders}OrderReason" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Job" type="{http://charter.com/enterprise/billing/csg/orders}AddOrderJobResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Schedules" type="{http://charter.com/enterprise/billing/csg/orders}AddOrderSchedulesList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OfferManagementIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOrderResult", propOrder = {
    "csgStatus",
    "customerId",
    "businessUnit",
    "customerSysPrin",
    "customerAgent",
    "locationId",
    "orderId",
    "orderStatus",
    "conversationId",
    "totalUnits",
    "timeZone",
    "accounts",
    "items",
    "reasons",
    "job",
    "schedules",
    "offerManagementIndicator"
})
public class AddOrderResult {

    @XmlElement(name = "CsgStatus")
    protected CsgStatus csgStatus;
    @XmlElement(name = "CustomerId")
    protected String customerId;
    @XmlElement(name = "BusinessUnit")
    protected String businessUnit;
    @XmlElement(name = "CustomerSysPrin")
    protected String customerSysPrin;
    @XmlElement(name = "CustomerAgent")
    protected String customerAgent;
    @XmlElement(name = "LocationId")
    protected String locationId;
    @XmlElement(name = "OrderId")
    protected String orderId;
    @XmlElement(name = "OrderStatus")
    protected String orderStatus;
    @XmlElement(name = "ConversationId")
    protected String conversationId;
    @XmlElement(name = "TotalUnits")
    protected String totalUnits;
    @XmlElement(name = "TimeZone")
    protected String timeZone;
    @XmlElement(name = "Accounts")
    protected List<AddOrderAccount> accounts;
    @XmlElement(name = "Items")
    protected List<ItemResult> items;
    @XmlElement(name = "Reasons")
    protected List<OrderReason> reasons;
    @XmlElement(name = "Job")
    protected List<AddOrderJobResult> job;
    @XmlElement(name = "Schedules")
    protected List<AddOrderSchedulesList> schedules;
    @XmlElement(name = "OfferManagementIndicator")
    protected String offerManagementIndicator;

    /**
     * Gets the value of the csgStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CsgStatus }
     *     
     */
    public CsgStatus getCsgStatus() {
        return csgStatus;
    }

    /**
     * Sets the value of the csgStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsgStatus }
     *     
     */
    public void setCsgStatus(CsgStatus value) {
        this.csgStatus = value;
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
     * Gets the value of the customerSysPrin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSysPrin() {
        return customerSysPrin;
    }

    /**
     * Sets the value of the customerSysPrin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSysPrin(String value) {
        this.customerSysPrin = value;
    }

    /**
     * Gets the value of the customerAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAgent() {
        return customerAgent;
    }

    /**
     * Sets the value of the customerAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAgent(String value) {
        this.customerAgent = value;
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
     * Gets the value of the conversationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversationId() {
        return conversationId;
    }

    /**
     * Sets the value of the conversationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversationId(String value) {
        this.conversationId = value;
    }

    /**
     * Gets the value of the totalUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalUnits() {
        return totalUnits;
    }

    /**
     * Sets the value of the totalUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalUnits(String value) {
        this.totalUnits = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the accounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddOrderAccount }
     * 
     * 
     */
    public List<AddOrderAccount> getAccounts() {
        if (accounts == null) {
            accounts = new ArrayList<AddOrderAccount>();
        }
        return this.accounts;
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
     * {@link ItemResult }
     * 
     * 
     */
    public List<ItemResult> getItems() {
        if (items == null) {
            items = new ArrayList<ItemResult>();
        }
        return this.items;
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
     * {@link AddOrderJobResult }
     * 
     * 
     */
    public List<AddOrderJobResult> getJob() {
        if (job == null) {
            job = new ArrayList<AddOrderJobResult>();
        }
        return this.job;
    }

    /**
     * Gets the value of the schedules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schedules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchedules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddOrderSchedulesList }
     * 
     * 
     */
    public List<AddOrderSchedulesList> getSchedules() {
        if (schedules == null) {
            schedules = new ArrayList<AddOrderSchedulesList>();
        }
        return this.schedules;
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

}
