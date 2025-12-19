package mcqs1;

public class mcq20 {
    public static void main(String[] args) {
        int x = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                x += j;
            }
        }
        System.out.println(x);
    }
}
