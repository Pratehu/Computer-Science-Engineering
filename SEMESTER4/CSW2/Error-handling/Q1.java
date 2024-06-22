package lab5;

public class Q1 {
    public static void main(String[] args) {
        try {
            String str = null;
            // Attempting to access a method or property of a null object will throw NullPointerException
            int length = str.length(); // This will throw NullPointerException
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            // Catching the NullPointerException and providing a meaningful error message
            System.out.println("NullPointerException occurred: " + e.getMessage());
        }
    }
}
