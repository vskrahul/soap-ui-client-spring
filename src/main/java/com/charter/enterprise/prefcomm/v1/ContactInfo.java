
package com.charter.enterprise.prefcomm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contact" type="{http://www.charter.com/enterprise/prefcomm/v1}contact" minOccurs="0"/>
 *         &lt;element name="contactDatas" type="{http://www.charter.com/enterprise/prefcomm/v1}contactData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactInfo", propOrder = {
    "contact",
    "contactDatas"
})
public class ContactInfo {

    protected Contact contact;
    @XmlElement(nillable = true)
    protected List<ContactData> contactDatas;

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the contactDatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactDatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactDatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactData }
     * 
     * 
     */
    public List<ContactData> getContactDatas() {
        if (contactDatas == null) {
            contactDatas = new ArrayList<ContactData>();
        }
        return this.contactDatas;
    }

}
