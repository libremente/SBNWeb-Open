/**
 * Redistribution and use of this software and associated documentation
 * ("Software"), with or without modification, are permitted provided
 * that the following conditions are met:
 *
 * 1. Redistributions of source code must retain copyright
 *    statements and notices.  Redistributions must also contain a
 *    copy of this document.
 *
 * 2. Redistributions in binary form must reproduce the
 *    above copyright notice, this list of conditions and the
 *    following disclaimer in the documentation and/or other
 *    materials provided with the distribution.
 *
 * 3. The name "Exolab" must not be used to endorse or promote
 *    products derived from this Software without prior written
 *    permission of Intalio, Inc.  For written permission,
 *    please contact info@exolab.org.
 *
 * 4. Products derived from this Software may not be called "Exolab"
 *    nor may "Exolab" appear in their names without prior written
 *    permission of Intalio, Inc. Exolab is a registered
 *    trademark of Intalio, Inc.
 *
 * 5. Due credit should be given to the Exolab Project
 *    (http://www.exolab.org/).
 *
 * THIS SOFTWARE IS PROVIDED BY INTALIO, INC. AND CONTRIBUTORS
 * ``AS IS'' AND ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT
 * NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL
 * INTALIO, INC. OR ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * Copyright 2000-2004 (C) Intalio, Inc. All Rights Reserved.
 *
 * $Id: LocaleDescriptor.java,v 1.1 2011/04/13 14:25:09 almaviva5 Exp $
 */


package org.exolab.castor.xml.descriptors;

import org.exolab.castor.mapping.ClassDescriptor;
import org.exolab.castor.mapping.FieldDescriptor;
import org.exolab.castor.mapping.AccessMode;
import org.exolab.castor.xml.NodeType;
import org.exolab.castor.xml.XMLClassDescriptor;
import org.exolab.castor.xml.XMLFieldDescriptor;
import org.exolab.castor.xml.XMLFieldHandler;
import org.exolab.castor.xml.TypeValidator;
import org.exolab.castor.xml.util.XMLFieldDescriptorImpl;

import java.util.Locale;

/**
 * A ClassDescriptor for java.util.Locale
 *
 * @author <a href="kvisco-at-intalio.com">Keith Visco</a>
 * @version $Revision: 1.1 $ $Date: 2011/04/13 14:25:09 $
 */
public class LocaleDescriptor
    implements XMLClassDescriptor
{


    /**
     * Used for returning no attribute and no element fields
    **/
    private static final XMLFieldDescriptor[] _noFields
        = new XMLFieldDescriptor[0];

    /**
     * The TypeValidator to use for validation of the described class
    **/
    private TypeValidator validator = null;

    /**
     * The name of the XML element.
     */
    private static final String XMLNAME_FOR_CLASS = "locale";

    private static XMLFieldDescriptorImpl _contentDescriptor = null;

    private static XMLFieldDescriptor[] _fields = null;

    //----------------/
    //- Constructors -/
    //----------------/

    public LocaleDescriptor() {
        super();


        if (_fields == null) {


            //-- Create FieldDescriptor for country
            XMLFieldDescriptorImpl fdCountry
                = new XMLFieldDescriptorImpl(String.class, "country", "country",
                    NodeType.Attribute);

            fdCountry.setConstructorArgumentIndex(1);
            fdCountry.setHandler( new XMLFieldHandler() {

                public Object getValue( Object object )
                    throws IllegalStateException
                {
                    return ((java.util.Locale)object).getCountry();
                }

                public void setValue( Object object, Object value)
                    throws IllegalStateException, IllegalArgumentException
                {
                    //-- do nothing, can only be set via constructor
                }
                public Object newInstance( Object parent ) {
                    //-- not applicable
                    return null;
                }
            } );

            //-- Create FieldDescriptor for language
            XMLFieldDescriptorImpl fdLanguage
                = new XMLFieldDescriptorImpl(String.class, "language", "language",
                    NodeType.Attribute);

            fdLanguage.setConstructorArgumentIndex(0);
            fdLanguage.setHandler( new XMLFieldHandler() {


                public Object getValue( Object object )
                    throws IllegalStateException
                {
                    return ((java.util.Locale)object).getLanguage();
                }

                public void setValue( Object object, Object value)
                    throws IllegalStateException, IllegalArgumentException
                {
                    //-- do nothing, can only be set via constructor
                }
                public Object newInstance( Object parent ) {
                    //-- not applicable
                    return null;
                }
            } );

            /*
                //-- Create FieldDescriptor for language
                XMLFieldDescriptorImpl fdVariant
                    = new XMLFieldDescriptorImpl(String.class, "variant", "variant",
                        NodeType.Attribute);

                fdVariant.setConstructorArgumentIndex(2);
                fdVariant.setRequired(false);

                fdVariant.setHandler( new XMLFieldHandler() {

                    public Object getValue( Object object )
                        throws IllegalStateException
                    {
                        String variant = ((Locale)object).getVariant();
                        if ((variant == null) || (variant.length() == 0))
                            return null;

                        return variant;
                    }

                    public void setValue( Object object, Object value)
                        throws IllegalStateException, IllegalArgumentException
                    {
                        //-- do nothing, can only be set via constructor
                    }
                    public Object newInstance( Object parent ) {
                        //-- not applicable
                        return null;
                    }
                } );

                */


            _fields = new XMLFieldDescriptor[2];
            _fields[0] = fdCountry;
            _fields[1] = fdLanguage;
            //_fields[2] = fdVariant;

        }


    } //-- LocaleDescriptor

    //------------------/
    //- Public Methods -/
    //------------------/

    /**
     * Returns the set of XMLFieldDescriptors for all members
     * that should be marshalled as XML attributes.
     * @return an array of XMLFieldDescriptors for all members
     * that should be marshalled as XML attributes.
    **/
    public XMLFieldDescriptor[]  getAttributeDescriptors() {
        return _fields;
    } // getAttributeDescriptors

    /**
     * Returns the XMLFieldDescriptor for the member
     * that should be marshalled as text content.
     * @return the XMLFieldDescriptor for the member
     * that should be marshalled as text content.
    **/
    public XMLFieldDescriptor getContentDescriptor() {
        return _contentDescriptor;
    } // getContentDescriptor

    /**
     * Returns the set of XMLFieldDescriptors for all members
     * that should be marshalled as XML elements.
     * @return an array of XMLFieldDescriptors for all members
     * that should be marshalled as XML elements.
    **/
    public XMLFieldDescriptor[]  getElementDescriptors() {
        return _noFields;
    } // getElementDescriptors

    /**
     * Returns the XML field descriptor matching the given
     * xml name and nodeType. If NodeType is null, then
     * either an AttributeDescriptor, or ElementDescriptor
     * may be returned. Null is returned if no matching
     * descriptor is available.
     *
     * @param name the xml name to match against
     * @param namespace the namespace uri
     * @param nodeType, the NodeType to match against, or null if
     * the node type is not known.
     * @return the matching descriptor, or null if no matching
     * descriptor is available.
     *
    **/
    public XMLFieldDescriptor getFieldDescriptor
        (String name, String namespace, NodeType nodeType)
    {
        return null;

    } //-- getFieldDescriptor

    /**
     * @return the namespace prefix to use when marshalling as XML.
    **/
    public String getNameSpacePrefix() {
        return null;
    } //-- getNameSpacePrefix

    /**
     * @return the namespace URI used when marshalling and unmarshalling as XML.
    **/
    public String getNameSpaceURI() {
        return null;
    } //-- getNameSpaceURI

    /**
     * Returns a specific validator for the class described by
     * this ClassDescriptor. A null value may be returned
     * if no specific validator exists.
     *
     * @return the type validator for the class described by this
     * ClassDescriptor.
    **/
    public TypeValidator getValidator() {
        return validator;
    } //-- getValidator

    /**
     * Returns the XML Name for the Class being described.
     *
     * @return the XML name.
    **/
    public String getXMLName() {
        return XMLNAME_FOR_CLASS;
    } //-- getXMLName

    /**
     * Returns the String representation of this XMLClassDescriptor
     * @return the String representation of this XMLClassDescriptor
    **/
    public String toString() {

        String str = super.toString() +
            "; descriptor for class: " + Locale.class.getName();

        //-- add xml name
        str += "; xml name: " + XMLNAME_FOR_CLASS;

        return str;
    } //-- toString


    //-------------------------------------/
    //- Implementation of ClassDescriptor -/
    //-------------------------------------/

    /**
     * Returns the Java class represented by this descriptor.
     *
     * @return The Java class
     */
    public Class getJavaClass() {
        return Locale.class;
    } //-- getJavaClass


    /**
     * Returns a list of fields represented by this descriptor.
     *
     * @return A list of fields
     */
    public FieldDescriptor[] getFields() {
        return _fields;
    } //-- getFields


    /**
     * Returns the class descriptor of the class extended by this class.
     *
     * @return The extended class descriptor
     */
    public ClassDescriptor getExtends() {
        return null;
    } //-- getExtends


    /**
     * Returns the identity field, null if this class has no identity.
     *
     * @return The identity field
     */
    public FieldDescriptor getIdentity() {
        return null;
    } //-- getIdentity


    /**
     * Returns the access mode specified for this class.
     *
     * @return The access mode
     */
    public AccessMode getAccessMode() {
        return null;
    } //-- getAccessMode


     /**
     * <p>Returns true if the given object represented by this XMLClassDescriptor
     * can accept a member whose name is given.
     * An XMLClassDescriptor can accept a field if it contains a descriptor that matches
     * the given name and if the given object can hold this field (i.e a value is not already set for
     * this field).
     * <p>This is mainly used for container object (that can contains other object), in this particular case
     * the implementation will return null.
     * @param name the xml name of the field to check
     * @param namespace the namespace uri
     * @param object the object represented by this XMLCLassDescriptor
     * @return true if the given object represented by this XMLClassDescriptor
     * can accept a member whose name is given.
     */
    public boolean canAccept(String name, String namespace, Object object) {
         return false;
    }



} //-- class: LocaleDescriptor
