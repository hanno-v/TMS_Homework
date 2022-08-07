package by.tms.lesson11;

// 2.	Создать ещё один собственный класс-исключение, сделав его НЕ проверяемым исключением .
// +
// 3.	Добавить в конструктор своих классов возможность указания сообщения и/или другого исключения.
public class MyUncheckedException extends RuntimeException { //  ИЛИ extends Error ??

    public MyUncheckedException() {
    }

    public MyUncheckedException(String message) {
        super(message);
    }

    public MyUncheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyUncheckedException(Throwable cause) {
        super(cause);
    }

}
