import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter point x1 and y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("enter point x2 and y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double dis = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("the distance between the points is: "+ dis);
    }
}
