import java.util.*;
public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a password: ");
	        String password = sc.nextLine();
	        sc.close();
	        if (isValidPassword(password)) {
	            System.out.println("Valid Password");
	        } else {
	            System.out.println("Invalid Password");
	        }
	    }
	


public static boolean isValidPassword(String password) {
    if (password.length() < 8) {
        return false;
    }
    if (!password.matches("[a-zA-Z0-9]+")) {
        return false;
    }
    int count = 0;
    for (int i = 0; i < password.length(); i++) {
        if (Character.isDigit(password.charAt(i))) {
            count++;
            if (count >= 2) {
                return true;
            }
        }
    }
    return false;
}
}