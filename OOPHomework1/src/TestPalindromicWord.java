import java.util.Scanner;

public class TestPalindromicWord {
    public static boolean isPalindrome(String str) {

        String rever = "";

        boolean res = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            rever = rever + str.charAt(i);
        }

        if (str.equals(rever)) {
            res = true;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.toLowerCase();
        if (isPalindrome(str))
            System.out.println(str + " is palindrome.");
        else
            System.out.println(str + " is not palindrome.");
    }
}
