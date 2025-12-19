import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int num;
        int sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        num = sc.nextInt();
        // for (sum = 0; num != 0; num /= 10) {
        // sum += num % 10;
        // }
        sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of Digits is:" + sum);
        sc.close();
    }
}
