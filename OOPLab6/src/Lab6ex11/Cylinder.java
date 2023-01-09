package Lab6ex11;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    public double getArea() {
        return 2 * getArea() + 2 * Math.PI * super.getRadius() * height;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}
