<%@ taglib uri="http://struts.apache.org/tags-html-el" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean-el" prefix="bean"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean-struts"%>
<%@ taglib uri="http://common.web.sbn.iccu.it/sbn" prefix="sbn"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="layout"%>
<table align="center">
      <tr>
       <td align="center">
    <html:submit property="methodDettaglio">
		<bean:message key="servizi.bottone.ok" bundle="serviziLabels" />
	</html:submit>
	<html:submit property="methodDettaglio">
		<bean:message key="servizi.bottone.nuovo" bundle="serviziLabels" />
	</html:submit>
    <html:submit property="methodDettaglio">
	  <bean:message key="servizi.bottone.cancella" bundle="serviziLabels" />
	</html:submit>
    <html:submit property="methodDettaglio">
	  <bean:message key="servizi.bottone.annulla" bundle="serviziLabels" />
	</html:submit>
    <html:submit property="methodDettaglio">
	  <bean:message key="servizi.bottone.tesserino" bundle="serviziLabels" />
	</html:submit>
    <html:submit property="methodDettaglio">
	  <bean:message key="servizi.bottone.impbiblio" bundle="serviziLabels" />
	</html:submit>
        </td>
      </tr>
</table>
