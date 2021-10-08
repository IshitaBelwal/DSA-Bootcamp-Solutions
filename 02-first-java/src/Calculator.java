import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter 1 for add; 2 for subs; 3 for multiply; 4 for divide: ");
        int c = sc.nextInt();

        if(c==1){
            System.out.println("sum= "+ (a+b));
        }
        if(c==2){
            System.out.println("difference= "+ (a-b));
        }
        if(c==3){
            System.out.println("product= "+ (a*b));
        }
        if(c==4){
            System.out.println("quotient= "+ (a/b));
        }
        else{
            System.out.println("Invalid Operation");
        }
    }
}
