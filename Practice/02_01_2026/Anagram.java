import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().toLowerCase().replaceAll("\\s+", "");
        String str2 = sc.nextLine().toLowerCase().replaceAll("\\s+", "");
        boolean flag = true;
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                int countStr1 = 0;
                int countStr2 = 0;
                for (int j = 0; j < str1.length(); j++) {
                    if (str1.charAt(i) == str1.charAt(j)) {
                        countStr1++;
                    }
                    if (str1.charAt(i) == str2.charAt(j)) {
                        countStr2++;
                    }
                }
                if (countStr1 != countStr2) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not an Anagram");
            }
        } else {
            System.out.println("Not an Anagram");
        }
        sc.close();
    }
}
