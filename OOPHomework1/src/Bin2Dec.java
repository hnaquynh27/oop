import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a binary string: ");
        int number = sc.nextInt();
        System.out.println(binaryToDecimal(number));
    }

    static int binaryToDecimal(int temp) {
        int decValue = 0;

        int base = 1;

        while (temp > 0) {
            int lastDigit = temp % 10;
            temp = temp / 10;

            decValue += lastDigit * base;

            base *= 2;
        }

        return decValue;
    }
}
