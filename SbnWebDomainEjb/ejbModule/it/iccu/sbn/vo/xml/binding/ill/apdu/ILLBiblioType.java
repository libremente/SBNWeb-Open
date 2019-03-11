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
// Generated on: 2015.10.27 at 02:36:14 PM CET
//


package it.iccu.sbn.vo.xml.binding.ill.apdu;

import it.iccu.sbn.ejb.vo.SerializableVO;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ILLBiblioType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ILLBiblioType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="std">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servprestito" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="servdd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "ILLBiblioType", propOrder = {
    "idb",
    "std",
    "des",
    "ind",
    "servprestito",
    "servdd"
})
public class ILLBiblioType
    extends SerializableVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String idb;
    @XmlElement(required = true)
    protected String std;
    protected String des;
    protected String ind;
    protected String servprestito;
    protected String servdd;

    /**
     * Gets the value of the idb property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdb() {
        return idb;
    }

    /**
     * Sets the value of the idb property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdb(String value) {
        this.idb = value;
    }

    /**
     * Gets the value of the std property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStd() {
        return std;
    }

    /**
     * Sets the value of the std property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStd(String value) {
        this.std = value;
    }

    /**
     * Gets the value of the des property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDes() {
        return des;
    }

    /**
     * Sets the value of the des property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDes(String value) {
        this.des = value;
    }

    /**
     * Gets the value of the ind property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInd() {
        return ind;
    }

    /**
     * Sets the value of the ind property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInd(String value) {
        this.ind = value;
    }

    /**
     * Gets the value of the servprestito property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getServprestito() {
        return servprestito;
    }

    /**
     * Sets the value of the servprestito property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setServprestito(String value) {
        this.servprestito = value;
    }

    /**
     * Gets the value of the servdd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getServdd() {
        return servdd;
    }

    /**
     * Sets the value of the servdd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setServdd(String value) {
        this.servdd = value;
    }

}
