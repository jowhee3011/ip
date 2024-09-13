package echoa;

/**
 * This class encapsulates errors relating to a deadline update instruction.
 */

public class DeadlineUpdateFormatException extends UpdateFormatException {
    public DeadlineUpdateFormatException() {
        super();
    }

    @Override
    public String getMessage() {
        return "Deadline Update Format is as shown: \n"
                + "update [label] "
                + "/d [new description]) "
                + "/e [new date and/or new time] "
                + "(omit if not required)";
    }
}
