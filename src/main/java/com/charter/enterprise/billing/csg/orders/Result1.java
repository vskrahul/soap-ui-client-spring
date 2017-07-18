
package com.charter.enterprise.billing.csg.orders;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Result1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Result1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReturnCode" type="{http://charter.com/enterprise/billing/csg/orders}ResultReturnCode1"/>
 *         &lt;element name="ReferenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://charter.com/enterprise/billing/csg/orders}ResultType1"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Server" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExceptionInfo" type="{http://charter.com/enterprise/billing/csg/orders}ResultExceptionInfo1" minOccurs="0"/>
 *         &lt;element name="StatusMessages" type="{http://charter.com/enterprise/billing/csg/orders}CsgStatusMessage1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Result", propOrder = {
    "returnCode",
    "referenceCode",
    "type",
    "description",
    "dateTime",
    "source",
    "server",
    "exceptionInfo",
    "statusMessages"
})
public class Result1 {

    @XmlElement(name = "ReturnCode", required = true)
    protected ResultReturnCode1 returnCode;
    @XmlElement(name = "ReferenceCode")
    protected String referenceCode;
    @XmlElement(name = "Type", required = true)
    protected ResultType1 type;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "DateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "Server")
    protected String server;
    @XmlElement(name = "ExceptionInfo")
    protected ResultExceptionInfo1 exceptionInfo;
    @XmlElement(name = "StatusMessages")
    protected List<CsgStatusMessage1> statusMessages;

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ResultReturnCode1 }
     *     
     */
    public ResultReturnCode1 getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultReturnCode1 }
     *     
     */
    public void setReturnCode(ResultReturnCode1 value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the referenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceCode() {
        return referenceCode;
    }

    /**
     * Sets the value of the referenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceCode(String value) {
        this.referenceCode = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ResultType1 }
     *     
     */
    public ResultType1 getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultType1 }
     *     
     */
    public void setType(ResultType1 value) {
        this.type = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the server property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServer() {
        return server;
    }

    /**
     * Sets the value of the server property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServer(String value) {
        this.server = value;
    }

    /**
     * Gets the value of the exceptionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ResultExceptionInfo1 }
     *     
     */
    public ResultExceptionInfo1 getExceptionInfo() {
        return exceptionInfo;
    }

    /**
     * Sets the value of the exceptionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultExceptionInfo1 }
     *     
     */
    public void setExceptionInfo(ResultExceptionInfo1 value) {
        this.exceptionInfo = value;
    }

    /**
     * Gets the value of the statusMessages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusMessages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CsgStatusMessage1 }
     * 
     * 
     */
    public List<CsgStatusMessage1> getStatusMessages() {
        if (statusMessages == null) {
            statusMessages = new ArrayList<CsgStatusMessage1>();
        }
        return this.statusMessages;
    }

}
