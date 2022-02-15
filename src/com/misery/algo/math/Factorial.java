package com.misery.algo.math;

import java.util.Formatter;
import java.util.Scanner;

/**
 * Contains a recursive and non-recursive implementations of a factorial
 * function written in java
 *
 * @author Misery
 */
public class Factorial {
  public static String format(String inputString, Object... argsObjects) {
    Formatter formatter = new Formatter();
    String res = formatter.format(inputString, argsObjects).toString();
    formatter.close();

    return res;
  }

  /**
   * Uses recursion to find the factorial of {@code num}
   *
   * @param num number to factorial
   * @return {@code num}!
   */
  public static int factorial(int num) {
    // I HATH CONVERTED THE FUNCTION INTO A MERE ONE-LINER
    // THEREFORE, I AM GOD
    // jk
    return num <= 1 ? 1 : num * factorial(num - 1);
  }

  /**
   * Interface to a recursive implementation of factorial
   */
  public void recursive() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Recursive Factorial");
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    int res = factorial(num);

    System.out.println(format("%s! is %s", num, res));
    scanner.close();
  }

  /**
   * Interface to a non-recursive implementation of factorial
   */
  public void nonRecursive() {
    Scanner scanner = new Scanner(System.in);
    int num, factorial;

    System.out.println("Non-Recursive Factorial");
    System.out.print("Enter Number: ");
    num = scanner.nextInt();

    factorial = num;
    for (int i = num - 1; i > 1; i--) {
      factorial *= i;
    }

    System.out.println(num + " factorial is " + factorial);
    scanner.close();
  }

  public static void main(String[] args) {
    boolean selecting = true;
    Scanner scanner = new Scanner(System.in);
    Factorial self = new Factorial();

    while (selecting) {
      System.out.print("Use the Recursive or the Naive implementation? ");

      switch (scanner.next()) {
        case "recursive":
          self.recursive();
          selecting = false;
          break;
        case "naive":
          self.nonRecursive();
          selecting = false;
          break;
        default:
          System.out.println("Invalid Choice");
          break;
      }
    }
    scanner.close();
  }
}
