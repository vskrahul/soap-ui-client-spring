
package com.charter.enterprise.billing.csg.accounts;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Prorate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Prorate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OldRateEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="NewRateBeginDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="OldRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="NewRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DailyOldRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DailyNewRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OldRateDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewRateDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OldCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="NewCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prorate", propOrder = {
    "oldRateEndDate",
    "newRateBeginDate",
    "oldRate",
    "newRate",
    "dailyOldRate",
    "dailyNewRate",
    "oldRateDays",
    "newRateDays",
    "oldCharge",
    "newCharge"
})
public class Prorate {

    @XmlElement(name = "OldRateEndDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar oldRateEndDate;
    @XmlElement(name = "NewRateBeginDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar newRateBeginDate;
    @XmlElement(name = "OldRate", required = true)
    protected BigDecimal oldRate;
    @XmlElement(name = "NewRate", required = true)
    protected BigDecimal newRate;
    @XmlElement(name = "DailyOldRate", required = true)
    protected BigDecimal dailyOldRate;
    @XmlElement(name = "DailyNewRate", required = true)
    protected BigDecimal dailyNewRate;
    @XmlElement(name = "OldRateDays")
    protected String oldRateDays;
    @XmlElement(name = "NewRateDays")
    protected String newRateDays;
    @XmlElement(name = "OldCharge", required = true)
    protected BigDecimal oldCharge;
    @XmlElement(name = "NewCharge", required = true)
    protected BigDecimal newCharge;

    /**
     * Gets the value of the oldRateEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOldRateEndDate() {
        return oldRateEndDate;
    }

    /**
     * Sets the value of the oldRateEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOldRateEndDate(XMLGregorianCalendar value) {
        this.oldRateEndDate = value;
    }

    /**
     * Gets the value of the newRateBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNewRateBeginDate() {
        return newRateBeginDate;
    }

    /**
     * Sets the value of the newRateBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNewRateBeginDate(XMLGregorianCalendar value) {
        this.newRateBeginDate = value;
    }

    /**
     * Gets the value of the oldRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOldRate() {
        return oldRate;
    }

    /**
     * Sets the value of the oldRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOldRate(BigDecimal value) {
        this.oldRate = value;
    }

    /**
     * Gets the value of the newRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewRate() {
        return newRate;
    }

    /**
     * Sets the value of the newRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewRate(BigDecimal value) {
        this.newRate = value;
    }

    /**
     * Gets the value of the dailyOldRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDailyOldRate() {
        return dailyOldRate;
    }

    /**
     * Sets the value of the dailyOldRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDailyOldRate(BigDecimal value) {
        this.dailyOldRate = value;
    }

    /**
     * Gets the value of the dailyNewRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDailyNewRate() {
        return dailyNewRate;
    }

    /**
     * Sets the value of the dailyNewRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDailyNewRate(BigDecimal value) {
        this.dailyNewRate = value;
    }

    /**
     * Gets the value of the oldRateDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldRateDays() {
        return oldRateDays;
    }

    /**
     * Sets the value of the oldRateDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldRateDays(String value) {
        this.oldRateDays = value;
    }

    /**
     * Gets the value of the newRateDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewRateDays() {
        return newRateDays;
    }

    /**
     * Sets the value of the newRateDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewRateDays(String value) {
        this.newRateDays = value;
    }

    /**
     * Gets the value of the oldCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOldCharge() {
        return oldCharge;
    }

    /**
     * Sets the value of the oldCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOldCharge(BigDecimal value) {
        this.oldCharge = value;
    }

    /**
     * Gets the value of the newCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewCharge() {
        return newCharge;
    }

    /**
     * Sets the value of the newCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewCharge(BigDecimal value) {
        this.newCharge = value;
    }

}
