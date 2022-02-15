package com.misery.algo.problems;

import java.util.Scanner;

// NOT FINISHED
/**
 * {@link Get9} is an algorithm that solves the following problem:
 *
 * {@code }
 */
public class Get9 {
  final int target = 9;

  /**
   * Parses a {@link String} and turns it into an array of integers
   *
   * @param num Number to parse
   * @return An array of integers
   */
  public int[] stringToInt(String num) {
    int[] intArr = new int[num.length()];

    for (int ind = 0; ind < num.length(); ind++) {
      intArr[ind] = Integer.parseInt(String.valueOf(num.charAt(ind)));
    }

    return intArr;
  }

  /**
   * Gets the max of an array of integers
   *
   * @param nums Array of integers to use
   * @return The biggest number in {@code nums}
   */
  public int max(int[] nums) {
    int max = nums[0], curr = 0;

    for (int ind = 0; ind < nums.length; ind++) {
      curr = nums[ind];
      if (max < curr) {
        max = curr;
      }
    }

    return max;
  }

  /**
   * Takes in an array of integers and computes the sum.
   *
   * Passing in [1, 2, 3, 4, 5, 6, 7, 8, 9] would return 45
   *
   * @param nums Array of numbers to calculate
   * @return The sum of {@code nums}
   */
  public int sum(int[] nums) {
    int res = 0;

    for (int ind = 0; ind < nums.length; ind++) {
      res += nums[ind];
    }

    return res;
  }

  /**
   * Decrements a number with the best number to decrement until
   * said number reaches the target
   *
   * @param nums       An array of numbers. The function will pick the best number
   *                   with this
   * @param currentNum The number to decrement
   * @return A number that is or below the target number
   *
   * @see {@link Get9} the target number
   */
  public int reachTargetNumber(int[] nums, int currentNum) {
    int num = nums[0];

    do {
      for (int ind = 0; ind < nums.length; ind++) {
        if (currentNum < this.target) {
          break;
        }
        num = nums[ind];

        currentNum -= num;
      }
    } while (currentNum > this.target);

    return currentNum;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Get9 self = new Get9();

    String num;
    int[] raw;
    int rawSum, res = 0;

    System.out.print("Enter a number: ");
    num = scanner.next();

    raw = self.stringToInt(num);
    rawSum = self.sum(raw);
    res = self.reachTargetNumber(raw, rawSum);

    System.out.println("Answer is: " + res);
    scanner.close();
  }
}
