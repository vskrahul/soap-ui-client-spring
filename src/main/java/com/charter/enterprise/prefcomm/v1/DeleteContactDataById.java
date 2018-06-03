
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteContactDataById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteContactDataById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactDataId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteContactDataById", propOrder = {
    "contactDataId"
})
public class DeleteContactDataById {

    protected long contactDataId;

    /**
     * Gets the value of the contactDataId property.
     * 
     */
    public long getContactDataId() {
        return contactDataId;
    }

    /**
     * Sets the value of the contactDataId property.
     * 
     */
    public void setContactDataId(long value) {
        this.contactDataId = value;
    }

}
