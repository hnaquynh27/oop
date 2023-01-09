import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        int num1, num2, num3;
        int sum, prod, min, max;

        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        sc.close();

        sum = num1 + num2 + num3;
        prod = num1 * num2 * num3;
        System.out.println("The sum is " + sum);
        System.out.println("The product is " + prod);

        min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        System.out.println("The min is " + min);

        max = num1;
        if (num2 > min) {
            max = num2;
        }
        if (num3 > min) {
            max = num3;
        }
        System.out.println("The max is " + max);
    }
}
