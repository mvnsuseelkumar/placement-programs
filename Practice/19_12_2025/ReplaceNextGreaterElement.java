import java.util.Scanner;

public class ReplaceNextGreaterElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                arr[i - 1] = arr[i];
            } else {
                arr[i - 1] = -1;
            }
        }
        for (int el : arr) {
            System.out.print(el + "\t");
        }
        sc.close();
    }
}