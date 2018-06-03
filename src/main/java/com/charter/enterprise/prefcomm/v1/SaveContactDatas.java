
package com.charter.enterprise.prefcomm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveContactDatas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveContactDatas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactDataList" type="{http://www.charter.com/enterprise/prefcomm/v1}contactData" maxOccurs="unbounded"/>
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
@XmlType(name = "saveContactDatas", propOrder = {
    "contactDataList",
    "validateContactData"
})
public class SaveContactDatas {

    @XmlElement(required = true)
    protected List<ContactData> contactDataList;
    protected String validateContactData;

    /**
     * Gets the value of the contactDataList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactDataList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactDataList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactData }
     * 
     * 
     */
    public List<ContactData> getContactDataList() {
        if (contactDataList == null) {
            contactDataList = new ArrayList<ContactData>();
        }
        return this.contactDataList;
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
