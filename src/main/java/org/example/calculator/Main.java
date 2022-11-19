package org.example.calculator;

import org.example.calculator.util.NumberIdentifier;

public class Main {
    public static void main(String[] args) {
        String testCase1 = "1";
        String testCase2 = "I";
        String testCase3 = "1I";

        System.out.printf("testCase1 %s \n", testCase1 );
        System.out.printf("RomanTest %s \n", NumberIdentifier.isRomanNumber(testCase1));
        System.out.printf("ArabicTest %s \n", NumberIdentifier.isArabicNumber(testCase1));

        System.out.printf("testCase2 %s \n", testCase2 );
        System.out.printf("RomanTest %s \n", NumberIdentifier.isRomanNumber(testCase2));
        System.out.printf("ArabicTest %s \n", NumberIdentifier.isArabicNumber(testCase2));

        System.out.printf("testCase3 %s \n", testCase3 );
        System.out.printf("RomanTest %s \n", NumberIdentifier.isRomanNumber(testCase3));
        System.out.printf("ArabicTest %s \n", NumberIdentifier.isArabicNumber(testCase3));
    }
}
