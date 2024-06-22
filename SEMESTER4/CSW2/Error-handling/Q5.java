package lab5;



public class Q5 {
    public static void main(String[] args) {
        try {
            double x = 20.0;
            double y = 0.0;
            
            // Perform complex mathematical computations
            double result = Math.log(x) / Math.sin(y); // Example computation
            
            System.out.println("Result: " + result);
        } catch (NullPointerException e) {
            System.out.println("Error: NullPointerException occurred. Make sure all necessary objects are initialized.");
        } catch (ArithmeticException e) {
            System.out.println("Error: ArithmeticException occurred. Division by zero or invalid mathematical operation.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
