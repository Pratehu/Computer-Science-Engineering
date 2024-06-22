package lab5;


import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of x in radians: ");
        double x = scanner.nextDouble();
        
        try {
            double result = calculateExpressionValue(x);
            System.out.println("Result of the expression: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero occurred. x is close to a multiple of π/2.");
        }
        
        scanner.close();
    }
    
    public static double calculateExpressionValue(double x) {
        double tanValue = Math.tan(x);
        
        // Handling division by zero if x is close to a multiple of π/2
        if (Math.abs(Math.abs(x) % (Math.PI / 2)) < 1e-10) {
            throw new ArithmeticException("Division by zero");
        }
        
        double sinValue = Math.sin(x);
        double cosValue = Math.cos(x);
        
        return (sinValue + cosValue) / tanValue;
    }
}
