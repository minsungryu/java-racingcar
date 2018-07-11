package calculator.view;

import java.io.*;

public class ConsoleCalculatorView implements CalculatorView {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    @Override
    public String getFormula() {
        try {
            return reader.readLine();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public void print(Object message) {
        try {
            writer.write(String.valueOf(message));
            writer.flush();
        } catch (Exception e) {
            // do nothing
        }
    }

    @Override
    public void println(Object message) {
        print(message);
        print('\n');
    }

}
