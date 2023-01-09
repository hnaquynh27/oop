import java.util.Scanner;

public class SequenceTypeChecker {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int size = sc.nextInt();
        int[] arr = inputArray(size);
    }
    static int[] inputArray(int n){

        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        return array;
    }

    static boolean isIncreasing(int[] array){
        int number = 0;
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] > array[i + 1]){
                number += 1;
            }
        }
        if (number == 0){
            return true;
        }
        else{
            return false;
        }
    }

    static boolean isDecreasing(int[] array){
        int number = 0;
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] < array[i + 1]){
                number += 1;
            }
        }
        if (number == 0){
            return true;
        }
        else{
            return false;
        }
    }

    static boolean isArithmetic(int[] array){

        int distance = array[1] - array[0];
        for (int i = 0; i < array.length - 1; i++){
                if (array[i+1] - array[i] == distance){
                    return true;
                }
        }
        return false;
    }

    static int sumArithmeticArr(int[] arr){

        int sum = 0;
        if (isArithmetic(arr)){
            for (int i = 0; i < arr.length; i++){
                sum += arr[i];
            }
        }
        return sum;
    }

    static boolean isGeometric(int[] array){

        int distance = array[1] / array[0];
        for (int i = 0; i < array.length - 1; i++){
            if (array[i+1] / array[i] == distance){
                return true;
            }
        }
        return false;
    }

    static int sumGeometricArr(int[] arr){

        int sum = 0;
        if (isGeometric(arr)){
            for (int i = 0; i < arr.length; i++){
                sum += arr[i];
            }
        }
        return sum;
    }

}
