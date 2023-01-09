package ex18_movable;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint centre;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.centre = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return centre.toString() + ", radius=" + radius + ']';
    }

    @Override
    public void moveDown() {
        centre.y += centre.ySpeed;
    }

    @Override
    public void moveUp() {
        centre.y -= centre.ySpeed;
    }

    @Override
    public void moveLeft() {
        centre.x -= centre.xSpeed;
    }

    @Override
    public void moveRight() {
        centre.x += centre.xSpeed;
    }
}