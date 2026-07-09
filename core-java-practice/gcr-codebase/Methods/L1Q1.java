import java.util.Scanner;

// Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
// Hint =&gt;
// a. Simple Interest = Principal * Rate * Time / 100
// b. Take user input for principal, rate, time
// c. Write a method to calculate the simple interest given principle, rate and time as
// parameters
// d. Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”
public class L1Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the Rate of Interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the Time (in years): ");
        double time = scanner.nextDouble();

        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f%n",
                simpleInterest, principal, rate, time);
    }

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
    
}
