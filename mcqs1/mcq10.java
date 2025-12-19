package mcqs1;

public class mcq10 {
    public static void main(String[] args) {
        int x = 1, y = 1;
        if ((x++ == 1) | (y++ == 1)) {
            x = x + y;
        }
        System.out.println(x + " " + y);
    }
}
