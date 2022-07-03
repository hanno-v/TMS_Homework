package by.tms.lesson8.figures.FiguresWithPoints.FiguresWith3Points;

import by.tms.lesson8.figures.FiguresWithPoints.FiguresWithPoints;

public abstract class FiguresWith3Points extends FiguresWithPoints {


    protected double lengthSide1;
    protected double lengthSide2;
    protected double lengthSide3;
    protected double angle1;
    protected double angle2;
    protected double angle3;


    public FiguresWith3Points(double lengthSide1, double lengthSide2, double lengthSide3, double angle1, double angle2, double angle3) {
        this.lengthSide1 = lengthSide1;
        this.lengthSide2 = lengthSide2;
        this.lengthSide3 = lengthSide3;
        this.angle1 = angle1;
        this.angle2 = angle2;
        this.angle3 = angle3;
    }


    public FiguresWith3Points() {

    }


    public double getLengthSide1() {
        return lengthSide1;
    }

    public void setLengthSide1(double lengthSide1) {
        this.lengthSide1 = lengthSide1;
    }

    public double getLengthSide2() {
        return lengthSide2;
    }

    public void setLengthSide2(double lengthSide2) {
        this.lengthSide2 = lengthSide2;
    }

    public double getLengthSide3() {
        return lengthSide3;
    }

    public void setLengthSide3(double lengthSide3) {
        this.lengthSide3 = lengthSide3;
    }

    public double getAngle1() {
        return angle1;
    }

    public void setAngle1(double angle1) {
        this.angle1 = angle1;
    }

    public double getAngle2() {
        return angle2;
    }

    public void setAngle2(double angle2) {
        this.angle2 = angle2;
    }

    public double getAngle3() {
        return angle3;
    }

    public void setAngle3(double angle3) {
        this.angle3 = angle3;
    }
}
