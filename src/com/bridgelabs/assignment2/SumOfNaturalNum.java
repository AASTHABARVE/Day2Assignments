package com.bridgelabs.assignment2;

public class SumOfNaturalNum {
    public static void main(String[] args){
        System.out.println("Sum of natural number");
        int n=5;
        int sum = 0;
        int i = 1;

        while (i<=n) {
            sum = sum+i;
            i++;
        }

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
