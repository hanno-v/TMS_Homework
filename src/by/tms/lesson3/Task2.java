package by.tms.lesson3;

import java.util.Scanner;

public class Task2 {


    // 2. Написать программу, вычисляющую и отображающую все числа Фибоначчи меньше введённого пользователем целого числа.
    public static void main(String[] args) {


        System.out.println("Hello. Enter the number from -2 147 483 648 to 2 147 483 647 :");


        // ввод числа
        Scanner myScanner = new Scanner(System.in);
        int numberIn = myScanner.nextInt();

        // если вводится число <0, 0, 1, 2 --> предзаписанный текст
        // если вводится число >2 --> рассчитываем
        if (numberIn <= 0) {
            System.out.println("There are no numbers in Fibonacci sequence less than input number."); // вывод результата
        } else if (numberIn == 1) {
            System.out.println("Numbers in Fibonacci sequence less than input number: 0"); // вывод результата
        } else if (numberIn == 2) {
            System.out.println("Numbers in Fibonacci sequence less than input number: 0, 1, 1"); // вывод результата
        } else {


            // Определение чисел Фибоначчи
            int varFib1 = 1; // число 1
            int varFib2 = 2; // число 2
            int varFibBuf = 0; // буферный тег для расчёта суммы
            String varFibNumbersString = ""; // текстовый тег, куда записываются числа Фибоначчи, меньше введённого
            String varBufString = ""; // буферный тег для перевода из INT в string


            for (; ; ) {

                varFibBuf = varFib1 + varFib2; // буферный расчёт суммы чисел

                // выходим из цикла, если число Фибоначчи получилось больше введённого
                if (numberIn <= varFibBuf) {
                    break;
                }


                // записываем число в результат
                varBufString = "";
                varBufString = Integer.toString(varFibBuf);
                varFibNumbersString = varFibNumbersString.concat(", ").concat(varBufString);

                // сдвигаем наши 2 числа для рассчётов
                varFib1 = varFib2;
                varFib2 = varFibBuf;


            }


            System.out.println("Numbers in Fibonacci sequence less than input number: 0, 1, 1, 2".concat(varFibNumbersString)); // вывод результата

        }

    }

}