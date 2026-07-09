// Problem 2: Calculate Factorial
// Write a recursive function to calculate the factorial of a number.
// Input:
// 5
// Output:
// 120
public class Question2 {
    public static void main(String[]args){
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);

    }
    public static int factorial(int n){
        if(n==0||n==1){
            return 1; // Base case: factorial of 0 or 1 is 1
        }else{
            return n * factorial(n-1); // Recursive case: n! = n * (n-1)!
        }  
     }
}
