public class Fraction<fraction2> {
    private int numerator, denominator;

    public Fraction(int numerator) {
        this.numerator = numerator;
        denominator = 1;
    }

    public Fraction add(Fraction fraction) {
        Fraction frac = new Fraction(5);
        return frac;
    }

    private int gcd(int denominator1, int denominator2) {
        int temp;
        while (denominator2 != 0) {
            temp = denominator1 % denominator2;
            denominator1 = denominator2;
            denominator2 = temp;
        }
        return denominator1;
    }

    private void simplify(int num1, int num2) {
        gcd(num1, num2);
    }
}
