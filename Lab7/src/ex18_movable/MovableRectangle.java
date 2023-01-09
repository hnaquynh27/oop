package ex18_movable;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft, bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x1, y1, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        bottomRight.y += bottomRight.ySpeed;
        topLeft.y += topLeft.ySpeed;
    }

    @Override
    public void moveDown() {
        bottomRight.y -= bottomRight.ySpeed;
        topLeft.y -= topLeft.ySpeed;
    }

    @Override
    public void moveLeft() {
        bottomRight.x -= bottomRight.xSpeed;
        topLeft.x -= bottomRight.xSpeed;
    }

    @Override
    public void moveRight() {
        bottomRight.x += bottomRight.xSpeed;
        topLeft.x += bottomRight.xSpeed;
    }
}
