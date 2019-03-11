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
package it.iccu.sbn.web.actionforms.periodici;

import it.iccu.sbn.ejb.vo.periodici.esame.RicercaKardexEsameBiblioPoloVO;

public class EsameKardexForm extends PeriodiciListaForm {


	private static final long serialVersionUID = -6320602621476308294L;
	private RicercaKardexEsameBiblioPoloVO paramRicerca = new RicercaKardexEsameBiblioPoloVO();

	public RicercaKardexEsameBiblioPoloVO getParamRicerca() {
		return paramRicerca;
	}

	public void setParamRicerca(RicercaKardexEsameBiblioPoloVO paramRicerca) {
		this.paramRicerca = paramRicerca;
	}

}
