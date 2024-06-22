package lab5;

//CustomNullPointerException.java
class CustomNullPointerException extends RuntimeException {
public CustomNullPointerException(String message) {
   super(message);
}
}
//DemoCustomNullPointerException.java
public class Q3 {
public static void main(String[] args) {
    try {
        String str = null;
        if (str == null) {
            throw new CustomNullPointerException("Custom Error: The string reference is null.");
        }
        int length = str.length(); // This will throw CustomNullPointerException
        System.out.println("Length of the string: " + length);
    } catch (CustomNullPointerException e) {
        System.out.println("Caught CustomNullPointerException: " + e.getMessage());
    }
}
}

