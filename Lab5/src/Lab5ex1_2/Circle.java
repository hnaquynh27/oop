package Lab5ex1_2;

public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(int radius) {
        return radius;
    }

    public void setRadius() {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCirrcumference() {
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[" + "radius=" + radius + ']';
    }
}

