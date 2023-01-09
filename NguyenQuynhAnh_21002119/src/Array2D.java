import java.util.Scanner;

public class Array2D {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int size = 3;
        int[] arr1 = inputArray(size);
        int[] arr2 = inputArray(size);

        double scalar = (calLength(arr1) * calLength(arr2) * calAngle(arr1, arr2));
        System.out.println("The scalar product of vectors is " + scalar);

    }
    static int[] inputArray(int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        return array;

    }

    static double calLength(int[] arr){
        double sumOfSquares = 0;
        for (int i = 0; i < arr.length; i++){
            sumOfSquares += Math.pow(arr[i], 2);
        }
        return Math.sqrt(sumOfSquares);
    }

    static double calAngle(int[] a, int[] b){
        double numerator = 0;
        double denominator = calLength(a) * calLength(b);
        for (int i = 0; i < a.length; i++){
            numerator += (a[i] * b[i]);
        }
        return numerator / denominator;
    }

}
