/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 *
 * This is an automatic generated file. It will be regenerated every time
 * you generate persistence class.
 *
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: almaviva
 * License Type: Purchased
 */
package it.finsiel.sbn.polo.orm.viste;

import it.finsiel.sbn.polo.orm.KeyParameter;
import it.finsiel.sbn.polo.orm.Tb_titolo;

import java.io.Serializable;
/**
 * ORM-Persistable Class
 */
public class Ve_grafica_aut_aut extends Tb_titolo implements Serializable {

	private static final long serialVersionUID = -1923953789816762526L;

	public boolean equals(Object aObj) {
		if (aObj == null)
			return false;
		if (!(aObj instanceof Ve_grafica_aut_aut))
			return false;
		Ve_grafica_aut_aut ve_grafica_aut_aut = (Ve_grafica_aut_aut)aObj;
		if (getVID() != null && !getVID().equals(ve_grafica_aut_aut.getVID()))
			return false;
		if (getTP_RESPONSABILITA() != ve_grafica_aut_aut.getTP_RESPONSABILITA())
			return false;
		if (getCD_RELAZIONE() != null && !getCD_RELAZIONE().equals(ve_grafica_aut_aut.getCD_RELAZIONE()))
			return false;
		if (getBID() != null && !getBID().equals(ve_grafica_aut_aut.getBID()))
			return false;
		if (getTP_RESPONSABILITA_F() != ve_grafica_aut_aut.getTP_RESPONSABILITA_F())
			return false;
		if (getCD_RELAZIONE_F() != null && !getCD_RELAZIONE_F().equals(ve_grafica_aut_aut.getCD_RELAZIONE_F()))
			return false;
		if (getVID_F() != null && !getVID_F().equals(ve_grafica_aut_aut.getVID_F()))
			return false;
		return true;
	}

	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + getVID().hashCode();
		hashcode = hashcode + getTP_RESPONSABILITA().hashCode();
		hashcode = hashcode + getCD_RELAZIONE().hashCode();
		hashcode = hashcode + getBID().hashCode();
		hashcode = hashcode + getTP_RESPONSABILITA_F().hashCode();
		hashcode = hashcode + getCD_RELAZIONE_F().hashCode();
		hashcode = hashcode + getVID_F().hashCode();
		return hashcode;
	}

	private String VID;

	private String TP_RESPONSABILITA;

	private String CD_RELAZIONE;

	private String NOTA_TIT_AUT;

	private String FL_INCERTO;

	private String FL_SUPERFLUO;

	private String CD_STRUMENTO_MUS;

	private String CD_LIVELLO_G;

	private String TP_MATERIALE_GRA;

	private String CD_SUPPORTO;

	private String CD_COLORE;

	private String CD_TECNICA_DIS_1;

	private String CD_TECNICA_DIS_2;

	private String CD_TECNICA_DIS_3;

	private String CD_TECNICA_STA_1;

	private String CD_TECNICA_STA_2;

	private String CD_TECNICA_STA_3;

	private String CD_DESIGN_FUNZ;

	private String TP_RESPONSABILITA_F;

	private String CD_RELAZIONE_F;

	private String FL_SUPERFLUO_F;

	private String VID_F;

	private String KY_CAUTUN_F;

	private String KY_AUTEUR_F;

	private String KY_CLES1_A_F;

	private String KY_CLES2_A_F;

	public void setVID(String value) {
		this.VID = value;
    this.settaParametro(KeyParameter.XXXvid,value);
	}

	public String getVID() {
		return VID;
	}

	public void setTP_RESPONSABILITA(String value) {
		this.TP_RESPONSABILITA = value;
    this.settaParametro(KeyParameter.XXXtp_responsabilita,value);
	}

	public String getTP_RESPONSABILITA() {
		return TP_RESPONSABILITA;
	}

	public void setCD_RELAZIONE(String value) {
		this.CD_RELAZIONE = value;
    this.settaParametro(KeyParameter.XXXcd_relazione,value);
	}

	public String getCD_RELAZIONE() {
		return CD_RELAZIONE;
	}

	public void setNOTA_TIT_AUT(String value) {
		this.NOTA_TIT_AUT = value;
    this.settaParametro(KeyParameter.XXXnota_tit_aut,value);
	}

	public String getNOTA_TIT_AUT() {
		return NOTA_TIT_AUT;
	}

	public void setFL_INCERTO(String value) {
		this.FL_INCERTO = value;
    this.settaParametro(KeyParameter.XXXfl_incerto,value);
	}

	public String getFL_INCERTO() {
		return FL_INCERTO;
	}

	public void setFL_SUPERFLUO(String value) {
		this.FL_SUPERFLUO = value;
    this.settaParametro(KeyParameter.XXXfl_superfluo,value);
	}

	public String getFL_SUPERFLUO() {
		return FL_SUPERFLUO;
	}

	public void setCD_STRUMENTO_MUS(String value) {
		this.CD_STRUMENTO_MUS = value;
    this.settaParametro(KeyParameter.XXXcd_strumento_mus,value);
	}

	public String getCD_STRUMENTO_MUS() {
		return CD_STRUMENTO_MUS;
	}

	public void setCD_LIVELLO_G(String value) {
		this.CD_LIVELLO_G = value;
    this.settaParametro(KeyParameter.XXXcd_livello_g,value);
	}

	public String getCD_LIVELLO_G() {
		return CD_LIVELLO_G;
	}

	public void setTP_MATERIALE_GRA(String value) {
		this.TP_MATERIALE_GRA = value;
    this.settaParametro(KeyParameter.XXXtp_materiale_gra,value);
	}

	public String getTP_MATERIALE_GRA() {
		return TP_MATERIALE_GRA;
	}

	public void setCD_SUPPORTO(String value) {
		this.CD_SUPPORTO = value;
    this.settaParametro(KeyParameter.XXXcd_supporto,value);
	}

	public String getCD_SUPPORTO() {
		return CD_SUPPORTO;
	}

	public void setCD_COLORE(String value) {
		this.CD_COLORE = value;
    this.settaParametro(KeyParameter.XXXcd_colore,value);
	}

	public String getCD_COLORE() {
		return CD_COLORE;
	}

	public void setCD_TECNICA_DIS_1(String value) {
		this.CD_TECNICA_DIS_1 = value;
    this.settaParametro(KeyParameter.XXXcd_tecnica_dis_1,value);
	}

	public String getCD_TECNICA_DIS_1() {
		return CD_TECNICA_DIS_1;
	}

	public void setCD_TECNICA_DIS_2(String value) {
		this.CD_TECNICA_DIS_2 = value;
    this.settaParametro(KeyParameter.XXXcd_tecnica_dis_2,value);
	}

	public String getCD_TECNICA_DIS_2() {
		return CD_TECNICA_DIS_2;
	}

	public void setCD_TECNICA_DIS_3(String value) {
		this.CD_TECNICA_DIS_3 = value;
    this.settaParametro(KeyParameter.XXXcd_tecnica_dis_3,value);
	}

	public String getCD_TECNICA_DIS_3() {
		return CD_TECNICA_DIS_3;
	}

	public void setCD_TECNICA_STA_1(String value) {
		this.CD_TECNICA_STA_1 = value;
    this.settaParametro(KeyParameter.XXXcd_tecnica_sta_1,value);
	}

	public String getCD_TECNICA_STA_1() {
		return CD_TECNICA_STA_1;
	}

	public void setCD_TECNICA_STA_2(String value) {
		this.CD_TECNICA_STA_2 = value;
    this.settaParametro(KeyParameter.XXXcd_tecnica_sta_2,value);
	}

	public String getCD_TECNICA_STA_2() {
		return CD_TECNICA_STA_2;
	}

	public void setCD_TECNICA_STA_3(String value) {
		this.CD_TECNICA_STA_3 = value;
    this.settaParametro(KeyParameter.XXXcd_tecnica_sta_3,value);
	}

	public String getCD_TECNICA_STA_3() {
		return CD_TECNICA_STA_3;
	}

	public void setCD_DESIGN_FUNZ(String value) {
		this.CD_DESIGN_FUNZ = value;
    this.settaParametro(KeyParameter.XXXcd_design_funz,value);
	}

	public String getCD_DESIGN_FUNZ() {
		return CD_DESIGN_FUNZ;
	}

	public void setTP_RESPONSABILITA_F(String value) {
		this.TP_RESPONSABILITA_F = value;
    this.settaParametro(KeyParameter.XXXtp_responsabilita_f,value);
	}

	public String getTP_RESPONSABILITA_F() {
		return TP_RESPONSABILITA_F;
	}

	public void setCD_RELAZIONE_F(String value) {
		this.CD_RELAZIONE_F = value;
    this.settaParametro(KeyParameter.XXXcd_relazione_f,value);
	}

	public String getCD_RELAZIONE_F() {
		return CD_RELAZIONE_F;
	}

	public void setFL_SUPERFLUO_F(String value) {
		this.FL_SUPERFLUO_F = value;
    this.settaParametro(KeyParameter.XXXfl_superfluo_f,value);
	}

	public String getFL_SUPERFLUO_F() {
		return FL_SUPERFLUO_F;
	}

	public void setVID_F(String value) {
		this.VID_F = value;
    this.settaParametro(KeyParameter.XXXvid_f,value);
	}

	public String getVID_F() {
		return VID_F;
	}

	public void setKY_CAUTUN_F(String value) {
		this.KY_CAUTUN_F = value;
    this.settaParametro(KeyParameter.XXXky_cautun_f,value);
	}

	public String getKY_CAUTUN_F() {
		return KY_CAUTUN_F;
	}

	public void setKY_AUTEUR_F(String value) {
		this.KY_AUTEUR_F = value;
    this.settaParametro(KeyParameter.XXXky_auteur_f,value);
	}

	public String getKY_AUTEUR_F() {
		return KY_AUTEUR_F;
	}

	public void setKY_CLES1_A_F(String value) {
		this.KY_CLES1_A_F = value;
    this.settaParametro(KeyParameter.XXXky_cles1_a_f,value);
	}

	public String getKY_CLES1_A_F() {
		return KY_CLES1_A_F;
	}

	public void setKY_CLES2_A_F(String value) {
		this.KY_CLES2_A_F = value;
    this.settaParametro(KeyParameter.XXXky_cles2_a_f,value);
	}


 public String getKY_CLES2_A_F() {
		return KY_CLES2_A_F;
	}

	public String toString() {
		return String.valueOf(getVID() + " " + getTP_RESPONSABILITA() + " " + getCD_RELAZIONE() + " " + getBID() + " " + getTP_RESPONSABILITA_F() + " " + getCD_RELAZIONE_F() + " " + getVID_F());
	}

}
