package by.tms.lesson13.task1;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

//1. Задан текст на английском языке. Выделить все различные слова.
//Для каждого слова подсчитать частоту его встречаемости.
//Слова, отличающиеся регистром букв, считать различными.
public class MainClass {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(Paths.get("resources", "lesson13", "Task1Text.txt").toFile())) {

            ArrayList<String> arrayList = new ArrayList<>();

            // добавляем все слова в общую коллекцию
            while (scanner.hasNext()) {
                // очищаем слово от знаков препинания в конце и добавляем в общую коллекцию
                arrayList.add(StringUtils.cutDot(scanner.next()));
            }

            // преобразование в коллекцию, в которой будут находиться только уникальные слова
            HashSet<String> hashSet = new HashSet<>(arrayList);

            // подсчёт каждого уникального слова, сколько раз оно используется в общей коллекции, и запись в файл
            try (FileWriter fileWriter = new FileWriter(Paths.get("resources", "lesson13", "Task1Result.txt").toFile())) {

                int counter = 0;
                for (String hashSetCurrentElement : hashSet
                ) {
                    counter = 0;

                    for (String arrayListCurrentElement : arrayList
                    ) {
                        if (arrayListCurrentElement.equals(hashSetCurrentElement)) {
                            counter++;
                        }
                    }

                    fileWriter.write(hashSetCurrentElement + " used " + counter + " times" + System.lineSeparator());
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}