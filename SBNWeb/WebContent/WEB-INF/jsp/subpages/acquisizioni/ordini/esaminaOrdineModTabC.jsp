<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://struts.apache.org/tags-html-el" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean-el" prefix="bean"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean-struts"%>
<%@ taglib uri="http://common.web.sbn.iccu.it/sbn" prefix="sbn"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="layout"%>


		  <!-- TABELLA DI TAG: da eliminare integralmente se non presenti -->
			<table width="100%"  border="0" cellpadding="0" cellspacing="0">
              <tr>
						<td style="width: auto;" class="schedaOff">
							<div align="center">
								<bean:message  key="ordine.label.acquisto" bundle="acquisizioniLabels" />
					        </div>
						</td>
						<td style="width: auto;" class="schedaOff">
							<div align="center">
								<bean:message  key="ordine.label.depositoLegale" bundle="acquisizioniLabels" />
				            </div>
						</td>
						<td style="width: auto;" class="schedaOff">
							<div align="center">
								<bean:message  key="ordine.label.dono" bundle="acquisizioniLabels" />
				            </div>
						</td>
						<td style="width: auto;" class="schedaOff">
							<div align="center">
								<bean:message  key="ordine.label.visioneTrattenuta" bundle="acquisizioniLabels" />
				            </div>
						</td>
						<td style="width: auto; height: 40px;"  class="schedaOn">
							<div align="center">
								<bean:message  key="ordine.label.cambio" bundle="acquisizioniLabels" />
				            </div>
						</td>
						<td style="width: auto;" class="schedaOff">
							<div align="center">
								<bean:message  key="ordine.label.rilegatura" bundle="acquisizioniLabels" />
				            </div>
						</td>


               <!-- COLONNA TAG RESIDUO: specificare la percentuale del WIDTH con un valore numerico o con auto PER LE PAGINE CON POCHI TAG -->
<!--			   <td style="width: auto;" class="tagDxBottomFinale">&nbsp;</td>-->
               <!-- FINE TAG RESIDUO -->

               <!-- FINE TAG -->
            	 </tr>
           		 </table>
