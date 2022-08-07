package by.tms.lesson11;

import java.net.SocketException;

public class MainClass {

    public static void main(String[] args) {


        // Task4, NullPointerException
        System.out.println("Task4, NullPointerException");
        try {
            ExceptionUtilClass.generateNullPointerException(null);
        } catch (NullPointerException e1) {
            e1.printStackTrace();
            System.out.println("NullPointerException catched");
        }

        System.out.println("/" + System.lineSeparator() + "/" + System.lineSeparator() + "/");


        // Task4, ArrayIndexOutOfBoundsException
        System.out.println("Task4, ArrayIndexOutOfBoundsException");
        ExceptionUtilClass.generateArrayIndexOutOfBoundsException();

        System.out.println("/" + System.lineSeparator() + "/" + System.lineSeparator() + "/");


        // Task4, IllegalArgumentException
        // if valueFromUser != 0 --> IllegalArgumentException
        System.out.println("Task4, IllegalArgumentException");
        try {
            ExceptionUtilClass.generateIllegalArgumentException(5);
        } catch (IllegalArgumentException e3) {
            System.out.println("Value from user is invalid, you have IllegalArgumentException");
        }

        System.out.println("/" + System.lineSeparator() + "/" + System.lineSeparator() + "/");


        // Task4, throw your own exception
        System.out.println("Task4, throw your own exception");
        try {
            ExceptionUtilClass.generateJDKExceptionAndThrowOwnException();
        } catch (SocketException e4) {

            try {
                throw new MyCheckedException("Wow, i have own exception!", new SocketException());
            } catch (MyCheckedException e5) {
                System.out.println("My own checked exception here");
            }
        }

        System.out.println("/" + System.lineSeparator() + "/" + System.lineSeparator() + "/");


        // Task4, random exception
        System.out.println("Task4, random exception");
        try {
            ExceptionUtilClass.generateRandomException();
        } catch (NullPointerException e4) {
            System.out.println("Random exception == NullPointerException");
        } catch (ArithmeticException e5) {
            System.out.println("Random exception == ArithmeticException");
        } catch (NumberFormatException e6) {
            System.out.println("Random exception == NumberFormatException");
        }

        System.out.println("/" + System.lineSeparator() + "/" + System.lineSeparator() + "/");


        // Task4, lottery exception
        System.out.println("Lottery is starting");
        try {
            ExceptionUtilClass.lotteryException();
        } catch (IllegalArgumentException e7) {
            System.out.println("Congrats, you win the lottery! Here your IllegalArgumentException, great job");
        } finally {
            System.out.println("Lottery is ended");
        }


    }


}
