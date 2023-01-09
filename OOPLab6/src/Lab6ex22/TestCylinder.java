package Lab6ex22;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println("Cylinder:" + " base=" + cylinder1.getBase() + " height=" + cylinder1.getHeight() + " base area=" + cylinder1.getArea() + " volume=" + cylinder1.getVolume());

        Cylinder cylinder2 = new Cylinder(5, "blue", 6);
        System.out.println(cylinder2.toString());
    }
}
