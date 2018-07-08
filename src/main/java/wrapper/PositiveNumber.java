package wrapper;

public class PositiveNumber extends Number {

    private int number;

    private PositiveNumber(int number) {
        if (number < 0) {
            throw new RuntimeException();
        }
        this.number = number;
    }

    public static PositiveNumber of(String number) {
        if (number == null || number.isEmpty()) {
            return new PositiveNumber(0);
        }
        return new PositiveNumber(Integer.parseInt(number));
    }

    public static PositiveNumber of(int number) {
        return new PositiveNumber(number);
    }

    @Override
    public int intValue() {
        return number;
    }

    @Override
    public long longValue() {
        return number;
    }

    @Override
    public float floatValue() {
        return number;
    }

    @Override
    public double doubleValue() {
        return number;
    }

}
