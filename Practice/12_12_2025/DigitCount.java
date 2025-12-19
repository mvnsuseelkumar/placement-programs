import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        while (N != 0) {
            count++;
            N /= 10;
        }
        System.out.println("Count:" + count);
        sc.close();
    }
}
