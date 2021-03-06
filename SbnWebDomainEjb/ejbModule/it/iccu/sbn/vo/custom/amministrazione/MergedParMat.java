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
package it.iccu.sbn.vo.custom.amministrazione;

import it.iccu.sbn.polo.orm.amministrazione.Tbf_par_mat;
import it.iccu.sbn.util.amministrazione.ProfilazioneUtil.Origine;

public class MergedParMat extends Tbf_par_mat {

	private static final long serialVersionUID = 990448542023575804L;

	private Origine tp_abilitaz_Origine;
	private Origine cd_contr_sim_Origine;
	private Origine fl_abil_forzat_Origine;
	private Origine cd_livello_Origine;
	private Origine sololocale_Origine;

	public Origine getTp_abilitaz_Origine() {
		return tp_abilitaz_Origine;
	}

	public void setTp_abilitaz_Origine(Origine tp_abilitaz_Origine) {
		this.tp_abilitaz_Origine = tp_abilitaz_Origine;
	}

	public Origine getCd_contr_sim_Origine() {
		return cd_contr_sim_Origine;
	}

	public void setCd_contr_sim_Origine(Origine cd_contr_sim_Origine) {
		this.cd_contr_sim_Origine = cd_contr_sim_Origine;
	}

	public Origine getFl_abil_forzat_Origine() {
		return fl_abil_forzat_Origine;
	}

	public void setFl_abil_forzat_Origine(Origine fl_abil_forzat_Origine) {
		this.fl_abil_forzat_Origine = fl_abil_forzat_Origine;
	}

	public Origine getCd_livello_Origine() {
		return cd_livello_Origine;
	}

	public void setCd_livello_Origine(Origine cd_livello_Origine) {
		this.cd_livello_Origine = cd_livello_Origine;
	}

	public Origine getSololocale_Origine() {
		return sololocale_Origine;
	}

	public void setSololocale_Origine(Origine sololocale_Origine) {
		this.sololocale_Origine = sololocale_Origine;
	}

}
