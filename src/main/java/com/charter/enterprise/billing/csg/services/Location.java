
package com.charter.enterprise.billing.csg.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Location complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SalesArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TechnicianArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RateArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VertexCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DemographicCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://charter.com/enterprise/billing/csg/services}Address" minOccurs="0"/>
 *         &lt;element name="Drop" type="{http://charter.com/enterprise/billing/csg/services}Drop" minOccurs="0"/>
 *         &lt;element name="Bridger" type="{http://charter.com/enterprise/billing/csg/services}Bridger" minOccurs="0"/>
 *         &lt;element name="CustomField" type="{http://charter.com/enterprise/billing/csg/services}customField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LineOfBusiness" type="{http://charter.com/enterprise/billing/csg/services}LineOfBusiness" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location", propOrder = {
    "locationId",
    "type",
    "typeDescription",
    "status",
    "statusDescription",
    "statusChangeDate",
    "salesArea",
    "serviceArea",
    "technicianArea",
    "rateArea",
    "vertexCode",
    "mapCode",
    "demographicCode",
    "timeZone",
    "address",
    "drop",
    "bridger",
    "customField",
    "comments",
    "lineOfBusiness"
})
public class Location {

    @XmlElement(name = "LocationId")
    protected String locationId;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "TypeDescription")
    protected String typeDescription;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "StatusDescription")
    protected String statusDescription;
    @XmlElement(name = "StatusChangeDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusChangeDate;
    @XmlElement(name = "SalesArea")
    protected String salesArea;
    @XmlElement(name = "ServiceArea")
    protected String serviceArea;
    @XmlElement(name = "TechnicianArea")
    protected String technicianArea;
    @XmlElement(name = "RateArea")
    protected String rateArea;
    @XmlElement(name = "VertexCode")
    protected String vertexCode;
    @XmlElement(name = "MapCode")
    protected String mapCode;
    @XmlElement(name = "DemographicCode")
    protected String demographicCode;
    @XmlElement(name = "TimeZone")
    protected String timeZone;
    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "Drop")
    protected Drop drop;
    @XmlElement(name = "Bridger")
    protected Bridger bridger;
    @XmlElement(name = "CustomField")
    protected List<CustomField> customField;
    @XmlElement(name = "Comments")
    protected List<String> comments;
    @XmlElement(name = "LineOfBusiness")
    protected List<LineOfBusiness> lineOfBusiness;

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
     * Gets the value of the typeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDescription() {
        return typeDescription;
    }

    /**
     * Sets the value of the typeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDescription(String value) {
        this.typeDescription = value;
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
     * Gets the value of the statusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * Sets the value of the statusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescription(String value) {
        this.statusDescription = value;
    }

    /**
     * Gets the value of the statusChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusChangeDate() {
        return statusChangeDate;
    }

    /**
     * Sets the value of the statusChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusChangeDate(XMLGregorianCalendar value) {
        this.statusChangeDate = value;
    }

    /**
     * Gets the value of the salesArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesArea() {
        return salesArea;
    }

    /**
     * Sets the value of the salesArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesArea(String value) {
        this.salesArea = value;
    }

    /**
     * Gets the value of the serviceArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceArea() {
        return serviceArea;
    }

    /**
     * Sets the value of the serviceArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceArea(String value) {
        this.serviceArea = value;
    }

    /**
     * Gets the value of the technicianArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicianArea() {
        return technicianArea;
    }

    /**
     * Sets the value of the technicianArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicianArea(String value) {
        this.technicianArea = value;
    }

    /**
     * Gets the value of the rateArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateArea() {
        return rateArea;
    }

    /**
     * Sets the value of the rateArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateArea(String value) {
        this.rateArea = value;
    }

    /**
     * Gets the value of the vertexCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVertexCode() {
        return vertexCode;
    }

    /**
     * Sets the value of the vertexCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVertexCode(String value) {
        this.vertexCode = value;
    }

    /**
     * Gets the value of the mapCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapCode() {
        return mapCode;
    }

    /**
     * Sets the value of the mapCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapCode(String value) {
        this.mapCode = value;
    }

    /**
     * Gets the value of the demographicCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemographicCode() {
        return demographicCode;
    }

    /**
     * Sets the value of the demographicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDemographicCode(String value) {
        this.demographicCode = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the drop property.
     * 
     * @return
     *     possible object is
     *     {@link Drop }
     *     
     */
    public Drop getDrop() {
        return drop;
    }

    /**
     * Sets the value of the drop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Drop }
     *     
     */
    public void setDrop(Drop value) {
        this.drop = value;
    }

    /**
     * Gets the value of the bridger property.
     * 
     * @return
     *     possible object is
     *     {@link Bridger }
     *     
     */
    public Bridger getBridger() {
        return bridger;
    }

    /**
     * Sets the value of the bridger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bridger }
     *     
     */
    public void setBridger(Bridger value) {
        this.bridger = value;
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
     * {@link CustomField }
     * 
     * 
     */
    public List<CustomField> getCustomField() {
        if (customField == null) {
            customField = new ArrayList<CustomField>();
        }
        return this.customField;
    }

    /**
     * Gets the value of the comments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getComments() {
        if (comments == null) {
            comments = new ArrayList<String>();
        }
        return this.comments;
    }

    /**
     * Gets the value of the lineOfBusiness property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineOfBusiness property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineOfBusiness().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineOfBusiness }
     * 
     * 
     */
    public List<LineOfBusiness> getLineOfBusiness() {
        if (lineOfBusiness == null) {
            lineOfBusiness = new ArrayList<LineOfBusiness>();
        }
        return this.lineOfBusiness;
    }

}
