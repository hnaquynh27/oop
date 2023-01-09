import java.util.Scanner;

public class PrimeFactor {
    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int product = 1;
        for (int i = 2; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0 && isPrime(i)) {
                product *= i;
                if (product > aPosInt) {
                    return false;
                }
            }
        }
        return product == aPosInt;
    }

    public static boolean isPrime(int aPosInt) {
        if (aPosInt < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
            if (aPosInt % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int upperBound = sc.nextInt();
        int count = 0;
        for (int i = 2; i <= upperBound; i++) {
            if (isProductOfPrimeFactors(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        double percent = (double) (count / upperBound * 100);
        System.out.println("[" + count + " numbers found (" + percent + "%)" + "]");
    }
}
