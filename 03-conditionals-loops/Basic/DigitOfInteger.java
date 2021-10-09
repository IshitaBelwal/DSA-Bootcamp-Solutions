import java.util.Scanner;

public class DigitOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        int sum =0 ;
        int product =1;
        while(n>0){
            int r = n%10;
            n = n/10 ;
            sum += r ;
            product *= r;

        }
        System.out.println(product - sum);

    }
}
