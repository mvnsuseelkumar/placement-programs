/*

Diagonal X Pattern

n=5

X - - - - 
- X - - - 
- - X - - 
- - - X - 
- - - - X 

*/

import java.util.Scanner;

public class DiagonalXpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print("X ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
