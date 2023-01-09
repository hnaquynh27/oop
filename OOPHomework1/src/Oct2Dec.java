import java.util.Scanner;

public class Oct2Dec {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a octal number: ");
        int oct = Integer.parseInt(sc.nextLine());

        System.out.println("The decimal value for hex number "
                + oct + " is " + octToDecimal(oct));
    }

    public static int octToDecimal(int temp) {
        int decValue = 0;
        int base = 1;
        while (temp > 0) {
            int lastDigit = temp % 10;
            temp = temp / 10;

            decValue += lastDigit * base;

            base *= 8;
        }
        return decValue;
    }

}
