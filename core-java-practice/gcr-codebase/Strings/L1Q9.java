// Write a program to convert the complete text to uppercase and compare the results
// Hint =&gt;
// a. Take user input using the Scanner nextLine() method to take the complete text into a
// String variable
// b. Write a method using the String built-in charAt() method to convert each character if it
// is lowercase to the uppercase. Use the logic ASCII value of &#39;a&#39; is 97 and &#39;A&#39; is 65 so the
// difference is 32, similarly ASCII value of &#39;b&#39; is 98 and &#39;B&#39; is 66 so the difference is 32, and
// so on
// c. Write a method to compare two strings using the charAt() method and return a boolean
// result
// d. In the main() use the String built-in method toUpperCase() to get the uppercase text
// and compare the two strings using the user-defined method. And finally display the
// result
import java.util.Scanner;
public class L1Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String upperCaseUsingCharAt = convertToUpperCaseUsingCharAt(inputString);
        String upperCaseUsingBuiltIn = inputString.toUpperCase();

        System.out.println("Uppercase using charAt(): " + upperCaseUsingCharAt);
        System.out.println("Uppercase using built-in method: " + upperCaseUsingBuiltIn);

        boolean comparisonResult = compareStrings(upperCaseUsingCharAt, upperCaseUsingBuiltIn);
        System.out.println("Are both uppercase strings equal? " + comparisonResult);
    }

    public static String convertToUpperCaseUsingCharAt(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
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
