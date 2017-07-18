
package com.charter.enterprise.billing.csg.accounts;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentSubTypeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Restriction" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Card" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SecurityCode" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="SecurityCodeOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="ECommerceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RequestedProcessingNetwork" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EFT" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RoutingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "PaymentDetail", propOrder = {
    "paymentSubType",
    "paymentSubTypeStatus",
    "restriction",
    "card",
    "eft"
})
public class PaymentDetail {

    @XmlElement(name = "PaymentSubType")
    protected String paymentSubType;
    @XmlElement(name = "PaymentSubTypeStatus")
    protected String paymentSubTypeStatus;
    @XmlElement(name = "Restriction")
    protected List<PaymentDetail.Restriction> restriction;
    @XmlElement(name = "Card")
    protected PaymentDetail.Card card;
    @XmlElement(name = "EFT")
    protected PaymentDetail.EFT eft;

    /**
     * Gets the value of the paymentSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentSubType() {
        return paymentSubType;
    }

    /**
     * Sets the value of the paymentSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentSubType(String value) {
        this.paymentSubType = value;
    }

    /**
     * Gets the value of the paymentSubTypeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentSubTypeStatus() {
        return paymentSubTypeStatus;
    }

    /**
     * Sets the value of the paymentSubTypeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentSubTypeStatus(String value) {
        this.paymentSubTypeStatus = value;
    }

    /**
     * Gets the value of the restriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDetail.Restriction }
     * 
     * 
     */
    public List<PaymentDetail.Restriction> getRestriction() {
        if (restriction == null) {
            restriction = new ArrayList<PaymentDetail.Restriction>();
        }
        return this.restriction;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetail.Card }
     *     
     */
    public PaymentDetail.Card getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetail.Card }
     *     
     */
    public void setCard(PaymentDetail.Card value) {
        this.card = value;
    }

    /**
     * Gets the value of the eft property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetail.EFT }
     *     
     */
    public PaymentDetail.EFT getEFT() {
        return eft;
    }

    /**
     * Sets the value of the eft property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetail.EFT }
     *     
     */
    public void setEFT(PaymentDetail.EFT value) {
        this.eft = value;
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
     *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SecurityCode" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="SecurityCodeOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="ECommerceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RequestedProcessingNetwork" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "expirationDate",
        "securityCode",
        "securityCodeOverride",
        "eCommerceIdentifier",
        "requestedProcessingNetwork",
        "source"
    })
    public static class Card {

        @XmlElement(name = "Number")
        protected String number;
        @XmlElement(name = "Type")
        protected String type;
        @XmlElement(name = "ExpirationDate")
        protected String expirationDate;
        @XmlElement(name = "SecurityCode")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger securityCode;
        @XmlElement(name = "SecurityCodeOverride")
        protected Boolean securityCodeOverride;
        @XmlElement(name = "ECommerceIdentifier")
        protected String eCommerceIdentifier;
        @XmlElement(name = "RequestedProcessingNetwork")
        protected String requestedProcessingNetwork;
        @XmlElement(name = "Source")
        protected String source;

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
         * Gets the value of the expirationDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpirationDate() {
            return expirationDate;
        }

        /**
         * Sets the value of the expirationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpirationDate(String value) {
            this.expirationDate = value;
        }

        /**
         * Gets the value of the securityCode property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSecurityCode() {
            return securityCode;
        }

        /**
         * Sets the value of the securityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSecurityCode(BigInteger value) {
            this.securityCode = value;
        }

        /**
         * Gets the value of the securityCodeOverride property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSecurityCodeOverride() {
            return securityCodeOverride;
        }

        /**
         * Sets the value of the securityCodeOverride property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSecurityCodeOverride(Boolean value) {
            this.securityCodeOverride = value;
        }

        /**
         * Gets the value of the eCommerceIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getECommerceIdentifier() {
            return eCommerceIdentifier;
        }

        /**
         * Sets the value of the eCommerceIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setECommerceIdentifier(String value) {
            this.eCommerceIdentifier = value;
        }

        /**
         * Gets the value of the requestedProcessingNetwork property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestedProcessingNetwork() {
            return requestedProcessingNetwork;
        }

        /**
         * Sets the value of the requestedProcessingNetwork property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestedProcessingNetwork(String value) {
            this.requestedProcessingNetwork = value;
        }

        /**
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
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
     *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "accountType",
        "source"
    })
    public static class EFT {

        @XmlElement(name = "RoutingNumber")
        protected String routingNumber;
        @XmlElement(name = "AccountNumber")
        protected String accountNumber;
        @XmlElement(name = "AccountType")
        protected String accountType;
        @XmlElement(name = "Source", defaultValue = "CSR")
        protected String source;

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

        /**
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
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
     *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "type",
        "indicator"
    })
    public static class Restriction {

        @XmlElement(name = "Type")
        protected String type;
        @XmlElement(name = "Indicator")
        protected String indicator;

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
         * Gets the value of the indicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndicator() {
            return indicator;
        }

        /**
         * Sets the value of the indicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndicator(String value) {
            this.indicator = value;
        }

    }

}
