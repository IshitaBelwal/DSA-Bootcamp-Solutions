import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sum= 0;
        int n;
        do{
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            sum += n;
        }
        while(n!=0);
        System.out.println(sum);

    }
}
