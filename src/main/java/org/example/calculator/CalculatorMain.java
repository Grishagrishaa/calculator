package org.example.calculator;

import org.example.calculator.util.NumberIdentifier;

import java.util.Arrays;
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        try{
            Calculation calculator;
            Scanner scn = new Scanner(System.in);

            String[] expression = scn.nextLine().split(" ");

            String operator = expression[1];
            String[] operands = {expression[0], expression[2]};

            if(isArabicOperands(operands)){
                calculator = new ArabicCalcs();
                int[] IntOperands = Arrays.stream(operands).mapToInt(Integer::valueOf).toArray();

                switch (operator){
                    case "+":
                        System.out.println(calculator.addition(IntOperands[0], IntOperands[1]));
                        break;
                    case "-":
                        System.out.println(calculator.subtraction(IntOperands[0], IntOperands[1]));
                        break;
                    case "*":
                        System.out.println(calculator.multiplication(IntOperands[0], IntOperands[1]));
                        break;
                    case "/":
                        System.out.println(calculator.division(IntOperands[0], IntOperands[1]));
                        break;
                    default: throw new IllegalArgumentException("Invalid Operand");
                }
            }else if(isRomanOperands(operands)){

            }

            System.out.println(operator);
            System.out.println(Arrays.toString(operands));
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
