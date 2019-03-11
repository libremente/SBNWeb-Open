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
package it.iccu.sbn.ejb.vo.amministrazionesistema.gestionedefault;

import it.iccu.sbn.ejb.vo.BaseVO;

public class AreaVO extends BaseVO {

	/**
	 *
	 */
	private static final long serialVersionUID = -5928889971484355515L;

	private String idAreaSezione;
	private int sequenzaOrdinamento;
	private String descrizione;

	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getIdAreaSezione() {
		return idAreaSezione;
	}
	public void setIdAreaSezione(String idAreaSezione) {
		this.idAreaSezione = idAreaSezione;
	}
	public int getSequenzaOrdinamento() {
		return sequenzaOrdinamento;
	}
	public void setSequenzaOrdinamento(int sequenzaOrdinamento) {
		this.sequenzaOrdinamento = sequenzaOrdinamento;
	}

}
