package racingcar.util;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UtilTest {

    @Test
    public void repeat() {
        assertThat(Util.repeat("-", 5)).isEqualTo("-----");
    }

}
