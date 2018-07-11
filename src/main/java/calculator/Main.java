package calculator;

import calculator.domain.Calculator;
import calculator.splitter.StringAdderSplitter;
import calculator.view.ConsoleCalculatorView;
import calculator.view.CalculatorView;

public class Main {

    public static void main(String[] args) {
        CalculatorView view = new ConsoleCalculatorView();
        int answer = Calculator.calculate(view.getFormula(), new StringAdderSplitter());
        view.println(answer);
    }

}
