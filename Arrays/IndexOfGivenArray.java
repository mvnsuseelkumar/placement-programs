import java.util.Scanner;

public class IndexOfGivenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Element You Want to Find:");
        int e = sc.nextInt();
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == e) {
                System.out.println("Element Found At Index " + i);
                break;
            }
        }
        if (i == n) {
            System.out.println("Element Not Found");
        }
        sc.close();
    }
}
