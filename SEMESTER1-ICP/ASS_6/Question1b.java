import java.util.*;
public class Question1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the value x and y: ");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt(), y=sc.nextInt();
		sc.close();
		int difference=subtractionSimple(x,y);
		System.out.println("Difference: "+difference);
	}
	public static int subtractionSimple(int a, int b) {
		int subtract=a-b;
		return subtract;
	}

}
