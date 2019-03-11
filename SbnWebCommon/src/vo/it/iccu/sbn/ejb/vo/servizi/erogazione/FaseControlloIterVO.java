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
package it.iccu.sbn.ejb.vo.servizi.erogazione;

import it.iccu.sbn.ejb.vo.SerializableVO;

import java.util.Date;

/**
 * TblFasiControllo generated by MyEclipse Persistence Tools
 */

public class FaseControlloIterVO extends SerializableVO {

	private static final long serialVersionUID = -4165048362941489014L;
	private String codBib;
	private String codTipoServ;
	private String codAttivita;
	private Short progrFase;

	private Date dataIns;
	private Date dataAgg;
	private String uteIns;
	private String uteVar;
	private boolean flagBloc;
	private String messaggio;
	private Short codControllo;
	private String descControllo;
	private String flCanc;
	private String classe;

	//flag tb_codici
	private boolean richiedeSupporto;
	private boolean controlloAggiornamento;
	private boolean controlloInoltraPrenotazione;

	// Constructors
	/** default constructor */
	public FaseControlloIterVO() {
	}

	/** full constructor */
	public FaseControlloIterVO(String codBib, String codTipoServ,
			String codAttivita, Short progrFase, Date dataIns, Date dataAgg,
			boolean flagBloc, String messaggio, Short codControllo) {
		this.codBib = codBib;
		this.codTipoServ = codTipoServ;
		this.codAttivita = codAttivita;
		this.progrFase = progrFase;
		this.dataIns = dataIns;
		this.dataAgg = dataAgg;
		this.flagBloc = flagBloc;
		this.messaggio = messaggio;
		this.codControllo = codControllo;
	}

	public FaseControlloIterVO(String codBib, String codTipoServ,
			String codAttivita, Short progrFase, Date dataIns, Date dataAgg,
			boolean flagBloc, String messaggio, Short codControllo,
			String descControllo, String uteIns, String uteVar, String flCanc,
			String classe) {
		this.codBib = codBib;
		this.codTipoServ = codTipoServ;
		this.codAttivita = codAttivita;
		this.progrFase = progrFase;
		this.dataIns = dataIns;
		this.dataAgg = dataAgg;
		this.flagBloc = flagBloc;
		this.messaggio = messaggio;
		this.codControllo = codControllo;
		this.descControllo = descControllo;
		this.uteIns = uteIns;
		this.uteVar = uteVar;
		this.flCanc = flCanc;
		this.classe = classe;
	}

	// Property accessors

	public Date getDataIns() {
		return this.dataIns;
	}

	public void setDataIns(Date dataIns) {
		this.dataIns = dataIns;
	}

	public Date getDataAgg() {
		return this.dataAgg;
	}

	public void setDataAgg(Date dataAgg) {
		this.dataAgg = dataAgg;
	}

	public boolean isFlagBloc() {
		return this.flagBloc;
	}

	public void setFlagBloc(boolean flagBloc) {
		this.flagBloc = flagBloc;
	}

	public String getMessaggio() {
		return this.messaggio;
	}

	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}

	public Short getCodControllo() {
		return this.codControllo;
	}

	public void setCodControllo(Short codControllo) {
		this.codControllo = codControllo;
	}

	public String getCodAttivita() {
		return codAttivita;
	}

	public void setCodAttivita(String codAttivita) {
		this.codAttivita = codAttivita;
	}

	public String getCodBib() {
		return codBib;
	}

	public void setCodBib(String codBib) {
		this.codBib = codBib;
	}

	public String getCodTipoServ() {
		return codTipoServ;
	}

	public void setCodTipoServ(String codTipoServ) {
		this.codTipoServ = codTipoServ;
	}

	public Short getProgrFase() {
		return progrFase;
	}

	public void setProgrFase(Short progrFase) {
		this.progrFase = progrFase;
	}

	public String getUteIns() {
		return uteIns;
	}

	public void setUteIns(String uteIns) {
		this.uteIns = uteIns;
	}

	public String getUteVar() {
		return uteVar;
	}

	public void setUteVar(String uteVar) {
		this.uteVar = uteVar;
	}

	public String getDescControllo() {
		return descControllo;
	}

	public void setDescControllo(String descControllo) {
		this.descControllo = descControllo;
	}

	public String getFlCanc() {
		return flCanc;
	}

	public void setFlCanc(String flCanc) {
		this.flCanc = flCanc;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public boolean isControlloAggiornamento() {
		return controlloAggiornamento;
	}

	public void setControlloAggiornamento(boolean controlloAggiornamento) {
		this.controlloAggiornamento = controlloAggiornamento;
	}

	public boolean isControlloInoltraPrenotazione() {
		return controlloInoltraPrenotazione;
	}

	public void setControlloInoltraPrenotazione(boolean controlloInoltraPrenotazione) {
		this.controlloInoltraPrenotazione = controlloInoltraPrenotazione;
	}

	public boolean isRichiedeSupporto() {
		return richiedeSupporto;
	}

	public void setRichiedeSupporto(boolean richiedeSupporto) {
		this.richiedeSupporto = richiedeSupporto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((classe == null) ? 0 : classe.hashCode());
		result = prime * result
				+ ((codAttivita == null) ? 0 : codAttivita.hashCode());
		result = prime * result + ((codBib == null) ? 0 : codBib.hashCode());
		result = prime * result
				+ ((codControllo == null) ? 0 : codControllo.hashCode());
		result = prime * result
				+ ((codTipoServ == null) ? 0 : codTipoServ.hashCode());
		result = prime * result + (controlloAggiornamento ? 1231 : 1237);
		result = prime * result + (controlloInoltraPrenotazione ? 1231 : 1237);
		result = prime * result + ((dataAgg == null) ? 0 : dataAgg.hashCode());
		result = prime * result + ((dataIns == null) ? 0 : dataIns.hashCode());
		result = prime * result
				+ ((descControllo == null) ? 0 : descControllo.hashCode());
		result = prime * result + ((flCanc == null) ? 0 : flCanc.hashCode());
		result = prime * result + (flagBloc ? 1231 : 1237);
		result = prime * result
				+ ((messaggio == null) ? 0 : messaggio.hashCode());
		result = prime * result
				+ ((progrFase == null) ? 0 : progrFase.hashCode());
		result = prime * result + (richiedeSupporto ? 1231 : 1237);
		result = prime * result + ((uteIns == null) ? 0 : uteIns.hashCode());
		result = prime * result + ((uteVar == null) ? 0 : uteVar.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FaseControlloIterVO other = (FaseControlloIterVO) obj;
		if (classe == null) {
			if (other.classe != null)
				return false;
		} else if (!classe.equals(other.classe))
			return false;
		if (codAttivita == null) {
			if (other.codAttivita != null)
				return false;
		} else if (!codAttivita.equals(other.codAttivita))
			return false;
		if (codBib == null) {
			if (other.codBib != null)
				return false;
		} else if (!codBib.equals(other.codBib))
			return false;
		if (codControllo == null) {
			if (other.codControllo != null)
				return false;
		} else if (!codControllo.equals(other.codControllo))
			return false;
		if (codTipoServ == null) {
			if (other.codTipoServ != null)
				return false;
		} else if (!codTipoServ.equals(other.codTipoServ))
			return false;
		if (controlloAggiornamento != other.controlloAggiornamento)
			return false;
		if (controlloInoltraPrenotazione != other.controlloInoltraPrenotazione)
			return false;
		if (dataAgg == null) {
			if (other.dataAgg != null)
				return false;
		} else if (!dataAgg.equals(other.dataAgg))
			return false;
		if (dataIns == null) {
			if (other.dataIns != null)
				return false;
		} else if (!dataIns.equals(other.dataIns))
			return false;
		if (descControllo == null) {
			if (other.descControllo != null)
				return false;
		} else if (!descControllo.equals(other.descControllo))
			return false;
		if (flCanc == null) {
			if (other.flCanc != null)
				return false;
		} else if (!flCanc.equals(other.flCanc))
			return false;
		if (flagBloc != other.flagBloc)
			return false;
		if (messaggio == null) {
			if (other.messaggio != null)
				return false;
		} else if (!messaggio.equals(other.messaggio))
			return false;
		if (progrFase == null) {
			if (other.progrFase != null)
				return false;
		} else if (!progrFase.equals(other.progrFase))
			return false;
		if (richiedeSupporto != other.richiedeSupporto)
			return false;
		if (uteIns == null) {
			if (other.uteIns != null)
				return false;
		} else if (!uteIns.equals(other.uteIns))
			return false;
		if (uteVar == null) {
			if (other.uteVar != null)
				return false;
		} else if (!uteVar.equals(other.uteVar))
			return false;
		return true;
	}

}
