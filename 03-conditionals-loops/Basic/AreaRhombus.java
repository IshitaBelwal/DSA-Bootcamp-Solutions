import java.util.Scanner;

public class AreaRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side of rhombus: ");
        float a = sc.nextFloat();
        System.out.println("enter the interior angle(in degree): ");
        float b = sc.nextFloat();
        double angle = Math.toRadians(b);

        System.out.println("area is= "+ a*a*Math.sin(angle));
    }
}
