import java.util.Scanner;

public class a13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num:");
        int n = sc.nextInt();

        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        System.out.println("Reverse = " + rev);

        sc.close();
    }
}
