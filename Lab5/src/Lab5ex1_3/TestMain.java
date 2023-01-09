package Lab5ex1_3;

public class TestMain {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(1.2f, 3.4f);
        System.out.println(rec1);

        Rectangle rec2 = new Rectangle();
        System.out.println(rec2);

        rec1.setLength(5.6f);
        rec1.setWidth(7.8f);
        System.out.println(rec1);
        System.out.println("length is: " + rec1.getLength());
        System.out.println("width is: " + rec1.getWidth());

        System.out.printf("area is: %.2f%n", rec1.getArea());
        System.out.printf("perimeter is: %.2f%n", rec2.getPerimeter());
    }
}
