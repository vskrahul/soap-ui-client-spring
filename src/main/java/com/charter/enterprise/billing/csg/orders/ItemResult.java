
package com.charter.enterprise.billing.csg.orders;

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
 * <p>Java class for ItemResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HandshakeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackageServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CatalogIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceBillCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="DiscountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Charge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="NegotiatedCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="NegotiatedChargeOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChargeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChargeMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="Parameter" type="{http://charter.com/enterprise/billing/csg/orders}Parameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Schedule" type="{http://charter.com/enterprise/billing/csg/orders}ItemSchedule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemResult", propOrder = {
    "lineOfBusiness",
    "billingIdentifier",
    "accountId",
    "code",
    "handshakeID",
    "parentID",
    "packageServiceIdentifier",
    "catalogIdentifier",
    "telephoneNumber",
    "serviceIdentifier",
    "serviceBillCode",
    "quantity",
    "beginDate",
    "discountCode",
    "charge",
    "negotiatedCharge",
    "negotiatedChargeOverride",
    "chargeType",
    "chargeMethod",
    "offer",
    "parameter",
    "schedule"
})
public class ItemResult {

    @XmlElement(name = "LineOfBusiness")
    protected String lineOfBusiness;
    @XmlElement(name = "BillingIdentifier")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger billingIdentifier;
    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "HandshakeID")
    protected String handshakeID;
    @XmlElement(name = "ParentID")
    protected String parentID;
    @XmlElement(name = "PackageServiceIdentifier")
    protected String packageServiceIdentifier;
    @XmlElement(name = "CatalogIdentifier")
    protected String catalogIdentifier;
    @XmlElement(name = "TelephoneNumber")
    protected String telephoneNumber;
    @XmlElement(name = "ServiceIdentifier")
    protected String serviceIdentifier;
    @XmlElement(name = "ServiceBillCode")
    protected String serviceBillCode;
    @XmlElement(name = "Quantity")
    protected int quantity;
    @XmlElement(name = "BeginDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar beginDate;
    @XmlElement(name = "DiscountCode")
    protected String discountCode;
    @XmlElement(name = "Charge", required = true)
    protected BigDecimal charge;
    @XmlElement(name = "NegotiatedCharge", required = true)
    protected BigDecimal negotiatedCharge;
    @XmlElement(name = "NegotiatedChargeOverride")
    protected String negotiatedChargeOverride;
    @XmlElement(name = "ChargeType")
    protected String chargeType;
    @XmlElement(name = "ChargeMethod")
    protected String chargeMethod;
    @XmlElement(name = "Offer")
    protected ItemResult.Offer offer;
    @XmlElement(name = "Parameter")
    protected List<Parameter> parameter;
    @XmlElement(name = "Schedule")
    protected ItemSchedule schedule;

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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the handshakeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandshakeID() {
        return handshakeID;
    }

    /**
     * Sets the value of the handshakeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandshakeID(String value) {
        this.handshakeID = value;
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
     * Gets the value of the packageServiceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageServiceIdentifier() {
        return packageServiceIdentifier;
    }

    /**
     * Sets the value of the packageServiceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageServiceIdentifier(String value) {
        this.packageServiceIdentifier = value;
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
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneNumber(String value) {
        this.telephoneNumber = value;
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
     * Gets the value of the quantity property.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
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
     * Gets the value of the charge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCharge() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCharge(BigDecimal value) {
        this.charge = value;
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
     * Gets the value of the chargeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * Sets the value of the chargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeType(String value) {
        this.chargeType = value;
    }

    /**
     * Gets the value of the chargeMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeMethod() {
        return chargeMethod;
    }

    /**
     * Sets the value of the chargeMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeMethod(String value) {
        this.chargeMethod = value;
    }

    /**
     * Gets the value of the offer property.
     * 
     * @return
     *     possible object is
     *     {@link ItemResult.Offer }
     *     
     */
    public ItemResult.Offer getOffer() {
        return offer;
    }

    /**
     * Sets the value of the offer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemResult.Offer }
     *     
     */
    public void setOffer(ItemResult.Offer value) {
        this.offer = value;
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
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSchedule }
     *     
     */
    public ItemSchedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSchedule }
     *     
     */
    public void setSchedule(ItemSchedule value) {
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
        protected ItemResult.Offer.Product product;
        @XmlElement(name = "PricePlan")
        protected ItemResult.Offer.PricePlan pricePlan;

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
         *     {@link ItemResult.Offer.Product }
         *     
         */
        public ItemResult.Offer.Product getProduct() {
            return product;
        }

        /**
         * Sets the value of the product property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemResult.Offer.Product }
         *     
         */
        public void setProduct(ItemResult.Offer.Product value) {
            this.product = value;
        }

        /**
         * Gets the value of the pricePlan property.
         * 
         * @return
         *     possible object is
         *     {@link ItemResult.Offer.PricePlan }
         *     
         */
        public ItemResult.Offer.PricePlan getPricePlan() {
            return pricePlan;
        }

        /**
         * Sets the value of the pricePlan property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemResult.Offer.PricePlan }
         *     
         */
        public void setPricePlan(ItemResult.Offer.PricePlan value) {
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
