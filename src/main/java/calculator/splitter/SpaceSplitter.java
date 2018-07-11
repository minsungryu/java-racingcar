package calculator.splitter;

import java.util.Arrays;

public class SpaceSplitter implements FormulaSplitter {

    private static final String SPACE = " ";

    @Override
    public String[] split(String input) {
        return Arrays.stream(input.split(SPACE)).filter(token -> !token.isEmpty()).toArray(String[]::new);
    }

}
