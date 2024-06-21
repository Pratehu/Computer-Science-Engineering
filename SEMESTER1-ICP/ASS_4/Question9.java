import java.util.*;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = sc.nextInt();
        sc.close();
        String inputString = Integer.toString(input);
        inputString = inputString.replaceAll("0", "");
        System.out.println("Input without zeros: " + inputString);
	}

}
