package org.example.calculator;

import org.example.calculator.operations.api.IOperation;
import org.example.calculator.operations.impl.IOperationAdditionImpl;
import org.example.calculator.operations.impl.IOperationDivisionImpl;
import org.example.calculator.operations.impl.IOperationMultiplicationImpl;
import org.example.calculator.operations.impl.IOperationSubtractionImpl;

public class ArabicCalcs extends Calculation {
    private IOperation operation;

    @Override
    public int addition(double a, double b) {
        operation = new IOperationAdditionImpl();
        return operation.execute(a, b);
    }

    @Override
    public int subtraction(double a, double b) {
        operation = new IOperationSubtractionImpl();
        return operation.execute(a, b);
    }

    @Override
    public int multiplication(double a, double b) {
        operation = new IOperationMultiplicationImpl();
        return operation.execute(a, b);
    }

    @Override
    public int division(double a, double b) {
        operation = new IOperationDivisionImpl();
        return operation.execute(a, b);
    }
}
