import java.util.Scanner;

public class ReverseWordsInString {
    static String reverse(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newString = "";
        int startIdx = 0;
        while (str.indexOf(' ', startIdx) != -1) {
            int endIdx = str.indexOf(' ', startIdx);
            if (endIdx != -1) {
                newString += reverse(str.substring(startIdx, endIdx)) + " ";
            }
            startIdx = endIdx + 1;
        }
        newString += reverse(str.substring(startIdx, str.length()));
        System.out.println(newString.strip());
        sc.close();
    }
}
