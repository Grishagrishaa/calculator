package org.example.calculator.operations.impl;

import org.example.calculator.operations.api.IOperation;

public class IOperationMultiplicationImpl implements IOperation {
    @Override
    public int execute(double a, double b) {
        return (int) (a * b);
    }
}
