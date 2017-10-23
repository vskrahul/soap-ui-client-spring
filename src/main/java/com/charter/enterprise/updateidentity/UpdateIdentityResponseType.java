
package com.charter.enterprise.updateidentity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateIdentityResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateIdentityResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseHeader" type="{http://charter.com/enterprise/updateidentity}ResponseHeaderType" minOccurs="0"/>
 *         &lt;element name="ResponseBody" type="{http://charter.com/enterprise/updateidentity}IdentityResponseBodyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateIdentityResponseType", propOrder = {
    "responseHeader",
    "responseBody"
})
public class UpdateIdentityResponseType {

    @XmlElement(name = "ResponseHeader")
    protected ResponseHeaderType responseHeader;
    @XmlElement(name = "ResponseBody")
    protected IdentityResponseBodyType responseBody;

    /**
     * Gets the value of the responseHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseHeaderType }
     *     
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the value of the responseHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseHeaderType }
     *     
     */
    public void setResponseHeader(ResponseHeaderType value) {
        this.responseHeader = value;
    }

    /**
     * Gets the value of the responseBody property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityResponseBodyType }
     *     
     */
    public IdentityResponseBodyType getResponseBody() {
        return responseBody;
    }

    /**
     * Sets the value of the responseBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityResponseBodyType }
     *     
     */
    public void setResponseBody(IdentityResponseBodyType value) {
        this.responseBody = value;
    }

}
