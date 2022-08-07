package by.tms.lesson13.task1;

public final class StringUtils {

    private StringUtils() {
    }

    // метод для очищения слова от знаков препинания в конце
    public static String cutDot(String stringToCut) {

        StringBuilder stringBuilder = new StringBuilder(stringToCut);

        if (Character.isAlphabetic(stringBuilder.charAt(stringBuilder.length() - 1))
                || (Character.isDigit(stringBuilder.charAt(stringBuilder.length() - 1)))) {
            return stringToCut;
        } else {

            while (!Character.isAlphabetic(stringBuilder.charAt(stringBuilder.length() - 1))
                    && (!Character.isDigit(stringBuilder.charAt(stringBuilder.length() - 1)))) {

                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }

            return stringBuilder.toString();

        }

    }

}
