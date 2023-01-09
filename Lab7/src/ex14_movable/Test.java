package ex14_movable;

public class Test {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(1, 1, 2, 3);
        System.out.println(m1.toString());
        m1.moveUp();
        System.out.println(m1.toString());
        System.out.println();

        Movable m2 = new MovableCircle(1, 2, 3, 4, 5);
        System.out.println(m2.toString());
        m2.moveDown();
        System.out.println(m2.toString());
        System.out.println();
    }
}
