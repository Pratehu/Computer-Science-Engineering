import java.util.Scanner;

public class Q8RM{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        long fib = calculateFibonacciRecursive(n);
        System.out.println("The " + n + "th Fibonacci number is: " + fib);
        sc.close();
    }

    public static long calculateFibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }

        return calculateFibonacciRecursive(n - 1) + calculateFibonacciRecursive(n - 2);
    }
}
