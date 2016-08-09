
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findContactDataByPreferenceAccountAndContactRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findContactDataByPreferenceAccountAndContactRole">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="preferenceAccount" type="{http://www.charter.com/enterprise/prefcomm/v1}preferenceAccount"/>
 *         &lt;element name="contactRole" type="{http://www.charter.com/enterprise/prefcomm/v1}contactRole"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findContactDataByPreferenceAccountAndContactRole", propOrder = {
    "preferenceAccount",
    "contactRole"
})
public class FindContactDataByPreferenceAccountAndContactRole {

    @XmlElement(required = true)
    protected PreferenceAccount preferenceAccount;
    @XmlElement(required = true)
    protected ContactRole contactRole;

    /**
     * Gets the value of the preferenceAccount property.
     * 
     * @return
     *     possible object is
     *     {@link PreferenceAccount }
     *     
     */
    public PreferenceAccount getPreferenceAccount() {
        return preferenceAccount;
    }

    /**
     * Sets the value of the preferenceAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferenceAccount }
     *     
     */
    public void setPreferenceAccount(PreferenceAccount value) {
        this.preferenceAccount = value;
    }

    /**
     * Gets the value of the contactRole property.
     * 
     * @return
     *     possible object is
     *     {@link ContactRole }
     *     
     */
    public ContactRole getContactRole() {
        return contactRole;
    }

    /**
     * Sets the value of the contactRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactRole }
     *     
     */
    public void setContactRole(ContactRole value) {
        this.contactRole = value;
    }

}
