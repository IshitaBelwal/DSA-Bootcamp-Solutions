import java.util.Scanner;

public class VolumePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length: ");
        float l = sc.nextFloat();
        System.out.println("enter width: ");
        float w = sc.nextFloat();
        System.out.println("enter height: ");
        float h = sc.nextFloat();
        double v = l*w*h/3;
        System.out.println("volume of pyramid: "+ v);
    }
}
