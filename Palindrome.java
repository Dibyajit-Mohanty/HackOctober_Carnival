import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0, n1 = n;
        ;
        while (n > 0) {
            int d = n % 10;
            r = r * 10 + d;
            n /= 10;
        }
        if (n1 == r) {
            System.out.println("Palindrom");
        } else {
            System.out.println("not Palindrome");
        }
    }
}
