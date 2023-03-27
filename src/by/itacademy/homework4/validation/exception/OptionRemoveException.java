package by.itacademy.homework4.validation.exception;

public class OptionRemoveException extends Throwable {
    public OptionRemoveException(String message) {
        getMessage(message);
    }

    private String getMessage(String message) {
        return message;
    }
}
