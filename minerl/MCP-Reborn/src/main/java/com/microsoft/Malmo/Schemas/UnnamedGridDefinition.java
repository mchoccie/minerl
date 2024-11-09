//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.09 at 02:21:58 AM PST 
//


package com.microsoft.Malmo.Schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnnamedGridDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnnamedGridDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="min">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="z" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="max">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="z" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnnamedGridDefinition", propOrder = {
    "min",
    "max"
})
public class UnnamedGridDefinition {

    @XmlElement(required = true)
    protected UnnamedGridDefinition.Min min;
    @XmlElement(required = true)
    protected UnnamedGridDefinition.Max max;

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link UnnamedGridDefinition.Min }
     *     
     */
    public UnnamedGridDefinition.Min getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnnamedGridDefinition.Min }
     *     
     */
    public void setMin(UnnamedGridDefinition.Min value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link UnnamedGridDefinition.Max }
     *     
     */
    public UnnamedGridDefinition.Max getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnnamedGridDefinition.Max }
     *     
     */
    public void setMax(UnnamedGridDefinition.Max value) {
        this.max = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="z" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Max {

        @XmlAttribute(name = "x", required = true)
        protected int x;
        @XmlAttribute(name = "y", required = true)
        protected int y;
        @XmlAttribute(name = "z", required = true)
        protected int z;

        /**
         * Gets the value of the x property.
         * 
         */
        public int getX() {
            return x;
        }

        /**
         * Sets the value of the x property.
         * 
         */
        public void setX(int value) {
            this.x = value;
        }

        /**
         * Gets the value of the y property.
         * 
         */
        public int getY() {
            return y;
        }

        /**
         * Sets the value of the y property.
         * 
         */
        public void setY(int value) {
            this.y = value;
        }

        /**
         * Gets the value of the z property.
         * 
         */
        public int getZ() {
            return z;
        }

        /**
         * Sets the value of the z property.
         * 
         */
        public void setZ(int value) {
            this.z = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="z" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Min {

        @XmlAttribute(name = "x", required = true)
        protected int x;
        @XmlAttribute(name = "y", required = true)
        protected int y;
        @XmlAttribute(name = "z", required = true)
        protected int z;

        /**
         * Gets the value of the x property.
         * 
         */
        public int getX() {
            return x;
        }

        /**
         * Sets the value of the x property.
         * 
         */
        public void setX(int value) {
            this.x = value;
        }

        /**
         * Gets the value of the y property.
         * 
         */
        public int getY() {
            return y;
        }

        /**
         * Sets the value of the y property.
         * 
         */
        public void setY(int value) {
            this.y = value;
        }

        /**
         * Gets the value of the z property.
         * 
         */
        public int getZ() {
            return z;
        }

        /**
         * Sets the value of the z property.
         * 
         */
        public void setZ(int value) {
            this.z = value;
        }

    }

}
