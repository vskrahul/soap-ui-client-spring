
package com.charter.enterprise.billing.csg.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AddOrderScheduleSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOrderScheduleSchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Result" type="{http://charter.com/enterprise/billing/csg/orders}MultiCallResult" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="TimeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsCustomerRequest" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Accepted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Attempted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOrderScheduleSchedule", propOrder = {
    "result",
    "date",
    "timeCode",
    "isCustomerRequest",
    "accepted",
    "attempted"
})
public class AddOrderScheduleSchedule {

    @XmlElement(name = "Result")
    protected MultiCallResult result;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "TimeCode")
    protected String timeCode;
    @XmlElement(name = "IsCustomerRequest")
    protected boolean isCustomerRequest;
    @XmlElement(name = "Accepted")
    protected Boolean accepted;
    @XmlElement(name = "Attempted")
    protected Boolean attempted;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link MultiCallResult }
     *     
     */
    public MultiCallResult getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiCallResult }
     *     
     */
    public void setResult(MultiCallResult value) {
        this.result = value;
    }

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
     * Gets the value of the isCustomerRequest property.
     * 
     */
    public boolean isIsCustomerRequest() {
        return isCustomerRequest;
    }

    /**
     * Sets the value of the isCustomerRequest property.
     * 
     */
    public void setIsCustomerRequest(boolean value) {
        this.isCustomerRequest = value;
    }

    /**
     * Gets the value of the accepted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccepted() {
        return accepted;
    }

    /**
     * Sets the value of the accepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccepted(Boolean value) {
        this.accepted = value;
    }

    /**
     * Gets the value of the attempted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttempted() {
        return attempted;
    }

    /**
     * Sets the value of the attempted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttempted(Boolean value) {
        this.attempted = value;
    }

}
