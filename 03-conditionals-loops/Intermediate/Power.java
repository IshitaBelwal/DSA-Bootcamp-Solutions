import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        System.out.println("enter the power: ");
        int p = sc.nextInt();
        int power = 1;
        System.out.print(n+" to the power "+p+" is:");
        while(p!=0){
            power *= n;
            p--;
        }
        System.out.println(+power);
    }
}
