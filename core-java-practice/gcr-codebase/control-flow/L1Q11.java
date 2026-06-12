// Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
// Hint => 
// Take the user input number and check whether it's a Natural number
// If it's a natural number Compute using formulae as well as compute using while loop
// Compare the two results and print the result
import java.util.*;
public class L1Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check if n is a natural number
        if (n >= 0) {
            // Compute using formula
            int formulaSum = n * (n + 1) / 2;

            // Compute using while loop
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
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
