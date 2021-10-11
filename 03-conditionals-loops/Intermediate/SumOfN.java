import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        System.out.println("please enter how many numbers:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1 ; i<=n;i++){
            System.out.println("enter the number: ");
            int num = sc.nextInt();
            sum += num;
        }
        System.out.println("sum is: "+sum);
    }
}
