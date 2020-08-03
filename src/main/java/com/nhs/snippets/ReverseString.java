/*******************************************************************************
 *  Copyright 2020 - Amadeus Development Company S.A. Copyright of this program
 *  is the property of AMADEUS, without whose written permission reproduction in
 *  whole or in part is prohibited. All rights reserved. Amadeus development
 *  company S.A. B.P. 69 06902 SOPHIA ANTIPOLIS CEDEX http://www.amadeus.net
 *
 *******************************************************************************
 * Last Version Identification:
 * ReverseString.java,v 1.0  1 Aug 2020   23:26:37    Last modified by: srahman
 *******************************************************************************/
package com.nhs.snippets;


/**
 * @author srahman
 *
 *         This class has code snippet to reverse the given String.
 */
public class ReverseString {

  /**
   * Reverses the given string and prints it.
   * 
   * @param str
   */
  public static void reverseString(String str) {
    System.out.println("Reverse String Demo : ");
    System.out.println("========================================");
    System.out.println("String reversed ::" + new StringBuilder(str).reverse().toString());
    System.out.println("========================================\n ");
  }

}

