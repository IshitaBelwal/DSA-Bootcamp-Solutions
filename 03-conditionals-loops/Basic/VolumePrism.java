import java.util.Scanner;

public class VolumePrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of prism: ");
        float l = sc.nextFloat();
        System.out.println("enter breadth of prism: ");
        float b = sc.nextFloat();
        System.out.println("enter height of prism: ");
        float h = sc.nextFloat();

        System.out.println("volume of prism= "+ l*b*h);
    }
}
