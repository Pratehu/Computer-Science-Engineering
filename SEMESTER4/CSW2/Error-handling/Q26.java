package lab5;

public class Q26 {
    public static void main(String[] args) {
        try {
            // Attempt to load a class that does not exist
            Class.forName("NonExistentClass");
            
            // Attempt to call a method that does not exist
            throw new MethodNotFoundException("Method not found");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e.getMessage());
        } catch (MethodNotFoundException e) {
            System.out.println("MethodNotFoundException: " + e.getMessage());
        } finally {
            // This block will always execute regardless of whether an exception occurred
            System.out.println("Finally block executed.");
        }
    }
}

// Custom exception for method not found
class MethodNotFoundException extends Exception {
    public MethodNotFoundException(String message) {
        super(message);
    }
}
