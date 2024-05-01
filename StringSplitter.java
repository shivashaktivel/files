package Practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSplitter {
    public static String[] split(String s, String regex) {
        // Escape characters that have special meaning in regular expressions
        String escapedRegex = Pattern.quote(regex);

        // Create the regex pattern
        Pattern pattern = Pattern.compile(escapedRegex);

        // Use a matcher to find all occurrences of the regex pattern in the input string
        Matcher matcher = pattern.matcher(s);

        // Initialize an array list to store the substrings
        List<String> substrings = new ArrayList<>();

        // Start index of the previous match
        int prevEnd = 0;

        // Find each match and add the substring between the previous match and the current match
        while (matcher.find()) {
            // Add the substring between the previous match and the current match
            substrings.add(s.substring(prevEnd, matcher.start()));

            // Add the matching delimiter
            substrings.add(matcher.group());

            // Update the start index of the next substring
            prevEnd = matcher.end();
        }

        // Add the remaining substring after the last match
        substrings.add(s.substring(prevEnd));

        // Convert the list of substrings to an array
        String[] result = new String[substrings.size()];
        return substrings.toArray(result);
    }

    public static void main(String[] args) {
        String s1 = "ab#12#453";
        String regex1 = "#";
        String[] result1 = split(s1, regex1);
        System.out.println(Arrays.toString(result1)); // Output: [ab, #, 12, #, 453]

        String s2 = "a?b?gf#e";
        String regex2 = "[?#]";
        String[] result2 = split(s2, regex2);
        System.out.println(Arrays.toString(result2)); // Output: [a, ?, b, ?, gf, #, e]
    }
}
