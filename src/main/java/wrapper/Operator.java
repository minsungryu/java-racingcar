package wrapper;

import java.util.HashMap;
import java.util.Map;

public class Operator {

    protected static Map<String, Operator> operatorPool = new HashMap<>();

    static {
        operatorPool.put("+", new Operator("+"));
        operatorPool.put("-", new Operator("-"));
        operatorPool.put("*", new Operator("*"));
        operatorPool.put("/", new Operator("/"));
    }

    protected String operator;

    private Operator(String operator) {
        this.operator = operator;
    }

    public static Operator as(String input) {
        if (!operatorPool.containsKey(input)) {
            throw new IllegalArgumentException();
        }
        return operatorPool.get(input);
    }

    @Override
    public String toString() {
        return operator;
    }

}
