package by.tms.lesson8.figures.FiguresWithPoints.FiguresWith4Points;


import java.util.Objects;


public class Parallelogram extends FiguresWith4Points {


    protected double height = 0.0;


    public Parallelogram() {
    }


    @Override
    public double CalculateSquare() {
        return getLengthSide1() * height;
    }


    @Override
    public double CalculatePerimeter() {
        return getLengthSide1() + getLengthSide2() + getLengthSide3() + getLengthSide4();
    }


    @Override
    public String toString() {
        return "Parallelogram{" +
                "height=" + height +
                ", lengthSide1=" + lengthSide1 +
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parallelogram that = (Parallelogram) o;
        return Double.compare(that.height, height) == 0;
    }


    @Override
    public int hashCode() {
        return Objects.hash(height);
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
