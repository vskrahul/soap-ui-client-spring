
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="audit" type="{http://www.charter.com/enterprise/prefcomm/v1}audit" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nameId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="preferenceAccount" type="{http://www.charter.com/enterprise/prefcomm/v1}preferenceAccount"/>
 *         &lt;element name="role" type="{http://www.charter.com/enterprise/prefcomm/v1}contactRole"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contact", propOrder = {
    "audit",
    "id",
    "nameId",
    "preferenceAccount",
    "role",
    "userName"
})
public class Contact {

    protected Audit audit;
    protected Long id;
    protected Long nameId;
    @XmlElement(required = true)
    protected PreferenceAccount preferenceAccount;
    @XmlElement(required = true)
    protected ContactRole role;
    protected String userName;

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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the nameId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNameId() {
        return nameId;
    }

    /**
     * Sets the value of the nameId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNameId(Long value) {
        this.nameId = value;
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

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link ContactRole }
     *     
     */
    public ContactRole getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactRole }
     *     
     */
    public void setRole(ContactRole value) {
        this.role = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

}
