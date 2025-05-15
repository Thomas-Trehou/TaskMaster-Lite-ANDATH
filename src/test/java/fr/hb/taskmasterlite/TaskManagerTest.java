package fr.hb.taskmasterlite;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.List;

public class TaskManagerTest {

    @Test
    public void testAddTask() throws NoSuchFieldException, IllegalAccessException {
        TaskManager manager = new TaskManager();
        manager.addTask("Faire les courses");
        Field tasksField = TaskManager.class.getDeclaredField("tasks");
        tasksField.setAccessible(true);
        List<String> tasks = (List<String>) tasksField.get(manager);
        assertEquals(1, tasks.size());
        assertEquals("Faire les courses", tasks.get(0));
    }

    @Test
    public void testGetAllTasks() {
        TaskManager manager = new TaskManager();

        manager.addTask("Faire les courses");
        manager.addTask("Coder du Java");

        List<String> tasks = manager.getAllTasks();

        assertEquals("La taille de la liste doit être 2", 2, tasks.size());
        assertEquals("Première tâche incorrecte", "Faire les courses", tasks.get(0));
        assertEquals("Deuxième tâche incorrecte", "Coder du Java", tasks.get(1));
    }
}
