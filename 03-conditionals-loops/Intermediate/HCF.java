import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first num: ");
        int a = sc.nextInt();
        System.out.println("enter second num: ");
        int b = sc.nextInt();
        int hcf = 1;

        for(int i=1; (i<=a) || (i<=b) ; i++ ){
            if(a%i==0 && b%i==0){
                hcf = i;
            }
        }
        System.out.println("HCF is : "+ hcf);
    }
}
