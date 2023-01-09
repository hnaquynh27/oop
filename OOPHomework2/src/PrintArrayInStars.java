import java.util.Scanner;

public class PrintArrayInStars {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        final int NUM_ITEMS = sc.nextInt();

        int[] items = inputArr(NUM_ITEMS);

        for (int idx = 0; idx < items.length; idx++) {
            System.out.print(idx + ": ");

            for (int starNo = 1; starNo <= items[idx]; starNo++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int[] inputArr(int size) {
        int[] arr = new int[size];
        System.out.println("Enter the values: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
