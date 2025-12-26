
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr += (char) (((int) str.charAt(i)) + 1);
        }
        System.out.println(newStr);
        sc.close();
    }
}