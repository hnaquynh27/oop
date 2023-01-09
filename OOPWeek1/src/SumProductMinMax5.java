import java.util.Scanner;

public class SumProductMinMax5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        sc.close();

        int sum, prod;
        sum = num[0] + num[1] + num[2] + num[3] + num[4];
        prod = num[0] * num[1] * num[2] * num[3] * num[4];

        System.out.println("The sum is " + sum);
        System.out.println("The product is " + prod);
        System.out.println("The max is "+ findMax(num));
        System.out.println("The min is "+ findMin(num));
    }


    public static int findMin(int num[]) {
        int min = num[0];
        int length = num.length;
        for (int i = 1; i < length; i++){
            if (num[i] < min){
                min = num[i];
            }
        }
        return min;
    }


    public static int findMax(int num[]) {
        int max = num[0];
        int l = num.length;
        for (int i = 1; i < l; i++){
            if (num[i] > max){
                max = num[i];
            }
        }
        return max;
    }
}