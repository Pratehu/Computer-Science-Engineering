import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int N = sc.nextInt();
	        sc.close();
	        int largestPower = (int) (Math.log(N) / Math.log(3));
	        int result = (int) Math.pow(3, largestPower);
	        System.out.println("Largest power of three less than or equal to " + N + " is: " + result);
	}

}
