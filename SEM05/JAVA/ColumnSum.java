/*
 * Question:
 * Write a Java program to calculate the sum of each column in a matrix.
 */

import java.util.Scanner;

public class ColumnSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][3];

        System.out.println("Enter elements:");

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }

        for(int j=0;j<3;j++){

            int sum=0;

            for(int i=0;i<2;i++){
                sum += a[i][j];
            }

            System.out.println("Column " + (j+1) + " Sum = " + sum);
        }
    }
}

/*
 * Output:
 * 1 2 3
 * 4 5 6
 * 
 * Column 1 Sum = 5
 * Column 2 Sum = 7
 * Column 3 Sum = 9
 * 
 */
