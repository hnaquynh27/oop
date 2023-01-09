import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        int temp, num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();

        while (num > 0) {
            temp = num % 10;
            System.out.print(temp);
            num = num / 10;
        }
    }
}
