import java.util.Scanner;

public class AreaParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st side of parallelogram: ");
        float a = sc.nextFloat();
        System.out.println("enter 2nd side of parallelogram: ");
        float b = sc.nextFloat();
        System.out.println("enter the acute angle between the sides in degree: ");
        float c = sc.nextFloat();
        double angle = Math.toRadians(c);

        System.out.println("area is= "+ a*b*Math.sin(angle));

    }
}
