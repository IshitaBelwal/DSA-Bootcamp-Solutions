import java.util.Scanner;

public class CSAcylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius of cylinder: ");
        float r = sc.nextFloat();
        System.out.println("enter height of cylinder: ");
        float h = sc.nextFloat();

        System.out.println("CSA of cylinder: "+ 2*Math.PI*r*h);
    }
}
