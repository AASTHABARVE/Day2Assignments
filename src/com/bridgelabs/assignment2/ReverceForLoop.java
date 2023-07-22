package com.bridgelabs.assignment2;

public class ReverceForLoop {
    public static void main(String args[]) {
        int number = 231;
        int reversedNumber = 0;
        for (reversedNumber = 0; number != 0; number /= 10) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }
        System.out.println("The reversed number is: " + reversedNumber);
    }
}