package Lab6ex21;

public class Line {
    private Point begin, end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }

    @Override
    public String toString() {
        return "Line[" + "begin=" + begin + ", end=" + end + ']';
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int beginX) {
        begin.setX(beginX);
    }

    public void setBeginY(int beginY) {
        begin.setY(beginY);
    }

    public void setBeginXY(int beginX, int beginY) {
        begin.setX(beginX);
        begin.setY(beginY);
    }

    public void setEndX(int endX) {
        end.setX(endX);
    }

    public void setEndY(int endY) {
        end.setY(endY);
    }

    public void setEndXY(int endX, int endY) {
        end.setX(endX);
        end.setY(endY);
    }

    public double getLength() {
        double xDiff = getBeginX() - getBeginY();
        double yDiff = getEndX() - getEndY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff); //khoảng cách có thể là thực
    }

    public double getGradient() {
        double xDiff = getBeginX() - getBeginY();
        double yDiff = getEndX() - getEndY();
        return Math.atan2(yDiff, xDiff);
    }

}
