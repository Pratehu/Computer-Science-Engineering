import java.util.*;
public class Question1f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the value x: ");
		Scanner sc=new Scanner(System.in);
		double x=sc.nextDouble();
		sc.close();
		if(x!=0) {
			double sqroot=squareRootSimple(x);
			System.out.println("Square root: "+sqroot);
		}
		else {
			System.out.println("Error");
		}
	}
	public static double squareRootSimple(double n){
		double modulo=Math.sqrt(n);
		return modulo;
	}

}
