package lab5;


import java.util.Arrays;

public class Q19 {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 7};

        // Sort the array
        try {
            Arrays.sort(array);
            System.out.println("Sorted array: " + Arrays.toString(array));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: ArrayIndexOutOfBoundsException occurred while sorting.");
        }

        // Search for an element
        try {
            int index = linearSearch(array, 9);
            if (index != -1) {
                System.out.println("Element 9 found at index: " + index);
            } else {
                System.out.println("Element 9 not found in the array.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: ArrayIndexOutOfBoundsException occurred while searching.");
        }

        // Access elements at various indices
        try {
            System.out.println("Element at index 3: " + getElementAtIndex(array, 3));
            System.out.println("Element at index 10: " + getElementAtIndex(array, 10));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: ArrayIndexOutOfBoundsException occurred while accessing elements.");
        }
    }

    // Linear search algorithm
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1; // Element not found
    }

    // Method to get element at a specific index
    public static int getElementAtIndex(int[] array, int index) {
        return array[index];
    }
}
