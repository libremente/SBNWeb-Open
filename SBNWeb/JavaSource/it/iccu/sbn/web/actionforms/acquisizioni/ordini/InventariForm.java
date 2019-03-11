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
package it.iccu.sbn.web.actionforms.acquisizioni.ordini;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class InventariForm extends ActionForm {

	private static final long serialVersionUID = -2733441134469781139L;
	// NUOVA
	private boolean sessione;
	private boolean conferma = false;



		public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
			ActionErrors errors = new ActionErrors();

			// Effettua i controlli solo se non è la prima
			// volta che si entra in questo metodo

			return errors;
		}
		public boolean isSessione() {
			return sessione;
		}
		public void setSessione(boolean sessione) {
			this.sessione = sessione;
		}
		public boolean isConferma() {
			return conferma;
		}
		public void setConferma(boolean conferma) {
			this.conferma = conferma;
		}



}
