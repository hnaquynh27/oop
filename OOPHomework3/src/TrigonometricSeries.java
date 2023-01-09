import java.util.Scanner;

public class TrigonometricSeries {

    public static void main(String[] args) {
        double x = sc.nextInt();
        int numTerm = sc.nextInt();
        System.out.println(calSin(x, numTerm));
        System.out.println(calCos(x, numTerm));
    }

    static Scanner sc = new Scanner(System.in);

    static double calTerm(double x, int numTerms) {
        double term = 1;
        for (int i = numTerms; i > 0; i--) {
            term *= x / i;
        }
        return term;
    }

    static double calSin(double x, int numTerms) {
        double sumSin = 0;
        for (int i = 0; i < numTerms; i++) {
            if (i % 2 == 0) {
                sumSin += calTerm(x, (2 * i + 1));
            } else {
                sumSin -= calTerm(x, (2 * i + 1));
            }
        }
        return sumSin;
    }

    static double calCos(double x, int numTerms) {
        double sumCos = 0;
        for (int i = 0; i < numTerms; i++) {
            if (i % 2 == 0) {
                sumCos += calTerm(x, (2 * i));
            } else {
                sumCos -= calTerm(x, (2 * i));
            }
        }
        return sumCos;
    }
}
