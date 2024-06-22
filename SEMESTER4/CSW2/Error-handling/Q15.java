package lab5;
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number as string: ");
            String str = scanner.nextLine();

            // Outer try-catch block to handle NumberFormatException
            try {
                int number = Integer.parseInt(str);
                
                // Inner try-catch block to handle ArithmeticException
                try {
                    int result = number / 0; // This will cause ArithmeticException
                    System.out.println("Result of division: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Inner catch block: ArithmeticException occurred.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Outer catch block: NumberFormatException occurred. Please enter a valid number.");
            }
        } finally {
            // Close the scanner in the finally block to ensure it's always closed
            scanner.close();
        }
    }
}
