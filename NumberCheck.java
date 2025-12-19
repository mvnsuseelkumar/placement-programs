import java.util.Scanner;

class NumberCheck {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A number:");
        num = sc.nextInt();
        if (num > 0) {
            System.out.println("Positive Number");
        } else if (num < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Zero");
        }
        sc.close();
    }
}