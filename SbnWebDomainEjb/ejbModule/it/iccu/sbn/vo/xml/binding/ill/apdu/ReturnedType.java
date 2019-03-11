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
import it.iccu.sbn.servizi.ill.api.ILLBaseAction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnedType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ReturnedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Transaction-Id"/>
 *         &lt;element name="Service-date-time" type="{}ServiceDateTimeType"/>
 *         &lt;element ref="{}Requester-Id"/>
 *         &lt;element ref="{}Responder-Id"/>
 *         &lt;element ref="{}Date-returned"/>
 *         &lt;element ref="{}Requester-note" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" fixed="F116" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnedType", propOrder = {
    "transactionId",
    "serviceDateTime",
    "requesterId",
    "responderId",
    "dateReturned",
    "requesterNote"
})
public class ReturnedType
    extends SerializableVO
    implements ILLBaseAction
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Transaction-Id", required = true)
    protected TransactionIdType transactionId;
    @XmlElement(name = "Service-date-time", required = true)
    protected ServiceDateTimeType serviceDateTime;
    @XmlElement(name = "Requester-Id", required = true)
    protected String requesterId;
    @XmlElement(name = "Responder-Id", required = true)
    protected String responderId;
    @XmlElement(name = "Date-returned", required = true)
    protected DateReturned dateReturned;
    @XmlElement(name = "Requester-note")
    protected RequesterNote requesterNote;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the transactionId property.
     *
     * @return
     *     possible object is
     *     {@link TransactionIdType }
     *
     */
    public TransactionIdType getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     *
     * @param value
     *     allowed object is
     *     {@link TransactionIdType }
     *
     */
    public void setTransactionId(TransactionIdType value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the serviceDateTime property.
     *
     * @return
     *     possible object is
     *     {@link ServiceDateTimeType }
     *
     */
    public ServiceDateTimeType getServiceDateTime() {
        return serviceDateTime;
    }

    /**
     * Sets the value of the serviceDateTime property.
     *
     * @param value
     *     allowed object is
     *     {@link ServiceDateTimeType }
     *
     */
    public void setServiceDateTime(ServiceDateTimeType value) {
        this.serviceDateTime = value;
    }

    /**
     * Gets the value of the requesterId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRequesterId() {
        return requesterId;
    }

    /**
     * Sets the value of the requesterId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRequesterId(String value) {
        this.requesterId = value;
    }

    /**
     * Gets the value of the responderId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResponderId() {
        return responderId;
    }

    /**
     * Sets the value of the responderId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResponderId(String value) {
        this.responderId = value;
    }

    /**
     * Gets the value of the dateReturned property.
     *
     * @return
     *     possible object is
     *     {@link DateReturned }
     *
     */
    public DateReturned getDateReturned() {
        return dateReturned;
    }

    /**
     * Sets the value of the dateReturned property.
     *
     * @param value
     *     allowed object is
     *     {@link DateReturned }
     *
     */
    public void setDateReturned(DateReturned value) {
        this.dateReturned = value;
    }

    /**
     * Gets the value of the requesterNote property.
     *
     * @return
     *     possible object is
     *     {@link RequesterNote }
     *
     */
    public RequesterNote getRequesterNote() {
        return requesterNote;
    }

    /**
     * Sets the value of the requesterNote property.
     *
     * @param value
     *     allowed object is
     *     {@link RequesterNote }
     *
     */
    public void setRequesterNote(RequesterNote value) {
        this.requesterNote = value;
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
            return "F116";
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

}
