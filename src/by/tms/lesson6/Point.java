package by.tms.lesson6;

public class Point {

    private int x;
    private int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public double distance(Point point2) {

        int distanceX;
        int distanceY;
        double distanceToPoint;

        distanceX = Math.abs(point2.x - x);
        distanceY = Math.abs(point2.y - y);

        distanceToPoint = Math.hypot(distanceX, distanceY);

        return distanceToPoint;
    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}
