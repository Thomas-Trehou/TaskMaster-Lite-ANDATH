package fr.hb.taskmasterlite;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class TaskManagerTest {

    @Test
    public void testAddTask() {
        TaskManager manager = new TaskManager();
        manager.addTask("Faire les courses");
        List<String> tasks = manager.getAllTasks();
        assertEquals(1, tasks.size());
        assertEquals("Faire les courses", tasks.get(0));
    }
}
