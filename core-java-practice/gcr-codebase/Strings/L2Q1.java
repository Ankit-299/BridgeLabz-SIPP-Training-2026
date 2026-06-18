// Write a program to find and return the length of a string without using the length() method
// Hint =&gt;
// a. Take user input using the Scanner next() method
// b. Create a method to find and return a string&#39;s length without using the built-in length()
// method. The logic for this is to use the infinite loop to count each character till the
// charAt() method throws a runtime exception, handles the exception, and then return
// the count
// c. The main function calls the user-defined method as well as the built-in length() method
// and displays the result
import java.util.Scanner;
public class L2Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int lengthUsingCharAt = getStringLengthUsingCharAt(inputString);
        int lengthUsingBuiltIn = inputString.length();

        System.out.println("Length using charAt(): " + lengthUsingCharAt);
        System.out.println("Length using built-in method: " + lengthUsingBuiltIn);
    }

    public static int getStringLengthUsingCharAt(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
          
        }
        return count;
    }

    
}
