import java.util.Scanner;

public class ConvToToggleFirstToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newStr = "";
        if (Character.isUpperCase((str.charAt(0)))) {
            newStr += Character.toLowerCase(str.charAt(0));
        } else {
            newStr += Character.toUpperCase(str.charAt(0));
        }
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                newStr += str.charAt(i); // To Add Space To New String
                i++;
                if (Character.isUpperCase((str.charAt(i)))) {
                    newStr += Character.toLowerCase(str.charAt(i));
                } else {
                    newStr += Character.toUpperCase(str.charAt(i));
                }
            } else {
                newStr += str.charAt(i);
            }
        }
        // for (int i = 1; i < str.length(); i++) {
        // if (str.charAt(i - 1) == ' ') {
        // if (Character.isUpperCase((str.charAt(i)))) {
        // newStr += Character.toLowerCase(str.charAt(i));
        // } else {
        // newStr += Character.toUpperCase(str.charAt(i));
        // }
        // } else {
        // newStr += str.charAt(i);
        // }
        // }
        System.out.println("New String:" + newStr);
        sc.close();
    }
}
