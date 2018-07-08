package calculator.view;

import java.io.IOException;

public interface View {

    String getFormula() throws IOException;

    void printAnswer(int answer) throws IOException;

}
