package com.misery.algo.search.binary;

import java.util.Scanner;

class BinSearch {
  /**
   * Searches for a number in an array with the binary search
   * algorithm
   *
   * @deprecated Need to learn how to read this first
   * @param nums
   * @param searchNum
   */
  public void binarySearch(int[] nums, int searchNum) {
    int first, last, middle;
    first = 0;
    last = nums.length - 1;
    middle = (first + last) / 2;

    while (first <= last) {
      if (nums[middle] < searchNum) {
        first = middle + 1;
      } else if (nums[middle] == searchNum) {
        System.out.println(searchNum + " found at location " + (middle + 1));
        break;
      } else {
        last = middle - 1;
      }
      middle = (first + last) / 2;
    }

    if (first > last) {
      System.out.println(searchNum + " is not found.\n");
    }
  }

  public static void main(String args[]) {
    int counter, elCount, searchNum, intArr[];
    try (Scanner scanner = new Scanner(System.in)) {
      BinSearch self = new BinSearch();

      System.out.println("Enter number of elements:");
      elCount = scanner.nextInt();

      intArr = new int[elCount];

      System.out.println("Enter " + elCount + " integers");

      for (counter = 0; counter < elCount; counter++) {
        intArr[counter] = scanner.nextInt();
      }

      System.out.println("Enter the search value:");
      searchNum = scanner.nextInt();

      self.binarySearch(intArr, searchNum);
      scanner.close();
    }
  }
}
