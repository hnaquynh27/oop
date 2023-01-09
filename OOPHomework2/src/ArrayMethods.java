import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethods {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        System.out.println("Enter the values of array: ");
        int[] arr = inputArr(size);

        System.out.println("Enter the key: ");
        int key = sc.nextInt();

        containCheck(arr, key);
        System.out.println("The index of number that equals the key is: " + search(arr, key));

    }

    static int[] inputArr(int size){
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static boolean contains(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return true;
            }
        }
        return false;
    }

    static void containCheck(int[] arr, int key) {
        if (contains(arr, key)) {
            System.out.println("The array has the key.");
        } else {
            System.out.println("The array doesn't have the key.");
        }
    }

    static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

}
