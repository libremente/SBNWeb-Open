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

import it.iccu.sbn.ejb.utils.DateUtil;
import it.iccu.sbn.ejb.vo.SerializableVO;

import java.util.Comparator;
import java.util.Date;

/**
 * TblSolleciti generated by MyEclipse - Hibernate Tools
 */

public class SollecitiVO extends SerializableVO {

	private static final long serialVersionUID = 5657976513450414345L;

	public static final Comparator<SollecitiVO> ORDINA_PER_DATA_SOLLECITO = new Comparator<SollecitiVO>() {
		public int compare(SollecitiVO s1, SollecitiVO s2) {
			int cmp = -(s1.dataInvio.compareTo(s2.dataInvio)); //desc
			cmp = (cmp != 0) ? cmp : (int)(s1.codRichServ - s2.codRichServ);
			cmp = (cmp != 0) ? cmp : -(s1.progrSollecito - s2.progrSollecito); //desc
			return cmp;
		}
	};

	private String codBib;
	private Long codRichServ;
	private Short progrSollecito;
	private Date tsIns;
	private Date tsVar;
	private Date dataInvio;
	private String note;
	private String tipoInvio;
	private String esito;
	private String flCanc;
	private String uteIns;
	private String uteVar;

	private MovimentoVO movimento;

	// Constructors

	/** default constructor */
	public SollecitiVO() {
		super();
	}

	/** full constructor */
	public SollecitiVO(String codBib, long codRichServ, short progrSollecito, Date tsIns, Date tsVar,
			Date dataInvio, String note, String flCanc, String uteIns,
			String uteVar) {

		this.codBib = codBib;
		this.codRichServ = codRichServ;
		this.progrSollecito = progrSollecito;
		this.tsIns = tsIns;
		this.tsVar = tsVar;
		this.dataInvio = dataInvio;
		this.note = note;
		this.flCanc = flCanc;
		this.uteIns = uteIns;
		this.uteVar = uteVar;
	}

	// Property accessors

	public Date getTsIns() {
		return this.tsIns;
	}

	public void setTsIns(Date tsIns) {
		this.tsIns = tsIns;
	}

	public Date getTsVar() {
		return this.tsVar;
	}

	public void setTsVar(Date tsVar) {
		this.tsVar = tsVar;
	}

	public String getDataInvioString() {
		return (dataInvio==null ? null : DateUtil.formattaData(dataInvio.getTime()));
	}

	public Date getDataInvio() {
		return this.dataInvio;
	}

	public void setDataInvio(Date dataInvio) {
		this.dataInvio = dataInvio;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getFlCanc() {
		return this.flCanc;
	}

	public void setFlCanc(String flCanc) {
		this.flCanc = flCanc;
	}

	public String getUteIns() {
		return this.uteIns;
	}

	public void setUteIns(String uteIns) {
		this.uteIns = uteIns;
	}

	public String getUteVar() {
		return this.uteVar;
	}

	public void setUteVar(String uteVar) {
		this.uteVar = uteVar;
	}

	public MovimentoVO getMovimento() {
		return movimento;
	}

	public void setMovimento(MovimentoVO movimento) {
		this.movimento = movimento;
	}

	public String getCodBib() {
		return codBib;
	}

	public void setCodBib(String codBib) {
		this.codBib = codBib;
	}

	public Long getCodRichServ() {
		return codRichServ;
	}

	public void setCodRichServ(Long codRichServ) {
		this.codRichServ = codRichServ;
	}

	public Short getProgrSollecito() {
		return progrSollecito;
	}

	public void setProgrSollecito(Short progrSollecito) {
		this.progrSollecito = progrSollecito;
	}

	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((codBib == null) ? 0 : codBib.hashCode());
		result = PRIME * result + ((codRichServ == null) ? 0 : codRichServ.hashCode());
		result = PRIME * result + ((dataInvio == null) ? 0 : dataInvio.hashCode());
		result = PRIME * result + ((flCanc == null) ? 0 : flCanc.hashCode());
		result = PRIME * result + ((note == null) ? 0 : note.hashCode());
		result = PRIME * result + ((progrSollecito == null) ? 0 : progrSollecito.hashCode());
		result = PRIME * result + ((tsIns == null) ? 0 : tsIns.hashCode());
		result = PRIME * result + ((tsVar == null) ? 0 : tsVar.hashCode());
		result = PRIME * result + ((uteIns == null) ? 0 : uteIns.hashCode());
		result = PRIME * result + ((uteVar == null) ? 0 : uteVar.hashCode());
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
		final SollecitiVO other = (SollecitiVO) obj;
		if (codBib == null) {
			if (other.codBib != null)
				return false;
		} else if (!codBib.equals(other.codBib))
			return false;
		if (codRichServ == null) {
			if (other.codRichServ != null)
				return false;
		} else if (!codRichServ.equals(other.codRichServ))
			return false;
		if (dataInvio == null) {
			if (other.dataInvio != null)
				return false;
		} else if (!dataInvio.equals(other.dataInvio))
			return false;
		if (flCanc == null) {
			if (other.flCanc != null)
				return false;
		} else if (!flCanc.equals(other.flCanc))
			return false;
		if (note == null) {
			if (other.note != null)
				return false;
		} else if (!note.equals(other.note))
			return false;
		if (progrSollecito == null) {
			if (other.progrSollecito != null)
				return false;
		} else if (!progrSollecito.equals(other.progrSollecito))
			return false;
		if (tsIns == null) {
			if (other.tsIns != null)
				return false;
		} else if (!tsIns.equals(other.tsIns))
			return false;
		if (tsVar == null) {
			if (other.tsVar != null)
				return false;
		} else if (!tsVar.equals(other.tsVar))
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

	public String getTipoInvio() {
		return tipoInvio;
	}

	public void setTipoInvio(String tipoInvio) {
		this.tipoInvio = tipoInvio;
	}

	public String getEsito() {
		return esito;
	}

	public void setEsito(String esito) {
		this.esito = esito;
	}

}
