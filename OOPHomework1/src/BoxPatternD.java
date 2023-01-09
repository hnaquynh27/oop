import java.util.Scanner;

public class BoxPatternD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("Try again...");
        }
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size; col++){
                if (row == 1 || col == size - row + 1 || row == size - col + 1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
