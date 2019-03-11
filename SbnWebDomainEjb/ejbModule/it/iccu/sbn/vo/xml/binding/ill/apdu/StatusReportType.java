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
// Generated on: 2014.10.21 at 02:52:06 PM CEST
//


package it.iccu.sbn.vo.xml.binding.ill.apdu;

import it.iccu.sbn.ejb.vo.SerializableVO;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status-reportType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Status-reportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}History-report" minOccurs="0"/>
 *         &lt;element ref="{}Current-state" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status-reportType", propOrder = {
    "historyReport",
    "currentState"
})
public class StatusReportType
    extends SerializableVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "History-report")
    protected HistoryReport historyReport;
    @XmlElement(name = "Current-state")
    protected CurrentState currentState;

    /**
     * Gets the value of the historyReport property.
     *
     * @return
     *     possible object is
     *     {@link HistoryReport }
     *
     */
    public HistoryReport getHistoryReport() {
        return historyReport;
    }

    /**
     * Sets the value of the historyReport property.
     *
     * @param value
     *     allowed object is
     *     {@link HistoryReport }
     *
     */
    public void setHistoryReport(HistoryReport value) {
        this.historyReport = value;
    }

    /**
     * Gets the value of the currentState property.
     *
     * @return
     *     possible object is
     *     {@link CurrentState }
     *
     */
    public CurrentState getCurrentState() {
        return currentState;
    }

    /**
     * Sets the value of the currentState property.
     *
     * @param value
     *     allowed object is
     *     {@link CurrentState }
     *
     */
    public void setCurrentState(CurrentState value) {
        this.currentState = value;
    }

}
