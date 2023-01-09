package visitor.pseu;

public class Rectangle implements Shape {
    int x, y, height, width;

    public Rectangle(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public void draw() {
        System.out.printf("[(%d, %d), height=%d, width=%d)]\n", x, y, height, width);
    }

    public String accept(Visitor v) {
        return v.visitRectangle(this);
    }
}
