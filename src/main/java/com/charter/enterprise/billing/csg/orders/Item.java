
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
 * <p>Java class for Item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
 *         &lt;element name="HandshakeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CatalogIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceBillCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Outlet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NegotiatedCharge" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="NegotiatedChargeOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DiscountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestedFunction" type="{http://charter.com/enterprise/billing/csg/orders}RequestedFunction"/>
 *         &lt;element name="Telephone" type="{http://charter.com/enterprise/billing/csg/orders}Telephone" minOccurs="0"/>
 *         &lt;element name="Parameter" type="{http://charter.com/enterprise/billing/csg/orders}Parameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExternalProvisioningStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Item", propOrder = {
    "lineOfBusiness",
    "billingIdentifier",
    "offer",
    "handshakeID",
    "parentID",
    "catalogIdentifier",
    "serviceIdentifier",
    "serviceBillCode",
    "packageCode",
    "quantity",
    "outlet",
    "classCode",
    "rate",
    "negotiatedCharge",
    "negotiatedChargeOverride",
    "effectiveDate",
    "discountCode",
    "requestedFunction",
    "telephone",
    "parameter",
    "externalProvisioningStatus",
    "jobSequence",
    "schedule"
})
public class Item {

    @XmlElement(name = "LineOfBusiness")
    protected String lineOfBusiness;
    @XmlElement(name = "BillingIdentifier")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger billingIdentifier;
    @XmlElement(name = "Offer")
    protected Item.Offer offer;
    @XmlElement(name = "HandshakeID")
    protected String handshakeID;
    @XmlElement(name = "ParentID")
    protected String parentID;
    @XmlElement(name = "CatalogIdentifier")
    protected String catalogIdentifier;
    @XmlElement(name = "ServiceIdentifier")
    protected String serviceIdentifier;
    @XmlElement(name = "ServiceBillCode")
    protected String serviceBillCode;
    @XmlElement(name = "PackageCode")
    protected String packageCode;
    @XmlElement(name = "Quantity")
    protected int quantity;
    @XmlElement(name = "Outlet")
    protected String outlet;
    @XmlElement(name = "ClassCode")
    protected String classCode;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "NegotiatedCharge")
    protected float negotiatedCharge;
    @XmlElement(name = "NegotiatedChargeOverride")
    protected String negotiatedChargeOverride;
    @XmlElement(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "DiscountCode")
    protected String discountCode;
    @XmlElement(name = "RequestedFunction", required = true)
    protected RequestedFunction requestedFunction;
    @XmlElement(name = "Telephone")
    protected Telephone telephone;
    @XmlElement(name = "Parameter")
    protected List<Parameter> parameter;
    @XmlElement(name = "ExternalProvisioningStatus")
    protected String externalProvisioningStatus;
    @XmlElement(name = "JobSequence")
    protected String jobSequence;
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
     * Gets the value of the offer property.
     * 
     * @return
     *     possible object is
     *     {@link Item.Offer }
     *     
     */
    public Item.Offer getOffer() {
        return offer;
    }

    /**
     * Sets the value of the offer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Item.Offer }
     *     
     */
    public void setOffer(Item.Offer value) {
        this.offer = value;
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
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the negotiatedCharge property.
     * 
     */
    public float getNegotiatedCharge() {
        return negotiatedCharge;
    }

    /**
     * Sets the value of the negotiatedCharge property.
     * 
     */
    public void setNegotiatedCharge(float value) {
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
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
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
        protected Item.Offer.Product product;
        @XmlElement(name = "PricePlan")
        protected Item.Offer.PricePlan pricePlan;

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
         *     {@link Item.Offer.Product }
         *     
         */
        public Item.Offer.Product getProduct() {
            return product;
        }

        /**
         * Sets the value of the product property.
         * 
         * @param value
         *     allowed object is
         *     {@link Item.Offer.Product }
         *     
         */
        public void setProduct(Item.Offer.Product value) {
            this.product = value;
        }

        /**
         * Gets the value of the pricePlan property.
         * 
         * @return
         *     possible object is
         *     {@link Item.Offer.PricePlan }
         *     
         */
        public Item.Offer.PricePlan getPricePlan() {
            return pricePlan;
        }

        /**
         * Sets the value of the pricePlan property.
         * 
         * @param value
         *     allowed object is
         *     {@link Item.Offer.PricePlan }
         *     
         */
        public void setPricePlan(Item.Offer.PricePlan value) {
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
