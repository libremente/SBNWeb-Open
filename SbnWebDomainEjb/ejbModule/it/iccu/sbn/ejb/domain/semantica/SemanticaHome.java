/*
 * Generated by XDoclet - Do not edit!
 */
package it.iccu.sbn.ejb.domain.semantica;

/**
 * Home interface for Semantica.
 * @generated
 * @wtp generated
 */
public interface SemanticaHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/Semantica";
   public static final String JNDI_NAME="sbnWeb/Semantica";

   public it.iccu.sbn.ejb.domain.semantica.Semantica create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
