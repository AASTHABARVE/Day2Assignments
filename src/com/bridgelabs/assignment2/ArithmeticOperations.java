package com.bridgelabs.assignment2;
import java.util.Scanner;

public class ArithmeticOperations {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input the numbers
            System.out.print("Enter the first number: ");
            double a = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double b = scanner.nextDouble();
            System.out.print("Enter the third number: ");
            double c = scanner.nextDouble();
            scanner.close();

            // Arithmetic Operations
           // double c = a + b * c;
            double result1 = a + b * c;
            double result2 = c + a / b;
            double result3 = a % b + c;
            double result4 = a * b + c;

            // Find the maximum and minimum values
            double max = Math.max(Math.max(result1, result2), Math.max(result3, result4));
            double min = Math.min(Math.min(result1, result2), Math.min(result3, result4));

            // Output the results
            System.out.println("Result 1: " + result1);
            System.out.println("Result 2: " + result2);
            System.out.println("Result 3: " + result3);
            System.out.println("Result 4: " + result4);
            System.out.println("Maximum: " + max);
            System.out.println("Minimum: " + min);
        }
    }
