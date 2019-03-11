<%@ taglib uri="http://struts.apache.org/tags-html-el" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean-el" prefix="bean"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic"
	prefix="logic"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean"
	prefix="bean-struts"%>
<%@ taglib uri="http://common.web.sbn.iccu.it/sbn" prefix="sbn"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="layout"%>
<layout:page>
	<sbn:navform
		action="/gestionesemantica/catalogazionesemantica/CancellaLegameClassificazioneTitolo.do">
		<div id="divForm">
		<div id="divMessaggio"><sbn:errors /></div>
		<table width="100%" border="0">
			<tr>
				<!-- Intestazione livello di ricerca -->
				<td class="etichetta" scope="col"><bean:message
					key="label.livRicercaPolo" bundle="gestioneBibliograficaLabels" /></td>
				<!-- INIZIO PAGINA -->
				<jsp:include
					page="/WEB-INF/jsp/subpages/gestionesemantica/catalogazionesemantica/datiTitolo.jsp" />
			</tr>
		</table>
		<table width="100%" border="0">
			<tr>
				<td align="center" class="etichetta"><bean:message
					key="crea.notaAlLegameClass" bundle="gestioneSemanticaLabels" /></td>
			</tr>
			<tr>
				<td><html:textarea styleId="testoNormale"
					property="notaAlLegame" cols="90" rows="6" readonly="true"></html:textarea></td>
			</tr>
		</table>
		<table width="100%" border="0">
			<tr>
				<td class="etichetta"><bean:message key="ricerca.sistema"
					bundle="gestioneSemanticaLabels" /></td>
				<td><html:select styleClass="testoNormale"
					property="ricercaClasse.codSistemaClassificazione" disabled="true">
					<html:optionsCollection property="listaSistemiClassificazione"
						value="codice" label="codice" />
				</html:select></td>
				<td class="etichetta"><bean:message key="ricerca.edizione"
					bundle="gestioneSemanticaLabels" /></td>
				<td><html:select styleClass="testoNormale"
					property="ricercaClasse.codEdizioneDewey" disabled="true">
					<html:optionsCollection property="listaEdizioni" value="codice"
						label="descrizione" />
				</html:select></td>
				<td class="etichetta"><bean:message key="crea.statoDiControllo"
					bundle="gestioneSemanticaLabels" /></td>
				<td><html:select styleClass="testoNormale"
					property="statoControllo" disabled="true">
					<html:optionsCollection property="listaStatoControllo"
						value="codice" label="descrizione" />
				</html:select></td>
			</tr>
			<tr>
				<td class="etichetta" scope="col"><bean:message
					key="ricerca.simbolo" bundle="gestioneSemanticaLabels" /></td>
				<td><html:text property="simbolo" readonly="true"></html:text></td>
			</tr>
		</table>
		<table width="100%" border="0">
			<tr>
				<td align="center" class="etichetta"><bean:message
					key="ricerca.descrizione" bundle="gestioneSemanticaLabels" /></td>
			</tr>
			<tr>
				<td><html:text styleId="testoNormale" property="descrizione"
					size="138" readonly="true"></html:text></td>
			</tr>
			<tr>
				<td class="etichetta" align="center"><bean:message
					key="crea.ulteriore" bundle="gestioneSemanticaLabels" /></td>
			</tr>
			<tr>
				<td><html:text styleId="testoNormale"
					property="ulterioreTermine" size="138" readonly="true"></html:text></td>
			</tr>
		</table>
		<table width="100%" border="0">
			<tr>
				<td align="left" class="etichetta" scope="col"><bean:message
					key="esamina.inserito" bundle="gestioneSemanticaLabels" /></td>
				<td class="etichetta"><bean:message key="esamina.il"
					bundle="gestioneSemanticaLabels" /></td>
				<td><html:text styleId="testoNormale"
					property="dataInserimento" size="14" maxlength="20" readonly="true"></html:text></td>
				<td class="etichetta"><bean:message key="esamina.modificato"
					bundle="gestioneSemanticaLabels" /></td>
				<td class="etichetta"><bean:message key="esamina.il"
					bundle="gestioneSemanticaLabels" /></td>
				<td><html:text styleId="testoNormale" property="dataModifica"
					size="14" maxlength="20" readonly="true"></html:text></td>
			</tr>

		</table>
		</div>
		<div id="divFooter">
		<table align="center">
			<tr>
				<c:choose>
					<c:when
						test="${CancellaLegameClassificazioneTitoloForm.enableConferma}">
						<jsp:include
							page="/WEB-INF/jsp/subpages/gestionesemantica/soggetto/confermaOperazione.jsp" />
					</c:when>
					<c:otherwise>
						<jsp:include
							page="/WEB-INF/jsp/subpages/gestionesemantica/catalogazionesemantica/bottonieraCancellaLegameClassificazioneTitolo.jsp" />
					</c:otherwise>
				</c:choose>
			</tr>
		</table>
		</div>
	</sbn:navform>
</layout:page>
