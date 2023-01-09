package Lab6ex14;

public class TestShape {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Rectangle rec1 = new Rectangle(12, 60, "blue", false);
        ;
        Square s1 = new Square();
        System.out.println(c1.toString());
        System.out.println("Circle area is " + c1.getArea() + "Circle perimeter is " + c1.getPerimeter());
        System.out.println(rec1.toString());
        System.out.println("Rectangle area is " + rec1.getArea() + "Rectangle perimeter is " + rec1.getPerimeter());
        System.out.println(s1.toString());
        System.out.println("Square area is " + s1.getArea() + "Square perimeter is " + s1.getPerimeter());
        System.out.println();
    }
}
