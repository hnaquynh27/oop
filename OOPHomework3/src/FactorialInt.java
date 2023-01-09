import java.util.Scanner;

public class FactorialInt {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);
        printFactorial();
    }

    static void printFactorial() {
        int i = 1;
        int fn = 1;
        while (true) {
            System.out.printf("The factorial of %1$d is %2$d.\n", i, fn);
            if (Integer.MAX_VALUE / fn < (i + 1)) {
                System.out.printf("The factorial of %d is out of range.\n", (i + 1));
                break;
            }
            i++;
            fn *= i;
        }
    }
}
