package com.nhs.snippets;

import java.util.Arrays;

/**
 * @author srahman
 * 
 *         Class has a snippet that throws ArrayIndexOutOfBoundsException.
 *
 */
public class ArrayIndexOOBExceptionDemo {


  /**
   * This method tries to print an element at indes 8 where the array has only 6 elements. Throws
   * ArrayIndexOutOfBoundsException, caught and printed stacktrace.
   */
  public static void showDemo() {

    System.out.println("Array Index Out Of Bounds Exception Demo : ");
    System.out.println("========================================");
    int[] intArray = { 0, 2, 4, 6, 8, 10 };

    System.out.println("Array elemets are : ");
    System.out.println(Arrays.toString(intArray));

    try {
      System.out.println("Element at index 8 : " + intArray[8]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Please enter valid index between 0 and " + (intArray.length - 1));
      e.printStackTrace();
    }
    System.out.println("========================================\n ");
  }

}

