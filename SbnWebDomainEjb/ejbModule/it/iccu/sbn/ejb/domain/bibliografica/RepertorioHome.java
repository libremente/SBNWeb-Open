/*
 * Generated by XDoclet - Do not edit!
 */
package it.iccu.sbn.ejb.domain.bibliografica;

/**
 * Home interface for Repertorio.
 * @generated
 * @wtp generated
 */
public interface RepertorioHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/Repertorio";
   public static final String JNDI_NAME="sbnWeb/Repertorio";

   public it.iccu.sbn.ejb.domain.bibliografica.Repertorio create()
      throws javax.naming.NamingException,javax.ejb.CreateException,java.rmi.RemoteException;

}