package Practice;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexAccess {
    public static void main(String[] args) {
        // Create an array with 100 randomly chosen integers
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000); // Random integers between 0 and 999
        }

        // Prompt the user to enter the index
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the array: ");
        int index = scanner.nextInt();

        // Display the corresponding element value or "Out of Bounds" message
        if (index >= 0 && index < array.length) {
            System.out.println("Element value at index " + index + ": " + array[index]);
        } else {
            System.out.println("Out of Bounds");
        }
    }
}
