import java.util.Scanner;

public class PerimeterParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sides of parallelogram: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        System.out.println("parameter= "+ 2*(a+b));
    }
}
