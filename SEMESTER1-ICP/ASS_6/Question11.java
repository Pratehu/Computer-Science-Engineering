import java.util.*;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();
	        System.out.print("Enter a character: ");
	        char a = sc.next().charAt(0);
	        sc.close();
	        int occurrence = count(str, a);
	        System.out.println("The character " + a + " occurs " + occurrence + " times in the string \"" + str + "\".");
	}


public static int count(String str, char a) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == a) {
            count++;
        }
    }
    return count;
}
}