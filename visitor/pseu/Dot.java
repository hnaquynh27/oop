package visitor.pseu;

public class Dot implements Shape {
    int x, y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public void draw() {
        System.out.println("(" + x + ", " + y + ")");
    }

    public String accept(Visitor v) {
        return v.visitDot(this);
    }
}
