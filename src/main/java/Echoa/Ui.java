package echoa;

/**
 * This class encapsulates information relating to the User Interface (UI).
 */

public class Ui {
    public static final String[] INSTRUCTION_LIST = {"todo", "deadline", "event", "mark", "unmark", "delete", "list", "bye"};

    public String getStartMessage() {
        return "Hello, I'm Echoa!\n" +
               "What can I do for you?\n";
    }


    public String getEndMessage() {
        return "Bye. Hope to see you again soon!\n";
    }

    public String getAddTaskMessage(TaskList taskList) {
        return "Task added!\n" +
                taskList.getSpecificTask(taskList.getSize() - 1).toString() +
                "\n";
    }

    public String getDeleteTaskMessage(TaskList taskList, Task task) {
        return "Task deleted :/\n" +
                task.toString() + "\n" +
                "Now you have " + (taskList.getSize()) + " task(s).\n";
    }

    public String getMarkTaskMessage(TaskList taskList, int index) {
        return "Task marked :)\n" +
                taskList.getSpecificTask(index).toString() + "\n";
    }

    public String getUnmarkTaskMessage(TaskList taskList, int index) {
        return "Task unmarked :(\n" +
                taskList.getSpecificTask(index).toString() + "\n";
    }

    public String getUpdateTaskMessage(Task task, int label) {
        return "Task " + label + " updated: " +
                task.toString() +
                "\n";
    }

    public String getListOfTasksMessage(TaskList taskList) {
        String message = "";
        for (int i = 0; i < taskList.getSize(); i++) {
            int label = i + 1;
            message += label + ". ";
            message += taskList.getSpecificTask(i).toString() + "\n";
        }
        if (taskList.getSize() == 0) {
            message = "No tasks in the requested list.\n";
        }

        return message;
    }

    public String getExceptionMessage(EchoaException e) {
        return e.getMessage() + "\n" + "Please try again.\n";
    }

    public String getExceptionMessage(Exception e) {
        return e.getClass().getName() + ": " + e.getMessage();
    }
}
