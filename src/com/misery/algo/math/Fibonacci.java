package com.misery.algo.math;

import java.util.Scanner;

public class Fibonacci {
  public static int fibonacci(int num) {
    if (num == 0 | num == 1) {
      return num;
    } else {
      return fibonacci(num - 1) + fibonacci(num - 2);
    }
  }

  public static void main(String[] args) {
    // Code Translated and refactored from C++ to Java by Misery
    int num, iterations = 0;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of terms: ");
    num = scanner.nextInt();
    System.out.println("First " + num + " terms of the Fibonacci series are the following:");

    for (int i = 1; i <= num; i++) {
      System.out.println(fibonacci(iterations));
      iterations++;
    }

    scanner.close();
  }
}
