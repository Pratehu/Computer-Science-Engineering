 import java.util.Scanner;
public class Q7 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = scanner.nextLine();
char[] charArray = str.toCharArray();
System.out.print("Enter a character to search: ");
char searchChar = scanner.next().charAt(0);
int firstIndex = -1, lastIndex = -1;
for (int i = 0; i < charArray.length; i++) {
if (charArray[i] == searchChar) {
if (firstIndex == -1) {
firstIndex = i;
}
lastIndex = i;
}
}
if (firstIndex != -1) {
System.out.println("Character array:");
for (int i = 0; i < charArray.length; i++) {
System.out.print(charArray[i] + " ");
}
System.out.println("\nFirst occurrence of '" + searchChar + "': " + firstIndex);
System.out.println("Last occurrence of '" + searchChar + "': " + lastIndex);
} else {
System.out.println("Character '" + searchChar + "' not found in the string.");
}
}
}
//Output:- Enter a string:
//Hello World!
//Enter a character to search:
//o
//Character array:
//H e l l o W o r l d !
//First occurrence of 'o': 4
//Last occurrence of 'o': 7