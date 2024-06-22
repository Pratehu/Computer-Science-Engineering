package lab5;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String userInput = scanner.nextLine();
        int number = convertToInteger(userInput);
        System.out.println("Number entered: " + number);
        scanner.close();
    }
    
    public static int convertToInteger(String str) {
        int result = 0;
        boolean isValidInput = false;
        
        while (!isValidInput) {
            try {
                result = Integer.parseInt(str);
                isValidInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a number: ");
                str = scanner.nextLine();
            }
        }
        
        return result;
    }
}
