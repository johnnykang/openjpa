//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB)
// Reference Implementation, v2.0.2-b01-fcs
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the
// source schema.
// Generated on: 2006.10.04 at 03:08:16 PM PDT
//


package org.apache.openjpa.persistence.xmlmapping.xmlbindings.myaddress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShortAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * 
 * <pre>
 * &lt;complexType name="ShortAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{}Address">
 *       &lt;sequence>
 *         &lt;element name="Name" type=
 *             "{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Street" type=
 *             "{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="City" type=
 *             "{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShortAddress")
public class ShortAddress
    extends Address
{


}
