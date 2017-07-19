
package com.charter.enterprise.billing.csg.accounts;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LedgerFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LedgerFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="LedgerDetailIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *           &lt;element name="LedgerDetailBeginPostDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="LedgerDetailEndPostDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="LedgerStatementIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="LedgerStatementDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="LedgerStatementYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;element name="LedgerStatementMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;/choice>
 *         &lt;element name="LedgerDetailItemOfferIdentifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="LedgerDetailLineOfBusinessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LedgerDetailUsageOrigination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LedgerDetailType" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DetailType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DetailTypeExcludeIncludeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LedgerFilter", propOrder = {
    "ledgerDetailIdentifierOrLedgerDetailBeginPostDateOrLedgerDetailEndPostDate",
    "ledgerDetailItemOfferIdentifier",
    "ledgerDetailLineOfBusinessType",
    "ledgerDetailUsageOrigination",
    "ledgerDetailType",
    "detailTypeExcludeIncludeIndicator"
})
public class LedgerFilter {

    @XmlElementRefs({
        @XmlElementRef(name = "LedgerDetailIdentifier", namespace = "http://charter.com/enterprise/billing/csg/accounts", type = JAXBElement.class),
        @XmlElementRef(name = "LedgerStatementMonth", namespace = "http://charter.com/enterprise/billing/csg/accounts", type = JAXBElement.class),
        @XmlElementRef(name = "LedgerStatementDate", namespace = "http://charter.com/enterprise/billing/csg/accounts", type = JAXBElement.class),
        @XmlElementRef(name = "LedgerStatementIdentifier", namespace = "http://charter.com/enterprise/billing/csg/accounts", type = JAXBElement.class),
        @XmlElementRef(name = "LedgerStatementYear", namespace = "http://charter.com/enterprise/billing/csg/accounts", type = JAXBElement.class),
        @XmlElementRef(name = "LedgerDetailEndPostDate", namespace = "http://charter.com/enterprise/billing/csg/accounts", type = JAXBElement.class),
        @XmlElementRef(name = "LedgerDetailBeginPostDate", namespace = "http://charter.com/enterprise/billing/csg/accounts", type = JAXBElement.class)
    })
    protected List<JAXBElement<? extends Serializable>> ledgerDetailIdentifierOrLedgerDetailBeginPostDateOrLedgerDetailEndPostDate;
    @XmlElement(name = "LedgerDetailItemOfferIdentifier")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger ledgerDetailItemOfferIdentifier;
    @XmlElement(name = "LedgerDetailLineOfBusinessType")
    protected String ledgerDetailLineOfBusinessType;
    @XmlElement(name = "LedgerDetailUsageOrigination")
    protected String ledgerDetailUsageOrigination;
    @XmlElement(name = "LedgerDetailType")
    protected List<LedgerFilter.LedgerDetailType> ledgerDetailType;
    @XmlElement(name = "DetailTypeExcludeIncludeIndicator")
    protected String detailTypeExcludeIncludeIndicator;

    /**
     * Gets the value of the ledgerDetailIdentifierOrLedgerDetailBeginPostDateOrLedgerDetailEndPostDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ledgerDetailIdentifierOrLedgerDetailBeginPostDateOrLedgerDetailEndPostDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLedgerDetailIdentifierOrLedgerDetailBeginPostDateOrLedgerDetailEndPostDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getLedgerDetailIdentifierOrLedgerDetailBeginPostDateOrLedgerDetailEndPostDate() {
        if (ledgerDetailIdentifierOrLedgerDetailBeginPostDateOrLedgerDetailEndPostDate == null) {
            ledgerDetailIdentifierOrLedgerDetailBeginPostDateOrLedgerDetailEndPostDate = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.ledgerDetailIdentifierOrLedgerDetailBeginPostDateOrLedgerDetailEndPostDate;
    }

    /**
     * Gets the value of the ledgerDetailItemOfferIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLedgerDetailItemOfferIdentifier() {
        return ledgerDetailItemOfferIdentifier;
    }

    /**
     * Sets the value of the ledgerDetailItemOfferIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLedgerDetailItemOfferIdentifier(BigInteger value) {
        this.ledgerDetailItemOfferIdentifier = value;
    }

    /**
     * Gets the value of the ledgerDetailLineOfBusinessType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLedgerDetailLineOfBusinessType() {
        return ledgerDetailLineOfBusinessType;
    }

    /**
     * Sets the value of the ledgerDetailLineOfBusinessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLedgerDetailLineOfBusinessType(String value) {
        this.ledgerDetailLineOfBusinessType = value;
    }

    /**
     * Gets the value of the ledgerDetailUsageOrigination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLedgerDetailUsageOrigination() {
        return ledgerDetailUsageOrigination;
    }

    /**
     * Sets the value of the ledgerDetailUsageOrigination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLedgerDetailUsageOrigination(String value) {
        this.ledgerDetailUsageOrigination = value;
    }

    /**
     * Gets the value of the ledgerDetailType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ledgerDetailType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLedgerDetailType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LedgerFilter.LedgerDetailType }
     * 
     * 
     */
    public List<LedgerFilter.LedgerDetailType> getLedgerDetailType() {
        if (ledgerDetailType == null) {
            ledgerDetailType = new ArrayList<LedgerFilter.LedgerDetailType>();
        }
        return this.ledgerDetailType;
    }

    /**
     * Gets the value of the detailTypeExcludeIncludeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailTypeExcludeIncludeIndicator() {
        return detailTypeExcludeIncludeIndicator;
    }

    /**
     * Sets the value of the detailTypeExcludeIncludeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailTypeExcludeIncludeIndicator(String value) {
        this.detailTypeExcludeIncludeIndicator = value;
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
     *         &lt;element name="DetailType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "detailType"
    })
    public static class LedgerDetailType {

        @XmlElement(name = "DetailType")
        protected String detailType;

        /**
         * Gets the value of the detailType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDetailType() {
            return detailType;
        }

        /**
         * Sets the value of the detailType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDetailType(String value) {
            this.detailType = value;
        }

    }

}
