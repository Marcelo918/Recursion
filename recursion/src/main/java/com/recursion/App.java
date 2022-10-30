package com.recursion;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        boolean isRunning = true;

        System.out.print("Please enter the base number: ");

        Scanner userInput = new Scanner(System.in);
        float base = userInput.nextFloat();

        System.out.print("Please enter a positive power number: ");
        int n = userInput.nextInt();

        while(n <= 0) {

            System.out.print("Please enter a positive power number: ");
            n  = userInput.nextInt();
        }

        float result = power(base, n);

        System.out.println(base + "^" + n + "=" + result);
        userInput.close();
    }

    public static float power(float base, int n) {
        if (n != 0) {
            return (base * power(base, n - 1));
        }
        else {
            return 1;
        }
    }
}
