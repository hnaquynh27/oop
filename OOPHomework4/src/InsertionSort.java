import java.util.Scanner;

public class InsertionSort {

    static Scanner sc = new Scanner(System.in);

    static int[] inputArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void insertSort(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                count++;
            }
            arr[j + 1] = key;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] array = inputArray(n);
        insertSort(array);
        printArray(array);
    }
}
