package by.tms.lesson3;

import java.util.Scanner;

public class Task3 {


    //3*. Написать программу, отображающую статистику по осадкам за N дней. N вводится пользователем.
    //    Пользователь также должен ввести N целых чисел, обозначающих величину осадков в день. (Необходимо использовать Scanner)
    //    Программа должна выводить:
    //a. Количество дней
    //b. Сумму осадков за этот период
    //c. Среднее количество осадков за этот период
    //d. Максимальное количество дневных осадков за этот период
    //    Не использовать массивы!

    public static void main(String[] args) {

        System.out.println("Hello. Enter the number of days :");

        // ввод числа
        Scanner myScanner1 = new Scanner(System.in);
        int numberIn1 = myScanner1.nextInt();


        // если введено <= 0, то цикл не выполняем
        if (numberIn1 <= 0) {
            System.out.println("Cycle done, goodbye"); // вывод результата
        } else {


            int varNumDays = numberIn1; // число дней
            int varCycle_i = 1; // буферный тег для цикла

            double varRainfallAverage = 0.0; // среднее значение
            double varDoubleBuf1 = 0.0; // буферный тег для расчёта double
            double varDoubleBuf2 = 0.0; // буферный тег для расчёта double
            int varMaxRainfallAverage = 0; // максимальное значение осадков
            int varSumRainfall = 0; // сумма осадков

            String varStringBuf1 = ""; // буферный тег для вывода текста


            for (; varCycle_i <= varNumDays; varCycle_i++) {

                // текст "введите значение осадков для дня №.."
                varStringBuf1 = Integer.toString(varCycle_i);
                System.out.println("Enter rainfall in mm for day №".concat(varStringBuf1));


                // ввод числа
                Scanner myScanner2 = new Scanner(System.in);
                int numberIn2 = myScanner2.nextInt();

                // расчёт суммы (это можно делать и вне цикла)
                varSumRainfall += numberIn2;

                // рассчёт среднего (это можно делать и вне цикла)
                varDoubleBuf1 = varCycle_i;
                varDoubleBuf2 = varSumRainfall;
                varRainfallAverage = varDoubleBuf2 / varDoubleBuf1;

                // рассчёт максимального значения
                if (numberIn2 > varMaxRainfallAverage) {
                    varMaxRainfallAverage = numberIn2;
                }

            }


            // вывод рассчитанных значений
            System.out.println("");

            varStringBuf1 = Integer.toString(varNumDays);
            System.out.println("Number of days: ".concat(varStringBuf1));

            varStringBuf1 = Integer.toString(varMaxRainfallAverage);
            System.out.println("Max rainfall: ".concat(varStringBuf1).concat(" mm."));

            varStringBuf1 = Double.toString(varRainfallAverage);
            System.out.println("Average rainfall: ".concat(varStringBuf1).concat(" mm."));

            varStringBuf1 = Integer.toString(varSumRainfall);
            System.out.println("Sum of rainfall: ".concat(varStringBuf1).concat(" mm."));


        }


    }
}
