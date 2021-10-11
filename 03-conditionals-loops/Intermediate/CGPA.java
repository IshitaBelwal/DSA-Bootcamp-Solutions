import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter grade in subject 1 out of 10: ");
        int a = sc.nextInt();
        System.out.println("enter grade in subject 2 out of 10: ");
        int b = sc.nextInt();
        System.out.println("enter grade in subject 3 out of 10: ");
        int c = sc.nextInt();
        System.out.println("enter grade in subject 4 out of 10: ");
        int d = sc.nextInt();
        System.out.println("enter grade in subject 5 out of 10: ");
        int e = sc.nextInt();
        float cgpa = (a+b+c+d+e)/5;
        double cgpaPercentage = cgpa*9.5;
        System.out.println("CGPA = "+ cgpa);
        System.out.println("Percentage of this CGPA = "+ cgpaPercentage);
    }
}
