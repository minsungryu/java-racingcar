package calculator.view;

import java.io.*;

public class ConsoleView implements View {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    @Override
    public String getFormula() throws IOException {
        return reader.readLine();
    }

    @Override
    public void printAnswer(int answer) throws IOException {
        writer.write(String.valueOf(answer));
        writer.flush();
    }

}
