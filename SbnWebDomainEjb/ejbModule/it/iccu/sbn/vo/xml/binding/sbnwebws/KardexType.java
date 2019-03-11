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
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine.
// Generato il: 2017.05.17 alle 02:58:57 PM CEST
//


package it.iccu.sbn.vo.xml.binding.sbnwebws;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * kardex del periodico
 *
 * <p>Classe Java per KardexType complex type.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 *
 * <pre>
 * &lt;complexType name="KardexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fascicolo" type="{http://www.iccu.sbn.it/sbnweb/sbnweb-ws}FascicoloType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="collocazione" type="{http://www.iccu.sbn.it/sbnweb/sbnweb-ws}CollocazioneType" minOccurs="0"/>
 *         &lt;element name="inventario" type="{http://www.iccu.sbn.it/sbnweb/sbnweb-ws}InventarioType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KardexType", propOrder = {
    "fascicolo",
    "collocazione",
    "inventario"
})
public class KardexType

    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<FascicoloType> fascicolo;
    protected CollocazioneType collocazione;
    protected List<InventarioType> inventario;

    /**
     * Gets the value of the fascicolo property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fascicolo property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFascicolo().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FascicoloType }
     *
     *
     */
    public List<FascicoloType> getFascicolo() {
        if (fascicolo == null) {
            fascicolo = new ArrayList<FascicoloType>();
        }
        return this.fascicolo;
    }

    /**
     * Recupera il valore della proprietà collocazione.
     *
     * @return
     *     possible object is
     *     {@link CollocazioneType }
     *
     */
    public CollocazioneType getCollocazione() {
        return collocazione;
    }

    /**
     * Imposta il valore della proprietà collocazione.
     *
     * @param value
     *     allowed object is
     *     {@link CollocazioneType }
     *
     */
    public void setCollocazione(CollocazioneType value) {
        this.collocazione = value;
    }

    /**
     * Gets the value of the inventario property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventario property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventario().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventarioType }
     *
     *
     */
    public List<InventarioType> getInventario() {
        if (inventario == null) {
            inventario = new ArrayList<InventarioType>();
        }
        return this.inventario;
    }

}
