// Write a program to split the text into words and return the words along with their lengths in a
// 2D array
// Hint =&gt;
// a. Take user input using the Scanner nextLine() method
// b. Create a Method to split the text into words using the charAt() method without using the
// String built-in split() method and return the words.
// c. Create a method to find and return a string&#39;s length without using the length() method.
// d. Create a method to take the word array and return a 2D String array of the word and its
// corresponding length. Use String built-in function String.valueOf() to generate the String
// value for the number
// e. The main function calls the user-defined method and displays the result in a tabular
// format. During display make sure to convert the length value from String to Integer and
// then display
import java.util.Scanner;
public class L2Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String[] wordsUsingCharAt = splitStringUsingCharAt(inputString);
        String[][] wordsWithLengths = getWordsWithLengths(wordsUsingCharAt);

        System.out.println("Word\tLength");
        for (String[] wordWithLength : wordsWithLengths) {
            System.out.println(wordWithLength[0] + "\t" + Integer.parseInt(wordWithLength[1]));
        }
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

    static String[] splitStringUsingCharAt(String s) {
        int n = lengthWithoutLength(s);
        int spaces = 0;
        for (int i = 0; i < n; i++) if (s.charAt(i) == ' ') spaces++;
        int parts = spaces + 1;
        String[] result = new String[parts];

        int partIndex = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                result[partIndex++] = sb.toString();
                sb.setLength(0);
            } else {
                sb.append(c);
            }
        }
        result[partIndex] = sb.toString(); // add last part
        return result;
    }

    static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(lengthWithoutLength(words[i]));
        }
        return result;
    }

    
}

