import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input:");
        String string = sc.nextLine();
        System.out.println(stringReverse(string));
    }

    public static String stringReverse(String string) {
        char[] chs = new char[string.length()];
        int j = 0;
        for (int i = string.length() - 1; i >= 0; i --) {
            chs[j] = string.charAt(i);
            j ++;
        }
        return new String(chs);
    }
}
