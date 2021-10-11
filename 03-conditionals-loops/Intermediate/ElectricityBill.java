import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total units: ");
        double unit = sc.nextDouble();
        System.out.println("enter the cost: ");
        double cost = sc.nextDouble();
        double bill = 0;
        if(unit>0 && cost>0){
            bill = unit*cost;
            System.out.println("The bill is: "+ bill);
        }
        else{
            System.out.println("Invalid outpu.");
        }
    }
}
