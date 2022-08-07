package by.tms.lesson13.task4;

import java.util.Comparator;

public class SortStudentsByAge implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getAge() - o1.getAge();
    } // от большего к меньшему

}
