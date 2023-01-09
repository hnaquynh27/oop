package Lab5ex1_2;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.toString());

        Circle c2 = new Circle();
        System.out.printf("area is: %.2f%n", c2.getArea());

        Circle c3 = new Circle(4.5);
        System.out.printf("circumference is: %.2f%n", c3.getCirrcumference());

        Circle c4 = new Circle(5);
        System.out.println(c4);
        System.out.printf("area is: %.2f%n", c4.getArea());
        System.out.printf("circumference is: %.2f%n", c4.getCirrcumference());
    }
}

