import java.util.Scanner;

public class PrintArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        final int NUM_ITEMS;

        System.out.println("Enter the number of items: ");
        NUM_ITEMS = sc.nextInt();

        int[] items = new int[NUM_ITEMS];
        System.out.println("Enter the value of all items: ");
        for (int i = 0; i < items.length; i++){
            items[i] = sc.nextInt();
        }

        System.out.print("The values are: [ ");
        for (int i = 0; i <= items.length; i++){
            if (i != items.length){
                System.out.print(items[i] + " ");
            } else {
                System.out.print("]");
            }
        }
    }

}
