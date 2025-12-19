import java.util.Scanner;

public class MoveMultiplesOf10AtThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arrNew = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 10 != 0) {
                arrNew[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 10 == 0) {
                arrNew[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arrNew[i] + "\t");
        }
    }
}
