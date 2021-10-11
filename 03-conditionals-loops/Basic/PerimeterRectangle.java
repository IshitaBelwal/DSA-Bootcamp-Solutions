import java.util.Scanner;

public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of rectangle: ");
        float l = sc.nextFloat();
        System.out.println("enter the breadth of rectangle: ");
        float b = sc.nextFloat();

        System.out.println("parameter= "+ 2*(l+b));
    }
}
