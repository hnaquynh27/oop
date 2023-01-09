import java.util.Scanner;

public class ReverseArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int size = sc.nextInt();
        int [] arr = inputArray(size);
        reverse(arr);
    }

    static int[] inputArray(int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        return array;
    }
    static void reverse(int a[]) {
        int size = a.length;
        int[] b = new int[size];
        int j = size;
        for (int i = 0; i < size; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        System.out.println("Reversed array is: ");
        for (int k = 0; k < size; k++) {
            System.out.print(b[k] + " ");
        }
    }

}
