// Write a program to split the text into words and find the shortest and longest strings in a
// given text
// Hint =&gt;
// a. Take user input using the Scanner nextLine() method
// b. Create a Method to split the text into words using the charAt() method without using the
// String built-in split() method and return the words.
// c. Create a method to find and return a string&#39;s length without using the length() method.
// d. Create a method to take the word array and return a 2D String array of the word and its
// corresponding length. Use String built-in function String.valueOf() to generate the String
// value for the number
// e. Create a Method that takes the 2D array of word and corresponding length as
// parameters, find the shortest and longest string and return them in an 1D int array.
// f. The main function calls the user-defined methods and displays the result.
import java.util.Scanner;
public class L2Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String[] wordsUsingCharAt = splitStringUsingCharAt(inputString);
        String[][] wordsWithLengths = getWordsWithLengths(wordsUsingCharAt);
        int[] shortestAndLongest = findShortestAndLongest(wordsWithLengths);

        System.out.println("Shortest word: " + wordsWithLengths[shortestAndLongest[0]][0] +
                " with length: " + wordsWithLengths[shortestAndLongest[0]][1]);
        System.out.println("Longest word: " + wordsWithLengths[shortestAndLongest[1]][0] +
                " with length: " + wordsWithLengths[shortestAndLongest[1]][1]);
    }
    
    public static String[] splitStringUsingCharAt(String text) {
        String[] words = new String[100];
        int wordCount = 0;
        String currentWord = "";
        
        for (int i = 0; i < getStringLength(text); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (getStringLength(currentWord) > 0) {
                    words[wordCount++] = currentWord;
                    currentWord = "";
                }
            } else {
                currentWord += ch;
            }
        }
        if (getStringLength(currentWord) > 0) {
            words[wordCount++] = currentWord;
        }
        
        String[] result = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            result[i] = words[i];
        }
        return result;
    }
    
    public static int getStringLength(String str) {
        int length = 0;
        try {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                str.charAt(i);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return length;
        }
        return length;
    }
    
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }
    
    public static int[] findShortestAndLongest(String[][] wordsWithLengths) {
        int shortestIndex = 0;
        int longestIndex = 0;
        int shortestLength = Integer.parseInt(wordsWithLengths[0][1]);
        int longestLength = Integer.parseInt(wordsWithLengths[0][1]);
        
        for (int i = 1; i < wordsWithLengths.length; i++) {
            int currentLength = Integer.parseInt(wordsWithLengths[i][1]);
            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestIndex = i;
            }
            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestIndex = i;
            }
        }
        
        return new int[] {shortestIndex, longestIndex};
    }
}
