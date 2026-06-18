// /Write a program to compare two strings using the charAt() method and check the result
// with the built-in String equals() method
// Hint =&gt;
// a. Take user input using the Scanner next() method for 2 String variables
// b. Write a method to compare two strings using the charAt() method and return a boolean
// result
// c. Use the String Built-In method to check if the results are the same and display the result
import java.util.Scanner;
public class L1Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.next();
        System.out.print("Enter the second string: ");
        String str2 = scanner.next();

        boolean charAtResult = compareStrings(str1, str2);
        boolean equalsResult = str1.equals(str2);

        System.out.println("Result using charAt(): " + charAtResult);
        System.out.println("Result using equals(): " + equalsResult);
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
