// Write a java program to take your Registration number as an input and find the sum of odd digits
// and product of even digits (Sample Run: Reg. No= 12345, Sum = 1+3+5= 9, product = 2*4=8).

import java.util.Scanner;
public class SetDQ1 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your Registration number: ");
	        String regNumber = scanner.nextLine();

	        int sumOfOdd = 0;
	        int productOfEven = 1;

	        for (int i = 0; i < regNumber.length(); i++) {
	            char digitChar = regNumber.charAt(i);
	            int digit = Character.getNumericValue(digitChar);

	            if (digit % 2 == 0) {
	                productOfEven *= digit;
	            } else {
	                sumOfOdd += digit;
	            }
	        }

	        System.out.println("Sum of odd digits: " + sumOfOdd);
	        System.out.println("Product of even digits: " + productOfEven);

	        scanner.close();
	    }
	}

// Enter your Registration number: 3070495
// Sum of odd digits: 24
// Product of even digits: 0
