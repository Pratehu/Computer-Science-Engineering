import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Celsius, Fahrenheit;
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a degree in Fahrenheit: ");
		Fahrenheit=sc.nextDouble();
		Celsius=(Fahrenheit-32)*5.0/9.0;
		System.out.println(Fahrenheit+" Fahrenheit is "+Celsius+" Celsius");
		sc.close();
	}

}
