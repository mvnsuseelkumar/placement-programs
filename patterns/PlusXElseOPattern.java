/*

Pattern with X as Plus Others are O

n=5

O O X O O 
O O X O O
X X X X X
O O X O O
O O X O O

*/

import java.util.Scanner;

public class PlusXElseOPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n / 2 || j == n / 2) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
