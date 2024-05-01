package Practice;
import java.util.Scanner;

public class AverageCalculator {
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] values = new double[10];

        System.out.println("Enter ten double values:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            values[i] = scanner.nextDouble();
        }

        double averageValue = average(values);
        System.out.println("Average value: " + averageValue);
    }
}
