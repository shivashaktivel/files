package Practice;

import java.io.*;
import java.util.Scanner;

public class Score{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the file name
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        // Initialize variables to store total and count of scores
        int total = 0;
        int count = 0;

        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            // Read scores from the file and calculate total and count
            while (fileScanner.hasNextInt()) {
                int score = fileScanner.nextInt();
                total += score;
                count++;
            }

            // Calculate average
            double average = count > 0 ? (double) total / count : 0.0;

            // Display total and average
            System.out.println("Total: " + total);
            System.out.println("Average: " + average);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileName);
        } catch (Exception e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
