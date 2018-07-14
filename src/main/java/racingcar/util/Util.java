package racingcar.util;

import java.util.Collections;
import java.util.Random;

public class Util {

    private static final int MAX = 10;

    public static String repeat(String input, int count) {
        return String.join("", Collections.nCopies(count, input));
    }

    private static int randomInt(int bound) {
        return new Random().nextInt(bound);
    }

    public static int randomCondition() {
        return randomInt(MAX);
    }

}
