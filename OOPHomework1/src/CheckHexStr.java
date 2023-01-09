import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (checkHex(str)) {
            System.out.println(str + " is a hex string.");
        } else {
            System.out.println(str + " is NOT a hex string.");
        }
    }

    static boolean checkHex(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!((str.charAt(i) >= '0' && str.charAt(i) <= '9')
                    || (str.charAt(i) >= 'A' && str.charAt(i) <= 'F')
                    || (str.charAt(i) >= 'a' && str.charAt(i) <= 'f'))) {
                return false;
            }
        }
        return true;
    }
}
