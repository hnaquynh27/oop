import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int gcd = calGCD(number1, number2);

        System.out.printf("GCD of %d and %d is %d.", number1, number2, gcd);
    }

    public static int calGCD(int number1, int number2) {
        if (number2 != 0)
            return calGCD(number2, number1 % number2);
        else
            return number1;
    }
}