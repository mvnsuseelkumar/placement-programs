package mcqs1;

public class mcq18 {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                break;
            }
            x += i;
        }
        System.out.println(x);
    }
}
