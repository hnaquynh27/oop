import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int number = sc.nextInt();

        /*/for (int row = 1; row <= number; row++){
            for (int col = 1; col <= number; col++){
                System.out.print("* ");
            }
            System.out.println();
        }/*/

        int i = 1;
        while (i <= number) {
            int j = 1;
            while (j <= number) {
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
