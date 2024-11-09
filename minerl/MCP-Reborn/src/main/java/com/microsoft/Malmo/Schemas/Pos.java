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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 An absolute position in the 3D Minecraft world.
 *             
 * 
 * <p>Java class for Pos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="z" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pos")
@XmlSeeAlso({
    PointWithToleranceAndDescription.class,
    PosAndDirection.class,
    NamedPoint.class,
    PointWithReward.class
})
public class Pos {

    @XmlAttribute(name = "x", required = true)
    protected float x;
    @XmlAttribute(name = "y", required = true)
    protected float y;
    @XmlAttribute(name = "z", required = true)
    protected float z;

    /**
     * Gets the value of the x property.
     * 
     */
    public float getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     */
    public void setX(float value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     */
    public float getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     */
    public void setY(float value) {
        this.y = value;
    }

    /**
     * Gets the value of the z property.
     * 
     */
    public float getZ() {
        return z;
    }

    /**
     * Sets the value of the z property.
     * 
     */
    public void setZ(float value) {
        this.z = value;
    }

}
