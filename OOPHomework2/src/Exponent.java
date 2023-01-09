import java.util.Scanner;

public class Exponent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base ");
        int base = sc.nextInt();
        System.out.println("Enter the exponent ");
        int exp = sc.nextInt();
        System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
    }

    static int exponent(int base, int exp) {
        int prod = 1;
        for (int i = 1; i <= exp; i++) {
            prod *= base;
        }
        return prod;
    }
}
