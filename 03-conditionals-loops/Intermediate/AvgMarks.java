import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of test takers ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            System.out.println("enter the marks obtained: ");
            int m = sc.nextInt();
            sum += m;
        }
        float avg = sum/n;
        System.out.println("Aerage marks id = "+ avg);
    }
}
