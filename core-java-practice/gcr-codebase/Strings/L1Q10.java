// 10. Write a program to convert the complete text to lowercase and compare the results
// Hint =&gt;
// a. Take user input using the Scanner nextLine() method to take the complete text into a
// String variable
// b. Write a method using the String built-in charAt() method to convert each character if it
// is uppercase to the lowercase. Use the logic ASCII value of &#39;a&#39; is 97 and &#39;A&#39; is 65 so the
// difference is 32, similarly ASCII value of &#39;b&#39; is 98 and &#39;B&#39; is 66 so the difference is 32, and
// so on
// c. Write a method to compare two strings using the charAt() method and return a boolean
// result
// d. In the main() use the String built-in method toLowerCase() to get the lowercase text
// and compare the two strings using the user-defined method. And finally display the
// result
import java.util.Scanner;
public class L1Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String lowerCaseUsingCharAt = convertToLowerCaseUsingCharAt(inputString);
        String lowerCaseUsingBuiltIn = inputString.toLowerCase();

        System.out.println("Lowercase using charAt(): " + lowerCaseUsingCharAt);
        System.out.println("Lowercase using built-in method: " + lowerCaseUsingBuiltIn);

        boolean comparisonResult = compareStrings(lowerCaseUsingCharAt, lowerCaseUsingBuiltIn);
        System.out.println("Are both lowercase strings equal? " + comparisonResult);
    }

    public static String convertToLowerCaseUsingCharAt(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
}
