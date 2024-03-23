package lesson7;

public class Division implements Operation {
    @Override
    public double calculate(double... operands) {
        if (operands.length < 2) {
            throw new IllegalArgumentException("Division requires at least two operands.");
        }
        double result = operands[0];
        for (int i = 1; i < operands.length; i++) {
            if (operands[i] == 0) {
                throw new ArithmeticException("Division by zero");
            }
            result /= operands[i];
        }
        return result;
    }
}
