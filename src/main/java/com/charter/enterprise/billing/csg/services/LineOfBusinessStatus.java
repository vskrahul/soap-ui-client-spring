
package com.charter.enterprise.billing.csg.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineOfBusinessStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LineOfBusinessStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSpecified"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Disconnect"/>
 *     &lt;enumeration value="NeverConnected"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LineOfBusinessStatus")
@XmlEnum
public enum LineOfBusinessStatus {

    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Disconnect")
    DISCONNECT("Disconnect"),
    @XmlEnumValue("NeverConnected")
    NEVER_CONNECTED("NeverConnected");
    private final String value;

    LineOfBusinessStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LineOfBusinessStatus fromValue(String v) {
        for (LineOfBusinessStatus c: LineOfBusinessStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
