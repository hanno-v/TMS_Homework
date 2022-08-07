package by.tms.lesson13.task4;

//4. Создать класс Student, представляющий собой ученика. Добавить ему данные об имени, фамилии, возрасте и среднем балле за год.
//          Создать список (List) учеников. Найти и вывести ученика с самым высоким средним баллом используя итератор.
//          Отсортировать и вывести список учеников по полному имени (имя + фамилия), возрасту и среднему баллу

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class MainClass {


    public static void main(String[] args) {

        ArrayList<Student> studentArrayList = new ArrayList<>();

        studentArrayList.add(new Student("Ivan", "Ivanov", 20, 8.7));
        studentArrayList.add(new Student("Petr", "Petrov", 19, 8.3));
        studentArrayList.add(new Student("Pavel", "Pavlov", 27, 10.0));
        studentArrayList.add(new Student("Egor", "Egorov", 23, 9.4));
        studentArrayList.add(new Student("Yuriy", "Yuriev", 54, 7.1));
        studentArrayList.add(new Student("Alexey", "Alexeyev", 11, 4.9));
        studentArrayList.add(new Student("Sergey", "Sergeyev", 36, 3.5));
        studentArrayList.add(new Student("Mikhail", "Mikhailov", 27, 6.0));

        // определение студента с самым высоким средним баллом
        Student bestStudent = new Student();
        Student bufferBestStudent = new Student();

        Iterator<Student> studentIterator = studentArrayList.listIterator();

        while (studentIterator.hasNext()) {

            bufferBestStudent = studentIterator.next();

            if (bestStudent.getRating() < bufferBestStudent.getRating()) {
                bestStudent.setFirstName(bufferBestStudent.getFirstName());
                bestStudent.setLastName(bufferBestStudent.getLastName());
                bestStudent.setAge(bufferBestStudent.getAge());
                bestStudent.setRating(bufferBestStudent.getRating());
            }
        }
        System.out.println("Student with best rating is " + bestStudent.toString());

        // сортировка по имени
        Comparator<Student> studentComparatorByName = new SortStudentsByName();
        studentArrayList.sort(studentComparatorByName);
        System.out.println("Sorting by name here");
        System.out.println(studentArrayList);

        // сортировка по возрасту
        Comparator<Student> studentComparatorByAge = new SortStudentsByAge();
        studentArrayList.sort(studentComparatorByAge);
        System.out.println("Sorting by age here");
        System.out.println(studentArrayList);

        // сортировка по оценке
        Comparator<Student> studentComparatorByRating = new SortStudentsByRating();
        studentArrayList.sort(studentComparatorByRating);
        System.out.println("Sorting by rating here");
        System.out.println(studentArrayList);
    }

}
