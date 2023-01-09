package Lab6ex21;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);

        Point p1 = new Point(5, 6);
        Point p2 = new Point(6, 9);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);

        LineSub l3 = new LineSub(6, 0, 3, 4);
        System.out.println(l3);

        Point p3 = new Point(7, 8);
        Point p4 = new Point(2, 9);
        LineSub l4 = new LineSub(p3, p4);
        System.out.println(l4.toString());
    }
}
