import java.util.Scanner;
public class Q8 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the first string: ");
String str1 = scanner.nextLine();
System.out.print("Enter the second string: ");
String str2 = scanner.nextLine();
// Concatenate strings using the string method
String concatenatedString1 = str1.concat(str2);
// Concatenate strings using the + operator
String concatenatedString2 = str1 + " " + str2;
System.out.println("Concatenated using the string method: " + concatenatedString1);
System.out.println("Concatenated using the + operator: " + concatenatedString2);
System.out.print("Enter an index number: ");
int index = scanner.nextInt();
// Check if the index is within the bounds of the concatenated string
if (index >= 0 && index < concatenatedString1.length()) {
System.out.println("Character at index " + index + " is: " + concatenatedString1.charAt(index));
} else {
System.out.println("Invalid index.");
}
}
}
//Output:- Enter the first string:
//Hello
//Enter the second string:
//World
//Concatenated using the string method: HelloWorld
//Concatenated using the + operator: Hello World
//Enter an index number:
//4
//Character at index 4 is: W