// Write a java program to generate a random number between 1 to 500 and check whether it is prime, if not , find the next prime number . 
import java.util.Scanner;

public class SetBQ1 {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findNextPrime(int num) {
        num++;
        while (!isPrime(num)) {
            num++;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a random number between 1 and 500: ");
        int randomNum = scanner.nextInt();

        if (randomNum < 1 || randomNum > 500) {
            System.out.println("Invalid input. Please enter a number between 1 and 500.");
        } else {
            if (isPrime(randomNum)) {
                System.out.println(randomNum + " is a prime number.");
            } else {
                int nextPrime = findNextPrime(randomNum);
                System.out.println(randomNum + " is not a prime number.");
                System.out.println("Next prime number: " + nextPrime);
            }
        }

        scanner.close();
    }
}

// Enter a random number between 1 and 500: 448
// 448 is not a prime number.
// Next prime number: 449
