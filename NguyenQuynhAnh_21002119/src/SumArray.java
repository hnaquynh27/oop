import java.util.Scanner;

public class SumArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int size = sc.nextInt();
        int[] arr1 = inputArr(size);
        int[] arr2 = inputArr(size);
        int[] sumArr = sumArray(arr1, arr2);
        printArray(sumArr);
        sc.close();
    }

    static int[] inputArr(int size){
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static int[] sumArray(int[] arr1, int[] arr2){
        int[] sumArr = new int[arr1.length];
        for (int i = 0; i < sumArr.length; i++){
            sumArr[i] = arr1[i] + arr2[i];
        }
        return sumArr;
    }

    static void printArray(int[] array){

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
