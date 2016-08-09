
package com.charter.enterprise.prefcomm.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for preferenceAccountInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="preferenceAccountInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactInfoList" type="{http://www.charter.com/enterprise/prefcomm/v1}contactInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contactPreferenceList" type="{http://www.charter.com/enterprise/prefcomm/v1}contactPreference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="preferenceAccount" type="{http://www.charter.com/enterprise/prefcomm/v1}preferenceAccount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preferenceAccountInfo", propOrder = {
    "contactInfoList",
    "contactPreferenceList",
    "preferenceAccount"
})
public class PreferenceAccountInfo {

    @XmlElement(nillable = true)
    protected List<ContactInfo> contactInfoList;
    @XmlElement(nillable = true)
    protected List<ContactPreference> contactPreferenceList;
    protected PreferenceAccount preferenceAccount;

    /**
     * Gets the value of the contactInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInfo }
     * 
     * 
     */
    public List<ContactInfo> getContactInfoList() {
        if (contactInfoList == null) {
            contactInfoList = new ArrayList<ContactInfo>();
        }
        return this.contactInfoList;
    }

    /**
     * Gets the value of the contactPreferenceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPreferenceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPreferenceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPreference }
     * 
     * 
     */
    public List<ContactPreference> getContactPreferenceList() {
        if (contactPreferenceList == null) {
            contactPreferenceList = new ArrayList<ContactPreference>();
        }
        return this.contactPreferenceList;
    }

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

}
