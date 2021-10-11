import java.util.Scanner;

public class DepreciationValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount:");
        int a = sc.nextInt();
        System.out.println("enter depreciation percentage:");
        int d = sc.nextInt();
        System.out.println("enter number of years:");
        int t = sc.nextInt();

        int x = a;

        for(int i=1;i<=t;i++){
            x = ((100-d)*x)/100;
        }
        System.out.println("depreciation value = "+ x);
    }
}
