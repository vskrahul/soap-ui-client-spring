
package com.charter.enterprise.billing.csg.accounts;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquifaxCreditDetailResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquifaxCreditDetailResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Business" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Credit" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Verification" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MessageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Hit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="HitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="HitCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AddressDiscrepancy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Warning" minOccurs="0">
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
 *                   &lt;element name="Score" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Decision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Treatment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="IncidentReport" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DeleteDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Comment" type="{http://charter.com/enterprise/billing/csg/accounts}text" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Contact" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Warning" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ReportDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Phone" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="InternationalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Address" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Comment" type="{http://charter.com/enterprise/billing/csg/accounts}text" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="InquiryCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="Inquiry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Name" type="{http://charter.com/enterprise/billing/csg/accounts}NameType" minOccurs="0"/>
 *                             &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Audit" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Creation" type="{http://charter.com/enterprise/billing/csg/accounts}audit" minOccurs="0"/>
 *                             &lt;element name="LastUpdate" type="{http://charter.com/enterprise/billing/csg/accounts}audit" minOccurs="0"/>
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
 *         &lt;element name="CustomerList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="Customer" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{http://charter.com/enterprise/billing/csg/accounts}NameType" minOccurs="0"/>
 *                             &lt;element name="Phone" type="{http://charter.com/enterprise/billing/csg/accounts}phoneA" minOccurs="0"/>
 *                             &lt;element name="Address" type="{http://charter.com/enterprise/billing/csg/accounts}addressA" minOccurs="0"/>
 *                             &lt;element name="Identification" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="TaxIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                       &lt;element name="DeceasedYear" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Verification" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ValidityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Match" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Previous" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Address" type="{http://charter.com/enterprise/billing/csg/accounts}addressA" minOccurs="0"/>
 *                                       &lt;element name="Phone" type="{http://charter.com/enterprise/billing/csg/accounts}phoneA" minOccurs="0"/>
 *                                       &lt;element name="Identification" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="TaxIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="UncollectedAccountCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                             &lt;element name="UncollectedAccount" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Name" type="{http://charter.com/enterprise/billing/csg/accounts}NameType" minOccurs="0"/>
 *                                       &lt;element name="Identification" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="TaxIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Address" type="{http://charter.com/enterprise/billing/csg/accounts}addressA" minOccurs="0"/>
 *                                       &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="SubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="CompanyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ConnectDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="DisconnectDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Balance" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Current" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Disputed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="DisputeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Match" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="UnreturnedEquipment" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
@XmlType(name = "EquifaxCreditDetailResult", propOrder = {
    "business",
    "locationId",
    "credit",
    "customerList"
})
public class EquifaxCreditDetailResult {

    @XmlElement(name = "Business")
    protected String business;
    @XmlElement(name = "LocationId")
    protected String locationId;
    @XmlElement(name = "Credit")
    protected EquifaxCreditDetailResult.Credit credit;
    @XmlElement(name = "CustomerList")
    protected EquifaxCreditDetailResult.CustomerList customerList;

    /**
     * Gets the value of the business property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusiness() {
        return business;
    }

    /**
     * Sets the value of the business property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusiness(String value) {
        this.business = value;
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
     * Gets the value of the credit property.
     * 
     * @return
     *     possible object is
     *     {@link EquifaxCreditDetailResult.Credit }
     *     
     */
    public EquifaxCreditDetailResult.Credit getCredit() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquifaxCreditDetailResult.Credit }
     *     
     */
    public void setCredit(EquifaxCreditDetailResult.Credit value) {
        this.credit = value;
    }

    /**
     * Gets the value of the customerList property.
     * 
     * @return
     *     possible object is
     *     {@link EquifaxCreditDetailResult.CustomerList }
     *     
     */
    public EquifaxCreditDetailResult.CustomerList getCustomerList() {
        return customerList;
    }

    /**
     * Sets the value of the customerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquifaxCreditDetailResult.CustomerList }
     *     
     */
    public void setCustomerList(EquifaxCreditDetailResult.CustomerList value) {
        this.customerList = value;
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
     *         &lt;element name="Verification" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MessageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Hit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="HitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="HitCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AddressDiscrepancy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Warning" minOccurs="0">
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
     *         &lt;element name="Score" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Decision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Treatment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="IncidentReport" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DeleteDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Comment" type="{http://charter.com/enterprise/billing/csg/accounts}text" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Contact" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Warning" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ReportDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Phone" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="InternationalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Address" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Comment" type="{http://charter.com/enterprise/billing/csg/accounts}text" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="InquiryCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="Inquiry" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Name" type="{http://charter.com/enterprise/billing/csg/accounts}NameType" minOccurs="0"/>
     *                   &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Audit" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Creation" type="{http://charter.com/enterprise/billing/csg/accounts}audit" minOccurs="0"/>
     *                   &lt;element name="LastUpdate" type="{http://charter.com/enterprise/billing/csg/accounts}audit" minOccurs="0"/>
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
        "verification",
        "hit",
        "hitCode",
        "hitCodeDescription",
        "addressDiscrepancy",
        "warning",
        "score",
        "incidentReport",
        "contact",
        "inquiryCount",
        "inquiry",
        "audit"
    })
    public static class Credit {

        @XmlElement(name = "Verification")
        protected EquifaxCreditDetailResult.Credit.Verification verification;
        @XmlElement(name = "Hit")
        protected String hit;
        @XmlElement(name = "HitCode")
        protected String hitCode;
        @XmlElement(name = "HitCodeDescription")
        protected String hitCodeDescription;
        @XmlElement(name = "AddressDiscrepancy")
        protected String addressDiscrepancy;
        @XmlElement(name = "Warning")
        protected EquifaxCreditDetailResult.Credit.Warning warning;
        @XmlElement(name = "Score")
        protected EquifaxCreditDetailResult.Credit.Score score;
        @XmlElement(name = "IncidentReport")
        protected EquifaxCreditDetailResult.Credit.IncidentReport incidentReport;
        @XmlElement(name = "Contact")
        protected EquifaxCreditDetailResult.Credit.Contact contact;
        @XmlElement(name = "InquiryCount")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger inquiryCount;
        @XmlElement(name = "Inquiry")
        protected List<EquifaxCreditDetailResult.Credit.Inquiry> inquiry;
        @XmlElement(name = "Audit")
        protected EquifaxCreditDetailResult.Credit.Audit audit;

        /**
         * Gets the value of the verification property.
         * 
         * @return
         *     possible object is
         *     {@link EquifaxCreditDetailResult.Credit.Verification }
         *     
         */
        public EquifaxCreditDetailResult.Credit.Verification getVerification() {
            return verification;
        }

        /**
         * Sets the value of the verification property.
         * 
         * @param value
         *     allowed object is
         *     {@link EquifaxCreditDetailResult.Credit.Verification }
         *     
         */
        public void setVerification(EquifaxCreditDetailResult.Credit.Verification value) {
            this.verification = value;
        }

        /**
         * Gets the value of the hit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHit() {
            return hit;
        }

        /**
         * Sets the value of the hit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHit(String value) {
            this.hit = value;
        }

        /**
         * Gets the value of the hitCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHitCode() {
            return hitCode;
        }

        /**
         * Sets the value of the hitCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHitCode(String value) {
            this.hitCode = value;
        }

        /**
         * Gets the value of the hitCodeDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHitCodeDescription() {
            return hitCodeDescription;
        }

        /**
         * Sets the value of the hitCodeDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHitCodeDescription(String value) {
            this.hitCodeDescription = value;
        }

        /**
         * Gets the value of the addressDiscrepancy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddressDiscrepancy() {
            return addressDiscrepancy;
        }

        /**
         * Sets the value of the addressDiscrepancy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddressDiscrepancy(String value) {
            this.addressDiscrepancy = value;
        }

        /**
         * Gets the value of the warning property.
         * 
         * @return
         *     possible object is
         *     {@link EquifaxCreditDetailResult.Credit.Warning }
         *     
         */
        public EquifaxCreditDetailResult.Credit.Warning getWarning() {
            return warning;
        }

        /**
         * Sets the value of the warning property.
         * 
         * @param value
         *     allowed object is
         *     {@link EquifaxCreditDetailResult.Credit.Warning }
         *     
         */
        public void setWarning(EquifaxCreditDetailResult.Credit.Warning value) {
            this.warning = value;
        }

        /**
         * Gets the value of the score property.
         * 
         * @return
         *     possible object is
         *     {@link EquifaxCreditDetailResult.Credit.Score }
         *     
         */
        public EquifaxCreditDetailResult.Credit.Score getScore() {
            return score;
        }

        /**
         * Sets the value of the score property.
         * 
         * @param value
         *     allowed object is
         *     {@link EquifaxCreditDetailResult.Credit.Score }
         *     
         */
        public void setScore(EquifaxCreditDetailResult.Credit.Score value) {
            this.score = value;
        }

        /**
         * Gets the value of the incidentReport property.
         * 
         * @return
         *     possible object is
         *     {@link EquifaxCreditDetailResult.Credit.IncidentReport }
         *     
         */
        public EquifaxCreditDetailResult.Credit.IncidentReport getIncidentReport() {
            return incidentReport;
        }

        /**
         * Sets the value of the incidentReport property.
         * 
         * @param value
         *     allowed object is
         *     {@link EquifaxCreditDetailResult.Credit.IncidentReport }
         *     
         */
        public void setIncidentReport(EquifaxCreditDetailResult.Credit.IncidentReport value) {
            this.incidentReport = value;
        }

        /**
         * Gets the value of the contact property.
         * 
         * @return
         *     possible object is
         *     {@link EquifaxCreditDetailResult.Credit.Contact }
         *     
         */
        public EquifaxCreditDetailResult.Credit.Contact getContact() {
            return contact;
        }

        /**
         * Sets the value of the contact property.
         * 
         * @param value
         *     allowed object is
         *     {@link EquifaxCreditDetailResult.Credit.Contact }
         *     
         */
        public void setContact(EquifaxCreditDetailResult.Credit.Contact value) {
            this.contact = value;
        }

        /**
         * Gets the value of the inquiryCount property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getInquiryCount() {
            return inquiryCount;
        }

        /**
         * Sets the value of the inquiryCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setInquiryCount(BigInteger value) {
            this.inquiryCount = value;
        }

        /**
         * Gets the value of the inquiry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inquiry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInquiry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EquifaxCreditDetailResult.Credit.Inquiry }
         * 
         * 
         */
        public List<EquifaxCreditDetailResult.Credit.Inquiry> getInquiry() {
            if (inquiry == null) {
                inquiry = new ArrayList<EquifaxCreditDetailResult.Credit.Inquiry>();
            }
            return this.inquiry;
        }

        /**
         * Gets the value of the audit property.
         * 
         * @return
         *     possible object is
         *     {@link EquifaxCreditDetailResult.Credit.Audit }
         *     
         */
        public EquifaxCreditDetailResult.Credit.Audit getAudit() {
            return audit;
        }

        /**
         * Sets the value of the audit property.
         * 
         * @param value
         *     allowed object is
         *     {@link EquifaxCreditDetailResult.Credit.Audit }
         *     
         */
        public void setAudit(EquifaxCreditDetailResult.Credit.Audit value) {
            this.audit = value;
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
         *         &lt;element name="Creation" type="{http://charter.com/enterprise/billing/csg/accounts}audit" minOccurs="0"/>
         *         &lt;element name="LastUpdate" type="{http://charter.com/enterprise/billing/csg/accounts}audit" minOccurs="0"/>
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
            "creation",
            "lastUpdate"
        })
        public static class Audit {

            @XmlElement(name = "Creation")
            protected com.charter.enterprise.billing.csg.accounts.Audit creation;
            @XmlElement(name = "LastUpdate")
            protected com.charter.enterprise.billing.csg.accounts.Audit lastUpdate;

            /**
             * Gets the value of the creation property.
             * 
             * @return
             *     possible object is
             *     {@link com.charter.enterprise.billing.csg.accounts.Audit }
             *     
             */
            public com.charter.enterprise.billing.csg.accounts.Audit getCreation() {
                return creation;
            }

            /**
             * Sets the value of the creation property.
             * 
             * @param value
             *     allowed object is
             *     {@link com.charter.enterprise.billing.csg.accounts.Audit }
             *     
             */
            public void setCreation(com.charter.enterprise.billing.csg.accounts.Audit value) {
                this.creation = value;
            }

            /**
             * Gets the value of the lastUpdate property.
             * 
             * @return
             *     possible object is
             *     {@link com.charter.enterprise.billing.csg.accounts.Audit }
             *     
             */
            public com.charter.enterprise.billing.csg.accounts.Audit getLastUpdate() {
                return lastUpdate;
            }

            /**
             * Sets the value of the lastUpdate property.
             * 
             * @param value
             *     allowed object is
             *     {@link com.charter.enterprise.billing.csg.accounts.Audit }
             *     
             */
            public void setLastUpdate(com.charter.enterprise.billing.csg.accounts.Audit value) {
                this.lastUpdate = value;
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
         *         &lt;element name="Warning" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ReportDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Phone" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="InternationalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Address" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Comment" type="{http://charter.com/enterprise/billing/csg/accounts}text" maxOccurs="unbounded" minOccurs="0"/>
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
            "warning",
            "status",
            "reportDate",
            "effectiveDate",
            "phone",
            "address",
            "comment"
        })
        public static class Contact {

            @XmlElement(name = "Warning")
            protected EquifaxCreditDetailResult.Credit.Contact.Warning warning;
            @XmlElement(name = "Status")
            protected String status;
            @XmlElement(name = "ReportDate")
            protected String reportDate;
            @XmlElement(name = "EffectiveDate")
            protected String effectiveDate;
            @XmlElement(name = "Phone")
            protected List<EquifaxCreditDetailResult.Credit.Contact.Phone> phone;
            @XmlElement(name = "Address")
            protected EquifaxCreditDetailResult.Credit.Contact.Address address;
            @XmlElement(name = "Comment")
            protected List<Text> comment;

            /**
             * Gets the value of the warning property.
             * 
             * @return
             *     possible object is
             *     {@link EquifaxCreditDetailResult.Credit.Contact.Warning }
             *     
             */
            public EquifaxCreditDetailResult.Credit.Contact.Warning getWarning() {
                return warning;
            }

            /**
             * Sets the value of the warning property.
             * 
             * @param value
             *     allowed object is
             *     {@link EquifaxCreditDetailResult.Credit.Contact.Warning }
             *     
             */
            public void setWarning(EquifaxCreditDetailResult.Credit.Contact.Warning value) {
                this.warning = value;
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
             * Gets the value of the reportDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReportDate() {
                return reportDate;
            }

            /**
             * Sets the value of the reportDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReportDate(String value) {
                this.reportDate = value;
            }

            /**
             * Gets the value of the effectiveDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEffectiveDate() {
                return effectiveDate;
            }

            /**
             * Sets the value of the effectiveDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEffectiveDate(String value) {
                this.effectiveDate = value;
            }

            /**
             * Gets the value of the phone property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the phone property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPhone().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EquifaxCreditDetailResult.Credit.Contact.Phone }
             * 
             * 
             */
            public List<EquifaxCreditDetailResult.Credit.Contact.Phone> getPhone() {
                if (phone == null) {
                    phone = new ArrayList<EquifaxCreditDetailResult.Credit.Contact.Phone>();
                }
                return this.phone;
            }

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link EquifaxCreditDetailResult.Credit.Contact.Address }
             *     
             */
            public EquifaxCreditDetailResult.Credit.Contact.Address getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link EquifaxCreditDetailResult.Credit.Contact.Address }
             *     
             */
            public void setAddress(EquifaxCreditDetailResult.Credit.Contact.Address value) {
                this.address = value;
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
             * {@link Text }
             * 
             * 
             */
            public List<Text> getComment() {
                if (comment == null) {
                    comment = new ArrayList<Text>();
                }
                return this.comment;
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
             *         &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "addressLine1",
                "addressLine2",
                "city",
                "state",
                "zipCode",
                "country"
            })
            public static class Address {

                @XmlElement(name = "AddressLine1")
                protected String addressLine1;
                @XmlElement(name = "AddressLine2")
                protected String addressLine2;
                @XmlElement(name = "City")
                protected String city;
                @XmlElement(name = "State")
                protected String state;
                @XmlElement(name = "ZipCode")
                protected String zipCode;
                @XmlElement(name = "Country")
                protected String country;

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
                 * Gets the value of the zipCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getZipCode() {
                    return zipCode;
                }

                /**
                 * Sets the value of the zipCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setZipCode(String value) {
                    this.zipCode = value;
                }

                /**
                 * Gets the value of the country property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCountry() {
                    return country;
                }

                /**
                 * Sets the value of the country property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCountry(String value) {
                    this.country = value;
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
             *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="InternationalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "internationalCode",
                "extension"
            })
            public static class Phone {

                @XmlElement(name = "Number")
                protected String number;
                @XmlElement(name = "Type")
                protected String type;
                @XmlElement(name = "InternationalCode")
                protected String internationalCode;
                @XmlElement(name = "Extension")
                protected String extension;

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
                 * Gets the value of the internationalCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInternationalCode() {
                    return internationalCode;
                }

                /**
                 * Sets the value of the internationalCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInternationalCode(String value) {
                    this.internationalCode = value;
                }

                /**
                 * Gets the value of the extension property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExtension() {
                    return extension;
                }

                /**
                 * Sets the value of the extension property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExtension(String value) {
                    this.extension = value;
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
                "type"
            })
            public static class Warning {

                @XmlElement(name = "Type")
                protected String type;

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
         *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DeleteDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Comment" type="{http://charter.com/enterprise/billing/csg/accounts}text" maxOccurs="unbounded" minOccurs="0"/>
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
            "deleteDate",
            "comment"
        })
        public static class IncidentReport {

            @XmlElement(name = "Date")
            protected String date;
            @XmlElement(name = "DeleteDate")
            protected String deleteDate;
            @XmlElement(name = "Comment")
            protected List<Text> comment;

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
             * Gets the value of the deleteDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeleteDate() {
                return deleteDate;
            }

            /**
             * Sets the value of the deleteDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeleteDate(String value) {
                this.deleteDate = value;
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
             * {@link Text }
             * 
             * 
             */
            public List<Text> getComment() {
                if (comment == null) {
                    comment = new ArrayList<Text>();
                }
                return this.comment;
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
         *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Name" type="{http://charter.com/enterprise/billing/csg/accounts}NameType" minOccurs="0"/>
         *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "customerId",
            "name",
            "date",
            "time"
        })
        public static class Inquiry {

            @XmlElement(name = "CustomerId")
            protected String customerId;
            @XmlElement(name = "Name")
            protected NameType name;
            @XmlElement(name = "Date")
            protected String date;
            @XmlElement(name = "Time")
            protected String time;

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
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link NameType }
             *     
             */
            public NameType getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link NameType }
             *     
             */
            public void setName(NameType value) {
                this.name = value;
            }

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
             * Gets the value of the time property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTime() {
                return time;
            }

            /**
             * Sets the value of the time property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTime(String value) {
                this.time = value;
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
         *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Decision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Treatment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "code",
            "decision",
            "treatment"
        })
        public static class Score {

            @XmlElement(name = "Code")
            protected String code;
            @XmlElement(name = "Decision")
            protected String decision;
            @XmlElement(name = "Treatment")
            protected String treatment;

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
             * Gets the value of the decision property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDecision() {
                return decision;
            }

            /**
             * Sets the value of the decision property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDecision(String value) {
                this.decision = value;
            }

            /**
             * Gets the value of the treatment property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTreatment() {
                return treatment;
            }

            /**
             * Sets the value of the treatment property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTreatment(String value) {
                this.treatment = value;
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
         *         &lt;element name="MessageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "messageCode",
            "message"
        })
        public static class Verification {

            @XmlElement(name = "MessageCode")
            protected String messageCode;
            @XmlElement(name = "Message")
            protected String message;

            /**
             * Gets the value of the messageCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMessageCode() {
                return messageCode;
            }

            /**
             * Sets the value of the messageCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMessageCode(String value) {
                this.messageCode = value;
            }

            /**
             * Gets the value of the message property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMessage() {
                return message;
            }

            /**
             * Sets the value of the message property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMessage(String value) {
                this.message = value;
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
        public static class Warning {

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
     *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="Customer" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{http://charter.com/enterprise/billing/csg/accounts}NameType" minOccurs="0"/>
     *                   &lt;element name="Phone" type="{http://charter.com/enterprise/billing/csg/accounts}phoneA" minOccurs="0"/>
     *                   &lt;element name="Address" type="{http://charter.com/enterprise/billing/csg/accounts}addressA" minOccurs="0"/>
     *                   &lt;element name="Identification" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="TaxIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                             &lt;element name="DeceasedYear" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Verification" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ValidityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Match" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Previous" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Address" type="{http://charter.com/enterprise/billing/csg/accounts}addressA" minOccurs="0"/>
     *                             &lt;element name="Phone" type="{http://charter.com/enterprise/billing/csg/accounts}phoneA" minOccurs="0"/>
     *                             &lt;element name="Identification" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="TaxIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                   &lt;element name="UncollectedAccountCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *                   &lt;element name="UncollectedAccount" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Name" type="{http://charter.com/enterprise/billing/csg/accounts}NameType" minOccurs="0"/>
     *                             &lt;element name="Identification" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="TaxIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Address" type="{http://charter.com/enterprise/billing/csg/accounts}addressA" minOccurs="0"/>
     *                             &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="SubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="CompanyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ConnectDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="DisconnectDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Balance" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Current" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Disputed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="DisputeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Match" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="UnreturnedEquipment" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
        "count",
        "customer"
    })
    public static class CustomerList {

        @XmlElement(name = "Count")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger count;
        @XmlElement(name = "Customer")
        protected List<EquifaxCreditDetailResult.CustomerList.Customer> customer;

        /**
         * Gets the value of the count property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCount() {
            return count;
        }

        /**
         * Sets the value of the count property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCount(BigInteger value) {
            this.count = value;
        }

        /**
         * Gets the value of the customer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EquifaxCreditDetailResult.CustomerList.Customer }
         * 
         * 
         */
        public List<EquifaxCreditDetailResult.CustomerList.Customer> getCustomer() {
            if (customer == null) {
                customer = new ArrayList<EquifaxCreditDetailResult.CustomerList.Customer>();
            }
            return this.customer;
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
         *         &lt;element name="Name" type="{http://charter.com/enterprise/billing/csg/accounts}NameType" minOccurs="0"/>
         *         &lt;element name="Phone" type="{http://charter.com/enterprise/billing/csg/accounts}phoneA" minOccurs="0"/>
         *         &lt;element name="Address" type="{http://charter.com/enterprise/billing/csg/accounts}addressA" minOccurs="0"/>
         *         &lt;element name="Identification" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="TaxIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                   &lt;element name="DeceasedYear" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Verification" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ValidityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Match" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Previous" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Address" type="{http://charter.com/enterprise/billing/csg/accounts}addressA" minOccurs="0"/>
         *                   &lt;element name="Phone" type="{http://charter.com/enterprise/billing/csg/accounts}phoneA" minOccurs="0"/>
         *                   &lt;element name="Identification" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="TaxIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *         &lt;element name="UncollectedAccountCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
         *         &lt;element name="UncollectedAccount" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Name" type="{http://charter.com/enterprise/billing/csg/accounts}NameType" minOccurs="0"/>
         *                   &lt;element name="Identification" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="TaxIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Address" type="{http://charter.com/enterprise/billing/csg/accounts}addressA" minOccurs="0"/>
         *                   &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="SubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="CompanyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ConnectDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="DisconnectDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Balance" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Current" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Disputed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="DisputeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Match" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="UnreturnedEquipment" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
            "name",
            "phone",
            "address",
            "identification",
            "verification",
            "match",
            "previous",
            "uncollectedAccountCount",
            "uncollectedAccount"
        })
        public static class Customer {

            @XmlElement(name = "Name")
            protected NameType name;
            @XmlElement(name = "Phone")
            protected PhoneA phone;
            @XmlElement(name = "Address")
            protected AddressA address;
            @XmlElement(name = "Identification")
            protected EquifaxCreditDetailResult.CustomerList.Customer.Identification identification;
            @XmlElement(name = "Verification")
            protected EquifaxCreditDetailResult.CustomerList.Customer.Verification verification;
            @XmlElement(name = "Match")
            protected String match;
            @XmlElement(name = "Previous")
            protected EquifaxCreditDetailResult.CustomerList.Customer.Previous previous;
            @XmlElement(name = "UncollectedAccountCount")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger uncollectedAccountCount;
            @XmlElement(name = "UncollectedAccount")
            protected List<EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount> uncollectedAccount;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link NameType }
             *     
             */
            public NameType getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link NameType }
             *     
             */
            public void setName(NameType value) {
                this.name = value;
            }

            /**
             * Gets the value of the phone property.
             * 
             * @return
             *     possible object is
             *     {@link PhoneA }
             *     
             */
            public PhoneA getPhone() {
                return phone;
            }

            /**
             * Sets the value of the phone property.
             * 
             * @param value
             *     allowed object is
             *     {@link PhoneA }
             *     
             */
            public void setPhone(PhoneA value) {
                this.phone = value;
            }

            /**
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link AddressA }
             *     
             */
            public AddressA getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressA }
             *     
             */
            public void setAddress(AddressA value) {
                this.address = value;
            }

            /**
             * Gets the value of the identification property.
             * 
             * @return
             *     possible object is
             *     {@link EquifaxCreditDetailResult.CustomerList.Customer.Identification }
             *     
             */
            public EquifaxCreditDetailResult.CustomerList.Customer.Identification getIdentification() {
                return identification;
            }

            /**
             * Sets the value of the identification property.
             * 
             * @param value
             *     allowed object is
             *     {@link EquifaxCreditDetailResult.CustomerList.Customer.Identification }
             *     
             */
            public void setIdentification(EquifaxCreditDetailResult.CustomerList.Customer.Identification value) {
                this.identification = value;
            }

            /**
             * Gets the value of the verification property.
             * 
             * @return
             *     possible object is
             *     {@link EquifaxCreditDetailResult.CustomerList.Customer.Verification }
             *     
             */
            public EquifaxCreditDetailResult.CustomerList.Customer.Verification getVerification() {
                return verification;
            }

            /**
             * Sets the value of the verification property.
             * 
             * @param value
             *     allowed object is
             *     {@link EquifaxCreditDetailResult.CustomerList.Customer.Verification }
             *     
             */
            public void setVerification(EquifaxCreditDetailResult.CustomerList.Customer.Verification value) {
                this.verification = value;
            }

            /**
             * Gets the value of the match property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMatch() {
                return match;
            }

            /**
             * Sets the value of the match property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMatch(String value) {
                this.match = value;
            }

            /**
             * Gets the value of the previous property.
             * 
             * @return
             *     possible object is
             *     {@link EquifaxCreditDetailResult.CustomerList.Customer.Previous }
             *     
             */
            public EquifaxCreditDetailResult.CustomerList.Customer.Previous getPrevious() {
                return previous;
            }

            /**
             * Sets the value of the previous property.
             * 
             * @param value
             *     allowed object is
             *     {@link EquifaxCreditDetailResult.CustomerList.Customer.Previous }
             *     
             */
            public void setPrevious(EquifaxCreditDetailResult.CustomerList.Customer.Previous value) {
                this.previous = value;
            }

            /**
             * Gets the value of the uncollectedAccountCount property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getUncollectedAccountCount() {
                return uncollectedAccountCount;
            }

            /**
             * Sets the value of the uncollectedAccountCount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setUncollectedAccountCount(BigInteger value) {
                this.uncollectedAccountCount = value;
            }

            /**
             * Gets the value of the uncollectedAccount property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the uncollectedAccount property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getUncollectedAccount().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount }
             * 
             * 
             */
            public List<EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount> getUncollectedAccount() {
                if (uncollectedAccount == null) {
                    uncollectedAccount = new ArrayList<EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount>();
                }
                return this.uncollectedAccount;
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
             *         &lt;element name="TaxIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *         &lt;element name="DeceasedYear" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
                "taxIdentifier",
                "age",
                "deceasedYear"
            })
            public static class Identification {

                @XmlElement(name = "TaxIdentifier")
                protected String taxIdentifier;
                @XmlElement(name = "Age")
                protected BigInteger age;
                @XmlElement(name = "DeceasedYear")
                protected BigInteger deceasedYear;

                /**
                 * Gets the value of the taxIdentifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTaxIdentifier() {
                    return taxIdentifier;
                }

                /**
                 * Sets the value of the taxIdentifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTaxIdentifier(String value) {
                    this.taxIdentifier = value;
                }

                /**
                 * Gets the value of the age property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getAge() {
                    return age;
                }

                /**
                 * Sets the value of the age property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setAge(BigInteger value) {
                    this.age = value;
                }

                /**
                 * Gets the value of the deceasedYear property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getDeceasedYear() {
                    return deceasedYear;
                }

                /**
                 * Sets the value of the deceasedYear property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setDeceasedYear(BigInteger value) {
                    this.deceasedYear = value;
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
             *         &lt;element name="Address" type="{http://charter.com/enterprise/billing/csg/accounts}addressA" minOccurs="0"/>
             *         &lt;element name="Phone" type="{http://charter.com/enterprise/billing/csg/accounts}phoneA" minOccurs="0"/>
             *         &lt;element name="Identification" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="TaxIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "address",
                "phone",
                "identification"
            })
            public static class Previous {

                @XmlElement(name = "Address")
                protected AddressA address;
                @XmlElement(name = "Phone")
                protected PhoneA phone;
                @XmlElement(name = "Identification")
                protected EquifaxCreditDetailResult.CustomerList.Customer.Previous.Identification identification;

                /**
                 * Gets the value of the address property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressA }
                 *     
                 */
                public AddressA getAddress() {
                    return address;
                }

                /**
                 * Sets the value of the address property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressA }
                 *     
                 */
                public void setAddress(AddressA value) {
                    this.address = value;
                }

                /**
                 * Gets the value of the phone property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PhoneA }
                 *     
                 */
                public PhoneA getPhone() {
                    return phone;
                }

                /**
                 * Sets the value of the phone property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PhoneA }
                 *     
                 */
                public void setPhone(PhoneA value) {
                    this.phone = value;
                }

                /**
                 * Gets the value of the identification property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EquifaxCreditDetailResult.CustomerList.Customer.Previous.Identification }
                 *     
                 */
                public EquifaxCreditDetailResult.CustomerList.Customer.Previous.Identification getIdentification() {
                    return identification;
                }

                /**
                 * Sets the value of the identification property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EquifaxCreditDetailResult.CustomerList.Customer.Previous.Identification }
                 *     
                 */
                public void setIdentification(EquifaxCreditDetailResult.CustomerList.Customer.Previous.Identification value) {
                    this.identification = value;
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
                 *         &lt;element name="TaxIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "taxIdentifier"
                })
                public static class Identification {

                    @XmlElement(name = "TaxIdentifier")
                    protected String taxIdentifier;

                    /**
                     * Gets the value of the taxIdentifier property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTaxIdentifier() {
                        return taxIdentifier;
                    }

                    /**
                     * Sets the value of the taxIdentifier property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTaxIdentifier(String value) {
                        this.taxIdentifier = value;
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
             *         &lt;element name="Name" type="{http://charter.com/enterprise/billing/csg/accounts}NameType" minOccurs="0"/>
             *         &lt;element name="Identification" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="TaxIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Address" type="{http://charter.com/enterprise/billing/csg/accounts}addressA" minOccurs="0"/>
             *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="SubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="CompanyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ConnectDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="DisconnectDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Balance" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Current" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Disputed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="DisputeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Match" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="UnreturnedEquipment" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
                "name",
                "identification",
                "address",
                "identifier",
                "type",
                "subType",
                "companyIdentifier",
                "connectDate",
                "disconnectDate",
                "balance",
                "disputed",
                "disputeDate",
                "match",
                "unreturnedEquipment"
            })
            public static class UncollectedAccount {

                @XmlElement(name = "Name")
                protected NameType name;
                @XmlElement(name = "Identification")
                protected EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount.Identification identification;
                @XmlElement(name = "Address")
                protected AddressA address;
                @XmlElement(name = "Identifier")
                protected String identifier;
                @XmlElement(name = "Type")
                protected String type;
                @XmlElement(name = "SubType")
                protected String subType;
                @XmlElement(name = "CompanyIdentifier")
                protected String companyIdentifier;
                @XmlElement(name = "ConnectDate")
                protected String connectDate;
                @XmlElement(name = "DisconnectDate")
                protected String disconnectDate;
                @XmlElement(name = "Balance")
                protected EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount.Balance balance;
                @XmlElement(name = "Disputed")
                protected String disputed;
                @XmlElement(name = "DisputeDate")
                protected String disputeDate;
                @XmlElement(name = "Match")
                protected String match;
                @XmlElement(name = "UnreturnedEquipment")
                protected List<EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount.UnreturnedEquipment> unreturnedEquipment;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link NameType }
                 *     
                 */
                public NameType getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link NameType }
                 *     
                 */
                public void setName(NameType value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the identification property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount.Identification }
                 *     
                 */
                public EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount.Identification getIdentification() {
                    return identification;
                }

                /**
                 * Sets the value of the identification property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount.Identification }
                 *     
                 */
                public void setIdentification(EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount.Identification value) {
                    this.identification = value;
                }

                /**
                 * Gets the value of the address property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AddressA }
                 *     
                 */
                public AddressA getAddress() {
                    return address;
                }

                /**
                 * Sets the value of the address property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AddressA }
                 *     
                 */
                public void setAddress(AddressA value) {
                    this.address = value;
                }

                /**
                 * Gets the value of the identifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIdentifier() {
                    return identifier;
                }

                /**
                 * Sets the value of the identifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIdentifier(String value) {
                    this.identifier = value;
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
                 * Gets the value of the subType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSubType() {
                    return subType;
                }

                /**
                 * Sets the value of the subType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSubType(String value) {
                    this.subType = value;
                }

                /**
                 * Gets the value of the companyIdentifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCompanyIdentifier() {
                    return companyIdentifier;
                }

                /**
                 * Sets the value of the companyIdentifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCompanyIdentifier(String value) {
                    this.companyIdentifier = value;
                }

                /**
                 * Gets the value of the connectDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConnectDate() {
                    return connectDate;
                }

                /**
                 * Sets the value of the connectDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConnectDate(String value) {
                    this.connectDate = value;
                }

                /**
                 * Gets the value of the disconnectDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDisconnectDate() {
                    return disconnectDate;
                }

                /**
                 * Sets the value of the disconnectDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDisconnectDate(String value) {
                    this.disconnectDate = value;
                }

                /**
                 * Gets the value of the balance property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount.Balance }
                 *     
                 */
                public EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount.Balance getBalance() {
                    return balance;
                }

                /**
                 * Sets the value of the balance property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount.Balance }
                 *     
                 */
                public void setBalance(EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount.Balance value) {
                    this.balance = value;
                }

                /**
                 * Gets the value of the disputed property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDisputed() {
                    return disputed;
                }

                /**
                 * Sets the value of the disputed property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDisputed(String value) {
                    this.disputed = value;
                }

                /**
                 * Gets the value of the disputeDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDisputeDate() {
                    return disputeDate;
                }

                /**
                 * Sets the value of the disputeDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDisputeDate(String value) {
                    this.disputeDate = value;
                }

                /**
                 * Gets the value of the match property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMatch() {
                    return match;
                }

                /**
                 * Sets the value of the match property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMatch(String value) {
                    this.match = value;
                }

                /**
                 * Gets the value of the unreturnedEquipment property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the unreturnedEquipment property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getUnreturnedEquipment().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount.UnreturnedEquipment }
                 * 
                 * 
                 */
                public List<EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount.UnreturnedEquipment> getUnreturnedEquipment() {
                    if (unreturnedEquipment == null) {
                        unreturnedEquipment = new ArrayList<EquifaxCreditDetailResult.CustomerList.Customer.UncollectedAccount.UnreturnedEquipment>();
                    }
                    return this.unreturnedEquipment;
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
                 *         &lt;element name="Current" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
                    "current"
                })
                public static class Balance {

                    @XmlElement(name = "Current", required = true)
                    protected BigDecimal current;

                    /**
                     * Gets the value of the current property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getCurrent() {
                        return current;
                    }

                    /**
                     * Sets the value of the current property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setCurrent(BigDecimal value) {
                        this.current = value;
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
                 *         &lt;element name="TaxIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "taxIdentifier"
                })
                public static class Identification {

                    @XmlElement(name = "TaxIdentifier")
                    protected String taxIdentifier;

                    /**
                     * Gets the value of the taxIdentifier property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTaxIdentifier() {
                        return taxIdentifier;
                    }

                    /**
                     * Sets the value of the taxIdentifier property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTaxIdentifier(String value) {
                        this.taxIdentifier = value;
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
                 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
                    "code",
                    "count"
                })
                public static class UnreturnedEquipment {

                    @XmlElement(name = "Code")
                    protected String code;
                    @XmlElement(name = "Count")
                    @XmlSchemaType(name = "nonNegativeInteger")
                    protected BigInteger count;

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
                     * Gets the value of the count property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getCount() {
                        return count;
                    }

                    /**
                     * Sets the value of the count property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setCount(BigInteger value) {
                        this.count = value;
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
             *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ValidityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "code",
                "validityCode"
            })
            public static class Verification {

                @XmlElement(name = "Code")
                protected String code;
                @XmlElement(name = "ValidityCode")
                protected String validityCode;

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
                 * Gets the value of the validityCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValidityCode() {
                    return validityCode;
                }

                /**
                 * Sets the value of the validityCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValidityCode(String value) {
                    this.validityCode = value;
                }

            }

        }

    }

}
