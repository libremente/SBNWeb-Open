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
package it.finsiel.sbn.polo.orm.viste;

import it.finsiel.sbn.polo.orm.KeyParameter;
import it.finsiel.sbn.polo.orm.OggettoServerSbnMarc;

import java.io.Serializable;

/**
 * Vl_sog_tit_bib generated by MyEclipse - Hibernate Tools
 */

public class Vl_sog_tit_bib extends OggettoServerSbnMarc implements
		Serializable {

	private static final long serialVersionUID = 9044701105650182685L;

	public boolean equals(Object aObj) {
		if (aObj == null)
			return false;
		if (!(aObj instanceof Vl_sog_tit_bib))
			return false;
		Vl_sog_tit_bib vl_sog_tit_bib = (Vl_sog_tit_bib) aObj;
		if (getBID() != null && !getBID().equals(vl_sog_tit_bib.getBID()))
			return false;
		if (getCID() != null && !getCID().equals(vl_sog_tit_bib.getCID()))
			return false;
		if (getCD_POLO() != null
				&& !getCD_POLO().equals(vl_sog_tit_bib.getCD_POLO()))
			return false;
		if (getCD_BIBLIOTECA() != null
				&& !getCD_BIBLIOTECA()
						.equals(vl_sog_tit_bib.getCD_BIBLIOTECA()))
			return false;
		return true;
	}

	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + getBID().hashCode();
		hashcode = hashcode + getCID().hashCode();
		hashcode = hashcode + getCD_POLO().hashCode();
		hashcode = hashcode + getCD_BIBLIOTECA().hashCode();
		return hashcode;
	}

	public String toString() {
		return String.valueOf(getBID() + " " + getCID() + " " + getCD_POLO()
				+ " " + getCD_BIBLIOTECA());
	}

	// Fields

	private String BID;
	private String CID;
	private String CD_POLO;
	private String CD_BIBLIOTECA;
	private String CD_SOGGETTARIO;
	private String CD_EDIZIONE;

	// Constructors

	/** default constructor */
	public Vl_sog_tit_bib() {
	}

	/** full constructor */
	public Vl_sog_tit_bib(String BID, String CID, String CD_POLO,
			String CD_BIBLIOTECA, String CD_SOGGETTARIO) {
		this.BID = BID;
		this.CID = CID;
		this.CD_POLO = CD_POLO;
		this.CD_BIBLIOTECA = CD_BIBLIOTECA;
		this.CD_SOGGETTARIO = CD_SOGGETTARIO;
	}

	// Property accessors

	public String getBID() {
		return this.BID;
	}

	public void setBID(String value) {
		this.BID = value;
		this.settaParametro(KeyParameter.XXXbid, value);

	}

	public String getCID() {
		return this.CID;
	}

	public void setCID(String value) {
		this.CID = value;
		this.settaParametro(KeyParameter.XXXcid, value);
	}

	public String getCD_POLO() {
		return this.CD_POLO;
	}

	public void setCD_POLO(String value) {
		this.CD_POLO = value;
		this.settaParametro(KeyParameter.XXXcd_polo, value);
	}

	public String getCD_BIBLIOTECA() {
		return this.CD_BIBLIOTECA;
	}

	public void setCD_BIBLIOTECA(String value) {
		this.CD_BIBLIOTECA = value;
		this.settaParametro(KeyParameter.XXXcd_biblioteca, value);
	}

	public String getCD_SOGGETTARIO() {
		return this.CD_SOGGETTARIO;
	}

	public void setCD_SOGGETTARIO(String value) {
		this.CD_SOGGETTARIO = value;
		this.settaParametro(KeyParameter.XXXcd_soggettario, value);
	}

	public void setCD_EDIZIONE(String value) {
		// almaviva5_20111122 evolutive CFI
		CD_EDIZIONE = value;
		this.settaParametro(KeyParameter.XXXcd_edizione, value);
	}

	public String getCD_EDIZIONE() {
		return CD_EDIZIONE;
	}

}
