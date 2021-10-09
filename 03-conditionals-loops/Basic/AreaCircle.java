import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        float r = in.nextFloat();
        double area = Math.PI * r * r;
        System.out.println("Area of circle: " + area);
    }
}

