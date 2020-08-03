package com.nhs.launcher;

import com.nhs.snippets.ArrayIndexOOBExceptionDemo;
import com.nhs.snippets.NullPointerExceptionDemo;
import com.nhs.snippets.ReplaceWhiteSpaces;
import com.nhs.snippets.ReverseString;

/**
 * @author srahman
 *
 *         CodeSnippets Class invokes methods from 4 different classes to show 4 different outputs.
 * 
 *         ArrayIndexOOBExceptionDemo.showDemo();
 *         NullPointerExceptionDemo.nullPointerExceptionDemo();
 *         ReverseString.reverseString("NICOR");
 *         ReplaceWhiteSpaces.replaceWhiteSpaceFromDefaultString();
 * 
 */
public class CodeSnippetsLauncher {

  public static void main(String args[]) {

    ArrayIndexOOBExceptionDemo.showDemo();
    NullPointerExceptionDemo.nullPointerExceptionDemo();
    ReverseString.reverseString("NICOR");
    ReplaceWhiteSpaces.replaceWhiteSpaceFromDefaultString();
    // uncomment the below to give standard input for replacing the white spaces
    // ReplaceWhiteSpaces.replaceWhitespacesFromGivenInput();
  }
}
