import java.util.Scanner;

public class PrimeList {

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
        int count = 0;
        System.out.println("Enter the upper bound: ");
        int upperBound = sc.nextInt();
        for (int i = 2; i < upperBound; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        double percent = count / upperBound;
        System.out.println("[" + count + " primes found (" + percent + "%)]");
    }
}
