import java.util.Scanner;

public class VolumeCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius of cylinder: ");
        float r = sc.nextFloat();
        System.out.println("enter height of cylinder: ");
        float h = sc.nextFloat();

        System.out.println("volume of cylinder: "+ Math.PI*r*r*h);
    }
}
