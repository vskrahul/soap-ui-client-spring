
package com.charter.enterprise.billing.csg.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineOfBusinessServiceable.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LineOfBusinessServiceable">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSpecified"/>
 *     &lt;enumeration value="True"/>
 *     &lt;enumeration value="False"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LineOfBusinessServiceable")
@XmlEnum
public enum LineOfBusinessServiceable {

    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified"),
    @XmlEnumValue("True")
    TRUE("True"),
    @XmlEnumValue("False")
    FALSE("False");
    private final String value;

    LineOfBusinessServiceable(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LineOfBusinessServiceable fromValue(String v) {
        for (LineOfBusinessServiceable c: LineOfBusinessServiceable.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
