package wrapper;

import org.junit.Test;

public class OperatorTest {

    @Test(expected = IllegalArgumentException.class)
    public void notOperator() {
        Operator.as("!");
    }
}
