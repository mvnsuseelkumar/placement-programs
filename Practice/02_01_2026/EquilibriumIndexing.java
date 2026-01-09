import java.util.Scanner;

public class EquilibriumIndexing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // for (int i = 0; i < arr.length; i++) {
        // int sum1 = 0;
        // int sum2 = 0;
        // for (int j = 0; j < arr.length; j++) {
        // if (j < i) {
        // sum1 += arr[j];
        // } else if (j == i) {
        // continue;
        // } else {
        // sum2 += arr[j];
        // }
        // }
        // if (sum1 == sum2) {
        // System.out.println(i);
        // }
        // }
        // sir requirement to include current element to left sum
        // int rSum = 0;
        // for (int el : arr) {
        // rSum += el;
        // }
        // int lSum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // rSum = rSum - arr[i];
        // lSum += arr[i];

        // if (lSum == rSum) {
        // System.out.println(i);
        // }

        // }
        // original
        int rSum = 0;
        for (int el : arr) {
            rSum += el;
        }
        int lSum = 0;
        for (int i = 0; i < arr.length; i++) {
            rSum = rSum - arr[i];
            if (lSum == rSum) {
                System.out.println(i);
            }
            lSum += arr[i];
        }
        sc.close();
    }
}
