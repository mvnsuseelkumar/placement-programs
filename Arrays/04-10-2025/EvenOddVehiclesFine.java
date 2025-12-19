import java.util.Scanner;

class EvenOddVehiclesFine {
    static int[] result(int date, int[] numberPlates, int fine) {
        int count = 0;
        if (date % 2 == 0) {
            for (int i = 0; i < numberPlates.length; i++) {
                if (numberPlates[i] % 2 != 0) {
                    count++;
                }
            }
        } else {
            for (int i = 0; i < numberPlates.length; i++) {
                if (numberPlates[i] % 2 == 0) {
                    count++;
                }
            }
        }
        int totalFine = count * fine;
        int[] results = { count, totalFine };
        return results;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Date:");
        int date = sc.nextInt();
        System.out.print("Enter No of Vehicles:");
        int n = sc.nextInt();
        int[] numberPlates = new int[n];
        System.out.print("Enter Last Numbers of Number Plate:");
        for (int i = 0; i < n; i++) {
            numberPlates[i] = sc.nextInt();
        }
        System.out.print("Enter fine amount:");
        int fine = sc.nextInt();
        int[] results = result(date, numberPlates, fine);
        System.out.println("Fine Members:" + results[0]);
        System.out.println("Total Fine:" + results[1]);
        sc.close();
    }
}