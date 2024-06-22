 import java.util.Scanner;
public class Q10 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = scanner.nextLine();
while (true) {

System.out.println("\nString Operations Menu:");
System.out.println("1. Convert to lowercase");
System.out.println("2. Convert to uppercase");
System.out.println("3. Search for a character");
System.out.println("4. Search for an index");
System.out.println("5. Concatenate with another string");
System.out.println("6. Exit");
System.out.print("Enter your choice: ");
int choice = scanner.nextInt();
switch (choice) {
case 1:
System.out.println("Lowercase: " + str.toLowerCase());
break;
case 2:
System.out.println("Uppercase: " + str.toUpperCase());
break;
case 3:
System.out.print("Enter a character to search: ");
char searchChar = scanner.next().charAt(0);
int index = str.indexOf(searchChar);
if (index != -1) {
System.out.println("Character found at index: " + index);
} else {
System.out.println("Character not found.");
}
break;
case 4:
System.out.print("Enter an index to search: ");
int searchIndex = scanner.nextInt();
if (searchIndex >= 0 && searchIndex < str.length()) {
System.out.println("Character at index " + searchIndex + " is: " + str.charAt(searchIndex));
} else {
System.out.println("Invalid index.");
}
break;
case 5:
System.out.print("Enter a string to concatenate: ");
String concatStr = scanner.next();
str = str.concat(concatStr);
System.out.println("Concatenated string: " + str);
break;
case 6:
System.out.println("Exiting...");
System.exit(0);
break;
default:
System.out.println("Invalid choice.");
}
}
}
}
//Output:- Enter a string:
//Hello World!