// 1. Username Validator 
// A company wants to validate usernames entered by users.
// Write a program that:
// Accepts a username.
// Checks whether it contains any spaces.
// Counts the total number of characters.
// Converts the username to uppercase.
// Displays whether the username is a palindrome.
import java.util.Scanner;
public class ScenarioBased {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a username:");
        String username=sc.nextLine();
        // Check for spaces
        if(username.contains(" ")){
            System.out.println("Username should not contain spaces.");
        } else {
            System.out.println("Username is valid.");
        } 
        // count characters
        int charCount=username.length();
        System.out.println("Total number of characters: "+charCount);
       //uppercase
       String upperUsername=username.toUpperCase();
       System.out.println("Username in uppercase: "+upperUsername);
       // palindrome check 
         String reversedUsername=new StringBuilder(username).reverse().toString();
        if(username.equalsIgnoreCase(reversedUsername)){
            System.out.println("The username is a palindrome.");
        }
    }
    
}
