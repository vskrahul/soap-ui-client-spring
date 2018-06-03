
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveContactDataByValueResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveContactDataByValueResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.charter.com/enterprise/prefcomm/v1}contactData" minOccurs="0"/>
 *         &lt;element name="charterHeaderOutputInfo" type="{http://www.charter.com/enterprise/prefcomm/v1}standardOutputHeader" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveContactDataByValueResponse", propOrder = {
    "_return",
    "charterHeaderOutputInfo"
})
public class SaveContactDataByValueResponse {

    @XmlElement(name = "return")
    protected ContactData _return;
    protected StandardOutputHeader charterHeaderOutputInfo;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ContactData }
     *     
     */
    public ContactData getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactData }
     *     
     */
    public void setReturn(ContactData value) {
        this._return = value;
    }

    /**
     * Gets the value of the charterHeaderOutputInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StandardOutputHeader }
     *     
     */
    public StandardOutputHeader getCharterHeaderOutputInfo() {
        return charterHeaderOutputInfo;
    }

    /**
     * Sets the value of the charterHeaderOutputInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardOutputHeader }
     *     
     */
    public void setCharterHeaderOutputInfo(StandardOutputHeader value) {
        this.charterHeaderOutputInfo = value;
    }

}
