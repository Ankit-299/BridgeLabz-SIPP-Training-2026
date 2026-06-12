// Write a program to check if the first is the smallest of the 3 numbers.
// I/P => number1, number2, number3
// O/P => Is the first number the smallest? ____
import java.util.Scanner;
public class L1Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        boolean isFirstSmallest = (number1 < number2) && (number1 < number3);
        System.out.println("Is the first number the smallest? " + isFirstSmallest);
    }
    
}
