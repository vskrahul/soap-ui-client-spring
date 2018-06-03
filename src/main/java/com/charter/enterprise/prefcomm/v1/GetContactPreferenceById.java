
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getContactPreferenceById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getContactPreferenceById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactPreferenceId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getContactPreferenceById", propOrder = {
    "contactPreferenceId"
})
public class GetContactPreferenceById {

    protected long contactPreferenceId;

    /**
     * Gets the value of the contactPreferenceId property.
     * 
     */
    public long getContactPreferenceId() {
        return contactPreferenceId;
    }

    /**
     * Sets the value of the contactPreferenceId property.
     * 
     */
    public void setContactPreferenceId(long value) {
        this.contactPreferenceId = value;
    }

}
