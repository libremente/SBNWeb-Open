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
package it.iccu.sbn.batch.allineamenti;

import it.iccu.sbn.ejb.domain.elaborazioniDifferite.acquisizioni.OperazioneSuOrdini;
import it.iccu.sbn.ejb.vo.acquisizioni.OperazioneSuOrdiniMassivaVO;
import it.iccu.sbn.ejb.vo.elaborazioniDifferite.ElaborazioniDifferiteOutputVo;
import it.iccu.sbn.ejb.vo.elaborazioniDifferite.ParametriRichiestaElaborazioneDifferitaVO;
import it.iccu.sbn.servizi.batch.BatchExecutor;
import it.iccu.sbn.servizi.batch.BatchLogWriter;

import javax.transaction.UserTransaction;

public class OperazioniSuOrdineBatch implements BatchExecutor {



	public ElaborazioniDifferiteOutputVo execute(String prefissoOutput,
			ParametriRichiestaElaborazioneDifferitaVO params, BatchLogWriter log,
			UserTransaction tx)	throws Exception {

		ElaborazioniDifferiteOutputVo output = new ElaborazioniDifferiteOutputVo(params) ;

		log.logWriteLine("Sto eseguendo OPERAZIONE SU ORDINI");
		OperazioneSuOrdiniMassivaVO operazioneSuOrdiniVO = (OperazioneSuOrdiniMassivaVO) params;

		OperazioneSuOrdini operazioneSuOrdini = new OperazioneSuOrdini(operazioneSuOrdiniVO);

		// richiamo del metodo di OperazioneSuOrdini.java
		ElaborazioniDifferiteOutputVo outputOperOrd = operazioneSuOrdini.operazioneSuOrdini(log);
		// integro le proprietà passate con la prenotazione del batch su quelle nuove acquisite dal servizio
		ElaborazioniDifferiteOutputVo outputComposto = integraProprieta(output,	outputOperOrd);
		return outputComposto;
	}

	public boolean validateInput(ParametriRichiestaElaborazioneDifferitaVO params, BatchLogWriter log ) {

		return true;
	}

	public ElaborazioniDifferiteOutputVo integraProprieta(ElaborazioniDifferiteOutputVo dest, ElaborazioniDifferiteOutputVo source) {
		dest.setDownloadList(source.getDownloadList());
		dest.setParametriDiRicercaMap(source.getParametriDiRicercaMap());
		dest.setStato(source.getStato());
		dest.setDataDiElaborazione(source.getDataDiElaborazione());
		return dest;
	}

}
