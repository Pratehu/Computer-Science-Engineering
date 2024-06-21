//  Write a java program to generate a random number between 1 to 500 and check whether it is 
//  prime . The program should use a loop that repeats until it generates prime number.


import java.util.Scanner;
public class SetAQ1 {
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

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int randomNum;
		        boolean primeFound = false;

		        while (!primeFound) {
		            // Generate a random number between 1 and 500
		            randomNum = (int) (Math.random() * 500) + 1;

		            if (isPrime(randomNum)) {
		                primeFound = true;
		                System.out.println("Random prime number generated: " + randomNum);
		            } else {
		                System.out.println("Generated number " + randomNum + " is not prime. Generating another...");
		            }
		        }

		        sc.close();
		    }
		}

	// Generated number 427 is not prime. Generating another...
   //  Random prime number generated: 179