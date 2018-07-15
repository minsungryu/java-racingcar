package racingcar.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Util {

    private static final String RANDOM_SEED = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String JOIN_DELIMITER = "";
    private static final int NAME_LENGTH = 6;
    private static final int MAX = 10;

    public static String repeat(String input, int count) {
        return String.join(JOIN_DELIMITER, Collections.nCopies(count, input));
    }

    private static int randomInt(int bound) {
        return new Random().nextInt(bound);
    }

    public static int randomCondition() {
        return randomInt(MAX);
    }

    public static String randomName() {
        List<String> randomSeed = Arrays.asList(RANDOM_SEED.split(""));
        Collections.shuffle(randomSeed);
        return String.join(JOIN_DELIMITER, randomSeed.subList(0, NAME_LENGTH));
    }

}
