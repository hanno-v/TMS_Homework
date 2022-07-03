package by.tms.lesson8.figures.FiguresWithPoints.FiguresWith4Points;


public class Rectangle extends FiguresWith4Points {

    public Rectangle() {
    }


    @Override
    public double CalculateSquare() {

        return getLengthSide1() * getLengthSide2();

    }


    @Override
    public double CalculatePerimeter() {

        return getLengthSide1() + getLengthSide2() + getLengthSide3() + getLengthSide4();

    }


    // собственный метод для прямоугольников по расчёту длины диагонали
    public double GetRectangleDiagonalLength() {

        return Math.hypot(getLengthSide1(), getLengthSide2());

    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "lengthSide1=" + lengthSide1 +
                ", lengthSide2=" + lengthSide2 +
                ", lengthSide3=" + lengthSide3 +
                ", lengthSide4=" + lengthSide4 +
                ", angle1=" + angle1 +
                ", angle2=" + angle2 +
                ", angle3=" + angle3 +
                ", angle4=" + angle4 +
                '}';
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


}
