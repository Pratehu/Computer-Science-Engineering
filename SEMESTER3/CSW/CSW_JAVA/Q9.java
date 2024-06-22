

public class Q9 {
    public static boolean isPalindrome(int num) {
        int reversed = 0;
        int original = num;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        int input = 12321; // Change this value to test different numbers
        boolean isPal = isPalindrome(input);

        if (isPal) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
