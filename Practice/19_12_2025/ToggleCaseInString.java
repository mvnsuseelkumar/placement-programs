import java.util.Scanner;

public class ToggleCaseInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] charr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                charr[i] = Character.toUpperCase(ch);
            } else if (Character.isUpperCase(ch)) {
                charr[i] = Character.toLowerCase(ch);
            } else {
                charr[i] = ch;
            }
        }
        String strToggle = new String(charr);
        // String strToggle = "";
        // for (int i = 0; i < str.length(); i++) {
        // char ch = str.charAt(i);
        // if (Character.isLowerCase(ch)) {
        // strToggle += Character.toUpperCase(ch);
        // } else if (Character.isUpperCase(ch)) {
        // strToggle = Character.toLowerCase(ch);
        // } else {
        // strToggle += ch;
        // }
        // }
        System.out.println("Toggle String:" + strToggle);
        sc.close();
    }
}
