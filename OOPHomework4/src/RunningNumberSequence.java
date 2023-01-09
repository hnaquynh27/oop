import java.util.Scanner;

public class RunningNumberSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String num = createLengthNumber(number);
        System.out.println(length(num));
    }

    public static int length(String n) {
        if (n == "1") {
            return 1;
        }
        return n.length();
    }

    static String createLengthNumber(int length) {
        String number = "";
        if (length < 0) {
            System.out.println("Try again");
        }
        if (length == 1) {
            return number = "1";
        }
        number = createLengthNumber(length - 1) + length;
        return number;
    }
}
