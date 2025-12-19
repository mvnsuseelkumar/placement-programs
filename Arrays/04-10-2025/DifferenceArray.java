//find the count of bumber which has absolute difference is  less than or eaqyal to give difference

import java.util.Scanner;

public class DifferenceArray {
    static int diffResult(int[] arr, int diff, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i] - num) <= diff) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No.of Elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Difference:");
        int diff = sc.nextInt();
        System.out.print("Enter Number:");
        int num = sc.nextInt();
        int result = diffResult(arr, diff, num);
        System.out.println("The Count is " + result);
        sc.close();
    }
}
