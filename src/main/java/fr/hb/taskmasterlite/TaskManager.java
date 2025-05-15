package fr.hb.taskmasterlite;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<String> tasks = new ArrayList<>();

    public void addTask(String description) {
        tasks.add(description);
    }

    public List<String> getAllTasks() {
        return new ArrayList<>(tasks);
    }
}
