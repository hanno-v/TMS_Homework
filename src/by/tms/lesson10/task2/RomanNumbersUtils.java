package by.tms.lesson10.task2;

public final class RomanNumbersUtils {

    private RomanNumbersUtils() {
    }


    // преобразование из римских чисел в арабские
    public static int ConvertRomanSymbolToArabianNumber(char RomanSymbol) {

        final int I = 1;
        final int V = 5;
        final int X = 10;
        final int L = 50;
        final int C = 100;
        final int D = 500;
        final int M = 1000;

        switch (RomanSymbol) {

            case 'I':
                return I;
            case 'V':
                return V;
            case 'X':
                return X;
            case 'L':
                return L;
            case 'C':
                return C;
            case 'D':
                return D;
            case 'M':
                return M;
            default:
                return 0;

        }

    }


    // проверка является ли число меньше следующего
    public static int IsNumberGreaterThenNext(char ThisSymbol, char NextSymbol) {

        if (
                ((ThisSymbol == 'I') && (NextSymbol == 'V' || NextSymbol == 'X' || NextSymbol == 'L' || NextSymbol == 'C' || NextSymbol == 'D' || NextSymbol == 'M') )
            ||
                ((ThisSymbol == 'V') && (NextSymbol == 'X' || NextSymbol == 'L' || NextSymbol == 'C' || NextSymbol == 'D' || NextSymbol == 'M') )
            ||
                ((ThisSymbol == 'X') && (NextSymbol == 'L' || NextSymbol == 'C' || NextSymbol == 'D' || NextSymbol == 'M') )
            ||
                ((ThisSymbol == 'L') && (NextSymbol == 'C' || NextSymbol == 'D' || NextSymbol == 'M') )
            ||
                ((ThisSymbol == 'C') && (NextSymbol == 'D' || NextSymbol == 'M') )
            ||
                ((ThisSymbol == 'D') && (NextSymbol == 'M') )
        ) {

            int ThisSymbolNum = ConvertRomanSymbolToArabianNumber(ThisSymbol);
            int NextSymbolNum = ConvertRomanSymbolToArabianNumber(NextSymbol);

            return NextSymbolNum - ThisSymbolNum;

        // если условие не выполняется, то возвращаем 0
        } else {
            return 0;
        }

    }


    // проверка на null
    public static boolean IsInputStringIsNull(String InputString) {
        return InputString != null;
    }

}
