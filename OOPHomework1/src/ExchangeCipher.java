import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ciphertextstring: ");
        String str = sc.next().toUpperCase();
        exchangeCode(str);
    }

    static void exchangeCode(String str) {
        for (int i = 0; i < str.length(); i++) {
            char plainTextChar = str.charAt(i);
            char cipherTextChar = (char) ('A' + 'Z' - plainTextChar);
            System.out.print(cipherTextChar);
        }
    }
}
