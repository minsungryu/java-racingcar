package calculator.splitter;

public class SpaceSplitter implements FormulaSplitter {

    private static final String SPACE = " ";

    @Override
    public String[] split(String input) {
        return input.split(SPACE);
    }

}
