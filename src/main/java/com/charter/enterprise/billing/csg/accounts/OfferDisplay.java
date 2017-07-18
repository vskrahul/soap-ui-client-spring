
package com.charter.enterprise.billing.csg.accounts;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferDisplay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferDisplay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="ServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="ParentServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="RootServiceIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="ComponentIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="PricePlan" type="{http://charter.com/enterprise/billing/csg/accounts}PricePlanType" minOccurs="0"/>
 *         &lt;element name="Display" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BundleType" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferDisplay", propOrder = {
    "identifier",
    "serviceIdentifier",
    "parentServiceIdentifier",
    "rootServiceIdentifier",
    "componentIdentifier",
    "pricePlan",
    "display",
    "bundleType"
})
public class OfferDisplay {

    @XmlElement(name = "Identifier")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger identifier;
    @XmlElement(name = "ServiceIdentifier")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger serviceIdentifier;
    @XmlElement(name = "ParentServiceIdentifier")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger parentServiceIdentifier;
    @XmlElement(name = "RootServiceIdentifier")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger rootServiceIdentifier;
    @XmlElement(name = "ComponentIdentifier")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger componentIdentifier;
    @XmlElement(name = "PricePlan")
    protected PricePlanType pricePlan;
    @XmlElement(name = "Display")
    protected OfferDisplay.Display display;
    @XmlElement(name = "BundleType")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger bundleType;

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
     * Gets the value of the serviceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getServiceIdentifier() {
        return serviceIdentifier;
    }

    /**
     * Sets the value of the serviceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setServiceIdentifier(BigInteger value) {
        this.serviceIdentifier = value;
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
     * Gets the value of the pricePlan property.
     * 
     * @return
     *     possible object is
     *     {@link PricePlanType }
     *     
     */
    public PricePlanType getPricePlan() {
        return pricePlan;
    }

    /**
     * Sets the value of the pricePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricePlanType }
     *     
     */
    public void setPricePlan(PricePlanType value) {
        this.pricePlan = value;
    }

    /**
     * Gets the value of the display property.
     * 
     * @return
     *     possible object is
     *     {@link OfferDisplay.Display }
     *     
     */
    public OfferDisplay.Display getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferDisplay.Display }
     *     
     */
    public void setDisplay(OfferDisplay.Display value) {
        this.display = value;
    }

    /**
     * Gets the value of the bundleType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBundleType() {
        return bundleType;
    }

    /**
     * Sets the value of the bundleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBundleType(BigInteger value) {
        this.bundleType = value;
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
     *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
        "level",
        "group"
    })
    public static class Display {

        @XmlElement(name = "Sequence")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger sequence;
        @XmlElement(name = "Level")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger level;
        @XmlElement(name = "Group")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger group;

        /**
         * Gets the value of the sequence property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSequence() {
            return sequence;
        }

        /**
         * Sets the value of the sequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSequence(BigInteger value) {
            this.sequence = value;
        }

        /**
         * Gets the value of the level property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLevel() {
            return level;
        }

        /**
         * Sets the value of the level property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLevel(BigInteger value) {
            this.level = value;
        }

        /**
         * Gets the value of the group property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getGroup() {
            return group;
        }

        /**
         * Sets the value of the group property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setGroup(BigInteger value) {
            this.group = value;
        }

    }

}
