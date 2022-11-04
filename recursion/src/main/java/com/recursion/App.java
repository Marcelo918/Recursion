package com.recursion;

import java.util.Scanner;

/**
 * Author: Marcelo Villalobos Diaz
 * Date: November 04, 2022
 * Class: CSIS26 - FA22
 * Description: Program that computes a recursive function x^n.
 * x should be a floating number, n should be an integer and it cannot be negative.
 */
public class App {
    public static void main(String[] args) {
        System.out.print("Please enter the base number: ");

        // scans for the user to input a floating number
        Scanner userInput = new Scanner(System.in);
        float base = userInput.nextFloat();

        // scans again but for a positive whole number now
        System.out.print("Please enter a positive power number: ");
        int n = userInput.nextInt();

        // if n is less than 0 then it will prompt
        // the user to input a new value again
        while (n < 0) {

            System.out.print("Please enter a positive power number: ");
            n = userInput.nextInt();
        }

        float result = power(base, n);

        // prints the result
        System.out.print(base + " ^ " + n + " = ");
        System.out.printf("%.4f%n", result);
        userInput.close();
    }

    // recursive function
    public static float power(float base, int n) {
        if (n != 0) {
            return (base * power(base, n - 1));
        } else {
            return 1;
        }
    }
}
