<%@ taglib uri="http://struts.apache.org/tags-html-el" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean-el" prefix="bean"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean"	prefix="bean-struts"%>
<%@ taglib uri="http://common.web.sbn.iccu.it/sbn" prefix="sbn"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="layout"%>


<div style="width:100%;" class="SchedaImg1">

	<div style="width:18%; float:left;">
		<c:choose>
			<c:when test="${ErogazioneRicercaForm.folder eq 'S'}">
				<div class="schedaOn" style="text-align: center;">
					<bean:message key="servizi.erogazione.tag.ricerca" bundle="serviziLabels" />
				</div>
			</c:when>
			<c:otherwise>
				<div class="schedaOff" align="center">
					<html:submit style="margin-left:auto; margin-right:auto;" property="methodErogazione" disabled="${ErogazioneRicercaForm.conferma}" styleClass="sintButtonLinkDefault">
						<bean:message key="servizi.erogazione.tag.ricerca" bundle="serviziLabels" />
					</html:submit>
				</div>
			</c:otherwise>
		</c:choose>
	</div>

	<div style="width:18%; float:left;">
		<c:choose>
			<c:when test="${ErogazioneRicercaForm.folder eq 'L'}">
				<div class="schedaOn" style="text-align: center;">
					<bean:message key="servizi.erogazione.tag.liste" bundle="serviziLabels" />
				</div>
			</c:when>
			<c:otherwise>
				<div class="schedaOff" align="center">
					<html:submit style="margin-left:auto; margin-right:auto;" property="methodErogazione" disabled="${ErogazioneRicercaForm.conferma}" styleClass="sintButtonLinkDefault">
						<bean:message key="servizi.erogazione.tag.liste" bundle="serviziLabels" />
					</html:submit>
				</div>
			</c:otherwise>
		</c:choose>
	</div>

	<div style="width:16%; float:left;">
		<c:choose>
			<c:when test="${ErogazioneRicercaForm.folder eq 'P'}">
				<div class="schedaOn" style="text-align: center;">
					<bean:message key="servizi.bottone.prenotazioni" bundle="serviziLabels" />
				</div>
			</c:when>
			<c:otherwise>
				<div class="schedaOff" align="center">
					<html:submit style="margin-left:auto; margin-right:auto;" property="methodErogazione" disabled="${ErogazioneRicercaForm.conferma}" styleClass="sintButtonLinkDefault">
						<bean:message key="servizi.bottone.prenotazioni" bundle="serviziLabels" />
					</html:submit>
				</div>
			</c:otherwise>
		</c:choose>
	</div>

	<div style="width:16%; float:left;">
		<c:choose>
			<c:when test="${ErogazioneRicercaForm.folder eq 'PG'}">
				<div class="schedaOn" style="text-align: center;">
					<bean:message key="servizi.bottone.proroghe" bundle="serviziLabels" />
				</div>
			</c:when>
			<c:otherwise>
				<div class="schedaOff" align="center">
					<html:submit style="margin-left:auto; margin-right:auto;" property="methodErogazione" disabled="${ErogazioneRicercaForm.conferma}" styleClass="sintButtonLinkDefault">
						<bean:message key="servizi.bottone.proroghe" bundle="serviziLabels" />
					</html:submit>
				</div>
			</c:otherwise>
		</c:choose>
	</div>

	<div style="width:16%; float:left;">
		<c:choose>
			<c:when test="${ErogazioneRicercaForm.folder eq 'G'}">
				<div class="schedaOn" style="text-align: center;">
					<bean:message key="servizi.bottone.giacenze" bundle="serviziLabels" />
				</div>
			</c:when>
			<c:otherwise>
				<div class="schedaOff" align="center">
					<html:submit style="margin-left:auto; margin-right:auto;" property="methodErogazione" disabled="${ErogazioneRicercaForm.conferma}" styleClass="sintButtonLinkDefault">
						<bean:message key="servizi.bottone.giacenze" bundle="serviziLabels" />
					</html:submit>
				</div>
			</c:otherwise>
		</c:choose>
	</div>

	<div style="width:15%; float:left;">
		<c:choose>
			<c:when test="${ErogazioneRicercaForm.folder eq 'SL'}">
				<div class="schedaOn" style="text-align: center;">
					<bean:message key="servizi.bottone.solleciti" bundle="serviziLabels" />
				</div>
			</c:when>
			<c:otherwise>
				<div class="schedaOff" align="center">
					<html:submit style="margin-left:auto; margin-right:auto;" property="methodErogazione" disabled="${ErogazioneRicercaForm.conferma}" styleClass="sintButtonLinkDefault">
						<bean:message key="servizi.bottone.solleciti" bundle="serviziLabels" />
					</html:submit>
				</div>
			</c:otherwise>
		</c:choose>
	</div>

</div>

