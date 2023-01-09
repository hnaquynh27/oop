package visitor.pseu;

public class Circle implements Shape {
    int x, y;
    int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public void draw() {
        System.out.printf("[(%d, %d), radius=%d]\n", x, y, radius);
    }

    public String accept(Visitor v) {
        return v.visitCircle(this);
    }
}
