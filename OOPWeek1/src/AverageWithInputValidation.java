import java.util.Scanner;

import static java.lang.System.out;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        final int NUM_STUDENT = 3;
        Scanner sc = new Scanner(System.in);
        int score = 0;
        boolean isValid;
        int sum = 0;
        double avg;

        for (int i = 1; i <= NUM_STUDENT; i++) {
            System.out.println("Enter the mark (0-100) for student " + i);
            score = sc.nextInt();
            isValid = false;
            do {
                if (score >= 0 && score <= 100) {
                    isValid = true;
                } else {
                    out.println("Invalid input, try again...");
                    System.out.println("Enter the mark (0-100) for student " + i);
                    score = sc.nextInt();
                }
            } while (!isValid);
            sum += score;
        }
        avg = sum * 1.0 / 3;
        out.println("The average is " + avg);
    }
}
