
package com.charter.enterprise.prefcomm.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findContactPreferencesByPreferenceAccountAndServiceEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findContactPreferencesByPreferenceAccountAndServiceEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="preferenceAccount" type="{http://www.charter.com/enterprise/prefcomm/v1}preferenceAccount"/>
 *         &lt;element name="serviceEvent" type="{http://www.charter.com/enterprise/prefcomm/v1}serviceEvent"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findContactPreferencesByPreferenceAccountAndServiceEvent", propOrder = {
    "preferenceAccount",
    "serviceEvent"
})
public class FindContactPreferencesByPreferenceAccountAndServiceEvent {

    @XmlElement(required = true)
    protected PreferenceAccount preferenceAccount;
    @XmlElement(required = true)
    protected ServiceEvent serviceEvent;

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
     * Gets the value of the serviceEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceEvent }
     *     
     */
    public ServiceEvent getServiceEvent() {
        return serviceEvent;
    }

    /**
     * Sets the value of the serviceEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEvent }
     *     
     */
    public void setServiceEvent(ServiceEvent value) {
        this.serviceEvent = value;
    }

}
