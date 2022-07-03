package by.tms.lesson8;

import by.tms.lesson8.figures.Figures;

public class MainClass {


    public static void main(String[] args) {


    }

    public static boolean areSquaresOfFiguresIdentical(Figures figure1, Figures figure2) {
        if (figure1.CalculateSquare() == figure2.CalculateSquare()) {
            return true;
        } else {
            return false;
        }
    }


}