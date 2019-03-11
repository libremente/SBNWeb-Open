/* Generated By:JavaCC: Do not edit this line. CharStream.java Version 0.7pre6 */

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
 * Copyright 2000 (C) Intalio Inc. All Rights Reserved.
 *
 * $Id: CharStream.java,v 1.1 2011/04/13 14:25:01 almaviva5 Exp $
 */

package org.exolab.castor.xml.dtd.parser;

/**
 * This interface describes a character stream that maintains line and
 * column number positions of the characters.  It also has the capability
 * to backup the stream to some extent.  An implementation of this
 * interface is used in the TokenManager implementation generated by
 * JavaCCParser.
 * <p>
 * All the methods except backup can be implemented in any fashion. backup
 * needs to be implemented correctly for the correct operation of the lexer.
 * Rest of the methods are all used to get information like line number,
 * column number and the String that constitutes a token and are not used
 * by the lexer. Hence their implementation won't affect the generated lexer's
 * operation.
 *
 * @author Generated automatically by <b>JavaCC</b>
 * @version Version 0.7pre6
 */
abstract public interface CharStream {

  /**
   * Returns the next character from the selected input.  The method
   * of selecting the input is the responsibility of the class
   * implementing this interface.  Can throw any java.io.IOException.
   */
  abstract public char readChar() throws java.io.IOException;

  /**
   * Returns the column position of the character last read.
   * @deprecated
   * @see #getEndColumn
   */
  abstract public int getColumn();

  /**
   * Returns the line number of the character last read.
   * @deprecated
   * @see #getEndLine
   */
  abstract public int getLine();

  /**
   * Returns the column number of the last character for current token (being
   * matched after the last call to BeginTOken).
   */
  abstract public int getEndColumn();

  /**
   * Returns the line number of the last character for current token (being
   * matched after the last call to BeginTOken).
   */
  abstract public int getEndLine();

  /**
   * Returns the column number of the first character for current token (being
   * matched after the last call to BeginTOken).
   */
  abstract public int getBeginColumn();

  /**
   * Returns the line number of the first character for current token (being
   * matched after the last call to BeginTOken).
   */
  abstract public int getBeginLine();

  /**
   * Backs up the input stream by amount steps. Lexer calls this method if it
   * had already read some characters, but could not use them to match a
   * (longer) token. So, they will be used again as the prefix of the next
   * token and it is the implemetation's responsibility to do this right.
   */
  abstract public void backup(int amount);

  /**
   * Returns the next character that marks the beginning of the next token.
   * All characters must remain in the buffer between two successive calls
   * to this method to implement backup correctly.
   */
  abstract public char BeginToken() throws java.io.IOException;

  /**
   * Returns a string made up of characters from the marked token beginning
   * to the current buffer position. Implementations have the choice of returning
   * anything that they want to. For example, for efficiency, one might decide
   * to just return null, which is a valid implementation.
   */
  abstract public String GetImage();

  /**
   * Returns an array of characters that make up the suffix of length 'len' for
   * the currently matched token. This is used to build up the matched string
   * for use in actions in the case of MORE. A simple and inefficient
   * implementation of this is as follows :
   * <pre>
   *   {
   *      String t = GetImage();
   *      return t.substring(t.length() - len, t.length()).toCharArray();
   *   }
   * </pre>
   */
  abstract public char[] GetSuffix(int len);

  /**
   * The lexer calls this function to indicate that it is done with the stream
   * and hence implementations can free any resources held by this class.
   * Again, the body of this function can be just empty and it will not
   * affect the lexer's operation.
   */
  abstract public void Done();

}
