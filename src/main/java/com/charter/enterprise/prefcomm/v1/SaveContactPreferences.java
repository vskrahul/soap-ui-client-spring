
package com.charter.enterprise.prefcomm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveContactPreferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveContactPreferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactPreferences" type="{http://www.charter.com/enterprise/prefcomm/v1}contactPreference" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveContactPreferences", propOrder = {
    "contactPreferences"
})
public class SaveContactPreferences {

    @XmlElement(required = true)
    protected List<ContactPreference> contactPreferences;

    /**
     * Gets the value of the contactPreferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPreferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPreferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPreference }
     * 
     * 
     */
    public List<ContactPreference> getContactPreferences() {
        if (contactPreferences == null) {
            contactPreferences = new ArrayList<ContactPreference>();
        }
        return this.contactPreferences;
    }

}
