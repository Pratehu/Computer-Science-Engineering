import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Q2 {
public static void main(String[] args) {
File diaryFile = new File("diary.txt");
if (!diaryFile.exists()) {
System.out.println("The file diary.txt does not exist.");
return;
}
try (BufferedReader reader = new BufferedReader(new FileReader(diaryFile))) {
String line;
while ((line = reader.readLine()) != null) {
System.out.println(line);
}
} catch (IOException e) {
System.err.println("Error reading from file: " + e.getMessage());
}
}
}
//Output:- 2023-03-15 14:22:12
//Today was a great day! I had a lot of fun with my friends. 