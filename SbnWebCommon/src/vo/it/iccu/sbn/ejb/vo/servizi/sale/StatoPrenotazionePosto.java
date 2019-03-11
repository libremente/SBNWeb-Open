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
package it.iccu.sbn.ejb.vo.servizi.sale;

public enum StatoPrenotazionePosto {

	//stati reali (persistenti)
	IMMESSA			('I'),
	FRUITA			('F'),
	ANNULLATA		('R'),
	DISDETTA		('D'),
	CONCLUSA		('C');

	private final char stato;

	private StatoPrenotazionePosto(char stato) {
		this.stato = stato;
	}

	public char getStato() {
		return stato;
	}

	public static StatoPrenotazionePosto of(char stato) {
		for (StatoPrenotazionePosto spp : StatoPrenotazionePosto.values())
			if (stato == spp.stato)
				return spp;

		return null;
	}

}
