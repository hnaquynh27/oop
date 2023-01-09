import java.util.Scanner;

public class CaesarCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.next().toUpperCase();
        caesarCodeConvert(str);
    }

    static void caesarCodeConvert(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print((char) (str.charAt(i) + 3));
        }
    }
}
