import java.util.Scanner;

public class SpecialSeries {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter x: ");
        double x = sc.nextDouble();
        int numTerms = sc.nextInt();
        System.out.println(specialSeries(x, numTerms));
    }

    static double specialSeries(double x, int numTerms) {
        if (!(x >= -1 && x <= 1)) {
            System.out.println("Try again");
        }
        double sum = 0;
        for (int i = 1; i <= numTerms; i = i + 2) {
            sum += factor(i) * Math.pow(x, i);
        }
        return sum;
    }

    static double factor(int num) {
        double numerator = 1;
        double denominator = 1;
        for (int i = num - 1; i > 0; i++) {
            if (i % 2 != 0) {
                numerator *= i;
            } else {
                denominator *= i;
            }
        }
        double factor = numerator / denominator;
        return factor;
    }
}
