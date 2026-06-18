// Write a program to demonstrate ArrayIndexOutOfBoundsException
// Hint =&gt;
// a. Define a variable of array of names and take input from the user
// b. Write a Method to generate the Exception. Here access index larger then the length of
// the array. This will generate a runtime exception and abruptly stop the program.
// c. Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access
// index larger then the length of the array. This will generate a runtime exception. Use the
// try-catch block to handle the ArrayIndexOutOfBoundsException and the generic
// runtime exception
// d. From the main Firstly call the method to generate the Exception then call the method to
// handle the RuntimeException
import java.util.Scanner;
public class L1Q8 {
    public static void main(String[] args) {
        // Call the method to generate ArrayIndexOutOfBoundsException
        generateArrayIndexOutOfBoundsException();

        // Call the method to handle ArrayIndexOutOfBoundsException
        handleArrayIndexOutOfBoundsException();
    }

    public static void generateArrayIndexOutOfBoundsException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        String[] names = new String[size];

        // This will throw ArrayIndexOutOfBoundsException if index is out of bounds
        System.out.println(names[size]); // Accessing index equal to size
    }

    public static void handleArrayIndexOutOfBoundsException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        String[] names = new String[size];

        try {
            System.out.println(names[size]); // Accessing index equal to size
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e);
        }
    }
    
}
