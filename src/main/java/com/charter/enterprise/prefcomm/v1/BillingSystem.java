
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for billingSystem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billingSystem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="audit" type="{http://www.charter.com/enterprise/prefcomm/v1}audit"/>
 *         &lt;element name="billingSystemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billingSystem", propOrder = {
    "audit",
    "billingSystemName",
    "id"
})
public class BillingSystem {

    @XmlElement(required = true)
    protected Audit audit;
    @XmlElement(required = true)
    protected String billingSystemName;
    @XmlElement(required = true)
    protected String id;

    /**
     * Gets the value of the audit property.
     * 
     * @return
     *     possible object is
     *     {@link Audit }
     *     
     */
    public Audit getAudit() {
        return audit;
    }

    /**
     * Sets the value of the audit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Audit }
     *     
     */
    public void setAudit(Audit value) {
        this.audit = value;
    }

    /**
     * Gets the value of the billingSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingSystemName() {
        return billingSystemName;
    }

    /**
     * Sets the value of the billingSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingSystemName(String value) {
        this.billingSystemName = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
