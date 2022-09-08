package org.example.calculator;

import org.example.calculator.calcImplements.*;

import java.util.List;

public class Calculator {

    private static final List<NewArithmeticOperator> arithmeticOperators = List.of(
            new AdditionOperator(),
            new SubtractionOperator(),
            new MultiplicationOperator(),
            new DivisionOperator()
    );

    public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2) {
        return ArithmeticOperator.calculate(operand1.toInt(), operator, operand2.toInt());
    }

    public static int calculate2(PositiveNumber operand1, String operator, PositiveNumber operand2) {
        return arithmeticOperators.stream()
                .filter(v -> v.support(operator))
                .map(m -> m.calculate(operand1.toInt(), operand2.toInt()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다"));
    }
}
