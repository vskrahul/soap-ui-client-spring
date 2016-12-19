
package com.charter.enterprise.billing.csg.accounts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConnectStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSpecified"/>
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="VoluntaryDisconnect"/>
 *     &lt;enumeration value="NonPayAccount"/>
 *     &lt;enumeration value="ChargedOff"/>
 *     &lt;enumeration value="NotAvailable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConnectStatus")
@XmlEnum
public enum ConnectStatus {

    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("VoluntaryDisconnect")
    VOLUNTARY_DISCONNECT("VoluntaryDisconnect"),
    @XmlEnumValue("NonPayAccount")
    NON_PAY_ACCOUNT("NonPayAccount"),
    @XmlEnumValue("ChargedOff")
    CHARGED_OFF("ChargedOff"),
    @XmlEnumValue("NotAvailable")
    NOT_AVAILABLE("NotAvailable");
    private final String value;

    ConnectStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConnectStatus fromValue(String v) {
        for (ConnectStatus c: ConnectStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
