package org.example.calculator.service;

import org.example.calculator.operations.api.IOperation;
import org.example.calculator.operations.impl.IOperationAdditionImpl;
import org.example.calculator.operations.impl.IOperationDivisionImpl;
import org.example.calculator.operations.impl.IOperationMultiplicationImpl;
import org.example.calculator.operations.impl.IOperationSubtractionImpl;


public class ArabicCalcs extends Calculation {
    private IOperation operation;

    @Override
    public String addition(String a, String b) {
        double doubleA = Double.parseDouble(a);
        double doubleB = Double.parseDouble(b);

        operation = new IOperationAdditionImpl();
        return String.valueOf(operation.execute(doubleA, doubleB));
    }

    @Override
    public String subtraction(String a, String b) {
        double doubleA = Double.parseDouble(a);
        double doubleB = Double.parseDouble(b);

        operation = new IOperationSubtractionImpl();
        return String.valueOf(operation.execute(doubleA, doubleB));
    }

    @Override
    public String multiplication(String a, String b) {
        double doubleA = Double.parseDouble(a);
        double doubleB = Double.parseDouble(b);

        operation = new IOperationMultiplicationImpl();
        return String.valueOf(operation.execute(doubleA, doubleB));
    }

    @Override
    public String division(String a, String b) {
        double doubleA = Double.parseDouble(a);
        double doubleB = Double.parseDouble(b);

        operation = new IOperationDivisionImpl();
        return String.valueOf(operation.execute(doubleA, doubleB));
    }
}
