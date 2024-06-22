package lab5;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q23 {
    public static void main(String[] args) {
        String filename = "data.txt"; // Change this to your file's name

        try {
            // Open the file for reading
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            // Read data line by line and perform processing
            String line;
            while ((line = reader.readLine()) != null) {
                // Process each line of data (for example, print it)
                System.out.println(line);
            }

            // Close the file
            reader.close();
        } catch (IOException e) {
            // Handle IOException
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
