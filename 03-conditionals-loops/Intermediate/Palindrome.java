import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String str = sc.nextLine() , reverseStr = "";

        int n = str.length();

        for (int i = (n - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println("reverse of "+ str + " is "+ reverseStr);
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println("reverse of "+ str + " is "+ reverseStr);
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}
