package racingcar.domain;

import racingcar.util.Util;

public class Car {

    private static final String MARK = "-";
    public static final int THRESHOLD = 4;

    private int position;

    public Car() {
        this(0);
    }

    public Car(int position) {
        this.position = position;
    }

    public boolean isMovable(int condition) {
        return THRESHOLD <= condition;
    }

    public int moveByCondition(int condition) {
        if (isMovable(condition)) {
            position += 1;
        }
        return position;
    }

    @Override
    public String toString() {
        return Util.repeat(MARK, position);
    }

}
