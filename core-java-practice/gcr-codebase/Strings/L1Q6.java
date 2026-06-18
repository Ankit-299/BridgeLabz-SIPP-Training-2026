// Write a program to demonstrate StringIndexOutOfBoundsException
// Hint =&gt;
// a. Define a variable of type String and take user input to assign a value
// b. Write a Method to generate the Exception. Access the index using charAt() beyond the
// length of the String. This will generate a runtime exception and abruptly stop the
// program.
// c. Write the Method to demonstrate StringIndexOutOfBoundsException. Access the
// index using charAt() beyond the length of the String. Then write try catch block for
// Exception while accessing the String method
// d. From the main Firstly call the method to generate the Exception then call the method to
// handle the RuntimeException
import java.util.Scanner;
public class L1Q6 {
    public static void main(String[] args) {
        // Call the method to generate StringIndexOutOfBoundsException
        generateStringIndexOutOfBoundsException();

        // Call the method to handle StringIndexOutOfBoundsException
        handleStringIndexOutOfBoundsException();
    }

    public static void generateStringIndexOutOfBoundsException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        // This will throw StringIndexOutOfBoundsException if index is out of bounds
        System.out.println(text.charAt(text.length())); // Accessing index equal to length
    }

    public static void handleStringIndexOutOfBoundsException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        try {
            System.out.println(text.charAt(text.length())); // Accessing index equal to length
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException: " + e);
        }
    }
    
}
