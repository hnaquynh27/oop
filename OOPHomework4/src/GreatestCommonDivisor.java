public class GreatestCommonDivisor {

    public static int gcd(int number1, int number2) {
        if (number1 <= 0 || number2 <= 0) {
            return -1;
        }
        while (number2 != 0) {
            int temp = number1 % number2;
            number1 = number2;
            number2 = temp;
        }
        return number1;
    }

    public static void main(String[] args) {
        System.out.println(gcd(123, 8));
        System.out.println(gcd(156, 346));
        System.out.println(gcd(11, 345));
        System.out.println(gcd(99, 834));
        System.out.println(gcd(0, 8));
    }
}
