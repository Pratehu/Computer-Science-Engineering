package lab5;
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example array
        int[] arr = {2,4,6,8,10};

        System.out.println("Original array:");
        printArray(arr);

        System.out.println("\nRecursive traversal result:");
        recursiveTraversal(arr, 0); // Start recursive traversal from index 0

        scanner.close();
    }

    // Recursive function to traverse the array
    public static void recursiveTraversal(int[] arr, int index) {
        // Base case: If index is equal to the length of the array, return
        if (index == arr.length) {
            return;
        }

        try {
            // Access the element at the current index and print it
            System.out.print(arr[index] + " ");

            // Recur with the next index
            recursiveTraversal(arr, index + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the ArrayIndexOutOfBoundsException gracefully
            System.out.println("\nError: Index " + index + " is out of bounds.");
        }
    }

    // Utility function to print the elements of the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
