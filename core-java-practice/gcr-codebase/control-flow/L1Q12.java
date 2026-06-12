// Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
// Hint => 
// Take the user input number and check whether it's a Natural number
// If it's a natural number Compute using formulae as well as compute using for loop
// Compare the two results and print the result
import java.util.*;
public class L1Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check if n is a natural number
        if (n >= 0) {
            // Compute using formula
            int formulaSum = n * (n + 1) / 2;

            // Compute using for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Compare the results
            if (formulaSum == loopSum) {
                System.out.println("The sum of " + n + " natural numbers is: " + formulaSum);
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("There is an error in the computations.");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }
    }
    
}
