/*
 * Generated by XDoclet - Do not edit!
 */
package it.iccu.sbn.ejb.domain.bibliografica;

/**
 * Home interface for Profiler.
 * @generated
 * @wtp generated
 */
public interface ProfilerHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/Profiler";
   public static final String JNDI_NAME="sbnWeb/Profiler";

   public it.iccu.sbn.ejb.domain.bibliografica.Profiler create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
