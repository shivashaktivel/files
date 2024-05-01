package Practice;
import java.util.*;

public class DuplicateEliminator {
    public static int[] eliminateDuplicates(int[] list) {
        Set<Integer> set = new HashSet<>();
        for (int num : list) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter ten integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int[] result = eliminateDuplicates(numbers);

        System.out.println("Array after eliminating duplicates:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
