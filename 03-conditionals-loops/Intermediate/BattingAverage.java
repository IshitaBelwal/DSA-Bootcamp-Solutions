import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total number of runs scored: ");
        int run = sc.nextInt();
        System.out.println("enter total number of innings played: ");
        int inn = sc.nextInt();
        float avg = run/inn;
        System.out.println("batting average is: "+ avg);
    }
}
