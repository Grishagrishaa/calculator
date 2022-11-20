package org.example.calculator;

import org.example.calculator.service.ArabicCalcs;
import org.example.calculator.service.Calculation;
import org.example.calculator.service.RomanCalcs;
import org.example.calculator.util.NumberIdentifier;

import java.util.Arrays;
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculation calculator;
        Scanner scn = new Scanner(System.in);
        try{
            String[] expression = scn.nextLine().split(" ");

            String operator = expression[1];
            String[] operands = {expression[0], expression[2]};

            if(isArabicOperands(operands)){
                calculator = new ArabicCalcs();
            }else if(isRomanOperands(operands)){
                calculator = new RomanCalcs();
            }else {
                throw new IllegalArgumentException();
            }

            switch (operator){
                case "+":
                    System.out.println(calculator.addition(operands[0], operands[1]));
                    break;
                case "-":
                    System.out.println(calculator.subtraction(operands[0], operands[1]));
                    break;
                case "*":
                    System.out.println(calculator.multiplication(operands[0], operands[1]));
                    break;
                case "/":
                    System.out.println(calculator.division(operands[0], operands[1]));
                    break;
                default: throw new IllegalArgumentException("Неверный формат чисел");
            }

//            System.out.println(operator);
//            System.out.println(Arrays.toString(operands));
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e){
            System.out.println("Invalid Input");
        }
    }

    private static boolean isArabicOperands(String[] operands) {
        return Arrays.stream(operands)
                .allMatch(NumberIdentifier::isArabicNumber);
    }

    private static boolean isRomanOperands(String[] operands) {
        return Arrays.stream(operands)
                .allMatch(NumberIdentifier::isRomanNumber);
    }

}
