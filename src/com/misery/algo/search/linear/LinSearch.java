package com.misery.algo.search.linear;

import java.util.Scanner;

class LinSearch {
  public int linearSearch(int[] nums, int target) {
    int ind = -1;

    for (ind = 0; ind < nums.length; ind++) {
      if (nums[ind] == target) {
        break;
      }
    }

    return ind == -1 ? -1 : ind + 1;
  }

  public static void main(String args[]) {
    int counter, elCount, target, intArr[], coords;
    LinSearch self = new LinSearch();

    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Enter number of elements:");
      elCount = input.nextInt();
      intArr = new int[elCount];

      System.out.println("Enter " + elCount + " integers");
      for (counter = 0; counter < elCount; counter++) {
        intArr[counter] = input.nextInt();
      }

      System.out.println("Enter the search value:");
      target = input.nextInt();

      coords = self.linearSearch(intArr, target);

      if (coords == -1) {
        System.out.println(target + " doesn't exist in array.");
      } else {
        System.out.println(target + " found on the array");
      }
    }
  }
}
