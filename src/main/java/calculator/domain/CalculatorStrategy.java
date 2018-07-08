package calculator.domain;

public interface CalculatorStrategy {

    int calculate(Number a, Number b) throws ArithmeticException;

}
