import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Not a Happy Number");
        } else {
            boolean b = true;
            while (n > 9 || b) {
                b = false;
                int sum = 0;
                while (n != 0) {
                    int digit = n % 10;
                    sum += digit * digit;
                    n = n / 10;
                }
                n = sum;
            }
            if (n == 1) {
                System.out.println("Happy Number");
            } else {
                System.out.println("Not a Happy Number");
            }
        }
        sc.close();
    }
}
