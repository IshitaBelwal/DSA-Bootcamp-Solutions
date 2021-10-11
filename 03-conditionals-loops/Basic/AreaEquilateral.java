import java.util.Scanner;

public class AreaEquilateral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side of the equilateral triangle: ");
        float a = sc.nextFloat();
        double area = Math.sqrt(3)*a*a/4;
        System.out.println("area is= "+ area);
    }
}
