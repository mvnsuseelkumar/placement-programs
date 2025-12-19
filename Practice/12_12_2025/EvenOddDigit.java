import java.util.Scanner;

public class EvenOddDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        while (N != 0) {
            if ((N % 10) % 2 == 0) {
                count++;
            }
            N = N / 10;
        }
        System.out.println("Cout:" + count);
        sc.close();
    }
}
