import java.util.Scanner;

public class SetDQ2 {

	
	

	    public static long factorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        }
	        return n * factorial(n - 1);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your Registration number: ");
	        int regNumber = scanner.nextInt();

	        int n = 0;
	        long factorialValue = 1;

	        while (factorialValue <= regNumber) {
	            n++;
	            factorialValue = factorial(n);
	        }

	        System.out.println("Factorial " + (n - 1) + " = " + factorial(n - 1));
	        System.out.println("Factorial " + n + " = " + factorialValue);
	        System.out.println("Value of n = " + (n - 1));

	        scanner.close();
	    }
	}

   // Enter your Registration number: 3079504
  //  Factorial 9 = 362880
 //   Factorial 10 = 3628800
//    Value of n = 9

