import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in); 
			System.out.print("Enter value of a:");
	        int a = sc.nextInt();
	        System.out.print("Enter value of b:");   
	        int b = sc.nextInt();
	        System.out.println("a     b     pow(a,b)");
	        System.out.println(a+"     "+b+"     "+Math.pow(a,b));
			a++;
			b++;
			System.out.println(a+"     "+b+"     "+Math.pow(a,b));
			a++;
			b++;
			System.out.println(a+"     "+b+"     "+Math.pow(a,b));
			a++;
			b++;
			System.out.println(a+"     "+b+"     "+Math.pow(a,b));
			a++;
			b++;
			System.out.println(a+"     "+b+"     "+Math.pow(a,b));
	}

}
