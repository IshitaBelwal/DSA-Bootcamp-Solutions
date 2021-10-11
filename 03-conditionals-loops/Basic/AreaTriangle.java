import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side a: ");
        float a = sc.nextFloat();
        System.out.println("enter side b: ");
        float b = sc.nextFloat();
        System.out.println("enter side c: ");
        float c = sc.nextFloat();
        double area, s;
        s = (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area is= " + area);
    }
}
