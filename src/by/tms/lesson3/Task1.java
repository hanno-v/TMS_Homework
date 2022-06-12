package by.tms.lesson3;

import java.util.Scanner;

public class Task1 {


    // 1. �������� ���������, ����������� ����� ���� ��������� ������������� ������ �����.
    public static void main(String[] args) {

        System.out.println("Hello. Enter the number from -2 147 483 648 to 2 147 483 647 :");

        // ���� �����
        Scanner myScanner = new Scanner(System.in);
        int numberIn = myScanner.nextInt();


        // �������� �������� ����� � �������������� ��������
        if (numberIn < 0) {
            numberIn = numberIn * -1;
        }


        // ���������� ����������
        int varOut = 0; // ����� ���� ��������� �����
        int varInt1 = 9; // �������� � 10^9
        int varBufCalc1 = 0; // �������� ��������
        int varBufCalc2 = 0; // �������� �������� (����� �� ��������, ������ ����� �� ��������)


        // �������� ����
        // ���� : max � min ����� � INT ������� �� 10 ����. �� ��������������� ����� �������� ����� �� 10^i, �������� �������.
        // ���� ������� ���������� � ������ ����������, ���� ������� ��� != 0, �� �������� �� ��������� ����� 10^i.
        // ���������� �������� �� ������ �����, � �������� ����� ����

        for (; varInt1 >= 0; varInt1--) {


            // �������� �������� ���������� � ������� (����, ��� � java ����� ������� ����� ����������, �� ����� ����� ���)
            varBufCalc1 = 1;

            if (varInt1 > 0) {          // ���� ����� �������� � ������� > 0

                // ���������� � �������
                for (varBufCalc2 = 1; varBufCalc2 <= varInt1; varBufCalc2++) {
                    varBufCalc1 = varBufCalc1 * 10;
                }
            }


            // ������� ������� �� ������� �� 10^x (�.�. �������� ������� ����� �����)
            varBufCalc2 = numberIn / varBufCalc1;
            // System.out.println(varBufCalc2);

            varOut = varOut + varBufCalc2; // ���������� � ��������� ���������� ����� ����

            numberIn = numberIn - (varBufCalc2 * varBufCalc1); // �������� �������*(10^x) �� ��������� �����

        }


        String varOutString = "";
        varOutString = Integer.toString(varOut); // ������� �� int � string ��� ������ ����������
        System.out.println("Sum of numbers: ".concat(varOutString)); // ����� ����������

    }

}