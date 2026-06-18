// Write a program to demonstrate NullPointerException.
// Hint =&gt;
// a. Write a Method to generate the Exception. Here define the variable text and initialize it to
// null. Then call one of the String Method to generate the exception
// e. Write the Method to demonstrate NullPointerException. Here define the variable text
// and initialize it to null. Then write try catch block for handling the Exception while
// accessing one of the String method
// b. From the main Firstly call the method to generate the Exception then refactor the code to
// call the method to handle the RuntimeException
import java.util.Scanner;
public class L1Q4 {
    public static void main(String[] args) {
        // Call the method to generate NullPointerException
        generateNullPointerException();

        // Call the method to handle NullPointerException
        handleNullPointerException();
    }
    
    public static void generateNullPointerException() {
        String text = null;
        // This will throw NullPointerException
        System.out.println(text.length());
    }

    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e);
        }
    }
}
