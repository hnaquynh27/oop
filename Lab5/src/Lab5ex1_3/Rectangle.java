package Lab5ex1_3;

public class Rectangle {
    private float length = 1.0f, width = 1.0f;

    public Rectangle() {
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return (double) (length * width);
    }

    public double getPerimeter() {
        return (double) 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle[" + "length=" + length + ", width=" + width + ']';
    }
}

