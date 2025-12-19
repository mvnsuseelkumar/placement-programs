import java.util.Scanner;

public class SumOfTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Dimension of a matrix(m n):");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter " + n * n + " Elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

    }
}
