import java.util.*;
public class HMQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int evenSum = 0, oddProduct = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddProduct *= i;
            }
        }
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Product of odd numbers: " + oddProduct);
	}

}
