import java.util.Scanner;

public class TwoArraysMethod {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        System.out.println("Enter the array 1: ");
        int[] arr1 = inputArr(size);

        System.out.println("Enter the array 2: ");
        int[] arr2 = inputArr(size);

        equalResult(arr1, arr2);
        printArr(copyOf(arr1));
        printArr(copyOfArr(arr1, 5));
        swapResult(arr1, arr2);
        reverse(arr1);
    }

    static int[] inputArr(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void printArr(int[] arr) {
        //cần kiểm tra array có null không nữa
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static boolean isEqual(int[] arr1, int[] arr2) {
        if (arr1 == null) {
            if (arr2 == null) {
                return true;
            } else {
                return false;
            }
        }
        if (arr2 == null) {
            return false;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    static void equalResult(int[] arr1, int[] arr2) {
        if (isEqual(arr1, arr2)) {
            System.out.println("Two arrays are equal.");
        } else {
            System.out.println("Two arrays aren't equal.");
        }
    }

    static int[] copyOf(int[] arr) {
        int size = arr.length;
        int[] newArr = new int[size];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    static int[] copyOfArr(int[] arr, int newLength) {
        int[] newArr = new int[newLength];
        if (newLength <= arr.length) {
            for (int i = 0; i < newLength; i++) {
                newArr[i] = arr[i];
            }
            return newArr;
        } else {
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            for (int i = arr.length; i < newLength; i++) {
                newArr[i] = 0;
            }
        }
        return newArr;
    }

    static boolean swapArr(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            int temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }
        return true;
    }

    static void swapResult(int[] arr1, int[] arr2) {
        if (swapArr(arr1, arr2)) {
            System.out.println("Successfully swapped: ");
            printArr(arr1);
            System.out.println();
            printArr(arr2);
        }
    }

    static void reverse(int[] arr) {
        int[] newArr = new int[arr.length];

        for (int fIdx = 0, bIdx = arr.length - 1; fIdx < arr.length; ++fIdx, bIdx--) {
            newArr[fIdx] = arr[bIdx];
        }
        printArr(newArr);
    }
}
