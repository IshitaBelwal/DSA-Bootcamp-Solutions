import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        System.out.println("enter currency in INR: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = 75.28f;
        System.out.println("currency in usd is: $"+ (a/b));
    }
}
