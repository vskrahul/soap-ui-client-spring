
package com.charter.enterprise.billing.csg.orders;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetOrdersOrderClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetOrdersOrderClass">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSpecified"/>
 *     &lt;enumeration value="SpecialRequest"/>
 *     &lt;enumeration value="ServiceRequest"/>
 *     &lt;enumeration value="TroubleCall"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GetOrdersOrderClass")
@XmlEnum
public enum GetOrdersOrderClass {

    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified"),
    @XmlEnumValue("SpecialRequest")
    SPECIAL_REQUEST("SpecialRequest"),
    @XmlEnumValue("ServiceRequest")
    SERVICE_REQUEST("ServiceRequest"),
    @XmlEnumValue("TroubleCall")
    TROUBLE_CALL("TroubleCall");
    private final String value;

    GetOrdersOrderClass(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GetOrdersOrderClass fromValue(String v) {
        for (GetOrdersOrderClass c: GetOrdersOrderClass.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
