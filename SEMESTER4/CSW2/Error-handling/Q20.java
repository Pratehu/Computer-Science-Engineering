package lab5;

import java.util.Arrays;

public class Q20 {
    public static void main(String[] args) {
        int[] arr = {4,5,7,9,11};
        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));
        
        System.out.println("\nRecursive traversal result:");
        recursiveTraversal(arr, 0);
    }

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
}
