package calculator.splitter;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringAdderSplitterTest {

    private FormulaSplitter splitter;

    @Before
    public void setUp() {
        splitter = new StringAdderSplitter();
    }

    @Test
    public void comma() {
        assertThat(splitter.split("1,2")).containsExactly("1", "+", "2");
    }

    @Test
    public void colon() {
        assertThat(splitter.split("1:2")).containsExactly("1", "+", "2");
    }

    @Test
    public void bothCommaAndColon() {
        assertThat(splitter.split("1,2:3")).containsExactly("1", "+", "2", "+", "3");
    }

    @Test
    public void customDelimiter() {
        assertThat(splitter.split("//@\n1@2@3")).containsExactly("1", "+", "2", "+", "3");
    }

    @Test
    public void nullInput() {
        assertThat(splitter.split(null)).isEmpty();
    }

    @Test
    public void emptyInput() {
        assertThat(splitter.split("")).isEmpty();
    }

    @Test
    public void oneNumber() {
        assertThat(splitter.split("1")).containsExactly("1");
    }

}
