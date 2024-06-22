
import java.util.Scanner;
public class Q11 {
    public static int countEvenDigits(int number) {
        int count = 0;

        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                count++;
            }
            number /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int inputNumber = scanner.nextInt();

        int evenCount = countEvenDigits(Math.abs(inputNumber));
        System.out.println("Number of even digits in " + inputNumber + ": " + evenCount);

        scanner.close();
    }
}
