package wrapper;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NameStringTest {

    @Test
    public void name() {
        assertThat(NameString.of("name").toString()).isEqualTo("name");
    }

    @Test(expected = RuntimeException.class)
    public void emptyName() {
        NameString.of("");
    }

    @Test(expected = RuntimeException.class)
    public void longName() {
        NameString.of("this name is too long");
    }

}
