package Echoa;

/**
 * InvalidToDoContentException is a class that encapsulates errors relating to ToDo.
 * It extends from the class InvalidTaskContentException.
 */

public class InvalidToDoContentException extends InvalidTaskContentException {
    public InvalidToDoContentException() {
        super();
    }

    @Override
    public String getMessage() {
        return
        "Please key in the following format:\n" +
        "todo [task name]";
    }
}
