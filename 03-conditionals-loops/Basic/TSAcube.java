import java.util.Scanner;

public class TSAcube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side of cube: ");
        float a = sc.nextFloat();

        System.out.println("TSA of cube: "+ 6*a*a);
    }
}
