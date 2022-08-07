package by.tms.lesson12;

import java.io.*;
import java.util.Arrays;

public final class FileUtils {

    private FileUtils() {
    }

    // Task1
    // 1. Создать (можно вручную) файл со стихотворением(к примеру Александра Пушкина). Определить частоту повторяемости всех букв в стихотворении,
    // игнорируя регистр.
    //          Вывести результат в отдельный файл в виде:
    //          а - 15
    //          б - 7
    //          и т.д.
    public static void fileCharsCount(File fileToCountChars, File fileToWriteResults) {

        String lettersArray = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        int[] resultCountArray = new int[lettersArray.length()];


        if (fileToCountChars != null && fileToCountChars.isFile() && fileToCountChars.exists()) {

            StringBuilder stringBuilder = new StringBuilder();

            try (BufferedReader reader = new BufferedReader(new FileReader(fileToCountChars))) {

                // склеиваем текст
                while (reader.ready()) {
                    stringBuilder.append(reader.readLine());
                }

                // конвертируем склеенную строку в массив символов
                char[] charArray = new char[stringBuilder.length()];
                charArray = stringBuilder.toString().toLowerCase().toCharArray();

                // берём каждую букву из массива букв и считаем сколько раз она используется в тексте
                for (int i=0; i<lettersArray.length(); i++) {

                    for (int j = 0; j<stringBuilder.length(); j++) {
                        if (charArray[j] == lettersArray.charAt(i)) {
                            resultCountArray[i]++;
                        }
                    }

                }

                // запись в файл
                try (FileWriter writer = new FileWriter(fileToWriteResults)) {

                    for (int i=0; i<lettersArray.length(); i++) {
                        writer.write(lettersArray.charAt(i) + " - " + resultCountArray[i] + System.lineSeparator());
                    }

                }  catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e); }


            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }



    // Task2
    // 2. Создать программно и заполнить файл случайными целыми числами.
    // Отсортировать содержимое файла по возрастанию и записать в новый файл.
    public static void createNewFilesAndSortValues (File fileToGetStartValues, int minRandomValue, int maxRandomValue,
                                                   File fileToWriteSortedValues) {

        // создание файла, куда будем писать начальные значения
        if (!fileToGetStartValues.exists() && fileToGetStartValues.isFile() && fileToGetStartValues != null) {
            try {
                System.out.println("File to get values from is created? --> " + fileToGetStartValues.createNewFile());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        // заполнение файла случайными числами
        try (FileWriter writer = new FileWriter(fileToGetStartValues);) {
            for (int i = 0; i < 1000; i++) {
                try {
                    writer.write(Integer.valueOf(getRandomInteger(minRandomValue, maxRandomValue)) + " "); //пришлось запаковать через valueOf, иначе
                                                                                            // в файле показывало китайскими символами

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // создание файла, куда будем писать отсортированные значения
        if (!fileToWriteSortedValues.exists() && fileToWriteSortedValues != null) {
            try {
                System.out.println("File to write sorted values is created? --> " + fileToWriteSortedValues.createNewFile());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        // чтение файла со случайными значениями, деление их на массив int, сортировка массива и запись в файл
        if (fileToWriteSortedValues.exists() && fileToWriteSortedValues.isFile() && fileToWriteSortedValues != null) {

            StringBuilder stringBuilder = new StringBuilder();

            try (BufferedReader reader = new BufferedReader(new FileReader(fileToGetStartValues))) {

                // чтение файла и склейка в строку
                while (reader.ready()) {
                    stringBuilder.append(reader.readLine());
                }

                // деление строки по пробелу на массив string
                String[] splitResultArray = stringBuilder.toString().split(" ");

                // конвертация массива string в массив int
                int[] intArray = new int[splitResultArray.length];
                for (int i=0; i<splitResultArray.length; i++){
                    intArray[i] = Integer.valueOf(splitResultArray[i]);
                }

                // сортировка массива int по возрастанию
                Arrays.sort(intArray);

                // запись в файл
                try (FileWriter writer = new FileWriter(fileToWriteSortedValues)) {

                    for (int i = 0; i < intArray.length; i++) {
                        writer.write(intArray[i] + " ");
                    }

                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }


            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }



    // метод для генерации случайных int
    public static int getRandomInteger (int minNumber, int maxNumber) {
        double randomDouble = Math.random();

        randomDouble = Math.round(randomDouble * ((double)maxNumber - (double)minNumber) + (double)minNumber);
        return (int) randomDouble;
    }

}
