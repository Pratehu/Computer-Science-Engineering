import java.util.*;
public class Question1e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the value x and y: ");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt(), y=sc.nextInt();
		sc.close();
		if(x!=0 && y!=0) {
			int remainder=remainderSimple(x,y);
			System.out.println("Remainder: "+remainder);
		}
		else {
			System.out.println("Error");
		}
	}
	public static int remainderSimple(int a, int b) {
		int modulo=a%b;
		return modulo;
	}

}
