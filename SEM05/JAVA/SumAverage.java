/*
 * Question:
 * Find the Sum and Average of Array Elements
 */

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double average = (double) sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}

/*
 * Output:
 * Enter size: 5
 * Enter elements:
 * 10 20 30 40 50
 * Sum = 150
 * Average = 30.0
 * 
 */
