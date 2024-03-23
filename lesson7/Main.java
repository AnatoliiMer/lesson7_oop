package lesson7;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        Operation addition = new Addition();
        double sum = calculator.calculate(addition, 5, 3, 2);
        System.out.println (sum);
        
        Operation multiplication = new Multiplication();
        double product = calculator.calculate(multiplication, 4, 2);
        System.out.println (product);
        
        Operation division = new Division();
        double quotient = calculator.calculate(division, 10, 2);
        System.out.println ( quotient);
    }
    
}
