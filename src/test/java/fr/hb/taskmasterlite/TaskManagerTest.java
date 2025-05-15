package fr.hb.taskmasterlite;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.List;

/**
 * Unit tests for the {@link TaskManager} class.
 */
public class TaskManagerTest {

    /**
     * Tests the functionality of adding a task to the list.
     * Verifies that the size of the list increases and that the added task is correct.
     *
     * @throws NoSuchFieldException   If the 'tasks' field is not found (for reflection).
     * @throws IllegalAccessException If access to the 'tasks' field is denied (for reflection).
     */
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

    /**
     * Tests the functionality of retrieving all tasks.
     * Adds multiple tasks and verifies that the returned list contains all tasks in the correct order.
     */
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
