package lesson7;

public class Addition implements Operation {
    @Override
    public double calculate(double... operands) {
        double result = 0;
        for (double operand : operands) {
            result += operand;
        }
        return result;
    }
}
