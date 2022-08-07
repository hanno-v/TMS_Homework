package by.tms.lesson13.task4;

import java.util.Comparator;

public class SortStudentsByRating implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.getRating(), o1.getRating()); // от большего к меньшему
    }
}
