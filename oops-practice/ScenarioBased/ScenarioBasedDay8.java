// A hospital billing system must never crash. Wrap division-by-zero
// (bills with zero items), array out-of-bounds (invalid patient index),
// and number format exceptions (bad input) with meaningful
// messages. Create a custom InsufficientFundsException for payment
// failures.
public class ScenarioBasedDay8 {
    public static void main(String[] args) {
        try {
            int items = 0; // Simulating zero items
            double billAmount = 100.0;
            double averageCost = billAmount / items; // This will throw ArithmeticException
            System.out.println("Average cost per item: " + averageCost);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot calculate average cost with zero items.");
        }

        try {
            int[] patientIds = {101, 102, 103};
            int index = 5; // Simulating invalid index
            System.out.println("Patient ID: " + patientIds[index]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        }

        try {
            String input = "abc"; // Simulating bad input
            int payment = Integer.parseInt(input); // This will throw NumberFormatException
            System.out.println("Payment amount: " + payment);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input for payment amount.");
        }

        try {
            processPayment(50.0, 100.0); // Simulating insufficient funds
        } catch (InsufficientFundsException e) {
            System.out.println("Payment failed: " + e.getMessage());
        }
    }

    public static void processPayment(double amountDue, double amountPaid) throws InsufficientFundsException {
        if (amountPaid < amountDue) {
            throw new InsufficientFundsException("Amount paid is less than the amount due.");
        }
        System.out.println("Payment processed successfully.");
    }
    
    public static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }
}
