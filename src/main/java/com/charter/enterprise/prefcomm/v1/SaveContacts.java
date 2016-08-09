
package com.charter.enterprise.prefcomm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveContacts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveContacts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactValuesList" type="{http://www.charter.com/enterprise/prefcomm/v1}contact" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveContacts", propOrder = {
    "contactValuesList"
})
public class SaveContacts {

    @XmlElement(required = true)
    protected List<Contact> contactValuesList;

    /**
     * Gets the value of the contactValuesList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactValuesList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactValuesList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getContactValuesList() {
        if (contactValuesList == null) {
            contactValuesList = new ArrayList<Contact>();
        }
        return this.contactValuesList;
    }

}
