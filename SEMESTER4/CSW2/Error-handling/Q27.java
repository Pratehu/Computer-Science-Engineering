package lab5;


public class Q27 {
    public static void main(String[] args) {
        try {
            Object obj = new Integer(10); // Creating an Integer object
            String str = (String) obj;     // Attempting to cast Integer to String
            System.out.println("Casting successful: " + str);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException occurred: " + e.getMessage());
        }
    }
}
