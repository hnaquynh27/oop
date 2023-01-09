package Lab5ex1_8;

public class TestMain {
    public static void main(String[] args) {
        MyPolynomial poly1 = new MyPolynomial(1.8, 6.2, 9.3);
        System.out.println(poly1);
        double[] coeffs = {1.6, 4.4, 5.6, 9.8};
        MyPolynomial poly2 = new MyPolynomial(coeffs);
        System.out.println(poly2);

        System.out.println("Add: " + poly1.add(poly2));
        MyPolynomial poly3 = new MyPolynomial(2.1, 1.2, 4.3);
        System.out.println("Evaluate with x = 2: " + poly3.evaluate(2));

        double[] coeff = {1.1, 2.2, 3.3};
        MyPolynomial poly4 = new MyPolynomial(coeff);
        System.out.println("Multi: " + poly4.multi(poly2));
    }
}
