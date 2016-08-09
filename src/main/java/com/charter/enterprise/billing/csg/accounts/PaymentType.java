
package com.charter.enterprise.billing.csg.accounts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DueDateMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DelinquentDueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentType", propOrder = {
    "dueDate",
    "dueDateMessage",
    "delinquentDueDate"
})
public class PaymentType {

    @XmlElement(name = "DueDate")
    protected String dueDate;
    @XmlElement(name = "DueDateMessage")
    protected String dueDateMessage;
    @XmlElement(name = "DelinquentDueDate")
    protected String delinquentDueDate;

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(String value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the dueDateMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDateMessage() {
        return dueDateMessage;
    }

    /**
     * Sets the value of the dueDateMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDateMessage(String value) {
        this.dueDateMessage = value;
    }

    /**
     * Gets the value of the delinquentDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelinquentDueDate() {
        return delinquentDueDate;
    }

    /**
     * Sets the value of the delinquentDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelinquentDueDate(String value) {
        this.delinquentDueDate = value;
    }

}
