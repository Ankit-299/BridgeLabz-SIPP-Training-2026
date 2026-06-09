// Similarly, write the DoubleOpt program by taking double values and doing the same operation

public class L2Question8 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();
        
        double result1 = a + b * c; // Multiplication has higher precedence than addition
        double result2 = a * b + c; // Multiplication has higher precedence than addition
        double result3 = c + a / b; // Division has higher precedence than addition
        double result4 = a % b + c; // Modulus has higher precedence than addition
        
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
        
        input.close();
    }

}