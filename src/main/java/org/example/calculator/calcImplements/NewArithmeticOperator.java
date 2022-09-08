package org.example.calculator.calcImplements;

public interface NewArithmeticOperator {
    boolean support(String operator);

    int calculate(int operand1, int operand2);
}
