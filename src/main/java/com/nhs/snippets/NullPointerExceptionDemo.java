/*******************************************************************************
 *  Copyright 2020 - Amadeus Development Company S.A. Copyright of this program
 *  is the property of AMADEUS, without whose written permission reproduction in
 *  whole or in part is prohibited. All rights reserved. Amadeus development
 *  company S.A. B.P. 69 06902 SOPHIA ANTIPOLIS CEDEX http://www.amadeus.net
 *
 *******************************************************************************
 * Last Version Identification:
 * NullPointerExceptionDemo.java,v 1.0  1 Aug 2020   23:25:13    Last modified by: srahman
 *******************************************************************************/
package com.nhs.snippets;


/**
 * @author srahman
 *
 *         THis class has a snippet that throws null pointer exception.
 */
public class NullPointerExceptionDemo {

  /**
   * This method tries to print length of a null string that throws NullPointerException. Caught and
   * printed stacktrace.
   */
  public static void nullPointerExceptionDemo() {
    System.out.println("Null Pointer Exception Demo : ");
    System.out.println("========================================");
    System.out.println(" String s= null;");
    System.out.println(" print s.length() will throw NullPointerException");

    String s = null;
    try {
      System.out.println(s.length());
    } catch (NullPointerException np) {
      np.printStackTrace();
    }
    System.out.println("========================================\n ");
  }

}

