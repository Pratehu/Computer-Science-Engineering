package lab5;



public class Q6 {
    public static void main(String[] args) {
        try {
            // Attempting to parse a non-numeric string will throw NumberFormatException
            String str = "pra";
            int number = Integer.parseInt(str); // This will throw NumberFormatException
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            // Catching the NumberFormatException and providing a meaningful error message
            System.out.println("NumberFormatException occurred: " + e.getMessage());
        }
    }
}
