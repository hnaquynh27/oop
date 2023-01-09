import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(calFibo(number));
    }

    static int calFibo(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        }
        return calFibo(num - 1) + calFibo(num - 2);
    }
}