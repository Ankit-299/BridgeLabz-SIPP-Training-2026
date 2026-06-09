// Write a program that takes the base and height in cm to find the area of a triangle in square inches and square centimeters 
// Hint => Area of a Triangle is ½ * base * height and 1 in = 2.54 cm
// I/P => base, height
// O/P => The Area of the triangle in sq in is ___ and sq cm is ___
public class L2Question2 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print("Enter the base of the triangle in cm: ");
        double baseCm = input.nextDouble();
        
        System.out.print("Enter the height of the triangle in cm: ");
        double heightCm = input.nextDouble();
        
        double areaCm2 = 0.5 * baseCm * heightCm;
        double areaIn2 = areaCm2 / Math.pow(2.54, 2);
        
        System.out.println("The Area of the triangle in sq in is " + areaIn2 + " and sq cm is " + areaCm2);
        
        input.close();
    }
    
}
