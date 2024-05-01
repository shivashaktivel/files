package Practice;
import java.util.*;

public class EmployeeHours {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of employees: ");
	        int numEmployees = scanner.nextInt();
	        System.out.print("Enter the number of days: ");
	        int numDays = scanner.nextInt();
	        int[][] weeklyHours = new int[numEmployees][numDays];
	        for (int i = 0; i < numEmployees; i++) {
	            System.out.println("Enter work hours for employee " + (i + 1) + ":");
	            for (int j = 0; j < numDays; j++) {
	                System.out.print("Day " + (j + 1) + ": ");
	                weeklyHours[i][j] = scanner.nextInt();
	            }
	        }

	        int[] totalHours = new int[numEmployees];
	        for (int i = 0; i < numEmployees; i++) {
	            totalHours[i] = calculateTotalHours(weeklyHours[i]);
	        }

	        sortEmployees(numEmployees, totalHours, weeklyHours);

	        System.out.println("Employees and their total hours in decreasing order:");
	        for (int i = 0; i < numEmployees; i++) {
	            int employeeNumber = i + 1;
	            int employeeTotalHours = totalHours[i];
	            System.out.println("Employee " + employeeNumber + ": " + employeeTotalHours + " hours");
	        }
	    }

	    public static int calculateTotalHours(int[] hours) {
	        int total = 0;
	        for (int hour : hours) {
	            total += hour;
	        }
	        return total;
	    }

	    public static void sortEmployees(int numEmployees, int[] totalHours, int[][] weeklyHours) {
	        for (int i = 0; i < numEmployees - 1; i++) {
	            for (int j = i + 1; j < numEmployees; j++) {
	                if (totalHours[j] > totalHours[i]) {
	                  
	                    int tempHours = totalHours[i];
	                    totalHours[i] = totalHours[j];
	                    totalHours[j] = tempHours;
	                 
	                    int[] tempWeeklyHours = weeklyHours[i];
	                    weeklyHours[i] = weeklyHours[j];
	                    weeklyHours[j] = tempWeeklyHours;
	                }
	            }
	        }
	    }
	}