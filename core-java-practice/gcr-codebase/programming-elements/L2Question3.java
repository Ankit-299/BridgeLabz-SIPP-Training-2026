
public class L2Question3 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print("Enter the length of the rectangle in cm: ");
        double lengthCm = input.nextDouble();
        
        System.out.print("Enter the width of the rectangle in cm: ");
        double widthCm = input.nextDouble();
        
        double areaCm2 = lengthCm * widthCm;
        double areaIn2 = areaCm2 / Math.pow(2.54, 2);
        
        System.out.println("The Area of the rectangle in sq in is " + areaIn2 + " and sq cm is " + areaCm2);
        
        input.close();
    }
    
}
