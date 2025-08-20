package sg.edu.nus.iss.epat.tdd.workshop;

import java.util.Collection;
import java.util.HashMap;

public class ToDoList {
    private final HashMap<String, Task> tasks = new HashMap<String, Task>();

    public void addTask(Task task) {
        // Add code here
        if (task != null && task.getDescription() != null) {
            tasks.put(task.getDescription(), task);
        }
    }

    public void completeTask(String description) {
        // Add code here
        if (description != null && tasks.containsKey(description) && getStatus(description) != true) {
            getTask(description).setComplete(true);
        }
    }

    public boolean getStatus(String description) {
        // Add code here
        if (description != null && tasks.containsKey(description)) {
            return tasks.get(description).isComplete();
        }else {
            return false;
        }
    }

    public Task getTask(String description) {
        // Add code here
        return tasks.get(description);
//        return null;
    }

    public Task removeTask(String description) {
        // Add code here
        if (description != null && tasks.containsKey(description)) {
            return tasks.remove(description);
        } else {
            return null;
        }
    }

    public Collection<Task> getAllTasks() {
        return tasks.values();
    }

    public Collection<Task> getCompletedTasks() {
        // Add code here
        return null;
    }
}
