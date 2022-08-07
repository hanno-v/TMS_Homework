package by.tms.lesson10.task1;

import java.util.Scanner;

public class MainClass {

    // 1. Проверить, является ли введённая строка палиндромом, т.е. читается одинаково в обоих направлениях

    public static void main(String[] args){

        // Ввод слова для проверки
        System.out.println("Enter the word to check:");

        // ввод слова
        // !! при вводе числа всё что после первого пробела - не учитывается !!
        Scanner myScanner1 = new Scanner(System.in);

        StringBuilder wordFromUser = new StringBuilder(myScanner1.next());


        if (wordFromUser.length() == 0){
            System.out.println("Word is empty");
        } else if (wordFromUser.length() <= 2) {
            System.out.println("Word is not a palindrome");

        } else
        {
            String wordConverted1 = wordFromUser.toString();

            wordFromUser.reverse();
            String wordConverted2 = wordFromUser.toString();

            if (wordConverted1.equals(wordConverted2)) {
                System.out.println("This is a palindrome");
            } else {
                System.out.println("This is not a palindrome");
            }

        }

    }

}
