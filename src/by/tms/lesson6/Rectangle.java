package by.tms.lesson6;

public class Rectangle {


    private Point pointLeftUp;
    private Point pointRightDown;


    public Rectangle() {
    }


    public Rectangle(Point pointLeftUp, Point pointRightDown) {
        this.pointLeftUp = pointLeftUp;
        this.pointRightDown = pointRightDown;
    }


    // Расчёт площади
    public int getSquare(Point point1, Point point2) {

        int distanceX;
        int distanceY;

        distanceX = Math.abs(point1.getX() - point2.getX());
        distanceY = Math.abs(point1.getY() - point2.getY());

        return (distanceX * distanceY);

    }


    // Расчёт периметра
    public int getPerimeter(Point point1, Point point2) {

        int distanceX;
        int distanceY;

        distanceX = Math.abs(point1.getX() - point2.getX());
        distanceY = Math.abs(point1.getY() - point2.getY());

        return (distanceX * 2 + distanceY * 2);

    }


    // Расчёт длины диагонали
    public double getDiagonalLenght(Point point1, Point point2) {

        int distanceX;
        int distanceY;
        double diagonalLenght;

        distanceX = Math.abs(point1.getX() - point2.getX());
        distanceY = Math.abs(point1.getY() - point2.getY());

        diagonalLenght = Math.hypot(distanceX, distanceY);

        return diagonalLenght;


    }


}
