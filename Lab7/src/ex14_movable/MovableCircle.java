package ex14_movable;

public class MovableCircle implements Movable {
    private int radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return center.toString() + ", radius=" + radius;
    }

    public void moveUp(){
        center.y -= center.ySpeed;
    }

    public void moveDown(){
        center.y += center.ySpeed;
    }

    public void moveLeft(){
        center.x -= center.xSpeed;
    }

    public void moveRight(){
        center.x += center.xSpeed;
    }

}
