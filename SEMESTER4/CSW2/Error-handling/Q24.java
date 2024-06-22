package lab5;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q24 {
    public static void main(String[] args) {
        String filename = "nonexistent_file.txt"; // File that does not exist

        try {
            // Attempt to open the file for reading
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            // If the file exists, read and display its contents
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the file
            reader.close();
        } catch (FileNotFoundException e) {
            // Catch and handle FileNotFoundException
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            // Catch and handle IOException (other I/O errors)
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
