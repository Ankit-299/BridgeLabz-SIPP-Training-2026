// Write a program to trim the leading and trailing spaces from a string using the charAt()
// method
// Hint =&gt;
// a. Create a method to trim the leading and trailing spaces from a string using the charAt()
// method. Inside the method run a couple of loops to trim leading and trailing spaces and
// determine the starting and ending points with no spaces. Return the start point and end
// point in an array
// b. Write a method to create a substring from a string using the charAt() method with the
// string, start, and end index as the parameters
// c. Write a method to compare two strings using the charAt() method and return a boolean
// result
// d. The main function calls the user-defined trim and substring methods to get the text after
// trimming the leading and trailing spaces. Post that use the String built-in method trim()
// to trim spaces and compare the two strings. And finally display the result
import java.util.Scanner;
public class L2Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing spaces: ");
        String inputString = scanner.nextLine();

        int[] trimIndices = trimSpacesUsingCharAt(inputString);
        String trimmedStringUsingCharAt = createSubstringUsingCharAt(inputString, trimIndices[0], trimIndices[1]);
        String trimmedStringUsingBuiltIn = inputString.trim();

        System.out.println("Trimmed string using charAt(): '" + trimmedStringUsingCharAt + "'");
        System.out.println("Trimmed string using built-in trim(): '" + trimmedStringUsingBuiltIn + "'");

        boolean comparisonResult = compareStrings(trimmedStringUsingCharAt, trimmedStringUsingBuiltIn);
        System.out.println("Are both trimmed strings equal? " + comparisonResult);
    }

    public static int[] trimSpacesUsingCharAt(String str) {
        int start = 0;
        int end = str.length();
        while (start < end && str.charAt(start) == ' ') {
            start++;
        }
        while (end > start && str.charAt(end - 1) == ' ') {
            end--;
        }
        return new int[] { start, end };
    }

    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return s1 == s2;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
