import java.util.Scanner;;

public class PrintDataElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size of the Array:");
        int n = sc.nextInt();
        int[] rno = new int[n];
        for (int i = 1; i <= n; i++) {
            rno[i - 1] = i;
        }
        for (int i = 1; i <= n; i++) {
            System.out.println("Element " + i + ":" + rno[i - 1]);
        }
        sc.close();
    }
}