package by.tms.lesson8;

import by.tms.lesson8.figures.FiguresWithPoints.FiguresWith4Points.Rectangle;
import by.tms.lesson8.figures.FiguresWithPoints.FiguresWith3Points.Triangle;
import by.tms.lesson8.figures.FiguresWithPoints.FiguresWithPoints;

public final class ShapeUtils {


    FiguresWithPoints abc;


    public ShapeUtils() {
    }


    public static boolean IsFigureTriangle(FiguresWithPoints FigureToCheck) {
        return FigureToCheck instanceof Triangle;
    }


    public static boolean IsFigureRectangle(FiguresWithPoints FigureToCheck) {
        return FigureToCheck instanceof Rectangle;
    }


}
