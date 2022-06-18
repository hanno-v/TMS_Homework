package by.tms.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {


        // 3. Написать программу, которая преобразовывает двумерный массив в одномерный массив со всеми элементами двумерного.


        // Ввод размерности 1 двумерного массива
        System.out.println("Enter the first dimension of array between 1 and 100:");

        // ввод числа
        Scanner myScanner1 = new Scanner(System.in);
        int varDim1 = myScanner1.nextInt();


        // Ввод размерности 2 двумерного массива
        System.out.println("Enter the second dimension of array between 1 and 100:");

        // ввод числа
        int varDim2 = myScanner1.nextInt();


        if (varDim1 >= 1 && varDim1 <= 100 && varDim2 >= 1 && varDim2 <= 100) {

            // объявление двумерного массива
            int[][] arrayTwoDim = new int[varDim1][varDim2];


            int i = 0;
            int j = 0;


            // заполнение двумерного массива случайными числами от 0 до 100
            while (i < varDim1 && j < varDim2) {

                arrayTwoDim[i][j] = (int) (Math.random() * 100);

                j++;

                if (j >= varDim2) {
                    i++;
                    j = 0;
                }

                if (i >= varDim1) {
                    break;
                }

            }


            // вывод на экран двумерного массива
            System.out.println("Your 2 dimension array is:");

            for (i = 0; i < varDim1; i++) {
                System.out.println(Arrays.toString(arrayTwoDim[i]));
            }


            System.out.println("            |");
            System.out.println("            |");
            System.out.println("            |");
            System.out.println("            v");


            // объявление одномерного массива
            int varOneDimArray = 0;
            varOneDimArray = varDim1 * varDim2;

            int[] arrayOneDim = new int[varOneDimArray];


            i = 0;
            j = 0;
            int k = 0;

            // перенос из двумерного массива в одномерный
            while (i < varDim1 && j < varDim2) {

                arrayOneDim[k] = arrayTwoDim[i][j];

                k++;
                j++;

                if (j >= varDim2) {
                    i++;
                    j = 0;
                }

                if (i >= varDim1) {
                    break;
                }
                /**/

            }


            // вывод на экран одномерного массива
            System.out.println("Your 1 dimension array is:");

            System.out.println(Arrays.toString(arrayOneDim));


        } else {
            System.out.println("All dimensions of array might be between 1 and 100");
        }

    }
}
