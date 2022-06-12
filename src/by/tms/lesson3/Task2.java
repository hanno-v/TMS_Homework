package by.tms.lesson3;

import java.util.Scanner;

public class Task2 {


    // 2. �������� ���������, ����������� � ������������ ��� ����� ��������� ������ ��������� ������������� ������ �����.
    public static void main(String[] args) {


        System.out.println("Hello. Enter the number from -2 147 483 648 to 2 147 483 647 :");


        // ���� �����
        Scanner myScanner = new Scanner(System.in);
        int numberIn = myScanner.nextInt();

        // ���� �������� ����� <0, 0, 1, 2 --> �������������� �����
        // ���� �������� ����� >2 --> ������������
        if (numberIn <= 0) {
            System.out.println("There are no numbers in Fibonacci sequence less than input number."); // ����� ����������
        } else if (numberIn == 1) {
            System.out.println("Numbers in Fibonacci sequence less than input number: 0"); // ����� ����������
        } else if (numberIn == 2) {
            System.out.println("Numbers in Fibonacci sequence less than input number: 0, 1, 1"); // ����� ����������
        } else {


            // ����������� ����� ���������
            int varFib1 = 1; // ����� 1
            int varFib2 = 2; // ����� 2
            int varFibBuf = 0; // �������� ��� ��� ������� �����
            String varFibNumbersString = ""; // ��������� ���, ���� ������������ ����� ���������, ������ ���������
            String varBufString = ""; // �������� ��� ��� �������� �� INT � string


            for (; ; ) {

                varFibBuf = varFib1 + varFib2; // �������� ������ ����� �����

                // ������� �� �����, ���� ����� ��������� ���������� ������ ���������
                if (numberIn <= varFibBuf) {
                    break;
                }


                // ���������� ����� � ���������
                varBufString = "";
                varBufString = Integer.toString(varFibBuf);
                varFibNumbersString = varFibNumbersString.concat(", ").concat(varBufString);

                // �������� ���� 2 ����� ��� ���������
                varFib1 = varFib2;
                varFib2 = varFibBuf;


            }


            System.out.println("Numbers in Fibonacci sequence less than input number: 0, 1, 1, 2".concat(varFibNumbersString)); // ����� ����������

        }

    }

}