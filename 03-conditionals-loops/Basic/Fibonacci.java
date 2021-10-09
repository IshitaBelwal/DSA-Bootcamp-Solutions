import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nth number: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int fibo = 0;

        if(n==1){
            System.out.println(0);
        }
        else if(n==2){
            System.out.println(1);
        }
        else{
            for(int i=2 ; i<n ; i++){
                fibo = a+b ;
                a = b;
                b=fibo;
            }
            System.out.println(fibo);
        }
    }
}
