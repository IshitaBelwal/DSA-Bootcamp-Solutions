import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        System.out.println("enter totall amount of sales: ");
        Scanner sc = new Scanner(System.in);
        float sale = sc.nextFloat();
        System.out.println("enter the amount of commission: ");
        float com = sc.nextFloat();

        float comPercentage = (com/sale)*100;
        System.out.println("commission percentage is: "+ comPercentage+"%");

    }
}
