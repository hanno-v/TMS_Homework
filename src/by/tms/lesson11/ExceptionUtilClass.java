package by.tms.lesson11;

//4.	Создать утилитный класс, в котором должны быть методы вопроизводящие следующие исключительные ситации (у методов должны быть понятные названия):
//•	Генерация NullPointerException. Отловите возникшее исключение и выведите stackTrace.
//•	Написать метод, который создаст, а затем отловит ArrayIndexOutOfBoundsException и корректно его обработает.
//•	Создать метод, выбрасывающий исключение IllegalArgumentException. Вызвать этот метод и отловить исключение. Вывести в консоль сообщение этого исключения.
//•	Создать метод выбрасывающий одно из существующих в JDK исключений, отловить его и выбросить своё собственное,
//      указав в качестве причины отловленное (тип своего исключения должен соответствовать типу исключения из JDK – проверяемое или не проверяемое).
//•	Создать метод случайным образом выбрасывающий одно из 3-х исключений. Исключения выбрать самому.
//      Вызвать этот метод в блоке try-catch, отлавливающем каждое из 3-х по отдельности.
//•	Написать метод, который в 50% случаев бросает исключение. Вызвать этот метод в конструкции try-catch-finally.
//      Протестировать работу блока finally.

import java.net.SocketException;

public final class ExceptionUtilClass {

    private ExceptionUtilClass() {
    }


    //•	Генерация NullPointerException. Отловите возникшее исключение и выведите stackTrace.
    public static void generateNullPointerException(Object nullObject) {
        nullObject.toString();
    }


    //•	Написать метод, который создаст, а затем отловит ArrayIndexOutOfBoundsException и корректно его обработает.
    public static void generateArrayIndexOutOfBoundsException() {
        int[] array = new int[5];
//        array[10] = 0;

        try {
            array[10] = 0;
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("You have a ArrayIndexOutOfBoundsException, check your array index");
        }
    }


    //•	Создать метод, выбрасывающий исключение IllegalArgumentException. Вызвать этот метод и отловить исключение. Вывести в консоль сообщение этого исключения.
    public static void generateIllegalArgumentException(int inputValue) {
        if (inputValue != 0) {
            throw new IllegalArgumentException();
        }

    }


    //•	Создать метод выбрасывающий одно из существующих в JDK исключений, отловить его и выбросить своё собственное,
    //      указав в качестве причины отловленное (тип своего исключения должен соответствовать типу исключения из JDK – проверяемое или не проверяемое).
    public static void generateJDKExceptionAndThrowOwnException() throws SocketException {
        throw new SocketException();
    }


    //•	Создать метод случайным образом выбрасывающий одно из 3-х исключений. Исключения выбрать самому.
    //      Вызвать этот метод в блоке try-catch, отлавливающем каждое из 3-х по отдельности.
    public static void generateRandomException() {
        final double minNumber = 1.0;
        final double maxNumber = 3.0;

        double randomValue = Math.random();

        randomValue = Math.round(randomValue * (maxNumber - minNumber) + minNumber);
        int finalValue = (int) randomValue;

        switch (finalValue) {
            case 1:
                throw new NullPointerException();
            case 2:
                throw new ArithmeticException();
            case 3:
                throw new NumberFormatException();
        }

    }


    //•	Написать метод, который в 50% случаев бросает исключение. Вызвать этот метод в конструкции try-catch-finally.
    //      Протестировать работу блока finally.
    public static void lotteryException() {
        double randomValue = Math.random();

        if (randomValue > 0.5) {
            throw new IllegalArgumentException();
        }

    }


}
