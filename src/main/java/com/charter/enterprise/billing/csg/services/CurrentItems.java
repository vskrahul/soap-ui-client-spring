
package com.charter.enterprise.billing.csg.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrentItems.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrentItems">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSpecified"/>
 *     &lt;enumeration value="True"/>
 *     &lt;enumeration value="False"/>
 *     &lt;enumeration value="Pricing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CurrentItems")
@XmlEnum
public enum CurrentItems {

    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified"),
    @XmlEnumValue("True")
    TRUE("True"),
    @XmlEnumValue("False")
    FALSE("False"),
    @XmlEnumValue("Pricing")
    PRICING("Pricing");
    private final String value;

    CurrentItems(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurrentItems fromValue(String v) {
        for (CurrentItems c: CurrentItems.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
