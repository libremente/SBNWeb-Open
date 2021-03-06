/*******************************************************************************
 * Copyright (C) 2019 ICCU - Istituto Centrale per il Catalogo Unico
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.10.01 at 01:17:47 PM CEST
//


package it.iccu.sbn.vo.xml.binding.ill.apdu;

import it.iccu.sbn.ejb.vo.SerializableVO;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConditionalType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConditionalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{}Date-for-reply"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" fixed="F1211" />
 *       &lt;attribute name="conditions" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="01"/>
 *             &lt;enumeration value="02"/>
 *             &lt;enumeration value="03"/>
 *             &lt;enumeration value="04"/>
 *             &lt;enumeration value="05"/>
 *             &lt;enumeration value="06"/>
 *             &lt;enumeration value="07"/>
 *             &lt;enumeration value="08"/>
 *             &lt;enumeration value="13"/>
 *             &lt;enumeration value="14"/>
 *             &lt;enumeration value="15"/>
 *             &lt;enumeration value="16"/>
 *             &lt;enumeration value="22"/>
 *             &lt;enumeration value="23"/>
 *             &lt;enumeration value="24"/>
 *             &lt;enumeration value="25"/>
 *             &lt;enumeration value="27"/>
 *             &lt;enumeration value="28"/>
 *             &lt;enumeration value="30"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionalType", propOrder = {
    "dateForReply"
})
public class ConditionalType
    extends SerializableVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Date-for-reply")
    protected DateForReply dateForReply;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "conditions", required = true)
    protected String conditions;

    /**
     * Gets the value of the dateForReply property.
     *
     * @return
     *     possible object is
     *     {@link DateForReply }
     *
     */
    public DateForReply getDateForReply() {
        return dateForReply;
    }

    /**
     * Sets the value of the dateForReply property.
     *
     * @param value
     *     allowed object is
     *     {@link DateForReply }
     *
     */
    public void setDateForReply(DateForReply value) {
        this.dateForReply = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId() {
        if (id == null) {
            return "F1211";
        } else {
            return id;
        }
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the conditions property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getConditions() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setConditions(String value) {
        this.conditions = value;
    }

}
