package Practice;
import java.io.*;

public class Filecount{
    public static void main(String[] args) {
        String filePath = "input.txt"; // Path to the input text file

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length(); // Counting characters in the line

                String[] words = line.split("\\s+"); // Split line into words using whitespace characters
                wordCount += words.length; // Counting words in the line
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        // Displaying the statistics
        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of lines: " + lineCount);
    }
}
