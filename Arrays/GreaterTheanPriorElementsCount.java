import java.util.Scanner;

public class GreaterTheanPriorElementsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int greaterElementCount = 1;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < 5; i++) {
            if (arr[i] > arr[i - 1]) {
                greaterElementCount++;
            }
        }
        System.out.println(greaterElementCount);
        sc.close();
    }
}
