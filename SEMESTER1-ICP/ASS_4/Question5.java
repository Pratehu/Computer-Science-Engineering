import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner (System.in);
	        System.out.print("Enter a number n: ");
	        int num = sc.nextInt();
	        int sum = 0;
	        sc.close();
	        for (int i = 1; i < num; i++) {
	            if (num % i == 0) {
	                sum += i;
	            }
	        }
	        if (sum == num) {
	            System.out.println(num + " is a perfect number.");
	        } else {
	            System.out.println(num + " is not a perfect number.");
	        }
	}

}
