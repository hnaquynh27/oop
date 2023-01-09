import java.util.Scanner;

public class CalculationsInArray {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int size = sc.nextInt();
        int[] array = inputArr(size);
        System.out.println("The min of array is "+ findMin(array));
        System.out.println("The max of array is "+ findMax(array));
        System.out.println("The average of array is "+ calAverage(array));
        sc.close();
    }

    static int[] inputArr(int size){
        int[] arr = new int[size];

        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    static int findMin(int[] array){
        int n = array.length;
        int min = array[0];
        for (int i = 1; i < n; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }

    static int findMax(int[] array){
        int n = array.length;
        int max = array[0];
        for (int i = 1; i < n; i++){
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    static double calAverage(int[] array){
        double sum = 0;

        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }

        return sum / array.length;
    }

}
