// Write a program to create a substring from a String using the charAt() method. Also, use
// the String built-in method substring() to find the substring of the text. Finally Compare the
// the two strings and display the results
// Hint =&gt;
// a. Take user input using the Scanner next() method to take the String variable and also
// the start and the end index to get the substring from the given text
// b. Write a method to create a substring from a string using the charAt() method with the
// string, start, and end index as the parameters
// c. Write a method to compare two strings using the charAt() method and return a boolean
// result
// d. Use the String built-in method substring() to get the substring and compare the two
// strings. And finally display the result
import java.util.Scanner;
public class L1Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();
        System.out.print("Enter the start index for substring: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter the end index for substring: ");
        int endIndex = scanner.nextInt();

        String substringUsingCharAt = createSubstringUsingCharAt(originalString, startIndex, endIndex);
        String substringUsingBuiltIn = originalString.substring(startIndex, endIndex);

        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using built-in method: " + substringUsingBuiltIn);

        boolean comparisonResult = compareStrings(substringUsingCharAt, substringUsingBuiltIn);
        System.out.println("Are both substrings equal? " + comparisonResult);
    }

    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
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
