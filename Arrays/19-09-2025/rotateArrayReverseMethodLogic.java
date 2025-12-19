import java.util.Scanner;

public class rotateArrayReverseMethodLogic {
    static void reverse(int[] arr, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    static void rotate(int[] arr, int k) {
        // Right Rotation (Left to Right i.e move the elements from left to right)
        reverse(arr, 0, arr.length - k - 1);
        reverse(arr, arr.length - k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        // Left Rotation (Right to Left i.e move the elements from Right to Left)
        // reverse(arr, 0,k - 1);
        // reverse(arr, k, arr.length - 1);
        // reverse(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter no.of times to rotare:");
        int r = sc.nextInt();
        if (r < 0) {
            r = r + arr.length;
        }
        r = r % arr.length;
        rotate(arr, r);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        sc.close();
    }
}
