
package com.charter.enterprise.billing.csg.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSourceOverrideType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataSourceOverrideType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoOverride"/>
 *     &lt;enumeration value="OverrideToDatabase"/>
 *     &lt;enumeration value="OverrideToRemoteSystem"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataSourceOverrideType")
@XmlEnum
public enum DataSourceOverrideType {

    @XmlEnumValue("NoOverride")
    NO_OVERRIDE("NoOverride"),
    @XmlEnumValue("OverrideToDatabase")
    OVERRIDE_TO_DATABASE("OverrideToDatabase"),
    @XmlEnumValue("OverrideToRemoteSystem")
    OVERRIDE_TO_REMOTE_SYSTEM("OverrideToRemoteSystem");
    private final String value;

    DataSourceOverrideType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataSourceOverrideType fromValue(String v) {
        for (DataSourceOverrideType c: DataSourceOverrideType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
