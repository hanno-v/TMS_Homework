package by.tms.lesson13.task3;


// 3. Написать метод markLength4, принимающий в качестве параметра список (List) строк и размещающий строку "****"
// перед каждым четырёхсимвольным элементом. Оригинальные элементы должны остаться на месте.
//          Например:
//
//{"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"}
//
//->
//
//{"****", "this", "is", "****", "lots", "of", "fun", "for", "every", "****", "Java", "programmer"}

import java.util.ArrayList;

public final class ListUtils {

    private ListUtils() {
    }


    public static void markLength4(ArrayList<String> listToConvert) {

        final int ELEMENT_LENGTH = 4;

        for (int i = 0; i < listToConvert.size(); i++) {

            if (listToConvert.get(i).length() == ELEMENT_LENGTH) {
                listToConvert.add(i, "****");
                i++;
            }

        }

    }

}
