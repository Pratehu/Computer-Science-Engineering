package lab5;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x in radians: ");
        double x = scanner.nextDouble();

        try {
            double result = evaluateFunction(x);
            System.out.println("Result of the function: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero occurred or invalid mathematical operation.");
        }

        scanner.close();
    }

    public static double evaluateFunction(double x) {
        double sinValue = Math.sin(x);
        double cosValue = Math.cos(x);
        
        // Handling potential division by zero or invalid mathematical operation
        if ((sinValue + cosValue) == 0) {
            throw new ArithmeticException("Division by zero or invalid mathematical operation");
        }
        
        double functionResult = (sinValue * cosValue) / (sinValue + cosValue);
        
        return functionResult;
    }
}
