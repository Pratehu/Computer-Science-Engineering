import java.util.*;
public class HMQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = sc.nextInt();
        sc.close();
		System.out.println("Is "+number+" divisible by 5 and 6? " +((number % 5 == 0) && (number % 6 == 0)));
		System.out.println("Is "+number+" divisible by 5 or 6? " +((number % 5 == 0) || (number % 6 == 0)));
		System.out.println("Is "+number+" divisible by 5 or 6, but not both? " +((number % 5 == 0) ^ (number % 6 == 0)));
	}

}
