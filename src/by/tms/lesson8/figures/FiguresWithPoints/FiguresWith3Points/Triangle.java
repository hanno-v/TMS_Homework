package by.tms.lesson8.figures.FiguresWithPoints.FiguresWith3Points;


public class Triangle extends FiguresWith3Points {


    public Triangle() {
    }


    @Override
    public double CalculateSquare() {
        return getLengthSide1() * getLengthSide2() * Math.sin(getAngle1());
    }


    @Override
    public double CalculatePerimeter() {
        return getLengthSide1() + getLengthSide2() + getLengthSide3();
    }


    // собственный метод для треугольников по нахождению высоты
    public double GetTriangleHeight() {
        return getLengthSide1() * Math.sin(getAngle1());
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "lengthSide1=" + lengthSide1 +
                ", lengthSide2=" + lengthSide2 +
                ", lengthSide3=" + lengthSide3 +
                ", angle1=" + angle1 +
                ", angle2=" + angle2 +
                ", angle3=" + angle3 +
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
