/*

n=5
 
     *
    **
   ***
  ****
 *****
 */

import java.util.Scanner;

public class RightTriaPyramidAlphabetnglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (65 + i) + " ");
            }
            System.out.println();
        }
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (j < n - 1 - i) {
        // System.out.print(" ");
        // } else {
        // System.out.print("*");
        // }
        // }
        // System.out.println();
        // }
        sc.close();
    }
}
