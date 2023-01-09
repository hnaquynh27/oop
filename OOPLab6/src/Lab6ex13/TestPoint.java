package Lab6ex13;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point1 = new Point2D(5, 6);
        System.out.println(point1.toString());
        point1.setXY(6, 7);
        System.out.println(point1.getY());

        Point3D point2 = new Point3D(6, 4, 5);
        System.out.println(point2.toString());
    }
}
