import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year:");
        year = sc.nextInt();
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Leap Year");
        } else if (year % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not A Leap Year");
        }
        sc.close();
    }
}
