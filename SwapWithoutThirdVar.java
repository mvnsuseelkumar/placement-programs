import java.util.Scanner;

public class SwapWithoutThirdVar {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First NUmber:");
        a = sc.nextInt();
        System.out.println("Enter Second NUmber:");
        b = sc.nextInt();
        System.out.println("Before Swapping:\n" + "a=" + a + "\nb=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping:\n" + "a=" + a + "\nb=" + b);
        sc.close();
    }
}
