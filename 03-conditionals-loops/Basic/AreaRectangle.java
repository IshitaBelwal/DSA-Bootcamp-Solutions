import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sides of rectangle: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("Area= "+ (a*b));
    }
}
