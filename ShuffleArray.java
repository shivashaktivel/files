package Practice;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ShuffleArray {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();
	        Integer[] array = new Integer[n];
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }
		
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			int randomIndexToSwap = rand.nextInt(array.length);
			int temp = array[randomIndexToSwap];
			array[randomIndexToSwap] = array[i];
			array[i] = temp;
		}
		System.out.println(Arrays.toString(array));
	}
}