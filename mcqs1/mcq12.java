package mcqs1;

public class mcq12 {
    public static void main(String[] args) {
        int x = 10;
        if (x++ == 10 && ++x == 12) {
            x += 1;
        }
        System.out.println(x);
    }
}
