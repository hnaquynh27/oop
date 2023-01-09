public class ExtractDigits {
    public static void main(String[] args) {
        int n = 346902;
        while (n > 0) {
            int temp = n % 10;
            System.out.printf(temp + " ");
            n = n / 10;
        }
    }
}
