package lab5;


import java.util.ArrayList;
import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> dynamicList = new ArrayList<>();

        while (true) {
            System.out.println("\nCurrent elements in the list: " + dynamicList);
            System.out.println("1. Add an element");
            System.out.println("2. Access an element");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an element to add: ");
                    int element = scanner.nextInt();
                    dynamicList.add(element);
                    break;
                case 2:
                    System.out.print("Enter the index to access: ");
                    int index = scanner.nextInt();
                    try {
                        int value = dynamicList.get(index);
                        System.out.println("Element at index " + index + ": " + value);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Error: Index is out of range.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
