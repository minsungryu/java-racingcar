package racingcar.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarsTest {

    private Car c1;
    private Car c2;
    private Car c3;
    private RacingCars racingCars;

    @Before
    public void setUp() {
        c1 = new Car("a", 1);
        c2 = new Car("b", 2);
        c3 = new Car("c", 2);

        racingCars = new RacingCars(Arrays.asList(c1, c2, c3), 2);
    }

    @Test
    public void getGameResult() {
        assertThat(racingCars.getGameResult())
                .containsExactly("a : -", "b : --", "c : --");
    }

    @Test
    public void getWinnerNames() {
        assertThat(racingCars.getWinnerNames())
                .isEqualTo("b, c");
    }

}