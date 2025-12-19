import java.util.Scanner;

public class PrintAllElementsExceptElementsDivisiibleBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0) {
                continue;
            } else {
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}
