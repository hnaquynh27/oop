import java.util.Scanner;

public class CalculationsInArr {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int size = sc.nextInt();
        int[] array = inputArray(size);

        sortArr(array);
        printArray(array);

        System.out.println("The min of array is " + findMin(array));
        System.out.println("The max of array is " + findMax(array));
        System.out.println("The average of array is " + calAverage(array));
        System.out.println("The median of array is " + calMedian(array));
        System.out.println("The average of array is " + calAverage(array));
        System.out.println("The Variance of array is " + calVariance(array));
    }
    static int[] inputArray(int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        return array;

    }

    static void sortArr(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
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

    static double calMedian(int[] arr){
        double med = 0;
        int size = arr.length;
        if (size % 2 == 1){
            med = arr[((size+1)/2)];
        } else {
            med = (arr[size/2-1]+arr[size/2])/2;
        }
        return med;
    }
    static double calAverage(int[] array){
        double sum = 0;

        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum / array.length;
    }

    public static double calVariance(int[] array){

        double mean_arr = calAverage(array);
        int size = array.length;
        double sumOfSquares = 0;
        for (int i : array){
            double x = i - mean_arr;
            sumOfSquares += Math.pow(x, 2);
        }
        return sumOfSquares / size;
    }
}
