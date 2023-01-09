package Lab5ex1_7;

public class TestMain {
    public static void main(String[] args) {
        MyComplex complex1 = new MyComplex(4, 3);
        MyComplex complex2 = new MyComplex(5, 5);
        MyComplex complex3 = new MyComplex(9, 7);

        System.out.println(complex2);
        complex1.setValue(3, 4);
        System.out.println("the complex1 after is: " + complex1);
        System.out.println("check if complex1 is real: " + complex1.isReal());
        System.out.println("check if complex1 is equals: " + complex1.equals(3, 4));
        System.out.println("check if complex1 is equasl to complex2: " + complex1.equals(complex2));
        System.out.println("complex1 add new complex3: " + complex1.addNew(complex3));
        System.out.println("complex1 add into complex2: " + complex1.add(complex2));

        complex2.setReal(0);
        System.out.println("check if complex2 is imag: " + complex2.isImaginary());
        complex3.setValue(3, 0);
        System.out.println("check if complex3 is real: " + complex3.isReal());

        System.out.println("complex1 subtract complex3: " + complex1.subtract(complex3));
        System.out.println("complex1 subtract new complex3: " + complex1.subtractNew(complex3));
        System.out.println("complex1 multify complex3: " + complex1.multify(complex3));
        System.out.println("complex1 divide complex3: " + complex1.divide(complex3));
        System.out.println("complex1 : " + complex1.conjugate());
    }
}
