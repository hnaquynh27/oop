public class Tribonacci {
    public static void main(String[] args) {
        int n = 4;
        int tn;
        int tnMinus1 = 2;
        int tnMinus2 = 1;
        int tnMinus3 = 1;
        int count = 20;

        System.out.println("The first " + count + " Tribonacci numbers are: ");
        System.out.println(tnMinus3);
        System.out.println(tnMinus2);
        System.out.println(tnMinus1);
        while (n <= 20) {
            tn = tnMinus3 + tnMinus2 + tnMinus1;
            n++;
            tnMinus3 = tnMinus2;
            tnMinus2 = tnMinus1;
            tnMinus1 = tn;

            System.out.println(tn);
        }

    }
}
