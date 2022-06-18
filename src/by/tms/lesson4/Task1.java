package by.tms.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {

        // 1. Напишите программу, которая циклически сдвигает элементы массива вправо на одну позицию, и печатает результат.
        // Цикличность означает, что последний элемент массива становится самым первым его элементом.
        //
        //Пример: {1,2,3,4,5} -> {5,1,2,3,4}


        // Ввод размерности массива
        System.out.println("Enter the dimension of array between 1 and 1000:");

        // ввод числа
        Scanner myScanner1 = new Scanner(System.in);
        int numberIn1 = myScanner1.nextInt();

        if (numberIn1 >= 1 && numberIn1 <= 1000) {


            // объявление массива
            int[] arrayInt = new int[numberIn1];

            // заполнение массива (для удобства последовательными цифрами начиная с 1)
            int i = 0;

            for (; i < arrayInt.length; i++) {
                arrayInt[i] = i + 1;
            }


            System.out.println("We have an array " + Arrays.toString(arrayInt));
            System.out.println("How many times you need to shift this array? Enter the number between 1 and 1000:");

            // ввод числа
            numberIn1 = myScanner1.nextInt();


            // проверка, что введенное число >=1 и <=1000
            if (numberIn1 >= 1 && numberIn1 <= 1000) {


                for (; numberIn1 > 0; numberIn1--) {


                    // Запоминаем последнее число массива, чтобы дальше его перенести в ячейку 0
                    int varBuf = arrayInt[arrayInt.length - 1];


                    for (i = arrayInt.length - 1; i >= 1; i--) {
                        arrayInt[i] = arrayInt[i - 1];
                    }

                    arrayInt[0] = varBuf;


                    System.out.println(Arrays.toString(arrayInt));

                }


            } else
                System.out.println("Come on man, you need number >0");


        } else
            System.out.println("Array dimension might be between 1 and 1000");

    }


}
