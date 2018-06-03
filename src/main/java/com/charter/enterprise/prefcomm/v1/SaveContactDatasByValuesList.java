
package com.charter.enterprise.prefcomm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveContactDatasByValuesList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveContactDatasByValuesList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactDataValueList" type="{http://www.charter.com/enterprise/prefcomm/v1}contactDataValue" maxOccurs="unbounded"/>
 *         &lt;element name="validateContactData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveContactDatasByValuesList", propOrder = {
    "contactDataValueList",
    "validateContactData"
})
public class SaveContactDatasByValuesList {

    @XmlElement(required = true)
    protected List<ContactDataValue> contactDataValueList;
    protected String validateContactData;

    /**
     * Gets the value of the contactDataValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactDataValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactDataValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactDataValue }
     * 
     * 
     */
    public List<ContactDataValue> getContactDataValueList() {
        if (contactDataValueList == null) {
            contactDataValueList = new ArrayList<ContactDataValue>();
        }
        return this.contactDataValueList;
    }

    /**
     * Gets the value of the validateContactData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidateContactData() {
        return validateContactData;
    }

    /**
     * Sets the value of the validateContactData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidateContactData(String value) {
        this.validateContactData = value;
    }

}
