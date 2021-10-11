import java.util.Scanner;

public class ncr_npr {
    static int fac(int a){
        if(a==1){
            return 1;
        }
        else{
            return a*fac(a-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
        System.out.println("enter r: ");
        int r = sc.nextInt();

        int nFact = fac(n); //-- n!
        int rFact = fac(r); //-- r!
        int n_rFact = fac(n-r); // (n-r)!

        int ncr = nFact/(rFact*n_rFact);
        int npr = nFact/n_rFact;

        System.out.println("npr is = "+ npr);
        System.out.println("ncr is = "+ ncr);
    }
}
