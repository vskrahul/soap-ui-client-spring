
package com.charter.enterprise.billing.csg.accounts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DelinquencyStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DelinquencyStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSpecified"/>
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="OpenNonPayWithEquipment"/>
 *     &lt;enumeration value="VoluntaryDisconnect"/>
 *     &lt;enumeration value="NonPayDisconnect"/>
 *     &lt;enumeration value="PendingNonPay"/>
 *     &lt;enumeration value="PendingChangeOfService"/>
 *     &lt;enumeration value="PayPerViewRestricted"/>
 *     &lt;enumeration value="DowngradeService"/>
 *     &lt;enumeration value="OpenVoluntaryDisconnect"/>
 *     &lt;enumeration value="OpenNonPayEquipmentDisabled"/>
 *     &lt;enumeration value="ChargedOff"/>
 *     &lt;enumeration value="NotAvailable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DelinquencyStatus")
@XmlEnum
public enum DelinquencyStatus {

    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("OpenNonPayWithEquipment")
    OPEN_NON_PAY_WITH_EQUIPMENT("OpenNonPayWithEquipment"),
    @XmlEnumValue("VoluntaryDisconnect")
    VOLUNTARY_DISCONNECT("VoluntaryDisconnect"),
    @XmlEnumValue("NonPayDisconnect")
    NON_PAY_DISCONNECT("NonPayDisconnect"),
    @XmlEnumValue("PendingNonPay")
    PENDING_NON_PAY("PendingNonPay"),
    @XmlEnumValue("PendingChangeOfService")
    PENDING_CHANGE_OF_SERVICE("PendingChangeOfService"),
    @XmlEnumValue("PayPerViewRestricted")
    PAY_PER_VIEW_RESTRICTED("PayPerViewRestricted"),
    @XmlEnumValue("DowngradeService")
    DOWNGRADE_SERVICE("DowngradeService"),
    @XmlEnumValue("OpenVoluntaryDisconnect")
    OPEN_VOLUNTARY_DISCONNECT("OpenVoluntaryDisconnect"),
    @XmlEnumValue("OpenNonPayEquipmentDisabled")
    OPEN_NON_PAY_EQUIPMENT_DISABLED("OpenNonPayEquipmentDisabled"),
    @XmlEnumValue("ChargedOff")
    CHARGED_OFF("ChargedOff"),
    @XmlEnumValue("NotAvailable")
    NOT_AVAILABLE("NotAvailable");
    private final String value;

    DelinquencyStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DelinquencyStatus fromValue(String v) {
        for (DelinquencyStatus c: DelinquencyStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
