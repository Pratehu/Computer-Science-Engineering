

public class Q17 {
    public static boolean isEven(int number) {
        return ((number & 1) == 0);
    }

    public static void main(String[] args) {
        int num = 101; // Change this value to test different numbers

        boolean result = isEven(num);
        System.out.println("Is " + num + " even? " + result);
    }
}
