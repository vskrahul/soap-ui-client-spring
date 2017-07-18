
package com.charter.enterprise.billing.csg.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Schedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Schedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineOfBusinessType" type="{http://charter.com/enterprise/billing/csg/orders}LineOfBusinessType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Schedule", propOrder = {
    "date",
    "day",
    "timeCode",
    "timeDescription",
    "lineOfBusinessType"
})
public class Schedule {

    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Day")
    protected String day;
    @XmlElement(name = "TimeCode")
    protected String timeCode;
    @XmlElement(name = "TimeDescription")
    protected String timeDescription;
    @XmlElement(name = "LineOfBusinessType", required = true)
    protected LineOfBusinessType lineOfBusinessType;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDay(String value) {
        this.day = value;
    }

    /**
     * Gets the value of the timeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeCode() {
        return timeCode;
    }

    /**
     * Sets the value of the timeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeCode(String value) {
        this.timeCode = value;
    }

    /**
     * Gets the value of the timeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeDescription() {
        return timeDescription;
    }

    /**
     * Sets the value of the timeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeDescription(String value) {
        this.timeDescription = value;
    }

    /**
     * Gets the value of the lineOfBusinessType property.
     * 
     * @return
     *     possible object is
     *     {@link LineOfBusinessType }
     *     
     */
    public LineOfBusinessType getLineOfBusinessType() {
        return lineOfBusinessType;
    }

    /**
     * Sets the value of the lineOfBusinessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineOfBusinessType }
     *     
     */
    public void setLineOfBusinessType(LineOfBusinessType value) {
        this.lineOfBusinessType = value;
    }

}
