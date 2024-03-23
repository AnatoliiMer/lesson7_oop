package lesson7;

public class Multiplication implements Operation {
    @Override
    public double calculate(double... operands) {
        double result = 1;
        for (double operand : operands) {
            result *= operand;
        }
        return result;
    }
}
