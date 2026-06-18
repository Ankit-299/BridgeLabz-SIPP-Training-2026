// Write a program to find vowels and consonants in a string and display the count of Vowels
// and Consonants in the string
// Hint =&gt;
// a. Create a method to check if the character is a vowel or consonant and return the result.
// The logic used here is as follows:
// i. Convert the character to lowercase if it is an uppercase letter using the ASCII values
// of the characters
// ii. Check if the character is a vowel or consonant and return Vowel, Consonant, or Not
// a Letter
// b. Create a Method to Method to find vowels and consonants in a string using charAt()
// method and finally return the count of vowels and consonants in an array
// c. Finally, the main function takes user inputs, calls the user-defined methods, and displays
// the result.
import java.util.Scanner;
public class L2Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int[] counts = countVowelsAndConsonants(inputString);
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
    }
    
    private static int[] countVowelsAndConsonants(String input) {
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[] {vowels, consonants};
    }
}
