// Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
// Hint => 
// Use infinite while loop as in while (true)
// Take the user entry and check if the user entered 0 or a negative number to break the loop using break;
import java.util.*;
public class L1Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double userInput;

        System.out.println("Enter numbers to sum (enter 0 or a negative number to stop):");
        while (true) {
            userInput = sc.nextDouble();
            if (userInput == 0 || userInput < 0) {
                break;
            }
            total += userInput;
        }
        System.out.println("The sum of the entered numbers is: " + total);
    }
}
