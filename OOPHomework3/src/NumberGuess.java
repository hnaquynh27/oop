import java.util.Scanner;

public class NumberGuess {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final int SECRET_NUMBER = (int) (Math.random() * 100);
        countGuess(SECRET_NUMBER);
    }

    static void countGuess(int secretNum) {
        System.out.println("Key in your guess:");
        int number = sc.nextInt();
        int count = 1;
        while (number != secretNum) {
            if (number < secretNum) {
                System.out.println("Try higher");
            } else {
                System.out.println("Try lower");
            }
            count++;
            number = sc.nextInt();
        }
        System.out.printf("You got it in %d trials!\n", count);
    }
}
