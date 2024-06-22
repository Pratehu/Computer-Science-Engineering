package lab5;


public class Q16 {
    public static void main(String[] args) {
        int[] numbers = {5,6,7,8,9};

        try {
            // Accessing an element at an index beyond the array's length
            int element = numbers[10];
            System.out.println("Element at index 10: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: ArrayIndexOutOfBoundsException occurred. Index is out of range.");
        }
    }
}
