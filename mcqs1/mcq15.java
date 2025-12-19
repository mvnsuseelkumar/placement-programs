package mcqs1;

public class mcq15 {
    public static void main(String[] args) {
        int a = 1;
        switch (a) {
            case 1:
                a += 2;
            case 2:
                a += 3;
            case 3:
                a += 4;
                break;
            case 4:
                a += 5;
        }
        System.out.println(a);
    }
}
