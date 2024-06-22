import java.util.Scanner;
public class Q4{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
StringBuilder sb = new StringBuilder();
while (true) {
System.out.println("\nStringBuilder Example Menu:");
System.out.println("1. Add a substring at a specified position");
System.out.println("2. Remove a range of characters from the string");
System.out.println("3. Modify a character at a specified index");
System.out.println("4. Concatenate another string at the end");
System.out.println("5. Display the current string");
System.out.println("6. Exit");
System.out.print("Enter your choice: ");
int choice = scanner.nextInt();
if (choice == 1) {
System.out.print("Enter the position to insert the substring: ");
int position = scanner.nextInt();
System.out.print("Enter the substring to insert: ");
String substring = scanner.next();
sb.insert(position, substring);
System.out.println("Current string: " + sb);
} else if (choice == 2) {
System.out.print("Enter the start index of the range to remove: ");
int startIndex = scanner.nextInt();

System.out.print("Enter the end index of the range to remove: ");
int endIndex = scanner.nextInt();
sb.delete(startIndex, endIndex);
System.out.println("Current string: " + sb);
} else if (choice == 3) {
System.out.print("Enter the index of the character to modify: ");
int index = scanner.nextInt();
System.out.print("Enter the new character: ");
char newChar = scanner.next().charAt(0);
sb.setCharAt(index, newChar);
System.out.println("Current string: " + sb);
} else if (choice == 4) {
System.out.print("Enter the string to concatenate: ");
String concatString = scanner.next();
sb.append(concatString);
System.out.println("Current string: " + sb);
} else if (choice == 5) {
System.out.println("Current string: " + sb);
} else if (choice == 6) {
break;
} else {
System.out.println("Invalid choice. Please try again.");
}
}
scanner.close();
}
}
//Output:- StringBuilder Example Menu:
//1. Add a substring at a specified position
//2. Remove a range of characters from the string
//3. Modify a character at a specified index
//4. Concatenate another string at the end
//5. Display the current string
//6. Exit
//Enter your choice: 1
//Enter the position to insert the substring: 2
//Enter the substring to insert: "world" Current string: "hello world" StringBuilder Example Menu:
//1. Add a substring at a specified position
//2. Remove a range of characters from the string
//3. Modify a character at a specified index
//4. Concatenate another string at the end
//5. Display the current string
//6. Exit
//Enter your choice: 2
//Enter the start index of the range to remove: 2
//Enter the end index of the range to remove: 5
//Current string: "hell" StringBuilder Example Menu:
//1. Add a substring at a specified position

//2. Remove a range of characters from the string
//3. Modify a character at a specified index
//4. Concatenate another string at the end
//5. Display the current string
//6. Exit
//Enter your choice: 3
//Enter the index of the character to modify: 1
//Enter the new character: 'i' Current string: "hili" StringBuilder Example Menu:
//1. Add a substring at a specified position
//2. Remove a range of characters from the string
//3. Modify a character at a specified index
//4. Concatenate another string at the end
//5. Display the current string
//6. Exit
//Enter your choice: 4
//Enter the string to concatenate: " Java" Current string: "hili Java" StringBuilder Example Menu:
//1. Add a substring at a specified position
//2. Remove a range of characters from the string
//3. Modify a character at a specified index
//4. Concatenate another string at the end
//5. Display the current string
//6. Exit
//Enter your choice: 5
//Current string: "hili Java" StringBuilder Example Menu:
//1. Add a substring at a specified position
//2. Remove a range of characters from the string
//3. Modify a character at a specified index
//4. Concatenate another string at the end
//5. Display the current string
//6. Exit
//Enter your choice: 6