import java.util.Scanner;

public class Hex2Bin {

    final String[] HEX_BITS = {
            "0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"
    };

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String hexString = SC.next();

        Hex2Bin aHex2Bin = new Hex2Bin();
        if (!aHex2Bin.isHex(hexString)) {
            System.out.printf("Invalid Hexadecimal string \"%1$s\"\n", hexString);
            return;
        }
        aHex2Bin.convertHexToBin(hexString);
    }

    static boolean isHex(String hexStr) {
        for (int i = 0; i < hexStr.length(); i++) {
            if (0 > Character.digit(hexStr.toLowerCase().charAt(i), 16)) {
                return false;
            }
        }
        return true;
    }

    private void convertHexToBin(String hexStr) {

        System.out.printf("The equivalent binary for hexadecimal %1$s is ", hexStr);

        for (int i = 0; i < hexStr.length(); i++) {
            int j = Character.digit(hexStr.toLowerCase().charAt(i), 16);
            System.out.printf("%1$s ", HEX_BITS[j]);
        }
        System.out.println();
    }

}