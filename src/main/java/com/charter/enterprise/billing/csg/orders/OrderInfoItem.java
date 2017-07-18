
package com.charter.enterprise.billing.csg.orders;

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
 * <p>Java class for OrderInfoItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderInfoItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Offer" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="ParentServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="RootServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="ComponentIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="OriginalIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="PenaltyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingDiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TelephoneNumber" type="{http://charter.com/enterprise/billing/csg/orders}TelephoneNumber" minOccurs="0"/>
 *         &lt;element name="BillingDiscountDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChangeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompleteIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NegotiatedCharge" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="NegotiatedChargeOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomField" type="{http://charter.com/enterprise/billing/csg/orders}ItemCustomField" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "OrderInfoItem", propOrder = {
    "offer",
    "code",
    "codeDescription",
    "billingDiscount",
    "telephoneNumber",
    "billingDiscountDescription",
    "changeIndicator",
    "completeIndicator",
    "activationDate",
    "jobSequence",
    "serviceIdentifier",
    "negotiatedCharge",
    "negotiatedChargeOverride",
    "customField",
    "schedule"
})
public class OrderInfoItem {

    @XmlElement(name = "Offer")
    protected OrderInfoItem.Offer offer;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "CodeDescription")
    protected String codeDescription;
    @XmlElement(name = "BillingDiscount")
    protected String billingDiscount;
    @XmlElement(name = "TelephoneNumber")
    protected TelephoneNumber telephoneNumber;
    @XmlElement(name = "BillingDiscountDescription")
    protected String billingDiscountDescription;
    @XmlElement(name = "ChangeIndicator")
    protected String changeIndicator;
    @XmlElement(name = "CompleteIndicator")
    protected String completeIndicator;
    @XmlElement(name = "ActivationDate")
    protected String activationDate;
    @XmlElement(name = "JobSequence")
    protected String jobSequence;
    @XmlElement(name = "ServiceIdentifier")
    protected String serviceIdentifier;
    @XmlElement(name = "NegotiatedCharge")
    protected float negotiatedCharge;
    @XmlElement(name = "NegotiatedChargeOverride")
    protected String negotiatedChargeOverride;
    @XmlElement(name = "CustomField")
    protected List<ItemCustomField> customField;
    @XmlElement(name = "Schedule")
    protected ItemSchedule schedule;

    /**
     * Gets the value of the offer property.
     * 
     * @return
     *     possible object is
     *     {@link OrderInfoItem.Offer }
     *     
     */
    public OrderInfoItem.Offer getOffer() {
        return offer;
    }

    /**
     * Sets the value of the offer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInfoItem.Offer }
     *     
     */
    public void setOffer(OrderInfoItem.Offer value) {
        this.offer = value;
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
     * Gets the value of the codeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDescription() {
        return codeDescription;
    }

    /**
     * Sets the value of the codeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDescription(String value) {
        this.codeDescription = value;
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
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumber }
     *     
     */
    public TelephoneNumber getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumber }
     *     
     */
    public void setTelephoneNumber(TelephoneNumber value) {
        this.telephoneNumber = value;
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
     * Gets the value of the changeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeIndicator() {
        return changeIndicator;
    }

    /**
     * Sets the value of the changeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeIndicator(String value) {
        this.changeIndicator = value;
    }

    /**
     * Gets the value of the completeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompleteIndicator() {
        return completeIndicator;
    }

    /**
     * Sets the value of the completeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompleteIndicator(String value) {
        this.completeIndicator = value;
    }

    /**
     * Gets the value of the activationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationDate() {
        return activationDate;
    }

    /**
     * Sets the value of the activationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationDate(String value) {
        this.activationDate = value;
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
     * {@link ItemCustomField }
     * 
     * 
     */
    public List<ItemCustomField> getCustomField() {
        if (customField == null) {
            customField = new ArrayList<ItemCustomField>();
        }
        return this.customField;
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
     *         &lt;element name="ParentServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="RootServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="ComponentIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="OriginalIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="PenaltyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "penaltyIndicator",
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
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger parentServiceIdentifier;
        @XmlElement(name = "RootServiceIdentifier")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger rootServiceIdentifier;
        @XmlElement(name = "ComponentIdentifier")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger componentIdentifier;
        @XmlElement(name = "OriginalIdentifier")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger originalIdentifier;
        @XmlElement(name = "PenaltyIndicator")
        protected String penaltyIndicator;
        @XmlElement(name = "PenaltyOfferIdentifier")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger penaltyOfferIdentifier;
        @XmlElement(name = "PenaltyServiceIdentifier")
        protected String penaltyServiceIdentifier;
        @XmlElement(name = "Product")
        protected OrderInfoItem.Offer.Product product;
        @XmlElement(name = "PricePlan")
        protected OrderInfoItem.Offer.PricePlan pricePlan;

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
         *     {@link BigInteger }
         *     
         */
        public BigInteger getParentServiceIdentifier() {
            return parentServiceIdentifier;
        }

        /**
         * Sets the value of the parentServiceIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setParentServiceIdentifier(BigInteger value) {
            this.parentServiceIdentifier = value;
        }

        /**
         * Gets the value of the rootServiceIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRootServiceIdentifier() {
            return rootServiceIdentifier;
        }

        /**
         * Sets the value of the rootServiceIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRootServiceIdentifier(BigInteger value) {
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
         * Gets the value of the penaltyIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPenaltyIndicator() {
            return penaltyIndicator;
        }

        /**
         * Sets the value of the penaltyIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPenaltyIndicator(String value) {
            this.penaltyIndicator = value;
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
         *     {@link OrderInfoItem.Offer.Product }
         *     
         */
        public OrderInfoItem.Offer.Product getProduct() {
            return product;
        }

        /**
         * Sets the value of the product property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderInfoItem.Offer.Product }
         *     
         */
        public void setProduct(OrderInfoItem.Offer.Product value) {
            this.product = value;
        }

        /**
         * Gets the value of the pricePlan property.
         * 
         * @return
         *     possible object is
         *     {@link OrderInfoItem.Offer.PricePlan }
         *     
         */
        public OrderInfoItem.Offer.PricePlan getPricePlan() {
            return pricePlan;
        }

        /**
         * Sets the value of the pricePlan property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderInfoItem.Offer.PricePlan }
         *     
         */
        public void setPricePlan(OrderInfoItem.Offer.PricePlan value) {
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
