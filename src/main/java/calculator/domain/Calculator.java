package calculator.domain;

import calculator.splitter.FormulaSplitter;
import calculator.splitter.SpaceSplitter;
import wrapper.FormulaString;
import wrapper.Operator;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Calculator {

    private static Map<Operator, CalculatorStrategy> operateMap = new HashMap<>();

    static {
        operateMap.put(Operator.as("+"), (a, b) -> a.intValue() + b.intValue());
        operateMap.put(Operator.as("-"), (a, b) -> a.intValue() - b.intValue());
        operateMap.put(Operator.as("*"), (a, b) -> a.intValue() * b.intValue());
        operateMap.put(Operator.as("/"), (a, b) -> a.intValue() / b.intValue());
    }

    public static int calculate(String input) {
        return calculate(new FormulaString(input, new SpaceSplitter()));
    }

    public static int calculate(String input, FormulaSplitter parser) {
        return calculate(new FormulaString(input, parser));
    }

    public static int calculate(FormulaString input) {
        LinkedList<Operator> operatorList = (LinkedList) input.getOperators();
        LinkedList<Number> operandList = (LinkedList) input.getOperands();

        while (!operatorList.isEmpty()) {
            Number a = operandList.pollFirst();
            Number b = operandList.pollFirst();
            operandList.addFirst(operateMap.get(operatorList.pollFirst()).calculate(a, b));
        }

        return operandList.poll().intValue();
    }

}
