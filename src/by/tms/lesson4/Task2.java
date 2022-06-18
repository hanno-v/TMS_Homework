package by.tms.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {


        // 2. Написать программу, удаляющую все целые числа из массива, которые равны тому, что ввёл пользователь.
        // В результате должен получиться новый массив, в котором нет заданных элементов. Распечатать полученный массив.


        // Ввод размерности массива
        System.out.println("Enter the dimension of array between 1 and 1000:");

        // ввод числа
        Scanner myScanner1 = new Scanner(System.in);
        int numberIn1 = myScanner1.nextInt();


        if (numberIn1 >= 1 && numberIn1 <= 1000) {


            // объявление начального массива
            int[] arrayIntBuf = new int[numberIn1];


            int i = 0;

            // заполнение массива случайными числами
            for (; i < arrayIntBuf.length; i++) {

                arrayIntBuf[i] = (int) (Math.random() * 100);

            }


            // Ввод числа для поиска и удаления
            System.out.println("We have an array " + Arrays.toString(arrayIntBuf));
            System.out.println("IDK why, but you need to delete some numbers? Ok, enter the number between 1 and 100:");

            // ввод числа
            numberIn1 = myScanner1.nextInt();


            if (numberIn1 >= 1 && numberIn1 <= 100) {


                int varDelNum = 0;

                // Проверяем массив на совпадение с введённым числом, если есть совпадение, то обнуляем ячейку
                for (i = 0; i < arrayIntBuf.length; i++) {

                    if (arrayIntBuf[i] == numberIn1) {
                        arrayIntBuf[i] = 0;
                        varDelNum++;
                    }

                }


                ///////
                // Проверяем сколько в массиве осталось чисел <> 0, объявляем новый массив данного размера и переносим туда числа <> 0
                ///////

                int varDimFinalArray = 0;

                for (i = 0; i < arrayIntBuf.length; i++) {

                    if (arrayIntBuf[i] != 0) {
                        varDimFinalArray++;
                    }

                }


                // объявление конечного массива
                int[] arrayIntOut = new int[varDimFinalArray];


                int j = 0;

                // перенос в него чисел <> 0 из начального массива
                for (i = 0; i < arrayIntBuf.length; i++) {

                    if (arrayIntBuf[i] != 0) {
                        arrayIntOut[j] = arrayIntBuf[i];
                        j++;
                    }
                }


                System.out.println("We have deleted " + Integer.toString(varDelNum) + " element(s).");
                System.out.println("Your new array is: " + Arrays.toString(arrayIntOut));

            } else {
                System.out.println("You need number between 1 and 100");
            }


        } else {
            System.out.println("You need number between 1 and 1000");
        }


    }

}
