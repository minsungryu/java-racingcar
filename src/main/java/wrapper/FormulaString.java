package wrapper;

import calculator.splitter.FormulaSplitter;
import calculator.splitter.SpaceSplitter;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FormulaString {

    private String input;
    private String[] tokens;

    public FormulaString(String input) {
        this(input, new SpaceSplitter());
    }

    public FormulaString(String input, FormulaSplitter parser) {
        this.input = input;
        this.tokens = parser.split(input);
    }

    public List<Number> getOperands() {
        return IntStream.range(0, tokens.length)
                .filter(FormulaString::isEven)
                .mapToObj(i -> PositiveNumber.of(tokens[i]))
                .collect(Collectors.toCollection(LinkedList::new));
    }

    public List<Operator> getOperators() {
        return IntStream.range(0, tokens.length)
                .filter(FormulaString::isOdd)
                .mapToObj(i -> Operator.as(tokens[i]))
                .collect(Collectors.toCollection(LinkedList::new));
    }

    private static boolean isEven(int n) {
        return (n & 1) == 0;
    }

    private static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    @Override
    public String toString() {
        return input;
    }

}
