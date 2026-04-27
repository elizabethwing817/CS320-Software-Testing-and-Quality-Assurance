package taskservice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void testTaskCreation() {
        Task task = new Task("T001", "Task Name", "Task description");
        assertEquals("T001", task.getTaskId());
        assertEquals("Task Name", task.getName());
        assertEquals("Task description", task.getDescription());
    }

    @Test
    public void testTaskIdCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task(null, "Task Name", "Task description");
        });
    }

    @Test
    public void testTaskIdCannotBeTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("12345678901", "Task Name", "Task description");
        });
    }

    @Test
    public void testNameCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("T001", null, "Task description");
        });
    }

    @Test
    public void testNameCannotBeTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("T001", "ThisNameIsWayTooLongToPass", "Task description");
        });
    }

    @Test
    public void testDescriptionCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("T001", "Task Name", null);
        });
    }

    @Test
    public void testDescriptionCannotBeTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("T001", "Task Name",
                "This description is definitely more than fifty characters long.");
        });
    }

    @Test
    public void testSetName() {
        Task task = new Task("T001", "Old Name", "Task description");
        task.setName("New Name");
        assertEquals("New Name", task.getName());
    }

    @Test
    public void testSetDescription() {
        Task task = new Task("T001", "Task Name", "Old description");
        task.setDescription("New description");
        assertEquals("New description", task.getDescription());
    }

    @Test
    public void testSetNameCannotBeNull() {
        Task task = new Task("T001", "Task Name", "Task description");
        assertThrows(IllegalArgumentException.class, () -> {
            task.setName(null);
        });
    }

    @Test
    public void testSetNameCannotBeTooLong() {
        Task task = new Task("T001", "Task Name", "Task description");
        assertThrows(IllegalArgumentException.class, () -> {
            task.setName("ThisNameIsWayTooLongToPass");
        });
    }

    @Test
    public void testSetDescriptionCannotBeNull() {
        Task task = new Task("T001", "Task Name", "Task description");
        assertThrows(IllegalArgumentException.class, () -> {
            task.setDescription(null);
        });
    }

    @Test
    public void testSetDescriptionCannotBeTooLong() {
        Task task = new Task("T001", "Task Name", "Task description");
        assertThrows(IllegalArgumentException.class, () -> {
            task.setDescription("This description is definitely more than fifty characters long.");
        });
    }
}
