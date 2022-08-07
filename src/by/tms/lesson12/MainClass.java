package by.tms.lesson12;
import java.nio.file.Paths;

public class MainClass {

    public static void main(String[] args) {

    // Task1
    FileUtils.fileCharsCount(Paths.get("resources", "lesson12", "Task1Text.txt.txt").toFile(),
            Paths.get("resources", "lesson12", "Task1Results.txt").toFile());

    // Task2
    FileUtils.createNewFilesAndSortValues(Paths.get("resources", "lesson12", "Task2RandomValues.txt").toFile(),
            -1000000, 1000000,
            Paths.get("resources", "lesson12", "Task2SortedValues.txt").toFile());

    }

}
