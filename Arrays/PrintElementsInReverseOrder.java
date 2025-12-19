import java.util.Scanner;

public class PrintElementsInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Directly Printing in Reverse Order Using For Loop
        System.out.println("Directly Printing in Reverse Order Using For Loop:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "\t");
        }
        // Storing The Reverse Array into New Array
        int[] arrRev = new int[arr.length];
        System.out.println("\nStoring The Reverse Array into New Array:");
        for (int i = 0, j = arr.length - 1; i < n && j >= 0; i++, j--) {
            arrRev[i] = arr[j];
        }
        for (int i = 0; i < arrRev.length; i++) {
            System.out.print(arrRev[i] + "\t");
        }
        // Reversing The Array Without Using Another Array
        System.out.println("\nReversing The Array Without Using Another Array:");
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        sc.close();
    }
}
