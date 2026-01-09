import java.util.Scanner;

public class MaxSubArrayCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (n == 0) {
            System.out.println(0);
            sc.close();
            return;
        }
        int count = 1; // single element is a valid subarray
        int maxCount = 1; // single element is a valid subarray
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            maxCount = Math.max(maxCount, count);
        }

        System.out.println(maxCount);
        sc.close();
    }
}
