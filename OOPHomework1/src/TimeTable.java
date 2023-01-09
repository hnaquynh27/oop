import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("Try again...");
        }
        System.out.print("*");
        for (int row = 0; row <= size; row++) {
            for (int col = 0; col <= size; col++) {
                System.out.print(" " + row * col);
            }
            System.out.println();
        }
    }
}
