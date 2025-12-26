/*

 n=5
 
 * * * * *
 * * * *
 * * *
 * *
 *
 */

import java.util.Scanner;

public class SquareNumberPatternStartsWithRowNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int count = i + 1;
            for (int j = 0; j < n; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
        sc.close();
    }
}
