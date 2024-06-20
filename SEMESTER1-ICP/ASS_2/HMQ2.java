import java.util.*;
public class HMQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Input total number of eggs:");
        int total = sc.nextInt();
        int gross = total/144;
        int x = gross*144;
        int left = total - x;
        int dozen = left/12;
        int extra = left%12;
        System.out.println("Your number of eggs is " + gross +" gross, " + dozen + " dozen, and " + extra + " eggs.");
	}

}
