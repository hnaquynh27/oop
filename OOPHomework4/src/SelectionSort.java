import java.util.Scanner;

class SelectionSort {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] array = inputArray(n);
        sort(array);
        printArray(array);
    }

    static int[] inputArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    static void sort(int[] array) {
        int n = array.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[minIdx] > array[j]) {
                    minIdx = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIdx];
            array[minIdx] = temp;
            count++;
        }
        System.out.println(count);
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}