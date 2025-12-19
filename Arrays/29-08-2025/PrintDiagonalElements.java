import java.util.Scanner;

public class PrintDiagonalElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Dimension of Square matrix:");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter " + n * n + " Elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Left Diagonal:");
        System.out.println("\nUsing Single Loop:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i][i] + "\t");
        }
        System.out.println("\nUsing Double Loops:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + "\t");
                }
            }
        }
        System.out.println("\nRight Diagonal:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1) {
                    System.out.print(arr[i][j] + "\t");
                }
            }
        }
    }
}
