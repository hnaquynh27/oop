package Lab6ex22;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(double radius, String color, double height) {
        base = new Circle(radius, color);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder[" + base.toString() + ", height=" + height + ']';
    }

    public Circle getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2 * base.getArea() + 2 * Math.PI * base.getRadius() * height;
    }

    public double getVolume() {
        return base.getArea() * height;
    }
}
