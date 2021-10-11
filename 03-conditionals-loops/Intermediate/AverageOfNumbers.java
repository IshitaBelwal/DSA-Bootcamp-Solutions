import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Nth number: ");
        int n = sc.nextInt();
        float sum = 0;
        for(int i = 1; i<=n; i++){
            sum += i;
        }
        float average = sum/n;
        System.out.println(average);
    }
}
