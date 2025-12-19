import java.util.Scanner;

public class SwapWithThirdVariable {
    public static void main(String[] args) {
        int a, b, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        a = sc.nextInt();
        System.out.println("Enter Second Number:");
        b = sc.nextInt();
        System.out.println("Before Swapping:\n" + "a=" + a + "\nb=" + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping:\n" + "a=" + a + "\nb=" + b);
        sc.close();
    }
}
