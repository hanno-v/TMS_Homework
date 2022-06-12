package by.tms.lesson3;

import java.util.Scanner;

public class Task1 {


    // 1. Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.
    public static void main(String[] args) {

        System.out.println("Hello. Enter the number from -2 147 483 648 to 2 147 483 647 :");

        // ввод числа
        Scanner myScanner = new Scanner(System.in);
        int numberIn = myScanner.nextInt();


        // приводим введённое число к положительному значению
        if (numberIn < 0) {
            numberIn = numberIn * -1;
        }


        // объявление переменных
        int varOut = 0; // сумма цифр введённого числа
        int varInt1 = 9; // начинаем с 10^9
        int varBufCalc1 = 0; // буферные рассчёты
        int varBufCalc2 = 0; // буферные рассчёты (сорри за названия, ничего умнее не придумал)


        // основной цикл
        // суть : max и min числа в INT состоят из 10 цифр. Мы последовательно делим введённое число на 10^i, получаем остаток.
        // Этот остаток прибавляем к общему результату, если остаток был != 0, то отнимаем от введённого числа 10^i.
        // Постепенно проходим по каждой цифре, и получаем сумму цифр

        for (; varInt1 >= 0; varInt1--) {


            // калечный алгоритм возведения в степень (знаю, что в java можно сделать через библиотеки, но пусть будет так)
            varBufCalc1 = 1;

            if (varInt1 > 0) {          // если нужно возвести в степень > 0

                // возведение в степень
                for (varBufCalc2 = 1; varBufCalc2 <= varInt1; varBufCalc2++) {
                    varBufCalc1 = varBufCalc1 * 10;
                }
            }


            // находим остаток от деления на 10^x (т.е. получаем верхнюю цифру числа)
            varBufCalc2 = numberIn / varBufCalc1;
            // System.out.println(varBufCalc2);

            varOut = varOut + varBufCalc2; // прибавляем к итоговому результату суммы цифр

            numberIn = numberIn - (varBufCalc2 * varBufCalc1); // отнимаем остаток*(10^x) от введённого числа

        }


        String varOutString = "";
        varOutString = Integer.toString(varOut); // перевод из int в string для вывода результата
        System.out.println("Sum of numbers: ".concat(varOutString)); // вывод результата

    }

}