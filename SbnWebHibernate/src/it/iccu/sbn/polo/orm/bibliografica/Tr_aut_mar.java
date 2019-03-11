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
package it.iccu.sbn.polo.orm.bibliografica;

import java.io.Serializable;
/**
 * COLLEGAMENTI AUTORE MARCHE EDITORIALI
 */
/**
 * ORM-Persistable Class
 */
public class Tr_aut_mar implements Serializable {

	private static final long serialVersionUID = 5537624844100309800L;

	public boolean equals(Object aObj) {
		if (aObj == null)
			return false;
		if (!(aObj instanceof Tr_aut_mar))
			return false;
		Tr_aut_mar tr_aut_mar = (Tr_aut_mar)aObj;
		if (getV() == null)
			return false;
		if (!getV().getORMID().equals(tr_aut_mar.getV().getORMID()))
			return false;
		if (getM() == null)
			return false;
		if (!getM().getORMID().equals(tr_aut_mar.getM().getORMID()))
			return false;
		return true;
	}

	public int hashCode() {
		int hashcode = 0;
		if (getV() != null) {
			hashcode = hashcode + getV().getORMID().hashCode();
		}
		if (getM() != null) {
			hashcode = hashcode + getM().getORMID().hashCode();
		}
		return hashcode;
	}

	private it.iccu.sbn.polo.orm.bibliografica.Tb_autore v;

	private it.iccu.sbn.polo.orm.bibliografica.Tb_marca m;

	private String nota_aut_mar;

	private String ute_ins;

	private java.sql.Timestamp ts_ins;

	private String ute_var;

	private java.sql.Timestamp ts_var;

	private char fl_canc;

	public void setNota_aut_mar(String value) {
		this.nota_aut_mar = value;
	}

	public String getNota_aut_mar() {
		return nota_aut_mar;
	}

	/**
	 * Utente che ha effettuato l'inserimento
	 */
	public void setUte_ins(String value) {
		this.ute_ins = value;
	}

	/**
	 * Utente che ha effettuato l'inserimento
	 */
	public String getUte_ins() {
		return ute_ins;
	}

	/**
	 * Timestamp di inserimento
	 */
	public void setTs_ins(java.sql.Timestamp value) {
		this.ts_ins = value;
	}

	/**
	 * Timestamp di inserimento
	 */
	public java.sql.Timestamp getTs_ins() {
		return ts_ins;
	}

	/**
	 * Utente che ha effettuato la variazione
	 */
	public void setUte_var(String value) {
		this.ute_var = value;
	}

	/**
	 * Utente che ha effettuato la variazione
	 */
	public String getUte_var() {
		return ute_var;
	}

	/**
	 * Timestamp di variazione
	 */
	public void setTs_var(java.sql.Timestamp value) {
		this.ts_var = value;
	}

	/**
	 * Timestamp di variazione
	 */
	public java.sql.Timestamp getTs_var() {
		return ts_var;
	}

	/**
	 * Flag di cancellazione logica
	 */
	public void setFl_canc(char value) {
		this.fl_canc = value;
	}

	/**
	 * Flag di cancellazione logica
	 */
	public char getFl_canc() {
		return fl_canc;
	}

	public void setV(it.iccu.sbn.polo.orm.bibliografica.Tb_autore value) {
		this.v = value;
	}

	public it.iccu.sbn.polo.orm.bibliografica.Tb_autore getV() {
		return v;
	}

	public void setM(it.iccu.sbn.polo.orm.bibliografica.Tb_marca value) {
		this.m = value;
	}

	public it.iccu.sbn.polo.orm.bibliografica.Tb_marca getM() {
		return m;
	}

	public String toString() {
		return String.valueOf(((getV() == null) ? "" : String.valueOf(getV().getORMID())) + " " + ((getM() == null) ? "" : String.valueOf(getM().getORMID())));
	}

	private boolean _saved = false;

	public void onSave() {
		_saved=true;
	}


	public void onLoad() {
		_saved=true;
	}


	public boolean isSaved() {
		return _saved;
	}


}
