import java.io.BufferedWriter;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Q3 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter your diary entry:");
String entry = scanner.nextLine();
File diaryFile = new File("diary.txt");
if (!diaryFile.exists()) {
System.out.println("The file diary.txt does not exist. Creating a new file.");
try {
diaryFile.createNewFile();
} catch (IOException e) {
System.err.println("Error creating file: " + e.getMessage());
return;
}
}
try (BufferedWriter writer = new BufferedWriter(new FileWriter(diaryFile, true))) {
writer.write(getCurrentDate());
writer.newLine();
writer.write(entry);
System.out.println("Your diary entry has been successfully appended to diary.txt");
} catch (IOException e) {
System.err.println("Error writing to file: " + e.getMessage());
}
}
private static String getCurrentDate() {
return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
}
}
//Output:- Enter your diary entry:
//I also finished my homework today. Your diary entry has been successfully appended to diary.txt
//diary.txt
//2023-03-15 14:22:12
//Today was a great day! I had a lot of fun with my friends. 2023-03-15 14:22:12
//I also finished my homework today. 