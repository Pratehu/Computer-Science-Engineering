import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        System.out.print("Multiplication table of ");
	        int x=sc.nextInt();
	        sc.close();
	        for(int i=1; i<=10; i++){
	            System.out.println(x+" * "+i+" = "+x*i);
	}

}
}