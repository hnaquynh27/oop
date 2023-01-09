import java.util.Scanner;

public class HillPatternA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("Try again...");
        }

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= (2 * size) - 1; col++) {
                if ((row + col >= size + 1) && (row >= col - size + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
