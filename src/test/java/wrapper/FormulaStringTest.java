package wrapper;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FormulaStringTest {

    @Test
    public void operators() {
        FormulaString formula = new FormulaString("1 + 2 - 3 * 4 / 5");
        List<Operator> operators = formula.getOperators();
        assertThat(operators.stream().map(operator -> operator.toString()))
                .containsExactly("+", "-", "*", "/");
    }

    @Test
    public void operands() {
        FormulaString formula = new FormulaString("1 + 2 - 3 * 4 / 5");
        List<Number> operands = formula.getOperands();
        assertThat(operands.stream().mapToInt(number -> number.intValue()).toArray())
                .containsExactly(1, 2, 3, 4, 5);
    }

}
