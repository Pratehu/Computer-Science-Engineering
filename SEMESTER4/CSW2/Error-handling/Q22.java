package lab5;

//CustomCheckedException class
class CustomCheckedException extends Exception {
public CustomCheckedException(String message) {
   super(message);
}
}

//Main class
public class Q22 {
public static void main(String[] args) {
   try {
       // Simulate a specific error condition
       int result = divide(10, 0);
       System.out.println("Result of division: " + result);
   } catch (CustomCheckedException e) {
       // Catch and handle the custom checked exception
       System.out.println("CustomCheckedException occurred: " + e.getMessage());
   }
}

// Method that may throw CustomCheckedException
public static int divide(int dividend, int divisor) throws CustomCheckedException {
   if (divisor == 0) {
       // Throw CustomCheckedException if divisor is zero
       throw new CustomCheckedException("Division by zero is not allowed.");
   }
   return dividend / divisor;
}
}
