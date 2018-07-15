package racingcar.domain;

import racingcar.util.Util;
import wrapper.NameString;

public class Car {

    private static final String MARK = "-";
    public static final int THRESHOLD = 4;

    private NameString name;
    private int position;

    public Car() {
        this(0);
    }

    public Car(NameString name) {
        this(name.toString(), 0);
    }

    public Car(String name) {
        this(name, 0);
    }

    public Car(int position) {
        this(Util.randomName(), position);
    }

    public Car(String name, int position) {
        this.name = NameString.of(name);
        this.position = position;
    }

    public int moveByCondition(int condition) {
        if (isMovable(condition)) {
            position += 1;
        }
        return position;
    }

    public boolean isMovable(int condition) {
        return THRESHOLD <= condition;
    }

    public boolean isSamePosition(int position) {
        return this.position == position;
    }

    public String getName() {
        return name.toString();
    }

    @Override
    public String toString() {
        return String.format("%s : %s", name, Util.repeat(MARK, position));
    }

}
