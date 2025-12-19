import java.util.Scanner;

public class SecondLargeElements {
    static int result(int[] arr) {
        int max = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (max2 < arr[i] && arr[i] != max) {
                max2 = arr[i];
            }
        }
        // System.out.println(max + "\n" + max2);
        return max2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max2 = result(arr);
        System.out.println("2nd Largest Number:" + max2);
        sc.close();
    }
}
