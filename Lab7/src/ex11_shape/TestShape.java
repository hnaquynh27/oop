package ex11_shape;

public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5.5, "red", false);
        System.out.println(shape1);
        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimeter());
        System.out.println(shape1.getColor());
        System.out.println(shape1.isFilled());

        Circle c1 = (Circle) shape1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        Shape shape3 = new Rectangle(1.0, 2.0, "red", false);
        System.out.println(shape3);
        System.out.println(shape3.getArea());
        System.out.println(shape3.getPerimeter());
        System.out.println(shape3.getColor());

        Rectangle rec1 = (Rectangle) shape3;
        System.out.println(rec1);
        System.out.println(rec1.getArea());
        System.out.println(rec1.getColor());
        System.out.println(rec1.getLength());

        Shape shape4 = new Square(6.6);
        System.out.println(shape4);
        System.out.println(shape4.getArea());
        System.out.println(shape4.getColor());

        Rectangle rec2 = (Rectangle) shape3;
        System.out.println(rec2);
        System.out.println(rec2.getArea());
        System.out.println(rec2.getColor());
        System.out.println(rec2.getLength());

        Square square1 = (Square) rec2;
        System.out.println(square1);
        System.out.println(square1.getArea());
        System.out.println(square1.getColor());
        System.out.println(square1.getLength());
        System.out.println(square1.getSide());
    }
}
