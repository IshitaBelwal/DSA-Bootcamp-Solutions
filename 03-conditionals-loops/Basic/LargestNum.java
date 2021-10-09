import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int n = sc.nextInt();
        while(n!=0){
            int large =Math.max(a,n);
            a = large;
            n = sc.nextInt();
        }
        System.out.println("largest number is: "+ a);
    }
}
