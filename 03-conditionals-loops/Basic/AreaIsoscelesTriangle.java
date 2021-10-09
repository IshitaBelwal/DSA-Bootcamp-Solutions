import java.util.Scanner;

public class AreaIsoscelesTriangle {
    public static void main(String[] args) {
        System.out.println("enter equal side of triangle: ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.println("enter third side of triangle: ");
        float b = sc.nextFloat();
        double height,area;
        height= Math.sqrt(a*a - (b*b)/4);
        // pythagoras theorem
        area= b*height*1/2;
        System.out.println("Area is :"+ area);
    }
}
