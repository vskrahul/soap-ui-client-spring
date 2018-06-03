
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUIEventFamilyById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUIEventFamilyById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uiEventFamilyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUIEventFamilyById", propOrder = {
    "uiEventFamilyId"
})
public class GetUIEventFamilyById {

    protected long uiEventFamilyId;

    /**
     * Gets the value of the uiEventFamilyId property.
     * 
     */
    public long getUiEventFamilyId() {
        return uiEventFamilyId;
    }

    /**
     * Sets the value of the uiEventFamilyId property.
     * 
     */
    public void setUiEventFamilyId(long value) {
        this.uiEventFamilyId = value;
    }

}
