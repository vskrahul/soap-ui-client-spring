
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLanguageTypeById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLanguageTypeById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="languageTypeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLanguageTypeById", propOrder = {
    "languageTypeId"
})
public class GetLanguageTypeById {

    @XmlElement(required = true)
    protected String languageTypeId;

    /**
     * Gets the value of the languageTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageTypeId() {
        return languageTypeId;
    }

    /**
     * Sets the value of the languageTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageTypeId(String value) {
        this.languageTypeId = value;
    }

}
