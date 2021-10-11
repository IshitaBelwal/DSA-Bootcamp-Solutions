import java.util.Scanner;
public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nSum = 0, eSum = 0, oSum = 0;
        System.out.println("Enter Numbers:");
        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            if (n < 0) {
                nSum += n;
            }
            else if (n % 2 == 0) {
                eSum += n;
            }
            else {
                oSum += n;
            }
        }

        System.out.println("Negative No. Sum = " + nSum);
        System.out.println("Positive Even No. Sum = " + eSum);
        System.out.println("Positive Odd No. Sum = " + oSum);
    }

}
