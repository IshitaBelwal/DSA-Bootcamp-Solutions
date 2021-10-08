import java.util.Scanner;
import java.lang.*;
public class Largest {
    public static void main(String[] args) {
        System.out.println("enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Largest of both number is = "+ (Math.max(a,b)));
    }
}
