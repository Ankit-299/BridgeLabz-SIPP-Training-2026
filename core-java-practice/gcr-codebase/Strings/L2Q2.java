// Write a program to split the text into words, compare the result with the split() method and
// display the result
// Hint =&gt;
// a. Take user input using the Scanner nextLine() method
// b. Create a Method to find the length of the String without using the built-in length()
// method.
// c. Create a Method to split the text into words using the charAt() method without using the
// String built-in split() method and return the words. Use the following logic
// i. Firstly Count the number of words in the text and create an array to store the
// indexes of the spaces for each word in a 1D array
// ii. Then Create an array to store the words and use the indexes to extract the words
// d. Create a method to compare the two String arrays and return a boolean
// e. The main function calls the user-defined method and the built-in split() method. Call the
// user defined method to compare the two string arrays and display the result
import java.util.Scanner;
public class L2Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String[] wordsUsingCharAt = splitStringUsingCharAt(inputString);
        String[] wordsUsingBuiltIn = inputString.split(" ");

        System.out.println("Words using charAt(): " + java.util.Arrays.toString(wordsUsingCharAt));
        System.out.println("Words using built-in split(): " + java.util.Arrays.toString(wordsUsingBuiltIn));

        boolean comparisonResult = compareStringArrays(wordsUsingCharAt, wordsUsingBuiltIn);
        System.out.println("Are both word arrays equal? " + comparisonResult);
    }   

    static int lengthWithoutLength(String s) {
        int len = 0;
        try {
            while (true) { s.charAt(len); len++; }
        } catch (IndexOutOfBoundsException e) {
            // reached end
        }
        return len;
    }

    // Split using charAt() (mimics String.split(" ") behaviour)
    static String[] splitStringUsingCharAt(String s) {
        int n = lengthWithoutLength(s);
        // count spaces to determine number of parts = spaces+1
        int spaces = 0;
        for (int i = 0; i < n; i++) if (s.charAt(i) == ' ') spaces++;
        int parts = spaces + 1;
        String[] result = new String[parts];

        int partIndex = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                // finish current part
                result[partIndex++] = sb.toString();
                sb.setLength(0);
            } else {
                sb.append(c);
            }
        }
        // add last part
        if (partIndex < parts) result[partIndex++] = sb.toString();

        return result;
    }

    static boolean compareStringArrays(String[] a, String[] b) {
        if (a == null || b == null) return a == b;
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                if (b[i] != null) return false;
            } else if (!a[i].equals(b[i])) return false;
        }
        return true;
    }
}
