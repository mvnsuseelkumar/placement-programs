import java.util.Scanner;

class SenarioBasedRatsQuestion {
    static int result(int[] arr, int r, int unit) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            count++;
            if (sum >= r * unit) {
                return count;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array (No.of Houses):");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements (Amount of Food in Each house):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter no of Rats:");
        int r = sc.nextInt();
        System.out.print("Enter how munch unit is amount of food each rat consumes:");
        int unit = sc.nextInt();
        int noOfHouses = result(arr, r, unit);
        System.out.println("The No of Houses is:" + noOfHouses);
        sc.close();
    }
}