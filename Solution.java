package Practice;
import java.io.*;
import java.util.*;

class Solution {
	 public static void main(String args[]) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = scanner.nextLine();
	        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
	        char[] arr = str.toCharArray();
	        for (char c : arr) {
	        	 if (count.containsKey(c)) {
	                    count.put(c, count.get(c) + 1);
	                } else {
	                    count.put(c, 1);
	                }
	        }
	        for (char c : count.keySet()) {
	            System.out.println("Occurrences of " + c + " = " + count.get(c));
	        }
	    }
}


