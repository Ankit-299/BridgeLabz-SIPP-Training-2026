// Write a program to find vowels and consonants in a string and display the character type -
// Vowel, Consonant, or Not a Letter
// Hint =&gt;
// a. Create a method to check if the character is a vowel or consonant and return the result.
// The logic used here is as follows:
// i. Convert the character to lowercase if it is an uppercase letter using the ASCII values
// of the characters
// ii. Check if the character is a vowel or consonant and return Vowel, Consonant, or Not
// a Letter
// b. Create a Method to find vowels and consonants in a string using charAt() method and
// return the character and vowel or consonant in a 2D array
// c. Create a Method to display the 2D Array of Strings in a Tabular Format
// d. Finally, the main function takes user inputs, calls the user-defined methods, and displays
// the result.
import java.util.Scanner;
public class L2Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String[][] charTypes = getCharTypes(inputString);
        displayCharTypes(charTypes);
    }

    private static String[][] getCharTypes(String input) {
        int length = input.length();
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = getCharType(ch);
        }
        return result;
    }

    private static String getCharType(char ch) {
        if (Character.isLetter(ch)) {
            char lower = Character.toLowerCase(ch);
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    private static void displayCharTypes(String[][] charTypes) {
        System.out.println("Character\tType");
        for (String[] charType : charTypes) {
            System.out.println(charType[0] + "\t\t" + charType[1]);
        }
    }

    
}
