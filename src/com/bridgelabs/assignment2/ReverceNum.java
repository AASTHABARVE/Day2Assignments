package com.bridgelabs.assignment2;

public class ReverceNum {

    public static void main(String[] args) {

            int number = 231;

            int reversedNumber = 0;

            while (number != 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number=number/10;
            }

            System.out.println("The reversed number is: " + reversedNumber);

        }
    }
