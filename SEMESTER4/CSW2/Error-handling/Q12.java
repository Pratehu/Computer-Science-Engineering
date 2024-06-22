package lab5;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x in radians: ");
        double x = scanner.nextDouble();

        try {
            double result = calculateExpressionValue(x);
            System.out.println("Result of the expression: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero occurred or invalid mathematical operation.");
        }

        scanner.close();
    }

    public static double calculateExpressionValue(double x) {
        double sinValue = Math.sin(x);
        double cosValue = Math.cos(x);
        double tanValue = Math.tan(x);
        
        // Handling division by zero if x is close to a multiple of π/2
        if (Math.abs(Math.abs(x) % (Math.PI / 2)) < 1e-10) {
            throw new ArithmeticException("Division by zero or invalid mathematical operation");
        }
        
        // Handling negative values inside the square root
        double absSinCos = Math.abs(sinValue * cosValue);
        if (absSinCos < 0) {
            throw new ArithmeticException("Negative value inside the square root");
        }
        
        double sqrtValue = Math.sqrt(absSinCos);
        double expressionResult = sqrtValue / (tanValue + 1);
        
        return expressionResult;
    }
}
