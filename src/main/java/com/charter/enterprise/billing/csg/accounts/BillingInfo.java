
package com.charter.enterprise.billing.csg.accounts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BillingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentStatementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CycleDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThruDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Frequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatementHold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EBPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Electronic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ElectronicOutsourced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hardcopy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PPVDiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerDiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerDiscountBeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerDiscountEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuspensionBeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SuspensionEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingInfo", propOrder = {
    "currentStatementId",
    "cycleDay",
    "fromDate",
    "thruDate",
    "frequency",
    "taxGroup",
    "statementHold",
    "ebpp",
    "electronic",
    "electronicOutsourced",
    "hardcopy",
    "ppvDiscount",
    "customerDiscount",
    "customerDiscountBeginDate",
    "customerDiscountEndDate",
    "suspensionBeginDate",
    "suspensionEndDate"
})
public class BillingInfo {

    @XmlElement(name = "CurrentStatementId")
    protected String currentStatementId;
    @XmlElement(name = "CycleDay")
    protected String cycleDay;
    @XmlElement(name = "FromDate")
    protected String fromDate;
    @XmlElement(name = "ThruDate")
    protected String thruDate;
    @XmlElement(name = "Frequency")
    protected String frequency;
    @XmlElement(name = "TaxGroup")
    protected String taxGroup;
    @XmlElement(name = "StatementHold")
    protected String statementHold;
    @XmlElement(name = "EBPP")
    protected String ebpp;
    @XmlElement(name = "Electronic")
    protected String electronic;
    @XmlElement(name = "ElectronicOutsourced")
    protected String electronicOutsourced;
    @XmlElement(name = "Hardcopy")
    protected String hardcopy;
    @XmlElement(name = "PPVDiscount")
    protected String ppvDiscount;
    @XmlElement(name = "CustomerDiscount")
    protected String customerDiscount;
    @XmlElement(name = "CustomerDiscountBeginDate")
    protected String customerDiscountBeginDate;
    @XmlElement(name = "CustomerDiscountEndDate")
    protected String customerDiscountEndDate;
    @XmlElement(name = "SuspensionBeginDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar suspensionBeginDate;
    @XmlElement(name = "SuspensionEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar suspensionEndDate;

    /**
     * Gets the value of the currentStatementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentStatementId() {
        return currentStatementId;
    }

    /**
     * Sets the value of the currentStatementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentStatementId(String value) {
        this.currentStatementId = value;
    }

    /**
     * Gets the value of the cycleDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCycleDay() {
        return cycleDay;
    }

    /**
     * Sets the value of the cycleDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCycleDay(String value) {
        this.cycleDay = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromDate(String value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the thruDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThruDate() {
        return thruDate;
    }

    /**
     * Sets the value of the thruDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThruDate(String value) {
        this.thruDate = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequency(String value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the taxGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxGroup() {
        return taxGroup;
    }

    /**
     * Sets the value of the taxGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxGroup(String value) {
        this.taxGroup = value;
    }

    /**
     * Gets the value of the statementHold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementHold() {
        return statementHold;
    }

    /**
     * Sets the value of the statementHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementHold(String value) {
        this.statementHold = value;
    }

    /**
     * Gets the value of the ebpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBPP() {
        return ebpp;
    }

    /**
     * Sets the value of the ebpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBPP(String value) {
        this.ebpp = value;
    }

    /**
     * Gets the value of the electronic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectronic() {
        return electronic;
    }

    /**
     * Sets the value of the electronic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectronic(String value) {
        this.electronic = value;
    }

    /**
     * Gets the value of the electronicOutsourced property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectronicOutsourced() {
        return electronicOutsourced;
    }

    /**
     * Sets the value of the electronicOutsourced property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectronicOutsourced(String value) {
        this.electronicOutsourced = value;
    }

    /**
     * Gets the value of the hardcopy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardcopy() {
        return hardcopy;
    }

    /**
     * Sets the value of the hardcopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardcopy(String value) {
        this.hardcopy = value;
    }

    /**
     * Gets the value of the ppvDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPVDiscount() {
        return ppvDiscount;
    }

    /**
     * Sets the value of the ppvDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPVDiscount(String value) {
        this.ppvDiscount = value;
    }

    /**
     * Gets the value of the customerDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerDiscount() {
        return customerDiscount;
    }

    /**
     * Sets the value of the customerDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerDiscount(String value) {
        this.customerDiscount = value;
    }

    /**
     * Gets the value of the customerDiscountBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerDiscountBeginDate() {
        return customerDiscountBeginDate;
    }

    /**
     * Sets the value of the customerDiscountBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerDiscountBeginDate(String value) {
        this.customerDiscountBeginDate = value;
    }

    /**
     * Gets the value of the customerDiscountEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerDiscountEndDate() {
        return customerDiscountEndDate;
    }

    /**
     * Sets the value of the customerDiscountEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerDiscountEndDate(String value) {
        this.customerDiscountEndDate = value;
    }

    /**
     * Gets the value of the suspensionBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSuspensionBeginDate() {
        return suspensionBeginDate;
    }

    /**
     * Sets the value of the suspensionBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSuspensionBeginDate(XMLGregorianCalendar value) {
        this.suspensionBeginDate = value;
    }

    /**
     * Gets the value of the suspensionEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSuspensionEndDate() {
        return suspensionEndDate;
    }

    /**
     * Sets the value of the suspensionEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSuspensionEndDate(XMLGregorianCalendar value) {
        this.suspensionEndDate = value;
    }

}
