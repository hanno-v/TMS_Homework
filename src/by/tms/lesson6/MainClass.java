package by.tms.lesson6;

import java.util.Scanner;

public class MainClass {


    public static void main(String[] args) {


        // Ввод позиции X точки 1
        System.out.println("Enter X of point 1:");
        // ввод числа
        Scanner myScanner1 = new Scanner(System.in);
        int x1 = myScanner1.nextInt();


        // Ввод позиции Y точки 1
        System.out.println("Enter Y of point 1:");
        // ввод числа
        int y1 = myScanner1.nextInt();


        // Ввод позиции X точки 2
        System.out.println("Enter X of point 2:");
        // ввод числа
        int x2 = myScanner1.nextInt();


        // Ввод позиции Y точки 2
        System.out.println("Enter Y of point 2:");
        // ввод числа
        int y2 = myScanner1.nextInt();

        // не совсем уверен правильно ли так делать инициализацию в рамках этой задачи, но почему нет?
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 0);

        point1.setX(x1);
        point1.setY(y1);
        point2.setX(x2);
        point2.setY(y2);

        System.out.println("Lenght from point1 to point 2 = " + point1.distance(point2));


        Rectangle rectangle1 = new Rectangle(point1, point2);


        System.out.println("Rectangle square = " + rectangle1.getSquare(point1, point2));

        System.out.println("Rectangle perimeter = " + rectangle1.getPerimeter(point1, point2));

        // то же самое, что и длина от точки до точки, рассчитанное ранее
        System.out.println("Rectangle diagonal lenght = " + rectangle1.getDiagonalLenght(point1, point2));


    }


}
