package mcqs1;

public class mcq9 {
    public static void main(String[] args) {
        int num = 4;

        switch (num % 2) {
            default:
                System.out.println("Default");
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");

        }
    }
}
