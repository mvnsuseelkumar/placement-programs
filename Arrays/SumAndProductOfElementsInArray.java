import java.util.Scanner;

public class SumAndProductOfElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0, pro = 1;
        System.out.println("Enter " + n + " Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            pro *= arr[i];
        }
        System.out.println("Sum of Elements In Array: " + sum);
        System.out.println("Product of Elements In Array: " + pro);
        sc.close();
    }
}
