package by.tms.lesson13.task3;

import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("1");
        arrayList.add("22");
        arrayList.add("333");
        arrayList.add("4444");
        arrayList.add("55555");
        arrayList.add("6666");
        arrayList.add("7");
        arrayList.add("88");
        arrayList.add("9999");
        arrayList.add("0000000");

        System.out.println("Unmarked collection: " + arrayList);
        ListUtils.markLength4(arrayList);
        System.out.println("Marked collection: " + arrayList);
    }

}
