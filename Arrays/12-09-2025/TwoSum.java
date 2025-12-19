import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Target:");
        int target = sc.nextInt();
        boolean flag = false;
        outer: for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("The Index are " + i + " " + j);
                    flag = true;
                    break outer;
                }
            }
        }
        if (!flag) {
            System.out.println("The Sum Not Found");
        }
        sc.close();
    }
}
