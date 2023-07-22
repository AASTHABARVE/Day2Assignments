package com.bridgelabs.assignment2;

public class PalinedromeNumber {
    public static void main(String[] args) {

            int number = 121;

            int originalNumber = number;
            int reversedNumber = 0;

            for (; number != 0; number /= 10) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
            }

            if (originalNumber == reversedNumber) {
                System.out.println(originalNumber + " is a palindrome number.");
            } else {
                System.out.println(originalNumber + " is not a palindrome number.");
            }

        }
    }