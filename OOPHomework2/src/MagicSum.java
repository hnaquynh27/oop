import java.util.Scanner;

public class MagicSum {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final int SENTINEL = -1;
        int sum = 0;

        System.out.println("Enter a positive integer (or -1 to end): ");
        int number = sc.nextInt();
        if (hasEight(number)) {
            sum += number;
        }
        while (number != SENTINEL) {
            System.out.println("Enter a positive integer (or -1 to end): ");
            number = sc.nextInt();
            if (hasEight(number)) {
                sum += number;
            }
        }
        System.out.println("The magic sum is: " + sum);

    }

    static boolean hasEight(int number) {
        while (number > 0) {
            int temp = number % 10;
            if (temp == 8) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }

    /*static int sumNumHasEight(int number){
        int sum = 0;
        if (hasEight(number)){
            sum += number;
        }
        return sum;
    }*/
}
