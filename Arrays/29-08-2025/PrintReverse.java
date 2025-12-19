import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size of The Array:");
        int n = sc.nextInt();
        int[] rno = new int[n];
        for (int i = 1; i <= n; i++) {
            rno[i - 1] = i;
        }
        for (int i = 0, j = rno.length - 1; i < j; i++, j--) {
            int temp = rno[i];
            rno[i] = rno[j];
            rno[j] = temp;
        }
        for (int i = 0; i < rno.length; i++) {
            // System.out.print(rno[i] + "\t");
            System.out.printf("%05d\n", rno[i]);
        }
        sc.close();
    }
}
