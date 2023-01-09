public class FibonacciInt {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);
        printFibonacci();
    }

    static void printFibonacci() {
        int fn2 = 1;
        int fn1 = 1;
        int fn;
        int i = 0;
        while (true) {
            System.out.printf("F(%1$d) = %2$d.\n", i, fn2);
            if (Integer.MAX_VALUE - fn2 < fn1) {
                System.out.printf("F(%d) is out of range.\n", (i + 1));
                break;
            }
            i++;
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
        }
    }
}
