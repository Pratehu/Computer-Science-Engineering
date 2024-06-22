package lab5;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");

        try {
            int number = readInteger(scanner);
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }

        scanner.close();
    }

    // Method to read an integer from the user
    public static int readInteger(Scanner scanner) throws InputMismatchException {
        return scanner.nextInt();
    }
}
