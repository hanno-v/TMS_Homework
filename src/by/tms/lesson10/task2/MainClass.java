package by.tms.lesson10.task2;

import java.util.Scanner;

public class MainClass {

    // 2. Написать программу, преобразующую строку, содержащую число в римском формате, в число в арабском формате.
    //Границы чисел: от 1 до 3999. Предусмотреть случай, когда меньший символ идёт перед большим:
    //Например CM == 900; IX == 9.
    //
    //Соответствие:
    //M 1000
    //D 500
    //C 100
    //L 50
    //X 10
    //V 5
    //I 1

    public static void main(String[] args) {

        // Ввод числа в римском формате
        System.out.println("Enter the number in roman format. You can use only I,V,X,L,C,D,M symbols in upper or lower case");

        Scanner myScanner = new Scanner(System.in);

        String numberFromUser = new String(myScanner.next().toUpperCase());
//        String numberFromUser = null;

        // если введённое значение != null
        if (RomanNumbersUtils.IsInputStringIsNull(numberFromUser)) {

            System.out.println("Roman number from user: " + numberFromUser);

            char[] numberFromUserChars = numberFromUser.toCharArray();

            // бит для контроля введённого значения, что там находятся только римские символы
            boolean RomanNumberControlBit = true;

            // проверка на содержимое, чтобы были только цифры в римской форме
            for (int i = 0; i < numberFromUserChars.length; i++) {

                if (numberFromUserChars[i] == 'I' || numberFromUserChars[i] == 'V' || numberFromUserChars[i] == 'X'
                        || numberFromUserChars[i] == 'L' || numberFromUserChars[i] == 'C' || numberFromUserChars[i] == 'D'
                        || numberFromUserChars[i] == 'M') {
                } else {
                    RomanNumberControlBit = false;
                    System.out.println("This is not a roman number here");
                    break;
                }

            }


            int ResultInArabianFormat = 0;

            // если введен только 1 символ, то не надо проверять последовательность, просто переводим в арабский формат
            if (RomanNumberControlBit == true && numberFromUser.length() == 1) {
                ResultInArabianFormat = RomanNumbersUtils.ConvertRomanSymbolToArabianNumber(numberFromUserChars[0]);
                System.out.println("Result = " + ResultInArabianFormat);
            }

            // если введено 2 или больше символов
            if (RomanNumberControlBit == true && numberFromUser.length() >= 2) {

                for (int i = 0; i < numberFromUser.length(); i++) {

                    // если буква последняя, то просто её добавляем
                    if (i == numberFromUser.length() - 1) {
                        ResultInArabianFormat += RomanNumbersUtils.ConvertRomanSymbolToArabianNumber(numberFromUserChars[i]);
                    } else {
                        // если буква не последняя --->
                        // проверяем является ли буква меньшей последующей
                        if (RomanNumbersUtils.IsNumberGreaterThenNext(numberFromUserChars[i], numberFromUserChars[i + 1]) != 0) {
                            ResultInArabianFormat += RomanNumbersUtils.IsNumberGreaterThenNext(numberFromUserChars[i], numberFromUserChars[i + 1]);
                            i++;

                        } else {
                            ResultInArabianFormat += RomanNumbersUtils.ConvertRomanSymbolToArabianNumber(numberFromUserChars[i]);
                        }

                    }

                }

            }


            System.out.println("Result in arabian format = " + ResultInArabianFormat);

        } else System.out.println("Input string is null");

    }

}
