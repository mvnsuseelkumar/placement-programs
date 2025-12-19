package mcqs1;

public class mcq5 {
    public static void main(String[] args) {
        int i = 0;
        while (++i <= 5) {
            if (i == 3) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
