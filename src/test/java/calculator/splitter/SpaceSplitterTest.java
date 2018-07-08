package calculator.splitter;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SpaceSplitterTest {

    @Test
    public void splitBySpace() {
        assertThat(new SpaceSplitter().split("a b")).containsExactly("a", "b");
    }

}
