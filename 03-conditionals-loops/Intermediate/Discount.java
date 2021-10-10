// 10% discount on price above 1000
// 20% discount on price above 2000
// 5% discount on price below 1000
import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the price of product: ");
        float discount = 0;
        float a = sc.nextFloat();
        if(a<1000){
            discount= a*5/100;
            System.out.println("discount is of: Rs."+ discount);
            System.out.println("final price: "+ (a-discount));
        }
        else if(a>1000 && a<2000){
            discount= a*10/100;
            System.out.println("discount is of: Rs."+ discount);
            System.out.println("final price: "+ (a-discount));
        }
        else{
            discount= a*20/100;
            System.out.println("discount is of: Rs."+ discount);
            System.out.println("final price: "+ (a-discount));
        }



    }
}
