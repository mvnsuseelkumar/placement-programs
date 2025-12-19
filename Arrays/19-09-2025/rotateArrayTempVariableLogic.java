import java.util.Scanner;

class rotateArrayTempVariableLogic {
    static void rotate(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int j = arr.length - 1; j > 0; j--) {
            arr[j] = arr[j - 1];
        }
        arr[0] = temp;
    }

    static void rotatation(int[] arr, int r) {
        for (int i = 0; i < r; i++) {
            rotate(arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter no.of times to rotare:");
        int r = sc.nextInt();
        if (r < 0) {
            r = r + arr.length;
        }
        r = r % arr.length;
        rotatation(arr, r);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        sc.close();
    }
}