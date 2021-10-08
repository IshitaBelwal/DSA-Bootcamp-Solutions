import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter principal amount: ");
        int p = sc.nextInt();
        System.out.println("enter time (in years): ");
        float t = sc.nextFloat();
        System.out.println("enter rate %: ");
        float r = sc.nextFloat();

        System.out.println("Simple Interest is: "+ (p*r*t)/100);
    }
}
