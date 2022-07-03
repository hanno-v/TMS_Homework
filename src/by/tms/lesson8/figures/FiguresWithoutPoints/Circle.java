package by.tms.lesson8.figures.FiguresWithoutPoints;

public class Circle extends FigureWithoutPoints {


    public Circle() {
    }


    @Override
    public double CalculateSquare() {
        return Math.PI * getRadius() * getRadius();
    }


    // собственный метод для нахождения диаметра круга
    public double GetCircleDiameter() {
        return getRadius() * 2.0;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
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
