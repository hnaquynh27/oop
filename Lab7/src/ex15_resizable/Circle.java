package ex15_resizable;

import ex12_geometric.GeometricObject;

public class Circle implements GeometricObject {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[" + "radius=" + radius + ']';
    }

    public double getPerimeter() {
        return Math.PI * radius * radius;
    }

    public double getArea() {
        return 2 * Math.PI * radius;
    }
}
