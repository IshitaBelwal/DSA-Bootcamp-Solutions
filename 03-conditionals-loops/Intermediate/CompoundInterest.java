import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount: ");
        float p = sc.nextFloat();
        System.out.println("enter the rate percentage: ");
        float r = (sc.nextFloat())/100;
        System.out.println("enter the time period in year: ");
        int t = sc.nextInt();
        System.out.println("enter the number of times interest is compounder per year: ");
        int n = sc.nextInt();

        double CI = Math.pow((p*(1+r/n)),n*t)-p;
        System.out.println("CI is "+ CI);
    }
}
