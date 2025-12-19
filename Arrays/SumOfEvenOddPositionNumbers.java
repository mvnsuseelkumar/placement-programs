import java.util.Scanner;

public class SumOfEvenOddPositionNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Elements:");
        int n = sc.nextInt();
        int evenSum = 0, oddSum = 0;
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }
        System.out.println("Even Positions Sum is " + evenSum);
        System.out.println("Odd Position Sum is " + oddSum);
        sc.close();
    }
}
