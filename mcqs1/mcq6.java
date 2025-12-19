package mcqs1;

public class mcq6 {
    public static void main(String[] args) {
        int a = 5;
        if (a++ == 5 && a++ == 6 && a++ == 7) {
            a++;
        }
        System.out.println(a);
    }
}
