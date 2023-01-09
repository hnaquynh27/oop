package ex13_movable;

public class TestMain {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(1, 1, 2, 3);
        System.out.println(m1.toString());
        m1.moveUp();
        System.out.println(m1.toString());
        System.out.println();
    }
}
