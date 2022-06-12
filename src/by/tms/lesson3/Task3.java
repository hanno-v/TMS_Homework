package by.tms.lesson3;

import java.util.Scanner;

public class Task3 {


    //3*. �������� ���������, ������������ ���������� �� ������� �� N ����. N �������� �������������.
    //    ������������ ����� ������ ������ N ����� �����, ������������ �������� ������� � ����. (���������� ������������ Scanner)
    //    ��������� ������ ��������:
    //a. ���������� ����
    //b. ����� ������� �� ���� ������
    //c. ������� ���������� ������� �� ���� ������
    //d. ������������ ���������� ������� ������� �� ���� ������
    //    �� ������������ �������!

    public static void main(String[] args) {

        System.out.println("Hello. Enter the number of days :");

        // ���� �����
        Scanner myScanner1 = new Scanner(System.in);
        int numberIn1 = myScanner1.nextInt();


        // ���� ������� <= 0, �� ���� �� ���������
        if (numberIn1 <= 0) {
            System.out.println("Cycle done, goodbye"); // ����� ����������
        } else {


            int varNumDays = numberIn1; // ����� ����
            int varCycle_i = 1; // �������� ��� ��� �����

            double varRainfallAverage = 0.0; // ������� ��������
            double varDoubleBuf1 = 0.0; // �������� ��� ��� ������� double
            double varDoubleBuf2 = 0.0; // �������� ��� ��� ������� double
            int varMaxRainfallAverage = 0; // ������������ �������� �������
            int varSumRainfall = 0; // ����� �������

            String varStringBuf1 = ""; // �������� ��� ��� ������ ������


            for (; varCycle_i <= varNumDays; varCycle_i++) {

                // ����� "������� �������� ������� ��� ��� �.."
                varStringBuf1 = Integer.toString(varCycle_i);
                System.out.println("Enter rainfall in mm for day �".concat(varStringBuf1));


                // ���� �����
                Scanner myScanner2 = new Scanner(System.in);
                int numberIn2 = myScanner2.nextInt();

                // ������ ����� (��� ����� ������ � ��� �����)
                varSumRainfall += numberIn2;

                // ������� �������� (��� ����� ������ � ��� �����)
                varDoubleBuf1 = varCycle_i;
                varDoubleBuf2 = varSumRainfall;
                varRainfallAverage = varDoubleBuf2 / varDoubleBuf1;

                // ������� ������������� ��������
                if (numberIn2 > varMaxRainfallAverage) {
                    varMaxRainfallAverage = numberIn2;
                }

            }


            // ����� ������������ ��������
            System.out.println("");

            varStringBuf1 = Integer.toString(varNumDays);
            System.out.println("Number of days: ".concat(varStringBuf1));

            varStringBuf1 = Integer.toString(varMaxRainfallAverage);
            System.out.println("Max rainfall: ".concat(varStringBuf1).concat(" mm."));

            varStringBuf1 = Double.toString(varRainfallAverage);
            System.out.println("Average rainfall: ".concat(varStringBuf1).concat(" mm."));

            varStringBuf1 = Integer.toString(varSumRainfall);
            System.out.println("Sum of rainfall: ".concat(varStringBuf1).concat(" mm."));


        }


    }
}
