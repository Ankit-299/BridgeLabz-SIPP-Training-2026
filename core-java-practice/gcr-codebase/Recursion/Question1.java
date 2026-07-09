// Problem 1: Print Numbers from N to 1
// Write a recursive function to print numbers from N to 1.
// Input: 
// N = 5
// Output: 
// 5 4 3 2 1

public class Question1 {
    public static void main(String[] args) {
        int N = 5;
        printNumbers(N);
    }

    public static void printNumbers(int N) {
        if (N < 1) {
            return; // Base case: stop recursion when N is less than 1
        }
        System.out.print(N + " "); // Print the current number
        printNumbers(N - 1); // Recursive call with N decremented by 1
    }
    
}
