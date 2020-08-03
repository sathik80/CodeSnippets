/*******************************************************************************
 *  Copyright 2020 - Amadeus Development Company S.A. Copyright of this program
 *  is the property of AMADEUS, without whose written permission reproduction in
 *  whole or in part is prohibited. All rights reserved. Amadeus development
 *  company S.A. B.P. 69 06902 SOPHIA ANTIPOLIS CEDEX http://www.amadeus.net
 *
 *******************************************************************************
 * Last Version Identification:
 * ReplaceWhiteSpaces.java,v 1.0  1 Aug 2020   23:15:40    Last modified by: srahman
 *******************************************************************************/
package com.nhs.snippets;

import java.util.Scanner;

/**
 * @author srahman
 *
 *         This class has a code snippet that replaces the white spaces using regex.
 */
public class ReplaceWhiteSpaces {

  private static final String DEFAULT_STRING = "National Institute For Cardiovascular Outcomes Research";
  private static final String WHITE_SPACE_REGEX = "\\s+";
  private static final String EMPTY_STRING = "";

  /**
   * Replace white spaces in the given string using regex.
   * 
   * @return String
   */
  private static String replaceWhiteSpaces(String arg) {
    return arg.replaceAll(WHITE_SPACE_REGEX, EMPTY_STRING);
  }

  /**
   * Replace white spaces from Default String.
   */
  public static void replaceWhiteSpaceFromDefaultString() {
    System.out.println("Replace White Spaces Demo : ");
    System.out.println("========================================");
    System.out.println("String to replace white spaces from :" + DEFAULT_STRING);
    System.out.println("Whitespaces Replaced String value is  :" + replaceWhiteSpaces(DEFAULT_STRING));
    System.out.println("========================================\n ");
  }

  /**
   * Replaces the whte spaces in a given string, uses Default String otherwise.
   */
  public static void replaceWhitespacesFromGivenInput() {
    System.out.println("Please enter the String to replace all the white spaces :");
    Scanner sc = new Scanner(System.in); // creates instance of Scanner to read from console
    String arg = sc.nextLine().trim(); // read string
    sc.close();

    // No input given, removing the white space from DEFAULT_STRING
    if (arg.length() <= 0) {
      System.out.println("No input given." + System.getProperty("line.separator") + "Using the default value : " + DEFAULT_STRING);
      arg = DEFAULT_STRING;
    }
    System.out.println("Whitespaces Replaced String value is  :" + replaceWhiteSpaces(arg));

  }



}

