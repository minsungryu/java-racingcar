package calculator.splitter;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAdderSplitter implements FormulaSplitter {

    private static final String DEFAULT_DELIMITER = ",|:";
    private static final String ADD_OPERATOR = " + ";

    @Override
    public String[] split(String input) {
        String text = Optional.ofNullable(input).orElse("");
        String delimiter = DEFAULT_DELIMITER;

        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (m.find()) {
            delimiter = m.group(1);
            text = m.group(2);
        }

        return new SpaceSplitter().split(text.replaceAll(delimiter, ADD_OPERATOR));
    }

}
