/*
 * Generated by XDoclet - Do not edit!
 */
package it.iccu.sbn.ejb.domain.bibliografica;

import it.iccu.sbn.command.CommandInvokeVO;
import it.iccu.sbn.command.CommandResultVO;
import it.iccu.sbn.ejb.dao.DAOException;
import it.iccu.sbn.ejb.exception.ApplicationException;
import it.iccu.sbn.ejb.exception.DataException;
import it.iccu.sbn.ejb.exception.ValidationException;
import it.iccu.sbn.ejb.vo.elaborazioniDifferite.AllineaVO;
import it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiPropostaDiCorrezioneVO;
import it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiVariazionePropostaDiCorrezioneVO;
import it.iccu.sbn.ejb.vo.gestionebibliografica.AreaParametriStampaSchedeVo;
import it.iccu.sbn.ejb.vo.gestionebibliografica.altre.AreaDatiVariazioneLuogoVO;
import it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiScambiaResponsLegameTitAutVO;
import it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.CatturaMassivaBatchVO;
import it.iccu.sbn.ejb.vo.gestionestampe.StampaTitoliEditoreVO;
import it.iccu.sbn.servizi.batch.BatchLogWriter;

import java.rmi.RemoteException;

/**
 * Remote interface for Interrogazione.
 * @generated
 * @wtp generated
 */
public interface Interrogazione
   extends javax.ejb.EJBObject
{
   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiPassaggioGetIdSbnVO getIdSbn( it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiPassaggioGetIdSbnVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.common.AreaDatiAccorpamentoReturnVO richiestaAccorpamento( it.iccu.sbn.ejb.vo.common.AreaDatiAccorpamentoVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.common.AreaDatiAccorpamentoReturnVO richiestaSpostamentoLegami( it.iccu.sbn.ejb.vo.common.AreaDatiAccorpamentoVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloReturnVO cercaLocalizzazioni( it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiLocalizzazioniAuthorityVO areaDatiPass,boolean soloPresenzaPolo,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiVariazioneReturnVO localizzaAuthorityMultipla( it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiLocalizzazioniAuthorityMultiplaVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiVariazioneReturnVO localizzaUnicoXML( it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiLocalizzazioniAuthorityMultiplaVO areaDatiPass,java.lang.String ticket )
   throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiVariazioneReturnVO localizzaAuthority( it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiLocalizzazioniAuthorityVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiPassaggioCancAuthorityVO cancellaAuthority( it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiPassaggioCancAuthorityVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiVariazioneReturnVO catturaReticolo( it.iccu.sbn.ejb.vo.gestionebibliografica.AreaTabellaOggettiDaCatturareVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiVariazioneReturnVO catturaAutore( it.iccu.sbn.ejb.vo.gestionebibliografica.AreaTabellaOggettiDaCatturareVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiVariazioneReturnVO catturaMarca( it.iccu.sbn.ejb.vo.gestionebibliografica.AreaTabellaOggettiDaCatturareVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;


   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiVariazioneReturnVO catturaLuogo( it.iccu.sbn.ejb.vo.gestionebibliografica.AreaTabellaOggettiDaCatturareVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiVariazioneReturnVO scatturaReticolo( it.iccu.sbn.ejb.vo.gestionebibliografica.AreaTabellaOggettiDaCatturareVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiVariazioneReturnVO inserisciReticoloCatturato( it.iccu.sbn.ejb.vo.gestionebibliografica.AreaTabellaOggettiDaCatturareVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaTabellaOggettiDaCondividereVO ricercaDocumentoPerCondividi( it.iccu.sbn.ejb.vo.gestionebibliografica.AreaTabellaOggettiDaCondividereVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaTabellaOggettiDaCondividereVO ricercaAutorePerCondividi( it.iccu.sbn.ejb.vo.gestionebibliografica.AreaTabellaOggettiDaCondividereVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;


   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloReturnVO ricercaTitoli( it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;





   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiImportSuPoloVO trattamentoAutore( it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiImportSuPoloVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;
   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiImportSuPoloVO trattamentoTitCollegati4xx( it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiImportSuPoloVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiImportSuPoloVO trattamentoTitCollegati5xx( it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiImportSuPoloVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiImportSuPoloVO trattamentoSogClaCollegati6xx( it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiImportSuPoloVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiImportSuPoloVO trattamentoDocumento( it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiImportSuPoloVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiImportSuPoloVO trattamentoDocumentoInferiore( it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiImportSuPoloVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;


   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiImportSuPoloVO trattamentoLegamiDocumento( it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiImportSuPoloVO areaDatiPass,java.lang.String livelloGerarchiche,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;


   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioElenchiListeConfrontoVO getElenchiListeConfronto( it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioElenchiListeConfrontoVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioSchedaDocCiclicaVO getSchedaDocCiclica( it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioSchedaDocCiclicaVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioSchedaDocCiclicaVO insertTbReportIndice( it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioSchedaDocCiclicaVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   public it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioSchedaDocCiclicaVO cancellaTabelleTbReportIndice( it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioSchedaDocCiclicaVO areaDatiPass,java.lang.String ticket )
   throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;



	// Modifica almaviva2 04.08.2010 - Gestione periodici nuovo servizio per ricavare, dato un bid,  tutti i legami
	// fra periodici sia verso l'alto che verso il basso
   public it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloReturnVO ricercaLegamiFraPeriodici( it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloVO areaDatiPass,java.lang.String ticket )
   throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;


   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloReturnVO ricercaTitoliPerGestionali( it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloAnaliticaReturnVO creaRichiestaAnaliticoTitoliPerBID( it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloAnaliticaVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloReturnVO getNextBloccoTitoli( it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloNextBloccoVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiVariazioneReturnVO inserisciTitolo( it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiVariazioneTitoloVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiVariazioneReturnVO inserisciLegameTitolo( it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiLegameTitoloVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiVariazioneReturnVO trascinaLegameAutore( it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiLegameTitoloVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;


   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiVariazioneReturnVO scambiaResponsabilitaLegameTitoloAutore( AreaDatiScambiaResponsLegameTitAutVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;


   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloReturnVO ricercaAutori( it.iccu.sbn.ejb.vo.gestionebibliografica.autore.AreaDatiPassaggioInterrogazioneAutoreVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloAnaliticaReturnVO creaRichiestaAnaliticoAutorePerVid( it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloAnaliticaVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloReturnVO getNextBloccoAutori( it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloNextBloccoVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiVariazioneReturnVO inserisciAutore( it.iccu.sbn.ejb.vo.gestionebibliografica.autore.AreaDatiVariazioneAutoreVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloReturnVO ricercaAutoriCollegati( it.iccu.sbn.ejb.vo.gestionebibliografica.autore.AreaDatiPassaggioInterrogazioneAutoreVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiVariazioneReturnVO collegaElementoAuthority( it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiLegameTitoloVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiVariazioneReturnVO creaFormaRinvio( it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiLegameTitoloVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiVariazioneReturnVO scambiaForma( it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiLegameTitoloVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloReturnVO ricercaMarche( it.iccu.sbn.ejb.vo.gestionebibliografica.marca.AreaDatiPassaggioInterrogazioneMarcaVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloAnaliticaReturnVO creaRichiestaAnaliticoMarchePerMid( it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloAnaliticaVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloReturnVO getNextBloccoMarche( it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloNextBloccoVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiVariazioneReturnVO inserisciMarca( it.iccu.sbn.ejb.vo.gestionebibliografica.marca.AreaDatiVariazioneMarcaVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloReturnVO ricercaMarcheCollegate( it.iccu.sbn.ejb.vo.gestionebibliografica.marca.AreaDatiPassaggioInterrogazioneMarcaVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloReturnVO ricercaLuoghi( it.iccu.sbn.ejb.vo.gestionebibliografica.altre.AreaDatiPassaggioInterrogazioneLuogoVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloReturnVO getNextBloccoLuoghi( it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloNextBloccoVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloAnaliticaReturnVO creaRichiestaAnaliticoLuoghiPerLid( it.iccu.sbn.ejb.vo.gestionebibliografica.titolo.AreaDatiPassaggioInterrogazioneTitoloAnaliticaVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiVariazioneReturnVO inserisciLuogo( AreaDatiVariazioneLuogoVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.elaborazioniDifferite.AllineaVO richiediListaAllineamenti( AllineaVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public  it.iccu.sbn.ejb.vo.elaborazioniDifferite.AllineaVO allineaBaseLocale( AllineaVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.elaborazioniDifferite.AllineaVO allineamentoRepertoriDaIndice(java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiPropostaDiCorrezioneVO cercaPropostaDiCorrezione( AreaDatiPropostaDiCorrezioneVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;


   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaDatiVariazionePropostaDiCorrezioneVO inserisciPropostaDiCorrezione( AreaDatiVariazionePropostaDiCorrezioneVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;


   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionebibliografica.AreaParametriStampaSchedeVo schedulatorePassiStampaSchede( AreaParametriStampaSchedeVo areaDatiPass,java.lang.String ticket, BatchLogWriter logger )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;


   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public CatturaMassivaBatchVO catturaMassivaBatch( CatturaMassivaBatchVO areaDatiPass,java.lang.String ticket )
      throws it.iccu.sbn.ejb.dao.DAOException, java.rmi.RemoteException;

   /**
    * <!-- begin-xdoclet-definition -->
    * @throws DAOException
    * @generated //TODO: Must provide implementation for bean create stub    */
   public it.iccu.sbn.ejb.vo.gestionestampe.StampaTitoliEditoreVO getTitoliEditoreXls(StampaTitoliEditoreVO stampaTEVO, String ticket, BatchLogWriter batchLog)
	throws DataException, ApplicationException, ValidationException, java.rmi.RemoteException ;

   public CommandResultVO invoke(CommandInvokeVO command) throws RemoteException, ApplicationException;

}
