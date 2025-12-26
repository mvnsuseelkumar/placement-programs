/*

Cross Plus Pattern

n=5

*   *   * 
  * * *
* * * * *
  * * *
*   *   *

*/

import java.util.Scanner;

public class CrosPlusPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1 || i == n / 2 || j == n / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
