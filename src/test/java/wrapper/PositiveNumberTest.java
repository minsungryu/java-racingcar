package wrapper;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PositiveNumberTest {

    @Test(expected = RuntimeException.class)
    public void negative() {
        PositiveNumber.of(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void notNumber() {
        PositiveNumber.of("a");
    }

    @Test
    public void nullInput() {
        assertThat(PositiveNumber.of(null).intValue()).isEqualTo(0);
    }

    @Test
    public void emptyInput() {
        assertThat(PositiveNumber.of("").intValue()).isEqualTo(0);
    }
}
