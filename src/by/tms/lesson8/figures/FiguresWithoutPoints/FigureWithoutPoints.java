package by.tms.lesson8.figures.FiguresWithoutPoints;

import by.tms.lesson8.figures.Figures;

public abstract class FigureWithoutPoints extends Figures {


    protected double radius = 0.0;

    public FigureWithoutPoints(double radius) {
        this.radius = radius;
    }

    public FigureWithoutPoints() {
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
