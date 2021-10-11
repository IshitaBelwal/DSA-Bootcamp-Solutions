import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount you want to invest: ");
        float pv = sc.nextFloat();
        System.out.println("enter the rate percentage: ");
        float r = (sc.nextFloat())/100;
        System.out.println("enter the time period in years: ");
        int t = sc.nextInt();

        double fv = pv*Math.pow(1+r,t);
        System.out.println("future value = "+ fv);
    }
}
