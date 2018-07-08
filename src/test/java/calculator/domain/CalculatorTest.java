package calculator.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void add() {
        assertThat(Calculator.calculate("1 + 1")).isEqualTo(2);
    }

    @Test
    public void subtract() {
        assertThat(Calculator.calculate("1 - 1")).isZero();
    }

    @Test
    public void multiply() {
        assertThat(Calculator.calculate("2 * 3")).isEqualTo(6);
    }

    @Test
    public void divide() {
        assertThat(Calculator.calculate("4 / 2")).isEqualTo(2);
    }

}
