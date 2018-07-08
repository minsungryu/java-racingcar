package calculator;

import calculator.domain.Calculator;
import calculator.splitter.StringAdderSplitter;
import calculator.view.ConsoleView;
import calculator.view.View;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        View view = new ConsoleView();

        int answer = Calculator.calculate(view.getFormula(), new StringAdderSplitter());
        view.printAnswer(answer);
    }

}
