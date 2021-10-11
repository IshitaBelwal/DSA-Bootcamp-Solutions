import java.util.Scanner;

public class VolumeSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius of cylinder: ");
        float r = sc.nextFloat();

        System.out.println("volume of cylinder: "+ Math.PI*r*r*r*4/3);
    }
}
