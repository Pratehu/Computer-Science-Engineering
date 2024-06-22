package lab5;

public class Q28 {
    private static final int MAX_DEPTH = 10000; // Maximum recursion depth

    public static void main(String[] args) {
        try {
            recursiveMethod(0); // Starting the recursive method
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError occurred: " + e.getMessage());
        }
    }

    // Recursive method with termination condition
    public static void recursiveMethod(int depth) {
        // Termination condition to avoid StackOverflowError
        if (depth >= MAX_DEPTH) {
            System.out.println("Maximum recursion depth reached.");
            return;
        }

        // Perform some operation in the recursive method
        System.out.println("Depth: " + depth);

        // Call the recursive method again
        recursiveMethod(depth + 1);
    }
}
