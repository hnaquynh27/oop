import java.util.Scanner;

public class HillPatternB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows: ");
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("Try again...");
        }
        int row = size, col;
        while (row > 0) {
            col = 0;
            while (col++ < size - row) {
                System.out.print(" ");
            }
            col = 0;

            while (col++ < (row * 2) - 1) {
                System.out.print("*");
            }
            System.out.println();
            row--;
        }
    }
}
