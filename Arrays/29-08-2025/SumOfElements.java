import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter Size of The Array:");
        int n = sc.nextInt();
        int[] rno = new int[n];
        for (int i = 1; i <= n; i++) {
            rno[i - 1] = i;
        }
        for (int i = 0; i < n; i++) {
            sum += rno[i];
        }
        System.out.println(sum);
        sc.close();
    }
}
