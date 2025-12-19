import java.util.Scanner;

public class MaxOfFourElements {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Four NUmbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        if (a < b && a < c && a < d) {
            System.out.println("Smallest Number is:" + a);
        } else if (b < c && b < d) {
            System.out.println("Smallest Number is:" + b);
        } else if (c < d) {
            System.out.println("Smallest Number is:" + c);
        } else {
            System.out.println("Smallest Number is:" + d);
        }
        sc.close();
    }
}
