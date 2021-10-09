import java.util.Scanner;

public class VolumeCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius: ");
        float r = sc.nextFloat();
        System.out.println("enter height: ");
        float h = sc.nextFloat();
         double v = Math.PI*r*r*h/3;
        System.out.println("volume of cone: "+ v);
    }
}
