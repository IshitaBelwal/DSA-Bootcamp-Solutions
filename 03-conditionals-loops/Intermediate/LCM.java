import java.util.Scanner;

public class LCM {
    static int hcf(int x, int y){
        int HCF=1;
        for(int i=1; i<=x || i<=y ; i++){
            if(x%i==0 && y%i==0){
                HCF = i;
            }
        }
        return HCF;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: ");
        int a = sc.nextInt();
        System.out.println("enter second number: ");
        int b = sc.nextInt();

        int lcm = (a*b)/hcf(a,b);
        System.out.println("LCM is = "+ lcm);
    }
}
