package Practice;
import java.io.*;

public class RemoveStringFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\krithivarsha\\OneDrive\\Desktop\\filetest.txt\\";
        String targetString = "love"; // String to be removed

        // Read the content of the text file
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                contentBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        String content = contentBuilder.toString();

        // Replace all occurrences of the specified string with an empty string
        content = content.replaceAll(targetString, "");

        // Write the modified content back to the text file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("All occurrences of \"" + targetString + "\" removed from the file.");
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }
}
