package by.tms.lesson11;

// 1.	Создать собственный класс-исключение, сделав его проверяемым исключением .
// +
// 3.	Добавить в конструктор своих классов возможность указания сообщения и/или другого исключения.
public class MyCheckedException extends Exception {

    public MyCheckedException() {
    }

    public MyCheckedException(String message) {
        super(message);
    }

    public MyCheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyCheckedException(Throwable cause) {
        super(cause);
    }

}
