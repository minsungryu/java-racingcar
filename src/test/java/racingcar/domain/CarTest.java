package racingcar.domain;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private Car car;

    @Before
    public void setUp() {
        car = new Car();
    }

    @Test
    public void isMovable() {
        assertThat(car.isMovable(Car.THRESHOLD)).isTrue();
        assertThat(car.isMovable(Car.THRESHOLD - 1)).isFalse();
    }

    @Test
    public void move() {
        assertThat(car.moveByCondition(Car.THRESHOLD)).isOne();
    }

    @Test
    public void isSamePosition() {
        int fakePosition = 3;
        Car fakeCar = new Car(fakePosition);
        assertThat(car.isSamePosition(fakePosition)).isFalse();
        assertThat(fakeCar.isSamePosition(fakePosition)).isTrue();
    }

}
