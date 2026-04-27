package taskservice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TaskServiceTest {

    @Test
    public void testAddTask() {
        TaskService service = new TaskService();
        Task task = new Task("T001", "Task One", "First task description");

        service.addTask(task);

        assertEquals(task, service.getTask("T001"));
    }

    @Test
    public void testAddDuplicateTaskIdFails() {
        TaskService service = new TaskService();
        Task task1 = new Task("T001", "Task One", "First task description");
        Task task2 = new Task("T001", "Task Two", "Second task description");

        service.addTask(task1);

        assertThrows(IllegalArgumentException.class, () -> {
            service.addTask(task2);
        });
    }

    @Test
    public void testDeleteTask() {
        TaskService service = new TaskService();
        Task task = new Task("T001", "Task One", "First task description");

        service.addTask(task);
        service.deleteTask("T001");

        assertNull(service.getTask("T001"));
    }

    @Test
    public void testDeleteTaskWithBadIdFails() {
        TaskService service = new TaskService();

        assertThrows(IllegalArgumentException.class, () -> {
            service.deleteTask("BADID");
        });
    }

    @Test
    public void testUpdateTaskName() {
        TaskService service = new TaskService();
        Task task = new Task("T001", "Old Name", "Task description");

        service.addTask(task);
        service.updateTaskName("T001", "New Name");

        assertEquals("New Name", service.getTask("T001").getName());
    }

    @Test
    public void testUpdateTaskDescription() {
        TaskService service = new TaskService();
        Task task = new Task("T001", "Task Name", "Old description");

        service.addTask(task);
        service.updateTaskDescription("T001", "New description");

        assertEquals("New description", service.getTask("T001").getDescription());
    }

    @Test
    public void testUpdateTaskNameWithBadIdFails() {
        TaskService service = new TaskService();

        assertThrows(IllegalArgumentException.class, () -> {
            service.updateTaskName("BADID", "New Name");
        });
    }

    @Test
    public void testUpdateTaskDescriptionWithBadIdFails() {
        TaskService service = new TaskService();

        assertThrows(IllegalArgumentException.class, () -> {
            service.updateTaskDescription("BADID", "New description");
        });
    }

    @Test
    public void testUpdateTaskNameToNullFails() {
        TaskService service = new TaskService();
        Task task = new Task("T001", "Task Name", "Task description");

        service.addTask(task);

        assertThrows(IllegalArgumentException.class, () -> {
            service.updateTaskName("T001", null);
        });
    }

    @Test
    public void testUpdateTaskNameTooLongFails() {
        TaskService service = new TaskService();
        Task task = new Task("T001", "Task Name", "Task description");

        service.addTask(task);

        assertThrows(IllegalArgumentException.class, () -> {
            service.updateTaskName("T001", "ThisNameIsWayTooLongToPass");
        });
    }

    @Test
    public void testUpdateTaskDescriptionToNullFails() {
        TaskService service = new TaskService();
        Task task = new Task("T001", "Task Name", "Task description");

        service.addTask(task);

        assertThrows(IllegalArgumentException.class, () -> {
            service.updateTaskDescription("T001", null);
        });
    }

    @Test
    public void testUpdateTaskDescriptionTooLongFails() {
        TaskService service = new TaskService();
        Task task = new Task("T001", "Task Name", "Task description");

        service.addTask(task);

        assertThrows(IllegalArgumentException.class, () -> {
            service.updateTaskDescription("T001",
                "This description is definitely more than fifty characters long.");
        });
    }
}