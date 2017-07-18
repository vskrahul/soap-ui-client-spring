
package com.charter.enterprise.customer.queryidentity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryIdentityResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryIdentityResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseHeader" type="{http://charter.com/enterprise/customer/QueryIdentity}ResponseHeaderType" minOccurs="0"/>
 *         &lt;element name="ResponseBody" type="{http://charter.com/enterprise/customer/QueryIdentity}QueryIdentityResponseBodyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryIdentityResponseType", propOrder = {
    "responseHeader",
    "responseBody"
})
public class QueryIdentityResponseType {

    @XmlElement(name = "ResponseHeader")
    protected ResponseHeaderType responseHeader;
    @XmlElement(name = "ResponseBody")
    protected QueryIdentityResponseBodyType responseBody;

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
     *     {@link QueryIdentityResponseBodyType }
     *     
     */
    public QueryIdentityResponseBodyType getResponseBody() {
        return responseBody;
    }

    /**
     * Sets the value of the responseBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryIdentityResponseBodyType }
     *     
     */
    public void setResponseBody(QueryIdentityResponseBodyType value) {
        this.responseBody = value;
    }

}
