package lesson7;

import java.util.logging.Logger;

public class Calculator {
    private static final Logger logger = Logger.getLogger(Calculator.class.getName());

    public double calculate(Operation operation, double... operands) {
        double result = operation.calculate(operands);
        logger.info("Calculation result: " + result);
        return result;
    }
}