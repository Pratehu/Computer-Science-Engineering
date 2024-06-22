package lab5;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x in radians: ");
        double x = scanner.nextDouble();

        try {
            double result = evaluateExpression(x);
            System.out.println("Result of the expression: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero occurred or invalid mathematical operation.");
        }

        scanner.close();
    }

    public static double evaluateExpression(double x) {
        double sinValue = Math.sin(x);
        double cosValue = Math.cos(x);
        double tanValue = Math.tan(x);
        double cotValue = 1.0 / tanValue; // cot(x) = 1 / tan(x)
        
        // Handling potential division by zero
        if (Math.abs(Math.abs(x) % (Math.PI / 2)) < 1e-10) {
            throw new ArithmeticException("Division by zero or invalid mathematical operation");
        }
        
        // Calculating the expression
        double logValue = Math.log(Math.abs(sinValue + cosValue));
        
        // Handling negative values inside the logarithmic function
        if (logValue < 0) {
            throw new ArithmeticException("Negative value inside the logarithmic function");
        }
        
        double expressionResult = logValue / (tanValue - cotValue);
        
        return expressionResult;
    }
}
