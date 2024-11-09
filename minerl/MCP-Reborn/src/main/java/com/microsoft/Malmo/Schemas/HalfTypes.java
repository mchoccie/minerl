//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.09 at 02:21:58 AM PST 
//


package com.microsoft.Malmo.Schemas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HalfTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HalfTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="top"/>
 *     &lt;enumeration value="bottom"/>
 *     &lt;enumeration value="head"/>
 *     &lt;enumeration value="foot"/>
 *     &lt;enumeration value="upper"/>
 *     &lt;enumeration value="lower"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HalfTypes")
@XmlEnum
public enum HalfTypes {

    @XmlEnumValue("top")
    TOP("top"),
    @XmlEnumValue("bottom")
    BOTTOM("bottom"),
    @XmlEnumValue("head")
    HEAD("head"),
    @XmlEnumValue("foot")
    FOOT("foot"),
    @XmlEnumValue("upper")
    UPPER("upper"),
    @XmlEnumValue("lower")
    LOWER("lower");
    private final String value;

    HalfTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HalfTypes fromValue(String v) {
        for (HalfTypes c: HalfTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
