package mcqs1;

public class mcq3 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                continue;
            }
            count++;
        }
        System.out.println(count);
    }
}
