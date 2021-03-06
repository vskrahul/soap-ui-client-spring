
package com.charter.enterprise.billing.csg.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineOfBusinessType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LineOfBusinessType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSpecified"/>
 *     &lt;enumeration value="Video"/>
 *     &lt;enumeration value="Data"/>
 *     &lt;enumeration value="Telephony"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LineOfBusinessType")
@XmlEnum
public enum LineOfBusinessType {

    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified"),
    @XmlEnumValue("Video")
    VIDEO("Video"),
    @XmlEnumValue("Data")
    DATA("Data"),
    @XmlEnumValue("Telephony")
    TELEPHONY("Telephony");
    private final String value;

    LineOfBusinessType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LineOfBusinessType fromValue(String v) {
        for (LineOfBusinessType c: LineOfBusinessType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
