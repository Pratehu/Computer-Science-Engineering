import java.io.File;
import java.util.Scanner;
public class Q6 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the directory path:");
String directoryPath = scanner.nextLine();
File directory = new File(directoryPath);
if (!directory.exists()) {

System.out.println("The directory does not exist.");
return;
}
if (!directory.isDirectory()) {
System.out.println("The given path is not a directory.");
return;
}
File[] files = directory.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));
for (File file : files) {
System.out.println("File: " + file.getName());
}
}
}
//Output:- Enter the directory path:
///home/user/documents
//File: document1.txt
//File: document2.txt
//File: report.txt