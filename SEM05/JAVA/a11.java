// 11. Write a Java program to find the sum of the first N natural numbers.

import java.util.Scanner;

public class a11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER N");
        int n = sc.nextInt();

        int sum = 0;


        for(int i = 1; i <= n ; i ++){
            sum = sum + i;
        }

        System.out.println(sum);

        

    }
}
