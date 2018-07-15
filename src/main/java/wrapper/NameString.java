package wrapper;

import racingcar.util.Util;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NameString {

    public static final int MAX = 10;

    private static final String DELIMITER = ",";

    private String name;

    private NameString(String name) {
        this.name = Optional.of(name).filter(NameString::isValidName).orElseThrow(RuntimeException::new);
    }
    
    public static NameString of(String name) {
        return new NameString(name);
    }

    public static NameString ofRandom() {
        return new NameString(Util.randomName());
    }

    public static List<NameString> ofRaw(String names) {
        return Arrays.stream(names.split(DELIMITER)).map(NameString::of).collect(Collectors.toList());
    }

    private static boolean isValidName(String name) {
        return !name.isEmpty() && (name.length() <= MAX);
    }

    @Override
    public String toString() {
        return name;
    }

}
