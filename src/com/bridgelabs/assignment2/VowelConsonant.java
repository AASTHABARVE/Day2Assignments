package com.bridgelabs.assignment2;

public class VowelConsonant {
    public static void main(String args[]) {
        char letter = 'a';

        switch (letter) {
            case 'a':
                System.out.println("The letter '" + letter + "' is a vowel");
                break;

            case 'e':
                System.out.println("The letter '" + letter + "' is a vowel");
                break;

            case 'i':
                System.out.println("The letter '" + letter + "' is a vowel");
                break;

            case 'o':
                System.out.println("The letter '" + letter + "' is a vowel");
                break;

            case 'u':
                System.out.println("The letter '" + letter + "' is a vowel");
                break;

            default:
                System.out.println("The letter '" + letter + "' is a consonant");
        }

    }
}