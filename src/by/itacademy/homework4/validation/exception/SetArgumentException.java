package by.itacademy.homework4.validation.exception;

public class SetArgumentException extends Throwable {
    public SetArgumentException(String message) {
        getMessage(message);
    }


    public String getMessage(String message) {
        return message;
    }
}
