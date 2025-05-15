package fr.hb.taskmasterlite;

import java.util.ArrayList;
import java.util.List;

/**
 * The <code>TaskManager</code> class manages a collection of tasks as strings.
 */
public class TaskManager {
    private final List<String> tasks = new ArrayList<>();

    /**
     * Adds a new task to the list of tasks.
     *
     * @param description The description of the task to add.
     */
    public void addTask(String description) {
        tasks.add(description);
    }

    /**
     * Returns a new list containing all currently recorded tasks.
     * The returned list is a copy to prevent external modification of the internal collection.
     *
     * @return A list of strings representing all tasks.
     */
    public List<String> getAllTasks() {
        return new ArrayList<>(tasks);
    }
}
