import java.util.Scanner;

public class ConvFirstToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newStr = "";
        newStr += Character.toUpperCase(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                newStr += str.charAt(i); // To Add Space To New String
                i++;
                newStr += Character.toUpperCase(str.charAt(i));
            } else {
                newStr += str.charAt(i);
            }
        }
        // newStr += Character.toUpperCase(str.charAt(0));
        // for (int i = 1; i < str.length(); i++) {
        // if (str.charAt(i - 1) == ' ') {
        // newStr += Character.toUpperCase(str.charAt(i));
        // } else {
        // newStr += str.charAt(i);
        // }
        // }
        System.out.println("New String:" + newStr);
        sc.close();
    }
}
