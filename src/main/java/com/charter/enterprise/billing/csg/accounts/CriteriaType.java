
package com.charter.enterprise.billing.csg.accounts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://charter.com/enterprise/billing/csg/accounts}NameType" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://charter.com/enterprise/billing/csg/accounts}phoneA" minOccurs="0"/>
 *         &lt;element name="TaxIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DriversLicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DriversLicenseState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScoreProduct" type="{http://charter.com/enterprise/billing/csg/accounts}ScoreProduct" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RequestedAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriteriaType", propOrder = {
    "locationId",
    "customerId",
    "name",
    "phone",
    "taxIdentifier",
    "taxType",
    "birthDate",
    "driversLicenseNumber",
    "driversLicenseState",
    "gender",
    "accountId",
    "scoreProduct",
    "requestedAction"
})
public class CriteriaType {

    @XmlElement(name = "LocationId")
    protected String locationId;
    @XmlElement(name = "CustomerId")
    protected String customerId;
    @XmlElement(name = "Name")
    protected NameType name;
    @XmlElement(name = "Phone")
    protected PhoneA phone;
    @XmlElement(name = "TaxIdentifier")
    protected String taxIdentifier;
    @XmlElement(name = "TaxType")
    protected String taxType;
    @XmlElement(name = "BirthDate")
    protected String birthDate;
    @XmlElement(name = "DriversLicenseNumber")
    protected String driversLicenseNumber;
    @XmlElement(name = "DriversLicenseState")
    protected String driversLicenseState;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "ScoreProduct")
    protected List<ScoreProduct> scoreProduct;
    @XmlElement(name = "RequestedAction")
    protected String requestedAction;

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
     * Gets the value of the taxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxType() {
        return taxType;
    }

    /**
     * Sets the value of the taxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxType(String value) {
        this.taxType = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the driversLicenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriversLicenseNumber() {
        return driversLicenseNumber;
    }

    /**
     * Sets the value of the driversLicenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriversLicenseNumber(String value) {
        this.driversLicenseNumber = value;
    }

    /**
     * Gets the value of the driversLicenseState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriversLicenseState() {
        return driversLicenseState;
    }

    /**
     * Sets the value of the driversLicenseState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriversLicenseState(String value) {
        this.driversLicenseState = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
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
     * Gets the value of the scoreProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScoreProduct }
     * 
     * 
     */
    public List<ScoreProduct> getScoreProduct() {
        if (scoreProduct == null) {
            scoreProduct = new ArrayList<ScoreProduct>();
        }
        return this.scoreProduct;
    }

    /**
     * Gets the value of the requestedAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedAction() {
        return requestedAction;
    }

    /**
     * Sets the value of the requestedAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedAction(String value) {
        this.requestedAction = value;
    }

}
