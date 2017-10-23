
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
 *         &lt;element name="Result" type="{http://charter.com/enterprise/billing/csg/orders}Result" minOccurs="0"/>
 *         &lt;element name="OrderResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrderStatus">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Open"/>
 *                         &lt;enumeration value="Completed"/>
 *                         &lt;enumeration value="Cancelled"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Items" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ServiceBillCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="HandshakeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NegotiatedCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                             &lt;element name="NegotiatedChargeOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OfferManagementIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Offer" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                                       &lt;element name="ParentServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="RootServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ComponentIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                                       &lt;element name="OriginalIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                                       &lt;element name="PenaltyOfferIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                                       &lt;element name="PenaltyServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Product" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PricePlan" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                                                 &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="OriginalIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                                                 &lt;element name="OriginalBeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="ClassChoiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
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
 *                   &lt;element name="Jobs" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="JobId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="HandshakeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="JobNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LineOfBusinessType" type="{http://charter.com/enterprise/billing/csg/orders}LineOfBusinessType"/>
 *                             &lt;element name="CashOnDelivery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CallAheadNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Schedule" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="TimeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="TimeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="Equipment" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Outlet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Ownership" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "result",
    "orderResult"
})
@XmlRootElement(name = "UpdateOrderResponse")
public class UpdateOrderResponse {

    @XmlElement(name = "Result")
    protected Result2 result;
    @XmlElement(name = "OrderResult")
    protected UpdateOrderResponse.OrderResult orderResult;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Result2 }
     *     
     */
    public Result2 getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result2 }
     *     
     */
    public void setResult(Result2 value) {
        this.result = value;
    }

    /**
     * Gets the value of the orderResult property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOrderResponse.OrderResult }
     *     
     */
    public UpdateOrderResponse.OrderResult getOrderResult() {
        return orderResult;
    }

    /**
     * Sets the value of the orderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOrderResponse.OrderResult }
     *     
     */
    public void setOrderResult(UpdateOrderResponse.OrderResult value) {
        this.orderResult = value;
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
     *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrderStatus">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Open"/>
     *               &lt;enumeration value="Completed"/>
     *               &lt;enumeration value="Cancelled"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Items" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ServiceBillCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="HandshakeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NegotiatedCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                   &lt;element name="NegotiatedChargeOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OfferManagementIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Offer" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *                             &lt;element name="ParentServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="RootServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ComponentIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *                             &lt;element name="OriginalIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
     *                                       &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="OriginalIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *                                       &lt;element name="OriginalBeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
     *         &lt;element name="Jobs" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="JobId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="HandshakeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="JobNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LineOfBusinessType" type="{http://charter.com/enterprise/billing/csg/orders}LineOfBusinessType"/>
     *                   &lt;element name="CashOnDelivery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CallAheadNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Schedule" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="TimeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="TimeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *         &lt;element name="Equipment" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Outlet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Ownership" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "customerID",
        "accountId",
        "locationId",
        "orderId",
        "orderStatus",
        "items",
        "jobs",
        "equipment"
    })
    public static class OrderResult {

        @XmlElement(name = "CustomerID")
        protected String customerID;
        @XmlElement(name = "AccountId")
        protected String accountId;
        @XmlElement(name = "LocationId")
        protected String locationId;
        @XmlElement(name = "OrderId")
        protected String orderId;
        @XmlElement(name = "OrderStatus", required = true)
        protected String orderStatus;
        @XmlElement(name = "Items")
        protected List<UpdateOrderResponse.OrderResult.Items> items;
        @XmlElement(name = "Jobs")
        protected List<UpdateOrderResponse.OrderResult.Jobs> jobs;
        @XmlElement(name = "Equipment")
        protected List<UpdateOrderResponse.OrderResult.Equipment> equipment;

        /**
         * Gets the value of the customerID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerID() {
            return customerID;
        }

        /**
         * Sets the value of the customerID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerID(String value) {
            this.customerID = value;
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
         * {@link UpdateOrderResponse.OrderResult.Items }
         * 
         * 
         */
        public List<UpdateOrderResponse.OrderResult.Items> getItems() {
            if (items == null) {
                items = new ArrayList<UpdateOrderResponse.OrderResult.Items>();
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
         * {@link UpdateOrderResponse.OrderResult.Jobs }
         * 
         * 
         */
        public List<UpdateOrderResponse.OrderResult.Jobs> getJobs() {
            if (jobs == null) {
                jobs = new ArrayList<UpdateOrderResponse.OrderResult.Jobs>();
            }
            return this.jobs;
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
         * {@link UpdateOrderResponse.OrderResult.Equipment }
         * 
         * 
         */
        public List<UpdateOrderResponse.OrderResult.Equipment> getEquipment() {
            if (equipment == null) {
                equipment = new ArrayList<UpdateOrderResponse.OrderResult.Equipment>();
            }
            return this.equipment;
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
         *         &lt;element name="MacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Outlet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Ownership" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "macAddress",
            "type",
            "outlet",
            "status",
            "ownership"
        })
        public static class Equipment {

            @XmlElement(name = "MacAddress")
            protected String macAddress;
            @XmlElement(name = "Type")
            protected String type;
            @XmlElement(name = "Outlet")
            protected String outlet;
            @XmlElement(name = "Status")
            protected String status;
            @XmlElement(name = "Ownership")
            protected String ownership;

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
         *         &lt;element name="ServiceBillCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="HandshakeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NegotiatedCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *         &lt;element name="NegotiatedChargeOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OfferManagementIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Offer" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
         *                   &lt;element name="ParentServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="RootServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ComponentIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
         *                   &lt;element name="OriginalIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
         *                             &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="OriginalIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
         *                             &lt;element name="OriginalBeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
            "serviceBillCode",
            "handshakeId",
            "serviceIdentifier",
            "beginDate",
            "negotiatedCharge",
            "negotiatedChargeOverride",
            "offerManagementIndicator",
            "offer"
        })
        public static class Items {

            @XmlElement(name = "ServiceBillCode")
            protected String serviceBillCode;
            @XmlElement(name = "HandshakeId")
            protected String handshakeId;
            @XmlElement(name = "ServiceIdentifier")
            protected String serviceIdentifier;
            @XmlElement(name = "BeginDate")
            protected String beginDate;
            @XmlElement(name = "NegotiatedCharge", required = true)
            protected BigDecimal negotiatedCharge;
            @XmlElement(name = "NegotiatedChargeOverride")
            protected String negotiatedChargeOverride;
            @XmlElement(name = "OfferManagementIndicator")
            protected String offerManagementIndicator;
            @XmlElement(name = "Offer")
            protected UpdateOrderResponse.OrderResult.Items.Offer offer;

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
             * Gets the value of the offer property.
             * 
             * @return
             *     possible object is
             *     {@link UpdateOrderResponse.OrderResult.Items.Offer }
             *     
             */
            public UpdateOrderResponse.OrderResult.Items.Offer getOffer() {
                return offer;
            }

            /**
             * Sets the value of the offer property.
             * 
             * @param value
             *     allowed object is
             *     {@link UpdateOrderResponse.OrderResult.Items.Offer }
             *     
             */
            public void setOffer(UpdateOrderResponse.OrderResult.Items.Offer value) {
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
             *         &lt;element name="OriginalIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
             *                   &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="OriginalIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
             *                   &lt;element name="OriginalBeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
                "originalIdentifier",
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
                @XmlElement(name = "OriginalIdentifier")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger originalIdentifier;
                @XmlElement(name = "PenaltyOfferIdentifier")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger penaltyOfferIdentifier;
                @XmlElement(name = "PenaltyServiceIdentifier")
                protected String penaltyServiceIdentifier;
                @XmlElement(name = "Product")
                protected UpdateOrderResponse.OrderResult.Items.Offer.Product product;
                @XmlElement(name = "PricePlan")
                protected UpdateOrderResponse.OrderResult.Items.Offer.PricePlan pricePlan;

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
                 * Gets the value of the originalIdentifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getOriginalIdentifier() {
                    return originalIdentifier;
                }

                /**
                 * Sets the value of the originalIdentifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setOriginalIdentifier(BigInteger value) {
                    this.originalIdentifier = value;
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
                 *     {@link UpdateOrderResponse.OrderResult.Items.Offer.Product }
                 *     
                 */
                public UpdateOrderResponse.OrderResult.Items.Offer.Product getProduct() {
                    return product;
                }

                /**
                 * Sets the value of the product property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UpdateOrderResponse.OrderResult.Items.Offer.Product }
                 *     
                 */
                public void setProduct(UpdateOrderResponse.OrderResult.Items.Offer.Product value) {
                    this.product = value;
                }

                /**
                 * Gets the value of the pricePlan property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link UpdateOrderResponse.OrderResult.Items.Offer.PricePlan }
                 *     
                 */
                public UpdateOrderResponse.OrderResult.Items.Offer.PricePlan getPricePlan() {
                    return pricePlan;
                }

                /**
                 * Sets the value of the pricePlan property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UpdateOrderResponse.OrderResult.Items.Offer.PricePlan }
                 *     
                 */
                public void setPricePlan(UpdateOrderResponse.OrderResult.Items.Offer.PricePlan value) {
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
                 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="OriginalIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
                 *         &lt;element name="OriginalBeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
                    "beginDate",
                    "originalIdentifier",
                    "originalBeginDate",
                    "classChoiceIdentifier"
                })
                public static class PricePlan {

                    @XmlElement(name = "Identifier")
                    @XmlSchemaType(name = "nonNegativeInteger")
                    protected BigInteger identifier;
                    @XmlElement(name = "BeginDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar beginDate;
                    @XmlElement(name = "OriginalIdentifier")
                    @XmlSchemaType(name = "nonNegativeInteger")
                    protected BigInteger originalIdentifier;
                    @XmlElement(name = "OriginalBeginDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar originalBeginDate;
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
                     * Gets the value of the originalIdentifier property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getOriginalIdentifier() {
                        return originalIdentifier;
                    }

                    /**
                     * Sets the value of the originalIdentifier property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setOriginalIdentifier(BigInteger value) {
                        this.originalIdentifier = value;
                    }

                    /**
                     * Gets the value of the originalBeginDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getOriginalBeginDate() {
                        return originalBeginDate;
                    }

                    /**
                     * Sets the value of the originalBeginDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setOriginalBeginDate(XMLGregorianCalendar value) {
                        this.originalBeginDate = value;
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
         *         &lt;element name="JobId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="HandshakeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="JobNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LineOfBusinessType" type="{http://charter.com/enterprise/billing/csg/orders}LineOfBusinessType"/>
         *         &lt;element name="CashOnDelivery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CallAheadNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Schedule" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="TimeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="TimeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "sequence",
            "jobId",
            "handshakeId",
            "jobNumber",
            "type",
            "typeDescription",
            "status",
            "lineOfBusinessType",
            "cashOnDelivery",
            "callAheadNumber",
            "schedule"
        })
        public static class Jobs {

            @XmlElement(name = "Sequence")
            protected String sequence;
            @XmlElement(name = "JobId")
            protected String jobId;
            @XmlElement(name = "HandshakeId")
            protected String handshakeId;
            @XmlElement(name = "JobNumber")
            protected String jobNumber;
            @XmlElement(name = "Type")
            protected String type;
            @XmlElement(name = "TypeDescription")
            protected String typeDescription;
            @XmlElement(name = "Status")
            protected String status;
            @XmlElement(name = "LineOfBusinessType", required = true)
            protected LineOfBusinessType lineOfBusinessType;
            @XmlElement(name = "CashOnDelivery")
            protected String cashOnDelivery;
            @XmlElement(name = "CallAheadNumber")
            protected String callAheadNumber;
            @XmlElement(name = "Schedule")
            protected UpdateOrderResponse.OrderResult.Jobs.Schedule schedule;

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
             * Gets the value of the jobId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getJobId() {
                return jobId;
            }

            /**
             * Sets the value of the jobId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setJobId(String value) {
                this.jobId = value;
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
             * Gets the value of the jobNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getJobNumber() {
                return jobNumber;
            }

            /**
             * Sets the value of the jobNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setJobNumber(String value) {
                this.jobNumber = value;
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
             * Gets the value of the lineOfBusinessType property.
             * 
             * @return
             *     possible object is
             *     {@link LineOfBusinessType }
             *     
             */
            public LineOfBusinessType getLineOfBusinessType() {
                return lineOfBusinessType;
            }

            /**
             * Sets the value of the lineOfBusinessType property.
             * 
             * @param value
             *     allowed object is
             *     {@link LineOfBusinessType }
             *     
             */
            public void setLineOfBusinessType(LineOfBusinessType value) {
                this.lineOfBusinessType = value;
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
             * Gets the value of the schedule property.
             * 
             * @return
             *     possible object is
             *     {@link UpdateOrderResponse.OrderResult.Jobs.Schedule }
             *     
             */
            public UpdateOrderResponse.OrderResult.Jobs.Schedule getSchedule() {
                return schedule;
            }

            /**
             * Sets the value of the schedule property.
             * 
             * @param value
             *     allowed object is
             *     {@link UpdateOrderResponse.OrderResult.Jobs.Schedule }
             *     
             */
            public void setSchedule(UpdateOrderResponse.OrderResult.Jobs.Schedule value) {
                this.schedule = value;
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
             *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="TimeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="TimeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "date",
                "day",
                "timeCode",
                "timeDescription"
            })
            public static class Schedule {

                @XmlElement(name = "Date")
                protected String date;
                @XmlElement(name = "Day")
                protected String day;
                @XmlElement(name = "TimeCode")
                protected String timeCode;
                @XmlElement(name = "TimeDescription")
                protected String timeDescription;

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
                 * Gets the value of the day property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDay() {
                    return day;
                }

                /**
                 * Sets the value of the day property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDay(String value) {
                    this.day = value;
                }

                /**
                 * Gets the value of the timeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTimeCode() {
                    return timeCode;
                }

                /**
                 * Sets the value of the timeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTimeCode(String value) {
                    this.timeCode = value;
                }

                /**
                 * Gets the value of the timeDescription property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTimeDescription() {
                    return timeDescription;
                }

                /**
                 * Sets the value of the timeDescription property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTimeDescription(String value) {
                    this.timeDescription = value;
                }

            }

        }

    }

}
