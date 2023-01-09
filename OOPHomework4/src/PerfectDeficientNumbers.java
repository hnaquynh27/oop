import java.util.Scanner;

public class PerfectDeficientNumbers {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(isDeficientNum(14));
        System.out.println(isDeficientNum(6));
        System.out.println(isPerfectNum(28));
        isPerfect();
    }

    public static boolean isPerfectNum(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void isPerfect() {
        System.out.println("Enter the upper: ");
        int n = sc.nextInt();
        System.out.println("The pefect number is: ");
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPerfectNum(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        double avg = 1.0 * count / n;
        System.out.println(avg);
    }

    public static boolean isDeficientNum(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum < num;
    }
}
