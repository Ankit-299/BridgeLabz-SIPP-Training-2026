// Write a program to demonstrate NumberFormatException
// Hint =&gt;
// a. Define a variable to take user input as a String
// b. Use Integer.parseInt() to generate this exception. Integer.parseInt() is a built-in
// function in java.lang.Integer class to extract the number from text. In case the text does
// not contain numbers the method will throw NumberFormatException which is a runtime
// exception
// c. Write a Method to generate the Exception. Use Integer.parseInt(text) to extract
// number from the text. This will generate a runtime exception and abruptly stop the
// program.
// d. Write the Method to demonstrate NumberFormatException. Use
// Integer.parseInt(text) to extract number from the text. This will generate a runtime
// exception. Use the try-catch block to handle the NumberFormatException as well as
// the generic runtime exception
// e. From the main Firs    tly call the method to generate the Exception then call the method to
// handle the RuntimeException
public class L1Q7 {
    public static void main(String[] args) {
        // Call the method to generate NumberFormatException
        generateNumberFormatException();

        // Call the method to handle NumberFormatException
        handleNumberFormatException();
    }

    private static void generateNumberFormatException() {
        String text = "abc";
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    private static void handleNumberFormatException() {
        String text = "abc";
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException ex) {
            System.out.println("NumberFormatException caught: " + ex.getMessage());
        } catch (RuntimeException ex) {
            System.out.println("RuntimeException caught: " + ex.getMessage());
        }
    }
}
