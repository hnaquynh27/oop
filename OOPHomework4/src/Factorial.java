import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(calFactorial(number));
    }

    static int calFactorial(int num) {
        if (num < 0) {
            System.out.println("Try again");
        }
        if (num == 0) {
            return 1;
        }
        return num * calFactorial(num - 1);
    }
}