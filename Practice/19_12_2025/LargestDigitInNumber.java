import java.util.Scanner;

public class LargestDigitInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        while (n != 0) {
            int num = n % 10;
            if (num > max) {
                max = num;
            }
            n = n / 10;
        }
        System.out.println("Max:" + max);
        sc.close();
    }
}
