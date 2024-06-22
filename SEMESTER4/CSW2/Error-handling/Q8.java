package lab5;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();
        
        try {
            double squareRoot = calculateSquareRoot(number);
            System.out.println("Square root of " + number + " is: " + squareRoot);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot calculate square root of a negative number.");
        }
        
        scanner.close();
    }
    
    public static double calculateSquareRoot(int number) {
        if (number < 0) {
            throw new ArithmeticException("Negative number cannot have a square root");
        }
        return Math.sqrt(number);
    }
}
