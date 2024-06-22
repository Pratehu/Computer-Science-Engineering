package lab5;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x in radians: ");
        double x = scanner.nextDouble();

        try {
            double result = calculateFunctionValue(x);
            System.out.println("Result of the function: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero occurred or invalid mathematical operation.");
        }

        scanner.close();
    }

    public static double calculateFunctionValue(double x) {
        double sinValue = Math.sin(x);
        double cosValue = Math.cos(x);
        double tanValue = Math.tan(x);
        double cotValue = 1.0 / tanValue; // cot(x) = 1 / tan(x)

        // Handling division by zero if x is close to a multiple of π/2 or π
        if (Math.abs(Math.abs(x) % (Math.PI / 2)) < 1e-10 || Math.abs(Math.abs(x) % Math.PI) < 1e-10) {
            throw new ArithmeticException("Division by zero or invalid mathematical operation");
        }

        double functionResult = Math.log(sinValue + cosValue) / (tanValue - cotValue);
        return functionResult;
    }
}
