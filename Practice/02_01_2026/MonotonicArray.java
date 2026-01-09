import java.util.Scanner;

public class MonotonicArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Solution 1
        // boolean flag1 = true;
        // boolean flag2 = true;
        // for (int i = 0; i < arr.length - 1; i++) {
        // if (arr[i] > arr[i + 1]) {
        // flag1 = false;
        // }
        // if (arr[i] < arr[i + 1]) {
        // flag2 = false;
        // }
        // }
        // if (flag1 || flag2) {
        // System.out.println(true);
        // } else {
        // System.out.println(false);
        // }
        // Solution 2
        // boolean flag1 = true;
        // for (int i = 0; i < arr.length - 1; i++) {
        // if (arr[i] > arr[i + 1]) {
        // flag1 = false;
        // break;
        // }
        // }
        // boolean flag2 = true;
        // for (int i = 0; i < arr.length - 1; i++) {
        // if (arr[i] < arr[i + 1]) {
        // flag2 = false;
        // break;
        // }
        // }
        // if (flag1 || flag2) {
        // System.out.println(true);
        // } else {
        // System.out.println(false);
        // }
        // Solution 3
        if (n <= 2) {
            System.out.println(true); // n=0 =>no elements i.e monotonic,n=1=>[oneElement] i.e
            sc.close(); // monotonic,n=2=>[small,big] or [big,small] either way its monotonic
            return;
        }
        int direction = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                continue;
            }
            if (direction == 0) {
                direction = arr[i] < arr[i + 1] ? 1 : -1;
            } else if ((direction == 1 && arr[i] > arr[i + 1]) || (direction == -1 && arr[i] < arr[i + 1])) {
                System.out.println(false);
                sc.close();
                return;
            }
        }
        System.out.println(true);
        sc.close();
    }
}