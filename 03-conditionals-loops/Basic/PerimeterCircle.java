import java.util.Scanner;

public class PerimeterCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius: ");
        float r = sc.nextFloat();

        System.out.println("parameter is: "+ 2*Math.PI*r);
    }
}
