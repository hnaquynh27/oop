import java.util.Scanner;

public class PrimeArrayChecker {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        printPrimeNumberArray(array);
    }
    static boolean isPrime(int k)
    {
        if (k < 2)
        {
            return false;
        }
        else{
            for (int i = 2; i * i <= k; i++)
            {
                if (k % i == 0)
                {
                    return false;
                }
            }
            return true;
        }
    }

    public static void printPrimeNumberArray(int[] array){
        int size = 0;
        for (int i = 0; i < array.length; i++){
            if (isPrime(array[i])){
                System.out.printf(array[i] + " ");
                size++;
            }
        }
        System.out.println();
        System.out.println("Number of primes is " + size);
    }
}
